package javarush.eclipse.ui.view.listeners;

import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TableItem;

import javarush.eclipse.core.beans.TaskBean;
import javarush.eclipse.core.beans.TaskBean.NotActiveTasks;
import javarush.eclipse.core.utils.ImageUtils;
import javarush.eclipse.ui.view.TaskListView;

final public class ListenerBuilder {
    private ListenerBuilder() {
    }

    public static class SelectionListener implements Listener {
        private final TaskListView view;

        public SelectionListener(TaskListView view) {
            this.view = view;
        }

        @Override
        public void handleEvent(Event event) {
            IStatusLineManager manager = view.getStatusLineManager();

            TableItem item = view.getTable().getSelection()[0];
            if (item == null) {
                manager.setMessage(null);
                return;
            }

            TaskBean data = (TaskBean) item.getData();
            if (data == null)
                manager.setMessage(null);
            else {
                view.setEnableMenu(
                        NotActiveTasks.LIST.isActive(data.getStatus()));
                manager.setMessage(
                        ImageUtils.resizeImage(data.getType().getImage(), 24,
                                24),
                        "[" + data.getType().getDescription() + "]  =>  "
                                              + data.getTitle());
            }
        }
    }
}
