package javarush.eclipse;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import javarush.eclipse.core.utils.WorkspaceUtil;

/**
 * The activator class controls the plug-in life cycle
 */
public class JavarushEclipsePlugin extends AbstractUIPlugin {
    // The shared instance
    private static JavarushEclipsePlugin plugin;

    public boolean started;
    public static String ERROR = "Error"; //$NON-NLS-1$

    /**
     * The constructor
     */
    public JavarushEclipsePlugin() {
    }

    public static String getId() {
        return plugin.getBundle().getSymbolicName();
    }

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
     * BundleContext
     * )
     */
    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        started = true;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.
     * BundleContext
     * )
     */
    @Override
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        started = false;
        super.stop(context);
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static JavarushEclipsePlugin getDefault() {
        return plugin;
    }

    /**
     * Returns an image descriptor for the image file at the given
     * plug-in relative path
     *
     * @param path
     *            the path
     * @return the image descriptor
     */
    public static ImageDescriptor getImageDescriptor(final String imagePath) {
        return imageDescriptorFromPlugin(getId(), imagePath);
    }

    public static void showMsg(final int kind, final String title,
                               final String msg) {
        MessageDialog.open(kind, WorkspaceUtil.getShell(), title, msg,
                MessageDialog.NONE);
    }

    public static void errorMsg(String title, String msg) {
        MessageDialog.openError(WorkspaceUtil.getShell(), title, msg);
    }

    public static void warnMsg(String title, String message) {
        MessageDialog.openWarning(WorkspaceUtil.getShell(), Messages.title,
                message);
    }

    public static IStatus statusError(Throwable throwable) {
        return new Status(IStatus.ERROR, getId(), IStatus.ERROR,
                throwable.toString(), throwable);
    }

    public static IStatus statusWarning(String msg) {
        return new Status(IStatus.WARNING, getId(), IStatus.WARNING, msg, null);
    }

    /**
     * Utility method to log an error represented by/in {@link Throwable}
     *
     * @param throwable
     *            The {@link Throwable} to log
     */
    public static final void logError(final Throwable throwable) {
        log(statusError(throwable));
    }

    /**
     * Utility method to log an information message
     *
     * @param message
     *            The text to be logged
     */
    public static final void logInfo(final String message) {
        log(new Status(IStatus.INFO, getId(), IStatus.INFO, message, null));
    }

    /**
     * Utility method to log a debug message
     *
     * @param message
     *            The text to be logged
     */
    public static final void logDebug(final String message) {
        // HACKTAG: Dont know why - but we need to do a null check (for 3.1)
        if (getDefault() != null && getDefault().isDebugging())
            log(statusWarning(message));
    }

    /**
     * Utility method to log {@link IStatus}
     *
     * @param status
     */
    private static final void log(final IStatus status) {
        getDefault().getLog().log(status);
    }

}
