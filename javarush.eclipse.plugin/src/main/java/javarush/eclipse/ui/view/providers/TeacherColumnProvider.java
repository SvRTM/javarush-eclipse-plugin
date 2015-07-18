package javarush.eclipse.ui.view.providers;

import javarush.eclipse.core.beans.TaskBean;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Event;

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
        event.setBounds(new Rectangle(event.x, event.y, rect.width, rect.height));
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

        switch (data.getTeacherCode()) {
            case 1:
                return iconProfessorTeacher;
            case 2:
                return iconLeelaTeacher;
            case 3:
                return iconBenderTeacher;
            case 4:
                return iconHermesTeacher;
            case 5:
                return iconZoidbergTeacher;
            case 6:
                return iconFryTeacher;
            case 7:
                return iconZappTeacher;
            case 8:
                return iconAmyTeacher;
        }
        return null;
    }
}
