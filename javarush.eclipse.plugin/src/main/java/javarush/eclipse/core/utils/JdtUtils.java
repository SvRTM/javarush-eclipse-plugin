package javarush.eclipse.core.utils;

import java.io.UnsupportedEncodingException;

import javarush.eclipse.Messages;
import javarush.eclipse.exceptions.SystemException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;

public class JdtUtils {

    public static IJavaProject createJavaProject(String name, String srcFolder,
                                                 String buildFolder,
                                                 IProgressMonitor monitor)
                                                                          throws CoreException {
        IProject project = WorkspaceUtil.getProject(name, monitor);
        WorkspaceUtil.createFolder(project, srcFolder, monitor);
        WorkspaceUtil.addNature(project, JavaCore.NATURE_ID, monitor);
        IJavaProject javaProject = createProject(project);
        addFolders(javaProject, srcFolder, buildFolder, monitor);
        return javaProject;
    }

    public static IJavaProject createProject(IProject project) {
        return JavaCore.create(project);
    }

    public static void addFolders(IJavaProject javaProject, String srcFolder,
                                  String buildFolder, IProgressMonitor monitor)
                                                                               throws JavaModelException {
        IProject project = javaProject.getProject();

        IClasspathEntry[] buildPath = {
                                       JavaCore.newSourceEntry(project
                                               .getFullPath().append(srcFolder)),
                                       JavaRuntime
                                               .getDefaultJREContainerEntry() };
        javaProject.setRawClasspath(buildPath,
                project.getFullPath().append(buildFolder), monitor);
    }

    public static ICompilationUnit creatPackage(String _package,
                                                String fileName,
                                                String content,
                                                IProgressMonitor monitor)
                                                                         throws CoreException,
                                                                         UnsupportedEncodingException {
        IPackageFragmentRoot packageRoot = getSourceFolder(monitor);
        IPackageFragment fragment = packageRoot.createPackageFragment(_package,
                true, monitor);
        return fragment.createCompilationUnit(fileName,
                new String(content.getBytes("UTF-8"), "UTF-8"), false, monitor);
    }

    public static IJavaElement getActiveEditorJavaInput() {
        IWorkbenchPage page = WorkspaceUtil.getActivePage();
        IEditorPart part = page.getActiveEditor();
        if (part == null)
            throw new SystemException(Messages.error_getActiveEditor);

        IEditorInput editorInput = part.getEditorInput();
        if (editorInput == null)
            throw new SystemException(Messages.error_getEditorInput);

        return JavaUI.getEditorInputJavaElement(editorInput);
    }

    public static IPackageFragmentRoot getSourceFolder(IProgressMonitor monitor)
                                                                                throws CoreException {
        IPackageFragmentRoot[] fragmentRoots = JavaCore.create(
                WorkspaceUtil.getProject(Util.getPrefProjectName(), monitor))
                .getPackageFragmentRoots();

        for (IPackageFragmentRoot fragmentRoot : fragmentRoots)
            if (IPackageFragmentRoot.K_SOURCE == fragmentRoot.getKind())
                return fragmentRoot;

        throw new SystemException(Messages.error_sourceFolderNotFound);
    }
}
