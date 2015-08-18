package javarush.eclipse.core.beans;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;

import javarush.eclipse.Messages;
import javarush.eclipse.core.Constants;
import javarush.eclipse.core.utils.ImageUtils;

public class TaskBean {
    private int id;

    private String taskKey;

    private String title;

    private String description;
    private TaskType type;
    private int teacherCode;
    private int reward;
    private int level;
    private String taskName;
    private boolean isRestricted;
    private TaskStatus status;

    public TaskBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskKey() {
        return taskKey;
    }

    public void setTaskKey(String taskKey) {
        this.taskKey = taskKey;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskType getType() {
        return type;
    }

    public void setType(int typeCode) {
        type = TaskType.UNKNOWN.fromNumber(typeCode);
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(int teacherCode) {
        this.teacherCode = teacherCode;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isRestricted() {
        return isRestricted;
    }

    public void setRestricted(boolean restricted) {
        isRestricted = restricted;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public enum NotActiveTasks {
        LIST(TaskStatus.DISABLED, TaskStatus.PREASSIGNED,
                TaskStatus.RESTRICTED);

        private TaskStatus[] list;

        private NotActiveTasks(TaskStatus... list) {
            this.list = list;
        }

        public boolean isActive(TaskStatus taskStatus) {
            for (TaskStatus status : list)
                if (status == taskStatus)
                    return false;
            return true;
        }
    }

    public enum TaskStatus {
        UNKNOWN("Unknown", Messages.TaskStatus_Unknown, SWT.COLOR_BLACK,
                SWT.COLOR_YELLOW),
        ASSIGNED("Assigned", Messages.TaskStatus_Assigned, SWT.COLOR_DARK_BLUE,
                null),
        IN_PROGRESS("InProgress", Messages.TaskStatus_InProgress,
                SWT.COLOR_DARK_BLUE, null),
        SOLVED("Solved", Messages.TaskStatus_Solved, SWT.COLOR_DARK_GREEN,
                null),
        HIDDEN("Hidden", Messages.TaskStatus_Hidden, SWT.COLOR_DARK_GRAY,
                SWT.COLOR_DARK_YELLOW),
        PREASSIGNED("Preassigned", Messages.TaskStatus_Preassigned, null,
                SWT.COLOR_CYAN),
        RESTRICTED("Restricted", Messages.TaskStatus_Restricted, SWT.COLOR_RED,
                null),
        DISABLED("Disabled", Messages.TaskStatus_Disabled, SWT.COLOR_BLACK,
                SWT.COLOR_GRAY);

        private final String value;
        private final String text;
        private Integer foreground, background;

        private TaskStatus(String v, String t, Integer fg, Integer bg) {
            value = v;
            text = t;
            foreground = fg;
            background = bg;
        }

        public static TaskStatus fromValue(String v) {
            for (TaskStatus c : TaskStatus.values())
                if (c.value.equals(v))
                    return c;

            throw new IllegalArgumentException(v);
        }

        public String getText() {
            return text;
        }

        public Integer getForeground() {
            return foreground;
        }

        public Integer getBackground() {
            return background;
        }
    }

    public enum TaskType {
        /** Practical Task */
        PRACTICAL(2, Constants.iconPracticalTask, Messages.TaskType_Practical),
        /** Homework Task */
        HOMEWORK(3, Constants.iconHomeworkTask, Messages.TaskType_Homework),
        /** Bonus Task */
        BONUS(4, Constants.iconBonusTask, Messages.TaskType_Bonus),
        /** Big Task */
        BIG(5, Constants.iconBigTask, Messages.TaskType_Big), /** Unknown */
        UNKNOWN(-1, Constants.iconEmpty, "???");

        private int n;
        private String image;
        private String description;

        private TaskType(int n, String image, String description) {
            this.n = n;
            this.image = image;
            this.description = description;
        }

        public TaskType fromNumber(int n) {
            for (TaskType type : values())
                if (n == type.n)
                    return type;
            return UNKNOWN;
        }

        public int getN() {
            return n;
        }

        public Image getImage() {
            return ImageUtils.getImage(image);
        }

        public String getDescription() {
            return description;
        }
    }
}
