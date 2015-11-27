package javarush.eclipse.core.jobs;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;

import javarush.eclipse.Messages;
import javarush.eclipse.core.enums._ServiceResultErrorCode;
import javarush.eclipse.exceptions.SystemException;
import javarush.eclipse.ws.client.ServiceResultErrorCode;
import javarush.eclipse.ws.client.ServiceResultOfBoolean;

public class ResetProgressTaskJob extends AJob {
    private final String taskKey;

    public ResetProgressTaskJob(String taskKey) {
        super(Messages.title_ResetProgress);
        this.taskKey = taskKey;
    }

    @Override
    protected IStatus run(IProgressMonitor monitor) {
        try {
            monitor.beginTask(Messages.monitor_ResetProgress, 100);

            monitor.subTask(Messages.monitor_Authorization);
            String sessionId = authorize();
            if (monitor.isCanceled())
                return Status.CANCEL_STATUS;
            monitor.worked(50);

            monitor.subTask(Messages.monitor_ResetProgress_reset);
            ServiceResultOfBoolean res = getWSClient().resetBigTask(sessionId,
                    taskKey);

            if (ServiceResultErrorCode.SUCCESS != res.getErrorCode())
                throw new SystemException(_ServiceResultErrorCode.UNKNOWN_ERROR
                        .fromValue(res.getErrorCode()).getDescription());
            monitor.worked(50);

            showMsg(MessageDialog.INFORMATION, Messages.title_ResetProgress,
                    Messages.info_ResetProgress_success);

            return Status.OK_STATUS;
        }
        catch (Exception e) {
            return showBusinessError(e);
        }
        finally {
            logout();
            monitor.done();
        }
    }
}
