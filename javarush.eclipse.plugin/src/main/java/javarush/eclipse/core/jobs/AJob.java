package javarush.eclipse.core.jobs;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;

import javarush.eclipse.JavarushEclipsePlugin;
import javarush.eclipse.Messages;
import javarush.eclipse.core.utils.SessionSingleton;
import javarush.eclipse.core.utils.Util;
import javarush.eclipse.core.utils.WSClient;
import javarush.eclipse.exceptions.BaseException;
import javarush.eclipse.exceptions.BusinessException;
import javarush.eclipse.exceptions.SystemException;
import javarush.eclipse.security.exceptoins.AuthorizationException;
import javarush.eclipse.ws.client.IJarCommonService;

public abstract class AJob extends Job {
    private final WSClient wsClient;

    public AJob(final String name) {
        super(name);
        setUser(true);
        wsClient = new WSClient();
    }

    protected IJarCommonService getWSClient() {
        return wsClient.getService();
    }

    protected String authorize() throws CoreException {
        return wsClient.authorize();
    }

    protected void logout() {
        wsClient.logout();
    }

    protected void resetSession() {
        SessionSingleton.INSTANCE.reset();
    }

    protected IStatus showBusinessError(final Exception e) {
        if (!(e instanceof BusinessException)) {
            resetSession();
            return JavarushEclipsePlugin.statusError(e);
        }

        String message = e instanceof AuthorizationException ? ((AuthorizationException) e)
                .getMsg() : e.getMessage();
        showMsg(MessageDialog.ERROR, Messages.title_errorMessage, message);

        return JavarushEclipsePlugin.statusWarning(e.getMessage());
    }

    protected void showMsg(final int kind, final String title,
                           final String msg) {
        Util.getDisplay().syncExec(new Runnable() {
            @Override
            public void run() {
                try {
                    JavarushEclipsePlugin.showMsg(kind, title, msg);
                }
                catch (Exception e) {
                    if (!(e instanceof BaseException))
                        e = new SystemException(e);
                    throw (BaseException) e;
                }
            }
        });
    }
}
