package javarush.eclipse.core.jobs;

import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.JavaUI;

import javarush.eclipse.JavarushEclipsePlugin;
import javarush.eclipse.Messages;
import javarush.eclipse.core.enums._ServiceResultErrorCode;
import javarush.eclipse.core.utils.JdtUtils;
import javarush.eclipse.core.utils.Util;
import javarush.eclipse.core.utils.WorkspaceUtil;
import javarush.eclipse.exceptions.BaseException;
import javarush.eclipse.exceptions.SystemException;
import javarush.eclipse.ws.client.ClassDataInfo;
import javarush.eclipse.ws.client.ServiceResultErrorCode;
import javarush.eclipse.ws.client.ServiceResultOfClassDataInfoList;

public class LoadTaskProjectJob extends AJob {

    private final String taskKey;

    public LoadTaskProjectJob(final String taskKey) {
        super(Messages.title_LoadTask);
        this.taskKey = taskKey;
    }

    @Override
    protected IStatus run(final IProgressMonitor monitor) {
        try {
            monitor.beginTask(Messages.monitor_LoadTaskProject, 100);

            monitor.subTask(Messages.monitor_Authorization);
            final String sessionId = authorize();
            monitor.worked(33);

            monitor.subTask(Messages.monitor_LoadTask_downloadJavaFiles);
            final ServiceResultOfClassDataInfoList res = getWSClient()
                    .getTaskTemplate(sessionId, taskKey);

            if (ServiceResultErrorCode.SUCCESS != res.getErrorCode())
                throw new SystemException(_ServiceResultErrorCode.UNKNOWN_ERROR
                        .fromValue(res.getErrorCode()).getDescription());
            if (monitor.isCanceled())
                return Status.CANCEL_STATUS;
            monitor.worked(33);

            final List<ClassDataInfo> classDatas = res.getResult().getValue()
                    .getResult();

            monitor.subTask(Messages.monitor_LoadTask_newTask);
            for (final ClassDataInfo classInfo : classDatas) {
                final String _package = classInfo.getPackage();
                final String fileName = classInfo.getFileName();
                final String content = Util.toUtf8(classInfo.getContentCode());
                final IPackageFragment fragment = JdtUtils
                        .creatPackage(_package, monitor);
                if (isJavaFile(fileName)) {
                    final ICompilationUnit cu = JdtUtils.addClass(fileName,
                            content, fragment, monitor);
                    if ("Solution.java".equals(fileName)
                        || isContainMainMethod(cu))
                        openInEditor(cu);
                }
                else {
                    IPath path = fragment.getResource().getFullPath()
                            .append(fileName);
                    WorkspaceUtil.createFile(path, content, monitor);
                }
            }

            monitor.worked(34);

            return Status.OK_STATUS;
        }
        catch (final Exception e) {
            resetSession();
            return JavarushEclipsePlugin.status(e);
        }
        finally {
            logout();
            monitor.done();
        }
    }

    private boolean isContainMainMethod(final ICompilationUnit cu) throws JavaModelException {
        final IType[] typeDeclarationList = cu.getTypes();
        for (final IType typeDeclaration : typeDeclarationList) {
            final IMethod[] methodList = typeDeclaration.getMethods();
            for (final IMethod method : methodList) {
                final String name = method.getElementName();
                if (name == null || !"main".equals(name))
                    continue;
                if (method.getSource().contains("public static void main"))
                    return true;
            }
        }
        return false;
    }

    private void openInEditor(final IJavaElement element) {
        Util.getDisplay().syncExec(new Runnable() {
            @Override
            public void run() {
                try {
                    JavaUI.openInEditor(element);
                }
                catch (Exception e) {
                    if (!(e instanceof BaseException))
                        e = new SystemException(e);
                    JavarushEclipsePlugin.logErrorWithMsg(e);
                }
            }
        });
    }

    private boolean isJavaFile(String file) {
        if (file == null)
            return false;
        int i = file.lastIndexOf('.');
        if (i > 0)
            return "java".equals(file.substring(i + 1));
        return false;
    }
}
