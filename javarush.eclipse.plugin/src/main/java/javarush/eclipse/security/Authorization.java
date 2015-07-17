package javarush.eclipse.security;

import static javarush.eclipse.ws.client.ServiceResultErrorCode.API_VERSION_MISMATCH;
import static javarush.eclipse.ws.client.ServiceResultErrorCode.AUTHORIZATION_ERROR;
import static javarush.eclipse.ws.client.ServiceResultErrorCode.SUCCESS;

import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Properties;

import javarush.eclipse.Messages;
import javarush.eclipse.core.utils.WorkspaceUtil;
import javarush.eclipse.exceptions.SystemException;
import javarush.eclipse.security.exceptoins.LoginException;
import javarush.eclipse.ws.client.IJarCommonService;
import javarush.eclipse.ws.client.ServiceResultErrorCode;
import javarush.eclipse.ws.client.ServiceResultOfString;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;

public class Authorization {
    public static int API_VERSION = 1;
    public static int RELEASE_VERSION = 21;

    public static String SECRET_KEY = "JavaRushPlugin.properties";
    public static String PROPERTY_KEY = "javarush.user.secretkey";

    public static String login(IProject project, IJarCommonService service)
                                                                           throws CoreException {
        return login(getSecretKey(project), service);
    }

    public static String login(final String secretKey, IJarCommonService service) {
        if (secretKey == null || "".equals(secretKey))
            throw new LoginException(Messages.error_Login_secKeyEmpty);

        final ServiceResultOfString result = service.signInViaSecretKey(
                API_VERSION, secretKey);

        final ServiceResultErrorCode errorCode = result.getErrorCode();
        if (SUCCESS == errorCode) {
            final String sessionId = result.getResult();
            if (sessionId == null)
                throw new LoginException(Messages.error_Login_sessionIdEmpty);
            return sessionId;
        }
        else if (API_VERSION_MISMATCH == errorCode)
            throw new LoginException(Messages.error_Login_oldVersion);
        else if (AUTHORIZATION_ERROR == errorCode)
            throw new LoginException(Messages.error_Login_authorizationError);
        else
            throw new LoginException(MessageFormat.format(
                    Messages.error_Login_unknownError, errorCode.toString()));
    }

    public static String getSecretKey(final IProject project)
                                                             throws CoreException {
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
}
