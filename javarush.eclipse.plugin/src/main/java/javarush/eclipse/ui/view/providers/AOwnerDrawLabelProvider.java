package javarush.eclipse.ui.view.providers;

import org.eclipse.jface.viewers.OwnerDrawLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.graphics.TextLayout;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.TableItem;

import javarush.eclipse.core.Constants;

public abstract class AOwnerDrawLabelProvider extends OwnerDrawLabelProvider
        implements Constants {
    protected static final int IMAGE_MARGIN = 10;
    protected static final int MIN_IMAGE_HEIGHT = 64;

    protected TableViewer tableViewer;

    public AOwnerDrawLabelProvider(TableViewer tableViewer) {
        this.tableViewer = tableViewer;
    }

    protected abstract Image getResImage(Object element);

    protected int[] getCenterArea(Event event, Image image) {
        if (image == null || event == null)
            return new int[] { 0, 0 };

        int widthCol = getColumnWidth(event);
        int heightCol = ((TableItem) event.item).getBounds().height;
        Rectangle rect = image.getBounds();
        int x = rect.width;
        int y = rect.height;

        x = widthCol / 2 - x / 2;
        if (x <= 0)
            x = event.x;
        else
            x += event.x;
        y = heightCol / 2 - y / 2;
        if (y <= 0)
            y = event.y;
        else
            y += event.y;

        return new int[] { x, y };
    }

    protected void setMinHeightColumn(Event event) {
        int heightCol = event.height;
        if (heightCol < MIN_IMAGE_HEIGHT + IMAGE_MARGIN) {
            heightCol = MIN_IMAGE_HEIGHT + IMAGE_MARGIN;
            event.height = heightCol;
        }
    }

    protected Display getDisplay() {
        return Display.getCurrent();
    }

    protected Color getSystemColor(Integer id) {
        if (id == null)
            return null;
        return getDisplay().getSystemColor(id);
    }

    protected TextLayout createDefaultTextLayout(Event event) {
        TextLayout layout = new TextLayout(getDisplay());
        layout.setAlignment(SWT.LEFT);
        layout.setJustify(true);
        int width = getColumnWidth(event);
        layout.setWidth(width > 0 ? width : 1);
        return layout;
    }

    protected TextStyle createTextStyle(FontData fontData, Color foreground) {
        return createTextStyle(fontData, foreground, null);
    }

    protected TextStyle createTextStyle(FontData fontData, Color foreground,
                                        Color background) {
        return new TextStyle(new Font(getDisplay(), fontData), foreground,
                background);
    }

    private int getColumnWidth(Event event) {
        return tableViewer.getTable().getColumn(event.index).getWidth();
    }

}
