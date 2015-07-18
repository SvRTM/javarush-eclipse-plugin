package javarush.eclipse.core.jobs;

import javarush.eclipse.JavarushEclipsePlugin;
import javarush.eclipse.Messages;
import javarush.eclipse.core.enums._ServiceResultErrorCode;
import javarush.eclipse.core.utils.WorkspaceUtil;
import javarush.eclipse.exceptions.BaseException;
import javarush.eclipse.exceptions.SystemException;
import javarush.eclipse.ws.client.IJarCommonService;
import javarush.eclipse.ws.client.JarCommonService;
import javarush.eclipse.ws.client.ServiceResultErrorCode;
import javarush.eclipse.ws.client.ServiceResultOfBoolean;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

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

            IJarCommonService client = new JarCommonService()
                    .getJarCommonServicePort();

            monitor.subTask(Messages.monitor_ResetProgress_reset);
            ServiceResultOfBoolean res = client
                    .resetBigTask(sessionId, taskKey);

            if (ServiceResultErrorCode.SUCCESS != res.getErrorCode())
                throw new SystemException(_ServiceResultErrorCode.UNKNOWN_ERROR
                        .fromValue(res.getErrorCode()).getDescription());
            monitor.worked(50);
            showMsg();

            return Status.OK_STATUS;
        }
        catch (Exception e) {
            return JavarushEclipsePlugin.status(e);
        }
        finally {
            monitor.done();
        }
    }

    private void showMsg() {
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                try {
                    MessageDialog.openInformation(WorkspaceUtil.getShell(),
                            Messages.title_ResetProgress,
                            Messages.info_ResetProgress_success);
                }
                catch (Exception e) {
                    if (!(e instanceof BaseException))
                        e = new SystemException(e);
                    JavarushEclipsePlugin.logError(e);
                    JavarushEclipsePlugin.errorMsg(e);
                }
            }
        });
    }
}
