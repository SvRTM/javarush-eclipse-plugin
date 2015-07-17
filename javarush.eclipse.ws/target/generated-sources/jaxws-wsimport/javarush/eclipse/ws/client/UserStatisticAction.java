
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserStatisticAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserStatisticAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="SignUp"/>
 *     &lt;enumeration value="SignIn"/>
 *     &lt;enumeration value="TaskInProgress"/>
 *     &lt;enumeration value="TaskSolved"/>
 *     &lt;enumeration value="LessonUp"/>
 *     &lt;enumeration value="LevelUp"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserStatisticAction")
@XmlEnum
public enum UserStatisticAction {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("SignUp")
    SIGN_UP("SignUp"),
    @XmlEnumValue("SignIn")
    SIGN_IN("SignIn"),
    @XmlEnumValue("TaskInProgress")
    TASK_IN_PROGRESS("TaskInProgress"),
    @XmlEnumValue("TaskSolved")
    TASK_SOLVED("TaskSolved"),
    @XmlEnumValue("LessonUp")
    LESSON_UP("LessonUp"),
    @XmlEnumValue("LevelUp")
    LEVEL_UP("LevelUp");
    private final String value;

    UserStatisticAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserStatisticAction fromValue(String v) {
        for (UserStatisticAction c: UserStatisticAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
