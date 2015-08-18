package javarush.eclipse.ui.view;

import java.text.MessageFormat;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;

import javarush.eclipse.JavarushEclipsePlugin;
import javarush.eclipse.Messages;
import javarush.eclipse.core.Constants;
import javarush.eclipse.core.beans.TaskBean;
import javarush.eclipse.core.beans.TaskBean.NotActiveTasks;
import javarush.eclipse.core.jobs.LoadTaskProjectJob;
import javarush.eclipse.core.jobs.ResetProgressTaskJob;
import javarush.eclipse.core.utils.ImageUtils;
import javarush.eclipse.core.utils.WorkspaceUtil;
import javarush.eclipse.exceptions.BaseException;
import javarush.eclipse.exceptions.BusinessException;
import javarush.eclipse.exceptions.SystemException;
import javarush.eclipse.ui.view.listeners.ListenerBuilder;
import javarush.eclipse.ui.view.listeners.ListenerTooltipBuilder;
import javarush.eclipse.ui.view.providers.ConditionColumnProvider;
import javarush.eclipse.ui.view.providers.RewardColumnProvider;
import javarush.eclipse.ui.view.providers.TeacherColumnProvider;
import javarush.eclipse.ui.view.providers.TypeColumnProvider;

public class TaskListView extends ViewPart implements Constants {
    /**
     * The ID of the view as specified by the extension.
     */
    public static final String ID = TaskListView.class.getName();

    private TableViewer tableViewer;

    private Action resetProgressTaskAction;
    private Action askHelpTaskAction;
    private Action discussTaskAction;

    private Action checkTaskAction;
    private Action taskListAction;

    private Action doubleClickAction;

    public void init(final TaskBean[] taskBeans) {
        tableViewer.setInput(taskBeans);
        tableViewer.setSelection(new StructuredSelection(taskBeans[0]));
        tableViewer.refresh();
        setEnableMenu(getTable().getItemCount() != 0);
    }

    /**
     * This is a callback that will allow us to create the viewer and initialize
     * it.
     */
    @Override
    public void createPartControl(final Composite parent) {
        tableViewer = new TableViewer(parent, SWT.BORDER | SWT.FULL_SELECTION);

        TableViewerColumn col = createTableColumn(
                Messages.table_TaskList_typeColumn, 80);
        col.setLabelProvider(new TypeColumnProvider(this, tableViewer));
        col = createTableColumn(Messages.table_TaskList_teacherColumn,
                0 /* 80 */);
        col.setLabelProvider(new TeacherColumnProvider(tableViewer));
        col = createTableColumn(Messages.table_TaskList_conditionColumn, 710);
        col.setLabelProvider(new ConditionColumnProvider(tableViewer));
        col = createTableColumn(Messages.table_TaskList_rewardColumn, 115);
        col.setLabelProvider(new RewardColumnProvider(tableViewer));

        tableViewer.setContentProvider(new ArrayContentProvider());

        final Table table = getTable();
        table.setHeaderVisible(true);
        table.setLinesVisible(true);
        table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

        table.addListener(SWT.Selection,
                new ListenerBuilder.SelectionListener(this));
        table.getColumn(0).setResizable(false);
        table.getColumn(1).setResizable(false);
        table.getColumn(3).setResizable(false);

        //
        // Variant 2
        // ColumnViewerToolTipSupport.enableFor(this.tableViewer,
        // ToolTip.NO_RECREATE);
        //
        // Variant 1
        initFakeTooltip();

        makeActions();
        hookContextMenu();
        hookDoubleClickAction();
        contributeToActionBars();

        setEnableMenu(false);
    }

    public Table getTable() {
        return tableViewer.getTable();
    }

    private TableViewerColumn createTableColumn(final String title,
                                                final int bound) {
        final TableViewerColumn tableColumn = new TableViewerColumn(tableViewer,
                SWT.NONE);
        final TableColumn column = tableColumn.getColumn();
        column.setText(title);
        column.setWidth(bound);
        column.setAlignment(SWT.CENTER);
        return tableColumn;
    }

    private void hookContextMenu() {
        final MenuManager menuMgr = new MenuManager("#PopupMenu");
        menuMgr.setRemoveAllWhenShown(true);
        menuMgr.addMenuListener(new IMenuListener() {
            @Override
            public void menuAboutToShow(final IMenuManager manager) {
                fillContextMenu(manager);
            }
        });
        final Menu menu = menuMgr.createContextMenu(tableViewer.getControl());
        tableViewer.getControl().setMenu(menu);
        getSite().registerContextMenu(menuMgr, tableViewer);
    }

    private void contributeToActionBars() {
        final IActionBars bars = getViewSite().getActionBars();
        fillLocalPullDown(bars.getMenuManager());
        fillLocalToolBar(bars.getToolBarManager());
    }

    private void fillLocalPullDown(final IMenuManager manager) {
        manager.add(askHelpTaskAction);
        manager.add(discussTaskAction);
        manager.add(resetProgressTaskAction);
    }

    private void fillContextMenu(final IMenuManager manager) {
        manager.add(askHelpTaskAction);
        manager.add(discussTaskAction);
        manager.add(resetProgressTaskAction);
    }

    private void fillLocalToolBar(final IToolBarManager manager) {
        // manager.add(checkTaskAction);
        manager.add(taskListAction);
    }

    public void setEnableMenu(final boolean v) {
        resetProgressTaskAction.setEnabled(v);
        askHelpTaskAction.setEnabled(v);
        discussTaskAction.setEnabled(v);
    }

