package javarush.eclipse.core.jobs;

import static javarush.eclipse.core.Constants.URL_MESSAGES_INFO;

import java.text.MessageFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javarush.eclipse.JavarushEclipsePlugin;
import javarush.eclipse.Messages;
import javarush.eclipse.core.beans.TaskBean;
import javarush.eclipse.core.beans.TaskBean.TaskStatus;
import javarush.eclipse.core.enums._ServiceResultErrorCode;
import javarush.eclipse.core.utils.WorkspaceUtil;
import javarush.eclipse.exceptions.BaseException;
import javarush.eclipse.exceptions.SystemException;
import javarush.eclipse.ui.view.TaskListView;
import javarush.eclipse.ws.client.IJarCommonService;
import javarush.eclipse.ws.client.ServiceResultErrorCode;
import javarush.eclipse.ws.client.ServiceResultOfInteger;
import javarush.eclipse.ws.client.ServiceResultOfTaskInfoList;
import javarush.eclipse.ws.client.TaskInfo;
import javarush.eclipse.ws.client.TaskInfoType;
import javarush.eclipse.ws.client.UserTaskStatus;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

public class TaskListJob extends AJob {

    public TaskListJob() {
        super(Messages.title_TaskList);
    }

    @Override
    protected IStatus run(final IProgressMonitor monitor) {
        try {
            monitor.beginTask(Messages.monitor_TaskList, 100);

            monitor.subTask(Messages.monitor_Authorization);
            final String sessionId = authorize();
            monitor.worked(25);

            final IJarCommonService client = getClient();

            monitor.subTask(Messages.monitor_TaskList_countUnreadMessages);
            final ServiceResultOfInteger unreadMessages = client
                    .getUnreadedMessagesCount(sessionId);

            if (ServiceResultErrorCode.SUCCESS != unreadMessages.getErrorCode())
                throw new SystemException(_ServiceResultErrorCode.UNKNOWN_ERROR
                        .fromValue(unreadMessages.getErrorCode())
                        .getDescription());
            monitor.worked(25);

            final int countMessages = unreadMessages.getResult().intValue();
            if (countMessages > 0)
                openConfirm(countMessages);

            monitor.subTask(Messages.monitor_TaskList_countUnresolvedTasks);
            final ServiceResultOfTaskInfoList unresolvedTasks = client
                    .getUnsolvedHomeTasks(sessionId);

            if (ServiceResultErrorCode.SUCCESS != unresolvedTasks
                    .getErrorCode())
                throw new SystemException(_ServiceResultErrorCode.UNKNOWN_ERROR
                        .fromValue(unresolvedTasks.getErrorCode())
                        .getDescription());

            final List<TaskInfo> taskInfos = unresolvedTasks.getResult()
                    .getValue().getResult();
            monitor.worked(25);

            monitor.subTask(Messages.monitor_TaskList_sortingTasks);
            sortTaskByLevel(taskInfos);

            if (taskInfos.size() == 0) {
                openInformation();
                return Status.OK_STATUS;
            }

            final TaskBean[] taskBeans = new TaskBean[taskInfos.size()];
            for (int i = 0; i < taskInfos.size(); i++) {
                final TaskInfo taskInfo = taskInfos.get(i);
                final TaskBean task = new TaskBean();
                taskBeans[i] = task;

                task.setId(taskInfo.getInterestRating());
                task.setTaskKey(taskInfo.getTaskKey());
                task.setTitle(taskInfo.getTitle());
                task.setDescription(taskInfo.getDescription());
                task.setType(taskInfo.getType().ordinal());
                task.setTeacherCode(taskInfo.getTeacher().ordinal());
                task.setRestricted(UserTaskStatus.RESTRICTED == taskInfo
                        .getStatus());
                task.setStatus(TaskStatus.fromValue(taskInfo.getStatus()
                        .value()));
                task.setReward(taskInfo.getGold() * 5 + taskInfo.getSilver());
                task.setLevel(taskInfo.getLevel());
                task.setTaskName(MessageFormat.format("{0}.{1}{2}{3}", taskInfo
                        .getLevel(), taskInfo.getLesson(),
                        TaskInfoType.BONUS == taskInfo.getType() ? " bonus "
                                                                : ".", taskInfo
                                .getNumber()));
            }
            monitor.worked(25);

            ui(taskBeans);
        }
        catch (final Exception e) {
            return JavarushEclipsePlugin.status(e);
        }
        finally {
            monitor.done();
        }

        return Status.OK_STATUS;
    }

    private void ui(final TaskBean[] taskBeans) {
        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {
                try {
                    final TaskListView view = (TaskListView) WorkspaceUtil
                            .getActiveWorkbenchWindow().getActivePage()
                            .showView(TaskListView.ID);
                    view.init(taskBeans);
                }
                catch (Exception e) {
                    if (!(e instanceof BaseException))
                        e = new SystemException(e);
                    JavarushEclipsePlugin.logError(e);
                    JavarushEclipsePlugin.errorMsg(e);
                }
            }
        });
    }

    private void openInformation() {
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                try {
                    MessageDialog.openInformation(WorkspaceUtil.getShell(),
                            Messages.title_TaskList,
                            Messages.info_TaskList_noAvailableTasks);
                }
                catch (Exception e) {
                    if (!(e instanceof BaseException))
                        e = new SystemException(e);
                    JavarushEclipsePlugin.logError(e);
                    JavarushEclipsePlugin.errorMsg(e);
                }
            }
        });
    }

    private void openConfirm(final int countMessages) {
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                try {
                    if (MessageDialog.openConfirm(WorkspaceUtil.getShell(),
                            Messages.confirm_TaskList_titleUnreadMessages,
                            MessageFormat.format(
                                    Messages.info_TaskList_unreadMessages,
                                    countMessages)))
                        WorkspaceUtil.openWebPage(URL_MESSAGES_INFO);
                }
                catch (Exception e) {
                    if (!(e instanceof BaseException))
                        e = new SystemException(e);
                    JavarushEclipsePlugin.logError(e);
                    JavarushEclipsePlugin.errorMsg(e);
                }
            }
        });
    }

    private void sortTaskByLevel(final List<TaskInfo> tasks) {
        Collections.sort(tasks, new Comparator<TaskInfo>() {
            @Override
            public int compare(final TaskInfo task1, final TaskInfo task2) {
                return getTaskWeight(task2) - getTaskWeight(task1);
            }

            public int getTaskWeight(final TaskInfo task) {
                int weight = task.getNumber();

                if (TaskInfoType.BONUS == task.getType())
                    weight += 15;

                return task.getLevel() * 10000 + task.getLesson() * 100
                       + weight;
            }
        });
    }

}
