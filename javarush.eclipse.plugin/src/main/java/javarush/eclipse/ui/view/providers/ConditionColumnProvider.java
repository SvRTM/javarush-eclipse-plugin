package javarush.eclipse.ui.view.providers;

import javarush.eclipse.core.beans.TaskBean;
import javarush.eclipse.core.beans.TaskBean.TaskStatus;
import javarush.eclipse.core.utils.Util;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.TextLayout;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;

public class ConditionColumnProvider extends AOwnerDrawLabelProvider {
    private static final int TEXT_MARGIN = 3;

    public ConditionColumnProvider(TableViewer tableViewer) {
        super(tableViewer);
    }

    @Override
    protected void measure(Event event, Object element) {
        if (!(element instanceof TaskBean))
            return;
        event.width = tableViewer.getTable().getColumn(event.index).getWidth();
        if (event.width == 0)
            return;

        TaskBean data = (TaskBean) element;
        final String text = "[" + data.getTaskName() + "] " + data.getTitle()
                            + "\n        " + data.getStatus().getText()
                            + "        " + "\n   " + data.getDescription();

        final Point size = event.gc.textExtent(text);
        event.width = size.x + 2 * TEXT_MARGIN;
        event.height = Util.isVersionEclipse3x() ? 100 : Math.max(event.height,
                size.y + TEXT_MARGIN);
    }

    //
    // Variant 2
    @Override
    public String getToolTipText(Object element) {
        if (!(element instanceof TaskBean))
            return null;
        TaskBean data = (TaskBean) element;
        return data.getDescription();
    }

    @Override
    protected void paint(Event event, Object element) {
        if (!(element instanceof TaskBean))
            return;

        TaskBean data = (TaskBean) element;

        StringBuilder sb = new StringBuilder("[" + data.getTaskName() + "] "
                                             + data.getTitle());
        int titleLen = sb.length();

        Display display = getDisplay();
        TextLayout layout = setDefaultTextLayout(event);

        Font font = JFaceResources.getFontRegistry().getBold(
                JFaceResources.DEFAULT_FONT);
        FontData fontData = font.getFontData()[0];
        fontData.setHeight(fontData.getHeight() + 2);
        Font newFont = new Font(display, fontData);
        TextStyle titleStyle = new TextStyle(newFont,
                display.getSystemColor(SWT.COLOR_LIST_FOREGROUND), null);
        titleStyle.underline = true;

        TaskStatus status = data.getStatus();

        TextStyle statusStyle = null;
        int statusLen = 0;
        if (TaskStatus.ASSIGNED != status) {
            fontData = font.getFontData()[0];
            fontData.setHeight(fontData.getHeight() + 1);
            Integer fg = status.getForeground(), bg = status.getBackground();
            statusStyle = new TextStyle(new Font(display, fontData),
                    fg == null ? null : display.getSystemColor(fg),
                    bg == null ? null : display.getSystemColor(bg));
            statusStyle.borderStyle = SWT.BORDER_DASH;

            sb.append("\n        ").append(status.getText()).append("        ");
            statusLen = sb.length() - titleLen;
        }
        // TextStyle plain = new TextStyle(
        // JFaceResources.getFont(JFaceResources.DEFAULT_FONT),
        // display.getSystemColor(SWT.COLOR_LIST_FOREGROUND), null);

        sb.append("\n   ").append(data.getDescription());

        layout.setText(sb.toString());
        layout.setStyle(titleStyle, 0, titleLen - 1);
        if (TaskStatus.ASSIGNED != status)
            layout.setStyle(statusStyle, titleLen, titleLen + statusLen - 1);
        // layout.setStyle(plain, titleLen + restrLen, sb.length() - 1);
        // layout.setWrapIndent(1);
        layout.draw(event.gc, event.x, event.y);
        layout.dispose();
    }

    @Override
    protected Image getResImage(Object element) {
        return null;
    }
}
