
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskInfoTeacher.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaskInfoTeacher">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Professor"/>
 *     &lt;enumeration value="Leela"/>
 *     &lt;enumeration value="Bender"/>
 *     &lt;enumeration value="Hermes"/>
 *     &lt;enumeration value="Zoidberg"/>
 *     &lt;enumeration value="Fry"/>
 *     &lt;enumeration value="Zapp"/>
 *     &lt;enumeration value="Emy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaskInfoTeacher")
@XmlEnum
public enum TaskInfoTeacher {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Professor")
    PROFESSOR("Professor"),
    @XmlEnumValue("Leela")
    LEELA("Leela"),
    @XmlEnumValue("Bender")
    BENDER("Bender"),
    @XmlEnumValue("Hermes")
    HERMES("Hermes"),
    @XmlEnumValue("Zoidberg")
    ZOIDBERG("Zoidberg"),
    @XmlEnumValue("Fry")
    FRY("Fry"),
    @XmlEnumValue("Zapp")
    ZAPP("Zapp"),
    @XmlEnumValue("Emy")
    EMY("Emy");
    private final String value;

    TaskInfoTeacher(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskInfoTeacher fromValue(String v) {
        for (TaskInfoTeacher c: TaskInfoTeacher.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
