package javarush.eclipse.ui.view.providers;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.TextLayout;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.swt.widgets.Event;

import javarush.eclipse.core.beans.TaskBean;
import javarush.eclipse.core.beans.TaskBean.TaskStatus;
import javarush.eclipse.core.utils.Util;

public class ConditionColumnProvider extends AOwnerDrawLabelProvider {
    private static final int TEXT_MARGIN = 3;
    private static final int HEIGHT_ROW_FOR_ECLIPSE_3X = 100;

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
        event.height = Util.isVersionEclipse3x() ? HEIGHT_ROW_FOR_ECLIPSE_3X
                                                 : Math.max(event.height,
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

        StringBuilder sb = new StringBuilder(
                "[" + data.getTaskName() + "] " + data.getTitle());
        int titleLen = sb.length();

        Font font = Util.defaultBoldFont();
        TextStyle titleStyle = createTextStyle(Util.addHeightFont(2, font),
                getSystemColor(SWT.COLOR_LIST_FOREGROUND));
        titleStyle.underline = true;

        TaskStatus status = data.getStatus();

        TextStyle statusStyle = null;
        int statusLen = 0;
        if (TaskStatus.ASSIGNED != status) {
            statusStyle = createTextStyle(Util.addHeightFont(1, font),
                    getSystemColor(status.getForeground()),
                    getSystemColor(status.getBackground()));
            statusStyle.borderStyle = SWT.BORDER_DASH;

            sb.append("\n        ").append(status.getText()).append("        ");
            statusLen = sb.length() - titleLen;
        }

        sb.append("\n   ").append(data.getDescription());

        TextLayout layout = createDefaultTextLayout(event);
        layout.setText(sb.toString());
        layout.setStyle(titleStyle, 0, titleLen - 1);
        if (TaskStatus.ASSIGNED != status)
            layout.setStyle(statusStyle, titleLen, titleLen + statusLen - 1);
        layout.draw(event.gc, event.x, event.y);
        layout.dispose();
    }

    @Override
    protected Image getResImage(Object element) {
        return null;
    }
}
