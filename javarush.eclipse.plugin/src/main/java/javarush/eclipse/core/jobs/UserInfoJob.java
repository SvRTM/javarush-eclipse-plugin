package javarush.eclipse.core.jobs;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import javarush.eclipse.Messages;
import javarush.eclipse.core.enums._ServiceResultErrorCode;
import javarush.eclipse.core.utils.Util;
import javarush.eclipse.exceptions.BaseException;
import javarush.eclipse.exceptions.SystemException;
import javarush.eclipse.ui.dialogs.UserInfoDialog;
import javarush.eclipse.ws.client.ServiceResultErrorCode;
import javarush.eclipse.ws.client.ServiceResultOfUserInfo;
import javarush.eclipse.ws.client.UserInfo;

public class UserInfoJob extends AJob {

    public UserInfoJob() {
        super(Messages.title_UserInfo);
    }

    @Override
    protected IStatus run(final IProgressMonitor monitor) {
        try {
            monitor.beginTask(Messages.monitor_UserInfo, 100);

            monitor.subTask(Messages.monitor_Authorization);
            final String sessionId = authorize();
            if (monitor.isCanceled())
                return Status.CANCEL_STATUS;
            monitor.worked(50);

            monitor.subTask(Messages.monitor_UserInfo_loadUserProfile);
            ServiceResultOfUserInfo res = getWSClient()
                    .getCurrentUserProfile(sessionId);
            if (ServiceResultErrorCode.SUCCESS != res.getErrorCode())
                throw new SystemException(_ServiceResultErrorCode.UNKNOWN_ERROR
                        .fromValue(res.getErrorCode()).getDescription());
            monitor.worked(50);

            UserInfo info = res.getResult();
            showUserInfo(info);

            return Status.OK_STATUS;
        }
        catch (final Exception e) {
            return showBusinessError(e);
        }
        finally {
            logout();
            monitor.done();
        }
    }

    private void showUserInfo(final UserInfo info) {
        Util.getDisplay().asyncExec(new Runnable() {
            @Override
            public void run() {
                try {
                    UserInfoDialog dlg = new UserInfoDialog(info);
                    dlg.open();
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
