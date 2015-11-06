package javarush.eclipse.core.utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;

import javarush.eclipse.JavarushEclipsePlugin;

public class ImageUtils {
    private static int RESIZE_IMAGE_HASH = "resizeImage".hashCode();

    public static ImageDescriptor getImageDescriptor(String bundleId,
                                                     String imagePath) {
        ImageRegistry registry = JavarushEclipsePlugin.getDefault()
                .getImageRegistry();
        ImageDescriptor desc = registry.getDescriptor(imagePath);
        if (desc == null) {
            desc = JavarushEclipsePlugin.getImageDescriptor(imagePath);
            registry.put(imagePath, desc);
        }
        return desc;
    }

    public static ImageDescriptor getImageDescriptor(String imagePath) {
        return getImageDescriptor(JavarushEclipsePlugin.getId(), imagePath);
    }

    public static Image getImage(String imagePath) {
        ImageRegistry registry = JavarushEclipsePlugin.getDefault()
                .getImageRegistry();
        getImageDescriptor(JavarushEclipsePlugin.getId(), imagePath);
        return registry.get(imagePath);
    }

    public static Image getImage(URL url) {
        ImageRegistry registry = JavarushEclipsePlugin.getDefault()
                .getImageRegistry();
        String name = url.toString();
        ImageDescriptor desc = registry.getDescriptor(name);
        if (desc != null) {
            desc = ImageDescriptor.createFromURL(url);
            registry.put(name, desc);
        }
        return registry.get(name);
    }

    public static Image resizeImage(final Image image, final int width,
                                    final int height) {
        ImageRegistry registry = JavarushEclipsePlugin.getDefault()
                .getImageRegistry();

        String name = String.valueOf(image.hashCode() + RESIZE_IMAGE_HASH);
        Image scaled = registry.get(name);
        if (scaled != null)
            return scaled;

        return resizeImage(image, width, height, registry, name);
    }

    public static Image resizeImage(URL url, final int width,
                                    final int height) throws IOException {
        ImageRegistry registry = JavarushEclipsePlugin.getDefault()
                .getImageRegistry();

        String name = url.toString();
        Image scaled = registry.get(name);
        if (scaled != null)
            return scaled;

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setReadTimeout(5000);
        int status = conn.getResponseCode();
        if (status != HttpURLConnection.HTTP_OK)
            switch (status) {
                case HttpURLConnection.HTTP_MOVED_TEMP:
                case HttpURLConnection.HTTP_MOVED_PERM:
                case HttpURLConnection.HTTP_SEE_OTHER:
                    url = new URL(conn.getHeaderField("Location"));
            }

        ImageDescriptor desc = ImageDescriptor.createFromURL(url);
        Image image = desc.createImage();

        return resizeImage(image, width, height, registry, name);
    }

    private static Image resizeImage(final Image image, final int width,
                                     final int height, ImageRegistry registry,
                                     String name) {
        Image scaled = new Image(Util.getDisplay(), width, height);

        final GC gc = new GC(scaled);
        gc.setInterpolation(SWT.HIGH);
        final Rectangle rect = image.getBounds();
        gc.drawImage(image, 0, 0, rect.width, rect.height, 0, 0, width, height);
        gc.dispose();

        registry.put(name, scaled);

        return scaled;
    }
}
