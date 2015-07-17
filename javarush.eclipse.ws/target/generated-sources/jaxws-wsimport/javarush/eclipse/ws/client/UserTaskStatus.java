
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserTaskStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserTaskStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Assigned"/>
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="Solved"/>
 *     &lt;enumeration value="Hidden"/>
 *     &lt;enumeration value="Preassigned"/>
 *     &lt;enumeration value="Restricted"/>
 *     &lt;enumeration value="Disabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserTaskStatus")
@XmlEnum
public enum UserTaskStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Assigned")
    ASSIGNED("Assigned"),
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("Solved")
    SOLVED("Solved"),
    @XmlEnumValue("Hidden")
    HIDDEN("Hidden"),
    @XmlEnumValue("Preassigned")
    PREASSIGNED("Preassigned"),
    @XmlEnumValue("Restricted")
    RESTRICTED("Restricted"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled");
    private final String value;

    UserTaskStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserTaskStatus fromValue(String v) {
        for (UserTaskStatus c: UserTaskStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
