package javarush.eclipse.core.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;

import javarush.eclipse.JavarushEclipsePlugin;
import javarush.eclipse.core.Constants;
import javarush.eclipse.exceptions.SystemException;

public class Util {
    private static Integer mVersion = null;

    public static boolean isEmpty(final String str) {
        return str == null || str.isEmpty();
    }

    public static Display getDisplay() {
        Display display = Display.getCurrent();
        // may be null if outside the UI thread
        if (display == null)
            display = Display.getDefault();
        return display;
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

    public static Font defaultBoldFont() {
        return JFaceResources.getFontRegistry()
                .getBold(JFaceResources.DEFAULT_FONT);
    }

    public static FontData addHeightFont(int height, Font font) {
        FontData fontData = font.getFontData()[0];
        fontData.setHeight(fontData.getHeight() + height);
        return fontData;
    }

    public static String getPrefProjectName() {
        final IPreferenceStore preferenceStore = JavarushEclipsePlugin
                .getDefault().getPreferenceStore();
        return preferenceStore.getString("projectName").trim();
    }

    public static boolean isVersionEclipse3x() {
        if (mVersion == null) {
            mVersion = getVersion("eclipse.buildId");
            if (mVersion == 0)
                mVersion = getVersion("osgi.framework.version");
        }
        return 3 == mVersion;
    }

    private static Integer getVersion(String key) {
        try {
            String ver = System.getProperty(key);
            if (ver != null) {
                String v[] = ver.split("\\.");
                if (v.length != 0 && v[0].charAt(0) >= '0'
                    && v[0].charAt(0) <= '9')
                    return Integer.valueOf(v[0]);
                return 0;
            }
        }
        catch (Exception e) {
            JavarushEclipsePlugin.logError(e);
        }

        return 0;
    }

    public static String getSecretKey(IProject project) throws CoreException {
        final IFile file = WorkspaceUtil.getFile(Constants.FILE_SECRET_KEY,
                null, project);

        InputStream in = file.getContents();
        try {
            final Properties prop = new Properties();
            prop.load(in);
            final String secretKey = prop.getProperty(Constants.PROPERTY_KEY);

            return secretKey != null ? secretKey.trim() : null;
        }
        catch (final Exception e) {
            throw new SystemException(e);
        }
    }

}
