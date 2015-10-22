package javarush.eclipse.core.utils;

import static javarush.eclipse.core.utils.Util.isEmpty;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.eclipse.ui.handlers.IHandlerService;

import javarush.eclipse.Messages;
import javarush.eclipse.exceptions.SystemException;

public class WorkspaceUtil {

    /**
     * @see org.eclipse.jdt.internal.ui->JavaPlugin
     */
    public static IWorkspace getWorkspace() {
        final IWorkspace workspace = ResourcesPlugin.getWorkspace();
        if (workspace == null)
            throw new SystemException(Messages.error_getWorkspace);
        return workspace;
    }

    public static IWorkspaceRoot getRoot() {
        final IWorkspaceRoot root = getWorkspace().getRoot();
        if (root == null)
            throw new SystemException(Messages.error_getRoot);
        return root;
    }

    public static void refreshWorkspace() throws CoreException {
        getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
    }

    public static IWorkbenchWindow getActiveWorkbenchWindow() {
        IWorkbenchWindow window = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow();
        if (window == null)
            throw new SystemException(Messages.error_getActiveWorknchWindow);
        return window;
    }

    public static IWorkbenchPage getActivePage() {
        IWorkbenchPage page = getActiveWorkbenchWindow().getActivePage();
        if (page == null)
            throw new SystemException(Messages.error_getActivePage);
        return page;
    }

    public static Shell getShell() {
        return getActiveWorkbenchWindow().getShell();
    }

    public static IFile createFile(String relativePath, String contents,
                                   IProgressMonitor monitor) throws CoreException {
        return createFile(new Path(relativePath), contents, monitor);
    }

    public static IFile createFile(IPath relativePath, final String contents,
                                   IProgressMonitor monitor) throws CoreException {
        final IFile file = getRoot().getFile(relativePath);
        getWorkspace().run(new IWorkspaceRunnable() {
            @Override
            public void run(IProgressMonitor monitor) throws CoreException {
                create(file.getParent(), monitor);
                file.delete(true, monitor);
                file.create(new ByteArrayInputStream(contents.getBytes()), true,
                        monitor);
                monitor.worked(1);
            }
        }, monitor);
        return file;
    }

    public static IFolder createFolder(IProject project, String folderName,
                                       IProgressMonitor monitor) throws CoreException {
        IFolder folder = project.getFolder(folderName);
        create(folder, monitor);
        return folder;
    }

    private static void create(final IContainer container,
                               IProgressMonitor monitor) throws CoreException {
        getWorkspace().run(new IWorkspaceRunnable() {
            @Override
            public void run(IProgressMonitor monitor) throws CoreException {
                if (container.exists())
                    return;

                create(container.getParent(), monitor);
                if (container instanceof IFolder)
                    ((IFolder) container).create(true, true, monitor);
                else
                    createProject((IProject) container, monitor);
            }
        }, monitor);
    }

    public static boolean createProject(String name) throws CoreException {
        IProject project = getRoot().getProject(name);
        if (project.exists())
            return false;
        project.create(null);
        project.open(null);
        return true;
    }

    public static IProject getProject(String name,
                                      IProgressMonitor monitor) throws CoreException {
        IProject project = getRoot().getProject(name);
        if (project.isOpen())
            return createProject(project, monitor);

        throw new SystemException(
                MessageFormat.format(Messages.error_closedProject, name));
    }

    public static IProject createProject(IProject project,
                                         IProgressMonitor monitor) throws CoreException {
        if (!project.exists())
            project.create(monitor);
        project.open(monitor);
        monitor.worked(1);
        return project;
    }

    private static IProject findProject(final String name) throws CoreException {
        for (final IResource r : getRoot().members())
            if (r instanceof IContainer && r.getName().equals(name))
                return (IProject) r;
        return null;
    }

    public static IProject getProject(final String name) throws CoreException {
        IProject prj = findProject(name);
        if (prj != null)
            return prj;

        throw new SystemException(
                MessageFormat.format(Messages.error_findProject, name));
    }

    public static boolean isProjectExists(final String name) throws CoreException {
        IProject prj = findProject(name);
        if (prj != null)
            return prj.isOpen();

        return false;
    }

    public static IFile getFile(final String fileName, final String _package,
                                final IContainer container) throws CoreException {
        String[] dirs = null;
        if (!isEmpty(_package))
            dirs = _package.split("\\.", 2);

        for (final IResource r : container.members())
            if (r instanceof IContainer) {
                if (dirs != null && dirs[0].equals(r.getName())) {
                    final IFile file = getFile(fileName,
                            dirs.length != 1 ? dirs[1] : dirs[0],
                            (IContainer) r);
                    if (file != null)
                        return file;
                }
            }
            else if (r instanceof IFile && r.getName().equals(fileName))
                return (IFile) r;

        String strError = null;
        if (_package != null)
            strError = MessageFormat.format(Messages.error_findFilePackage,
                    _package, fileName, Util.getPrefProjectName());
        else
            strError = MessageFormat.format(Messages.error_findFile, fileName,
                    Util.getPrefProjectName());
        throw new SystemException(strError);
    }

    public static IFile findFileRecursively(final IContainer container,
                                            final String name) throws CoreException {
        for (final IResource r : container.members())
            if (r instanceof IContainer) {
                final IFile file = findFileRecursively((IContainer) r, name);
                if (file != null)
                    return file;
            }
            else if (r instanceof IFile && r.getName().equals(name))
                return (IFile) r;

        return null;
    }

    public static IFolder findFolder(final IProject project,
                                     String srcFolder) throws CoreException {
        final IFolder f = project.getFolder(srcFolder);
        if (f.exists())
            return f;
        throw new SystemException(
                MessageFormat.format(Messages.error_findFolder, srcFolder));
    }

    public static void addNature(IProject project, String nature,
                                 IProgressMonitor monitor) throws CoreException {
        IProjectDescription description = project.getDescription();
        String[] natures = description.getNatureIds();
        String[] newNatures = new String[natures.length + 1];
        System.arraycopy(natures, 0, newNatures, 0, natures.length);
        newNatures[natures.length] = nature;
        description.setNatureIds(newNatures);
        project.setDescription(description, monitor);
    }

    public static IHandlerService getHandlerService() {
        IWorkbenchWindow window = getActiveWorkbenchWindow();
        IHandlerService handlerService = (IHandlerService) window
                .getService(IHandlerService.class);
        return handlerService;
    }

    public static void openWebPage(String url) throws PartInitException,
                                               MalformedURLException {
        final IWorkbenchBrowserSupport browserSupport = PlatformUI
                .getWorkbench().getBrowserSupport();
        browserSupport.createBrowser(IWorkbenchBrowserSupport.AS_EDITOR, null,
                "View Eclipse", "Here's a hint").openURL(new URL(url));
    }

    protected static IPath getRootlocation() {
        final IPath location = getRoot().getLocation();
        if (location != null)
            return location;
        throw new SystemException(Messages.error_getRootLocation);
    }

}
