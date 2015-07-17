package javarush.eclipse.ui.view.providers;

import javarush.eclipse.core.beans.TaskBean;
import javarush.eclipse.ui.view.TaskListView;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Event;

public class TypeColumnProvider extends AOwnerDrawLabelProvider {
    public TypeColumnProvider(TaskListView view, TableViewer tableViewer) {
        super(tableViewer);
    }

    @Override
    protected void measure(Event event, Object element) {
        if (!(element instanceof TaskBean))
            return;

        Image image = getResImage(element);
        Rectangle rectangle = image.getBounds();
        event.setBounds(new Rectangle(event.x, event.y, rectangle.width,
                rectangle.height));

        setMinHeightColumn(event);
    }

    //
    // Variant 2
    @Override
    public String getToolTipText(Object element) {
        if (!(element instanceof TaskBean))
            return null;
        TaskBean data = (TaskBean) element;
        return data.getType().getDescription();
    }

    @Override
    protected void paint(Event event, Object element) {
        if (!(element instanceof TaskBean))
            return;

        Image image = getResImage(element);
        int[] center = getCenterArea(event, image);
        event.gc.drawImage(image, center[0], center[1]);
    }

    @Override
    protected Image getResImage(Object element) {
        TaskBean data = (TaskBean) element;
        return data.getType().getImage();
    }

}
