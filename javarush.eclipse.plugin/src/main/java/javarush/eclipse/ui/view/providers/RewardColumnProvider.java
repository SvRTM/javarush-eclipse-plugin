package javarush.eclipse.ui.view.providers;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.graphics.TextLayout;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.swt.widgets.Event;

import javarush.eclipse.core.beans.TaskBean;
import javarush.eclipse.core.utils.ImageUtils;
import javarush.eclipse.core.utils.Util;

public class RewardColumnProvider extends AOwnerDrawLabelProvider {

    public RewardColumnProvider(TableViewer tableViewer) {
        super(tableViewer);
    }

    @Override
    protected void measure(Event event, Object element) {
        if (!(element instanceof TaskBean))
            return;

        TaskBean data = (TaskBean) element;
        final Point size = event.gc.textExtent(getReward(data));
        Rectangle rect = getResImage().getBounds();
        event.setBounds(new Rectangle(event.x, event.y, rect.width + size.x,
                rect.height));
    }

    @Override
    protected void paint(Event event, Object element) {
        if (!(element instanceof TaskBean))
            return;

        TaskBean data = (TaskBean) element;

        Image image = getResImage();
        int[] center = getCenterArea(event, image);
        event.gc.drawImage(image, event.x + 10, center[1]);

        Rectangle rectangle = image.getBounds();

        TextLayout layout = new TextLayout(getDisplay());

        String reward = getReward(data);
        layout.setText(reward);

        TextStyle textStyleBold = new TextStyle(Util.defaultBoldFont(),
                getSystemColor(SWT.COLOR_LIST_FOREGROUND), null);
        layout.setStyle(textStyleBold, 0, reward.length() - 1);

        layout.draw(event.gc, event.x + 10 + rectangle.width + 5,
                center[1] + image.getBounds().width / 2 - 8);
        layout.dispose();
    }

    @Override
    protected Image getResImage(Object element) {
        return ImageUtils.getImage(iconDarkMater);
    }

    private String getReward(TaskBean data) {
        return " x " + data.getReward();
    }

    private Image getResImage() {
        return getResImage(null);
    }
}
