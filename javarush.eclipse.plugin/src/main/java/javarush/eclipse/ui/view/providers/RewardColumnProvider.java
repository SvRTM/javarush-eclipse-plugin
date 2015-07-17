package javarush.eclipse.ui.view.providers;

import javarush.eclipse.core.beans.TaskBean;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.graphics.TextLayout;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;

public class RewardColumnProvider extends AOwnerDrawLabelProvider {

    public RewardColumnProvider(TableViewer tableViewer) {
        super(tableViewer);
    }

    @Override
    protected void measure(Event event, Object element) {
        if (!(element instanceof TaskBean))
            return;

        TaskBean data = (TaskBean) element;
        String reward = " x " + data.getReward();
        final Point size = event.gc.textExtent(reward);
        Rectangle rect = getResImage().getBounds();
        event.setBounds(new Rectangle(event.x, event.y, rect.width + size.x,
                rect.height));
    }

    @Override
    protected void paint(Event event, Object element) {
        if (!(element instanceof TaskBean))
            return;

        TaskBean data = (TaskBean) element;
        String reward = " x " + data.getReward();

        Image image = getResImage();
        int[] center = getCenterArea(event, image);
        event.gc.drawImage(image, event.x + 10, center[1]);

        Rectangle rectangle = image.getBounds();

        Display display = getDisplay();
        TextStyle bold = new TextStyle(JFaceResources.getFontRegistry()
                .getBold(JFaceResources.DEFAULT_FONT),
                display.getSystemColor(SWT.COLOR_LIST_FOREGROUND), null);
        TextLayout layout = new TextLayout(display);
        layout.setText(reward);
        layout.setStyle(bold, 0, reward.length() - 1);
        layout.draw(event.gc, event.x + 10 + rectangle.width + 5,
                center[1] + image.getBounds().width / 2 - 8);
        layout.dispose();
    }

    @Override
    protected Image getResImage(Object element) {
        return iconDarkMater;
    }

    private Image getResImage() {
        return getResImage(null);
    }
}
