package javarush.eclipse.ui.view.providers;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Event;

import javarush.eclipse.core.beans.TaskBean;
import javarush.eclipse.core.utils.ImageUtils;

public class TeacherColumnProvider extends AOwnerDrawLabelProvider {
    public TeacherColumnProvider(TableViewer tableViewer) {
        super(tableViewer);
    }

    @Override
    protected void measure(Event event, Object element) {
        if (!(element instanceof TaskBean))
            return;

        Image image = getResImage(element);
        Rectangle rect = image.getBounds();
        event.setBounds(
                new Rectangle(event.x, event.y, rect.width, rect.height));
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

        String img = null;
        switch (data.getTeacherCode()) {
            case 1:
                img = iconProfessorTeacher;
                break;
            case 2:
                img = iconLeelaTeacher;
                break;
            case 3:
                img = iconBenderTeacher;
                break;
            case 4:
                img = iconHermesTeacher;
                break;
            case 5:
                img = iconZoidbergTeacher;
                break;
            case 6:
                img = iconFryTeacher;
                break;
            case 7:
                img = iconZappTeacher;
                break;
            case 8:
                img = iconAmyTeacher;
                break;
            default:
                img = iconEmpty;
        }

        return ImageUtils.getImage(img);
    }
}
