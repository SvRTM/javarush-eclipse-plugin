package javarush.eclipse.core;

import static javarush.eclipse.core.utils.Util.getResourceImage;

import org.eclipse.swt.graphics.Image;

public interface Constants {
    String DEFAULT_PROJECT_NAME = "JavaRushHomeWork";

    String URL_MESSAGES_INFO = "http://javarush.ru/user/messages/info";
    String URL_ASK_HELP = "http://help.javarush.ru/search/?q={0}";
    String URL_DISCUSS_TASK = "http://info.javarush.ru/search/topics/?q={0}";

    String BTN_CHECK_TASK = "javarush.eclipse.actions.CheckTaskAction";
    String BTN_TASK_LIST = "javarush.eclipse.actions.TaskListAction";

    /************************************************************************/
    Image iconTaskListReceive = getResourceImage("buuf/task-receive.png");
    Image iconCheckTask = getResourceImage("buuf/task-check.png");

    Image iconPracticalTask = getResourceImage("buuf/practical-task.png");
    Image iconHomeworkTask = getResourceImage("homework.png");
    Image iconBonusTask = getResourceImage("buuf/bonus-task.png");
    Image iconBigTask = getResourceImage("buuf/big-task.png");

    Image iconDarkMater = getResourceImage("buuf/dark-matter.png");

    Image iconAmyTeacher = getResourceImage("amy.png");
    Image iconBenderTeacher = getResourceImage("bender.png");
    Image iconFryTeacher = getResourceImage("fry.png");
    Image iconHermesTeacher = getResourceImage("hermes.png");
    Image iconLeelaTeacher = getResourceImage("leela.png");
    Image iconProfessorTeacher = getResourceImage("profesor_farsnworth.png");
    Image iconZappTeacher = getResourceImage("zapp_brannigan.png");
    Image iconZoidbergTeacher = getResourceImage("zoidberg.png");

}
