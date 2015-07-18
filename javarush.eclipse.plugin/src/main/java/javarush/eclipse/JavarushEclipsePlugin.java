package javarush.eclipse;

import javarush.eclipse.core.utils.WorkspaceUtil;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class JavarushEclipsePlugin extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "javarush.eclipse";

    // The shared instance
    private static JavarushEclipsePlugin plugin;

    public boolean started;
    public static String ERROR = "Error"; //$NON-NLS-1$

    /**
     * The constructor
     */
    public JavarushEclipsePlugin() {
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
    public static ImageDescriptor getImageDescriptor(final String path) {
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
    }

    public static void errorMsg(Throwable throwable) {
        String message = ERROR + "\n" + throwable.getMessage();
        MessageDialog.openError(WorkspaceUtil.getShell(), Messages.title,
                message);
    }

    public static void warnMsg(String message) {
        MessageDialog.openWarning(WorkspaceUtil.getShell(), Messages.title,
                message);
    }

    public static IStatus status(Throwable throwable) {
        return new Status(IStatus.ERROR, PLUGIN_ID, IStatus.ERROR,
                throwable.toString(), throwable);
    }

    /**
     * Utility method to log an error represented by/in {@link Throwable}
     * 
     * @param throwable
     *            The {@link Throwable} to log
     */
    public static final void logError(final Throwable throwable) {
        log(status(throwable));
    }

    /**
     * Utility method to log an information message
     * 
     * @param message
     *            The text to be logged
     */
    public static final void logInfo(final String message) {
        // if (INFO)
        log(new Status(IStatus.INFO, PLUGIN_ID, IStatus.INFO, message, null));
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
            log(new Status(IStatus.WARNING, PLUGIN_ID, IStatus.WARNING,
                    message, null));
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
