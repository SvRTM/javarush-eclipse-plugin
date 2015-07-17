
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="UNKNOWN_ERROR"/>
 *     &lt;enumeration value="INVALID"/>
 *     &lt;enumeration value="INVALID_BUT_PARTIAL_SUCCESS"/>
 *     &lt;enumeration value="TIMEOUT_ERROR"/>
 *     &lt;enumeration value="SECURITY_ERROR"/>
 *     &lt;enumeration value="TASK_SOLVED_ERROR"/>
 *     &lt;enumeration value="TASK_UNAVAILABLE_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValidationStatus")
@XmlEnum
public enum ValidationStatus {

    SUCCESS,
    UNKNOWN_ERROR,
    INVALID,
    INVALID_BUT_PARTIAL_SUCCESS,
    TIMEOUT_ERROR,
    SECURITY_ERROR,
    TASK_SOLVED_ERROR,
    TASK_UNAVAILABLE_ERROR;

    public String value() {
        return name();
    }

    public static ValidationStatus fromValue(String v) {
        return valueOf(v);
    }

}
