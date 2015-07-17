
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskInfoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaskInfoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Example"/>
 *     &lt;enumeration value="Practic"/>
 *     &lt;enumeration value="Homework"/>
 *     &lt;enumeration value="Bonus"/>
 *     &lt;enumeration value="Big"/>
 *     &lt;enumeration value="Pair"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaskInfoType")
@XmlEnum
public enum TaskInfoType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Example")
    EXAMPLE("Example"),
    @XmlEnumValue("Practic")
    PRACTIC("Practic"),
    @XmlEnumValue("Homework")
    HOMEWORK("Homework"),
    @XmlEnumValue("Bonus")
    BONUS("Bonus"),
    @XmlEnumValue("Big")
    BIG("Big"),
    @XmlEnumValue("Pair")
    PAIR("Pair");
    private final String value;

    TaskInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskInfoType fromValue(String v) {
        for (TaskInfoType c: TaskInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
