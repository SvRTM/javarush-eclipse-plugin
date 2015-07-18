package javarush.eclipse.ui.view.listeners;

import javarush.eclipse.core.beans.TaskBean;
import javarush.eclipse.ui.view.TaskListView;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

final public class ListenerTooltipBuilder {

    private ListenerTooltipBuilder() {
    }

    public static class LabelListener implements Listener {
        private final TaskListView view;
        private final Table table;

        public LabelListener(TaskListView view) {
            this.view = view;
            table = view.getTable();
        }

        @Override
        public void handleEvent(Event event) {
            Label label = (Label) event.widget;
            Shell shell = label.getShell();
            switch (event.type) {
                case SWT.MouseDown:
                    Event e = new Event();
                    e.item = (TableItem) label.getData("_TABLEITEM");
                    // Assuming table is single select, set the selection as
                    // if the mouse down event went through to the table
                    table.setSelection(new TableItem[] { (TableItem) e.item });
                    table.notifyListeners(SWT.Selection, e);
                    shell.dispose();
                    view.setFocus();
                break;
                case SWT.MouseExit:
                    shell.dispose();
                break;
            }
        }
    }

    public static class TableListener implements Listener {
        private final Listener labelListener;
        private final Table table;

        private Shell tip = null;
        private Label label = null;

        public TableListener(TaskListView view, Listener labelListener) {
            this.labelListener = labelListener;
            table = view.getTable();
        }

        @Override
        public void handleEvent(Event event) {
            switch (event.type) {
                case SWT.Dispose:
                case SWT.KeyDown:
                case SWT.MouseMove:
                    if (tip == null)
                        break;
                    tip.dispose();
                    tip = null;
                    label = null;
                break;

                case SWT.MouseHover:
                    Point point = new Point(event.x, event.y);
                    TableItem item = table.getItem(point);
                    if (item == null)
                        break;

                    int column = 0;
                    for (int i = 0; i < table.getColumnCount(); i++) {
                        Rectangle rect = item.getBounds(i);
                        if (rect.contains(point))
                            column = i;
                    }

                    Shell shell = event.display.getActiveShell();

                    if (tip != null && !tip.isDisposed())
                        tip.dispose();
                    tip = new Shell(shell, SWT.ON_TOP | SWT.NO_FOCUS | SWT.TOOL);
                    tip.setBackground(event.display
                            .getSystemColor(SWT.COLOR_INFO_BACKGROUND));
                    FillLayout layout = new FillLayout();
                    layout.marginWidth = 2;
                    tip.setLayout(layout);
                    label = new Label(tip, SWT.WRAP);
                    label.setForeground(event.display
                            .getSystemColor(SWT.COLOR_INFO_FOREGROUND));
                    label.setBackground(event.display
                            .getSystemColor(SWT.COLOR_INFO_BACKGROUND));
                    label.setData("_TABLEITEM", item);
                    TaskBean data = (TaskBean) item.getData();
                    label.setText(column == 0 ? data.getType().getDescription()
                                             : data.getDescription());
                    label.addListener(SWT.MouseExit, labelListener);
                    label.addListener(SWT.MouseDown, labelListener);
                    Rectangle rect = item.getBounds(column);
                    // Rectangle rect = item.getBounds(0);
                    Point pt = table.toDisplay(rect.x, rect.y);
                    Point size = tip.computeSize(SWT.DEFAULT, SWT.DEFAULT);

                    int colsWidth = table.getColumn(0).getWidth()
                                    + table.getColumn(1).getWidth();
                    int width = table.getSize().x - colsWidth;
                    tip.setBounds(pt.x, pt.y, size.x > width ? width : size.x,
                            size.y);
                    tip.setVisible(true);
            }
        }
    }
}
