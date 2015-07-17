package javarush.eclipse.core.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import javarush.eclipse.JavarushEclipsePlugin;
import javarush.eclipse.exceptions.SystemException;

public class Util {
    private static Integer mVersion = null;

    public static boolean isEmpty(final String str) {
        return str == null || str.isEmpty();
    }

    public static String convertStreamToString(final InputStream is) {
        try {
            final byte[] data = new byte[is.available()];
            is.read(data);
            return new String(data, "UTF-8");
        }
        catch (final IOException e) {
            throw new SystemException(e);
        }
    }

    public static Image getResourceImage(final String file) {
        final Bundle bundle = FrameworkUtil.getBundle(Util.class);
        final URL url = FileLocator.find(bundle, new Path("icons/" + file),
                null);
        final ImageDescriptor image = ImageDescriptor.createFromURL(url);
        return image.createImage();
    }

    private static Map<Integer, Image> cache = new HashMap<Integer, Image>(3);

    public static Image resizeImage(final Image image, final int width,
                                    final int height) {
        if (image == null)
            return null;

        final int hash = image.hashCode();
        Image scaled = cache.get(hash);
        if (scaled != null)
            return scaled;

        scaled = new Image(Display.getDefault(), width, height);
        final GC gc = new GC(scaled);
        gc.setInterpolation(SWT.HIGH);
        final Rectangle rect = image.getBounds();
        gc.drawImage(image, 0, 0, rect.width, rect.height, 0, 0, width, height);
        gc.dispose();
        cache.put(hash, scaled);

        return scaled;
    }

    public static String getPrefProjectName() {
        final IPreferenceStore preferenceStore = JavarushEclipsePlugin
                .getDefault().getPreferenceStore();
        return preferenceStore.getString("projectName").trim();
    }

    public static boolean isVersionEclipse3x() {
        if (mVersion == null) {
            mVersion = getVersion("eclipse.buildId");
            if (mVersion == null)
                mVersion = getVersion("osgi.framework.version");
        }
        return 3 == mVersion;
    }

    private static Integer getVersion(String key) {
        try {
            String ver = System.getProperty(key);
            if (ver != null) {
                String v[] = ver.split("\\.");
                if (v.length != 0)
                    return Integer.valueOf(v[0]);
                return 0;
            }
        }
        catch (Exception e) {
            JavarushEclipsePlugin.logError(e);
        }

        return 0;
    }
}