    private void makeActions() {
        resetProgressTaskAction = new Action(
                Messages.menu_TaskList_resetProgressTask) {
            @Override
            public void run() {
                if (!MessageDialog.openConfirm(WorkspaceUtil.getShell(),
                        Messages.confirm_TaskList_titleConfirm,
                        Messages.confirm_TaskList_resetProgress))
                    return;

                final TaskBean data = getSelection();
                if (data == null)
                    throw new BusinessException(
                            Messages.error_TaskList_emptyKeyTask);

                final String taskKey = data.getTaskKey();
                final Job job = new ResetProgressTaskJob(taskKey);
                job.setUser(true);
                job.schedule();
            }
        };

        askHelpTaskAction = new Action(Messages.menu_TaskList_askHelpTask) {
            @Override
            public void run() {
                try {
                    final TaskBean data = getSelection();
                    if (data == null)
                        throw new BusinessException(
                                Messages.error_TaskList_emptyKeyTask);

                    final String url = MessageFormat.format(URL_ASK_HELP,
                            data.getTaskKey().replaceAll(",", "."));
                    WorkspaceUtil.openWebPage(url);
                }
                catch (Exception e) {
                    if (!(e instanceof BaseException))
                        e = new SystemException(e);
                    throw (BaseException) e;
                }
            }
        };

        discussTaskAction = new Action(Messages.menu_TaskList_discussTask) {
            @Override
            public void run() {
                try {
                    final TaskBean data = getSelection();
                    if (data == null)
                        throw new BusinessException(
                                Messages.error_TaskList_emptyKeyTask);

                    final String url = MessageFormat.format(URL_DISCUSS_TASK,
                            data.getTaskKey().replaceAll(",", "."));

                    WorkspaceUtil.openWebPage(url);
                }
                catch (Exception e) {
                    if (!(e instanceof BaseException))
                        e = new SystemException(e);
                    throw (BaseException) e;
                }
            }
        };

        // / /// ///
        checkTaskAction = new Action(Messages.toolbox_TaskList_checkTask) {
            @Override
            public void run() {
                resetTable();
                try {
                    WorkspaceUtil.getHandlerService()
                            .executeCommand(BTN_CHECK_TASK, null);
                }
                catch (Exception e) {
                    if (!(e instanceof BaseException))
                        e = new SystemException(e);
                    throw (BaseException) e;
                }
            }
        };
        checkTaskAction.setToolTipText(Messages.toolbox_TaskList_checkTask);
        checkTaskAction.setImageDescriptor(
                ImageUtils.getImageDescriptor(iconCheckTask));

        taskListAction = new Action(Messages.toolbox_TaskList_taskList) {
            @Override
            public void run() {
                try {
                    resetTable();
                    WorkspaceUtil.getHandlerService()
                            .executeCommand(BTN_TASK_LIST, null);
                }
                catch (Exception e) {
                    if (!(e instanceof BaseException))
                        e = new SystemException(e);
                    throw (BaseException) e;
                }
            }
        };
        taskListAction.setToolTipText(Messages.toolbox_TaskList_taskList);
        taskListAction.setImageDescriptor(
                ImageUtils.getImageDescriptor(iconTaskListReceive));

        doubleClickAction = new Action() {
            @Override
            public void run() {
                final TaskBean data = getSelection();
                if (data == null)
                    throw new BusinessException(
                            Messages.error_TaskList_emptyKeyTask);

                if (!NotActiveTasks.LIST.isActive(data.getStatus())) {
                    JavarushEclipsePlugin.warnMsg(data.getStatus().getText());
                    return;
                }

                final String taskKey = data.getTaskKey();
                final Job job = new LoadTaskProjectJob(taskKey);
                job.setUser(true);
                job.schedule();
            }
        };
    }

    private void hookDoubleClickAction() {
        tableViewer.addDoubleClickListener(new IDoubleClickListener() {
            @Override
            public void doubleClick(final DoubleClickEvent event) {
                doubleClickAction.run();
            }
        });
    }

    /**
     * Passing the focus request to the viewer's control.
     */
    @Override
    public void setFocus() {
        tableViewer.getControl().setFocus();
    }

    /***************************************************/
    private void initFakeTooltip() {
        final Table table = getTable();

        // Disable native tooltip
        table.setToolTipText("");

        // Implement a "fake" tooltip
        final Listener labelListener = new ListenerTooltipBuilder.LabelListener(
                this);
        final Listener tableListener = new ListenerTooltipBuilder.TableListener(
                this, labelListener);

        table.addListener(SWT.Dispose, tableListener);
        table.addListener(SWT.KeyDown, tableListener);
        table.addListener(SWT.MouseMove, tableListener);
        table.addListener(SWT.MouseHover, tableListener);
    }

    public IStatusLineManager getStatusLineManager() {
        final IStatusLineManager manager = getViewSite().getActionBars()
                .getStatusLineManager();
        return manager;
    }

    private void resetTable() {
        setEnableMenu(false);
        tableViewer.setInput(null);
        final IStatusLineManager manager = getStatusLineManager();
        manager.setMessage(null);
    }

    private TaskBean getSelection() {
        final ISelection selection = tableViewer.getSelection();
        final Object element = ((IStructuredSelection) selection)
                .getFirstElement();
        if (!(element instanceof TaskBean))
            return null;
        return (TaskBean) element;
    }

}
