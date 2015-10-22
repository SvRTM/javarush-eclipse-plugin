package javarush.eclipse.security;

import static javarush.eclipse.ws.client.ServiceResultErrorCode.API_VERSION_MISMATCH;
import static javarush.eclipse.ws.client.ServiceResultErrorCode.AUTHORIZATION_ERROR;
import static javarush.eclipse.ws.client.ServiceResultErrorCode.SUCCESS;

import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.preference.IPreferenceStore;

import javarush.eclipse.JavarushEclipsePlugin;
import javarush.eclipse.Messages;
import javarush.eclipse.core.Constants;
import javarush.eclipse.core.utils.SessionSingleton;
import javarush.eclipse.core.utils.WorkspaceUtil;
import javarush.eclipse.exceptions.SystemException;
import javarush.eclipse.security.exceptoins.AuthorizationException;
import javarush.eclipse.security.exceptoins.AuthorizationException.Action;
import javarush.eclipse.ws.client.IJarCommonService;
import javarush.eclipse.ws.client.ServiceResultErrorCode;
import javarush.eclipse.ws.client.ServiceResultOfBoolean;
import javarush.eclipse.ws.client.ServiceResultOfString;

public class Authorization {
    private static int API_VERSION = 1;

    private static String SECRET_KEY = "JavaRushPlugin.properties";
    private static String PROPERTY_KEY = "javarush.user.secretkey";

    private final IJarCommonService client;

    public Authorization(IJarCommonService client) {
        this.client = client;
    }

    public String login(IProject project) throws CoreException {
        return login(getSecretKey(project));
    }

    public String login(String secretKey) {
        if (secretKey == null || "".equals(secretKey))
            throw new AuthorizationException(Messages.error_Login_secKeyEmpty);

        String sessionId = getSessionId();
        if (sessionId != null)
            return sessionId;

        ServiceResultOfString result = client.signInViaSecretKey(API_VERSION,
                secretKey);

        final ServiceResultErrorCode errorCode = result.getErrorCode();
        if (SUCCESS == errorCode) {
            sessionId = result.getResult();
            if (sessionId == null)
                throw new AuthorizationException(Action.LOGIN,
                        Messages.error_Login_sessionIdEmpty);

            SessionSingleton.INSTANCE.setId(sessionId);

            return sessionId;
        }
        else if (API_VERSION_MISMATCH == errorCode)
            throw new AuthorizationException(Action.LOGIN,
                    Messages.error_Login_oldVersion);
        else if (AUTHORIZATION_ERROR == errorCode)
            throw new AuthorizationException(Action.LOGIN,
                    Messages.error_Login_authorizationError);
        else
            throw new AuthorizationException(Action.LOGIN, MessageFormat.format(
                    Messages.error_Login_unknownError, errorCode.toString()));
    }

    public void logout() {
        String sessionId = getSessionId();
        if (sessionId == null)
            return;

        ServiceResultOfBoolean result = client.signOut(sessionId);
        ServiceResultErrorCode errorCode = result.getErrorCode();
        if (SUCCESS != errorCode)
            throw new AuthorizationException(Action.LOGOUT,
                    MessageFormat.format(Messages.error_Login_unknownError,
                            errorCode.toString()));
    }

    public String getSecretKey(IProject project) throws CoreException {
        final IFile file = WorkspaceUtil.getFile(SECRET_KEY, null, project);

        InputStream in = file.getContents();
        try {
            final Properties prop = new Properties();
            prop.load(in);
            final String secretKey = prop.getProperty(PROPERTY_KEY);

            return secretKey != null ? secretKey.trim() : null;
        }
        catch (final Exception e) {
            throw new SystemException(e);
        }
    }

    private String getSessionId() {
        return SessionSingleton.INSTANCE.getId(getLifetime());
    }

    private int getLifetime() {
        IPreferenceStore store = JavarushEclipsePlugin.getDefault()
                .getPreferenceStore();
        return store.getInt(Constants.FIELD_MINUTES);
    }
}
