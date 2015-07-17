package javarush.eclipse.core.jobs;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import javarush.eclipse.JavarushEclipsePlugin;
import javarush.eclipse.Messages;
import javarush.eclipse.core.Constants;
import javarush.eclipse.core.enums._CompilationStatus;
import javarush.eclipse.core.enums._CompilationStatus.AllowList;
import javarush.eclipse.core.enums._ServiceResultErrorCode;
import javarush.eclipse.core.enums._ValidationStatus;
import javarush.eclipse.core.utils.JdtUtils;
import javarush.eclipse.core.utils.Util;
import javarush.eclipse.core.utils.WorkspaceUtil;
import javarush.eclipse.exceptions.BaseException;
import javarush.eclipse.exceptions.BusinessException;
import javarush.eclipse.exceptions.SystemException;
import javarush.eclipse.ws.client.ClassDataInfo;
import javarush.eclipse.ws.client.CompilationStatus;
import javarush.eclipse.ws.client.IJarCommonService;
import javarush.eclipse.ws.client.JarCommonService;
import javarush.eclipse.ws.client.ServiceResultErrorCode;
import javarush.eclipse.ws.client.ServiceResultOfValidationInfo;
import javarush.eclipse.ws.client.ValidateInfo;
import javarush.eclipse.ws.client.ValidationStatus;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

public class CheckTaskJob extends AJob {
    private static String MARKER = "com.javarush.test.";

    public CheckTaskJob() {
        super(Messages.title_LoadTask);
    }

    @Override
    protected IStatus run(final IProgressMonitor monitor) {
        try {
            monitor.beginTask(Messages.monitor_CheckTask, 100);

            monitor.subTask(Messages.monitor_Authorization);
            final String sessionId = authorize();
            monitor.worked(25);

            final IJarCommonService client = new JarCommonService()
                    .getJarCommonServicePort();

            monitor.subTask(Messages.monitor_CheckTask_taskNumber);
            final String[] taskNumber = new String[1];
            final List<ClassDataInfo> classDatas = new ArrayList<ClassDataInfo>();
            prepareData(taskNumber, classDatas, monitor);
            monitor.worked(25);

            monitor.subTask(Messages.monitor_CheckTask_sentOnCheck);

            final ServiceResultOfValidationInfo res = client.validateForPlugin(
                    sessionId, taskNumber[0], classDatas);

            if (ServiceResultErrorCode.SUCCESS != res.getErrorCode())
                throw new SystemException(_ServiceResultErrorCode.UNKNOWN_ERROR
                        .fromValue(res.getErrorCode()).getDescription());

            monitor.worked(50);

            final ValidateInfo validateInfo = res.getResult();

            final CompilationStatus compilationStatus = validateInfo
                    .getCompilationStatus();
            if (CompilationStatus.SUCCESS != compilationStatus) {
                showMsg(MessageDialog.ERROR,
                        Messages.title_CheckTask_compilation,
                        AllowList.LIST.isAllow(compilationStatus) ? _CompilationStatus.UNKNOWN_ERROR
                                                                         .fromValue(
                                                                                 compilationStatus)
                                                                         .getDescription()
                                                                 : Messages.info_CheckTask_errorCompilation);
                return Status.OK_STATUS;
            }

            final ValidationStatus validationStatus = validateInfo
                    .getValidationStatus();
            if (ValidationStatus.SUCCESS != validationStatus)
                showMsg(MessageDialog.ERROR,
                        Messages.title_CheckTask_validation,
                        _ValidationStatus.UNKNOWN_ERROR.fromValue(
                                validationStatus).getDescription());

            final String message = MessageFormat.format(
                    Messages.info_CheckTask_statistics,
                    validateInfo.getBetterThan(), validateInfo.getAttempts(),
                    validateInfo.getAvgAttempts());
            showMsg(MessageDialog.INFORMATION,
                    Messages.title_CheckTask_wellDone, message);

            reloadTaskList();
        }
        catch (final Exception e) {
            return JavarushEclipsePlugin.status(e);
        }
        finally {
            monitor.done();
        }

        return Status.OK_STATUS;
    }

    private void prepareData(final String[] taskNumber,
                             final List<ClassDataInfo> classDatas,
                             final IProgressMonitor monitor)
                                                            throws CoreException {

        final IJavaElement element = JdtUtils.getActiveEditorJavaInput();
        if (element == null)
            throw new BusinessException(Messages.error_CheckTask_onlyJavaFile);

        final IJavaElement parent = element.getParent();
        final String pkg = parent.getElementName();
        final int i = pkg.indexOf(MARKER);
        if (i < 0)
            throw new BusinessException(MessageFormat.format(
                    Messages.error_CheckTask_invalidPackage, pkg));

        taskNumber[0] = pkg.substring(i + MARKER.length()).replace('.', ',');

        prepareClassDataInfoList((IContainer) parent.getResource(), classDatas,
                monitor);
    }

    private void prepareClassDataInfoList(final IContainer container,
                                          final List<ClassDataInfo> classDatas,
                                          final IProgressMonitor monitor)
                                                                         throws CoreException {
        WorkspaceUtil.getWorkspace().run(new IWorkspaceRunnable() {
            @Override
            public void run(final IProgressMonitor monitor)
                                                           throws CoreException {
                for (final IResource r : container.members())
                    if (r instanceof IContainer)
                        prepareClassDataInfoList((IContainer) r, classDatas,
                                monitor);
                    else if (r instanceof IFile) {
                        classDatas.add(prepareClassDataInfo((IFile) r));
                        monitor.worked(1);
                    }
            }
        }, monitor);
    }

    private ClassDataInfo prepareClassDataInfo(final IFile file)
                                                                throws CoreException {
        final ClassDataInfo info = new ClassDataInfo();
        info.setFileName(file.getName());
        info.setPackage(JavaCore.create(file).getParent().getElementName());
        info.setContentCode(Util.convertStreamToString(file.getContents()));
        return info;
    }

    private void showMsg(final int kind, final String title, final String msg) {
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                try {
                    MessageDialog.open(kind, WorkspaceUtil.getShell(), title,
                            msg, MessageDialog.NONE);
                }
                catch (Exception e) {
                    if (!(e instanceof BaseException))
                        e = new SystemException(e);
                    throw (BaseException) e;
                }
            }
        });
    }

    private void reloadTaskList() {
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                try {
                    WorkspaceUtil.getHandlerService().executeCommand(
                            Constants.BTN_TASK_LIST, null);
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
