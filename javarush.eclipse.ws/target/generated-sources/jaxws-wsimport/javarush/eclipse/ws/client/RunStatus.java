
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RunStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RunStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="UNKNOWN_ERROR"/>
 *     &lt;enumeration value="MAIN_CLASS_NOT_FOUND_ERROR"/>
 *     &lt;enumeration value="TIMEOUT_ERROR"/>
 *     &lt;enumeration value="SECURITY_ERROR"/>
 *     &lt;enumeration value="FATAL_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RunStatus")
@XmlEnum
public enum RunStatus {

    SUCCESS,
    UNKNOWN_ERROR,
    MAIN_CLASS_NOT_FOUND_ERROR,
    TIMEOUT_ERROR,
    SECURITY_ERROR,
    FATAL_ERROR;

    public String value() {
        return name();
    }

    public static RunStatus fromValue(String v) {
        return valueOf(v);
    }

}
