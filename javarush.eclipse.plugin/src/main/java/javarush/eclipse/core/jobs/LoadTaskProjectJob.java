package javarush.eclipse.core.jobs;

import java.util.List;

import javarush.eclipse.JavarushEclipsePlugin;
import javarush.eclipse.Messages;
import javarush.eclipse.core.enums._ServiceResultErrorCode;
import javarush.eclipse.core.utils.JdtUtils;
import javarush.eclipse.exceptions.BaseException;
import javarush.eclipse.exceptions.SystemException;
import javarush.eclipse.ws.client.ClassDataInfo;
import javarush.eclipse.ws.client.IJarCommonService;
import javarush.eclipse.ws.client.JarCommonService;
import javarush.eclipse.ws.client.ServiceResultErrorCode;
import javarush.eclipse.ws.client.ServiceResultOfClassDataInfoList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.swt.widgets.Display;

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

            final IJarCommonService client = new JarCommonService()
                    .getJarCommonServicePort();

            monitor.subTask(Messages.monitor_LoadTask_downloadJavaFiles);
            final ServiceResultOfClassDataInfoList res = client
                    .getTaskTemplate(sessionId, taskKey);

            if (ServiceResultErrorCode.SUCCESS != res.getErrorCode())
                throw new SystemException(_ServiceResultErrorCode.UNKNOWN_ERROR
                        .fromValue(res.getErrorCode()).getDescription());
            monitor.worked(33);

            final List<ClassDataInfo> classDatas = res.getResult().getValue()
                    .getResult();

            monitor.subTask(Messages.monitor_LoadTask_newTask);
            ICompilationUnit mainCu = null;
            for (final ClassDataInfo classInfo : classDatas) {
                final String _package = classInfo.getPackage();
                final String file = classInfo.getFileName();
                final String content = classInfo.getContentCode();

                final ICompilationUnit cu = JdtUtils.creatPackage(_package,
                        file, content, monitor);
                if ("Solution".equals(file) || isContainMainMethod(cu))
                    mainCu = cu;
            }
            if (mainCu != null)
                openInEditor(mainCu);
            monitor.worked(34);
        }
        catch (final Exception e) {
            return JavarushEclipsePlugin.status(e);
        }
        finally {
            monitor.done();
        }

        return Status.OK_STATUS;
    }

    private boolean isContainMainMethod(final ICompilationUnit cu)
                                                                  throws JavaModelException {
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

    private void openInEditor(final ICompilationUnit cu) {
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                try {
                    JavaUI.openInEditor(cu);
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
