
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceResultErrorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceResultErrorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="AuthorizationError"/>
 *     &lt;enumeration value="RequestTimeout"/>
 *     &lt;enumeration value="ServerUnavailable"/>
 *     &lt;enumeration value="ApiVersionMismatch"/>
 *     &lt;enumeration value="UnknownUser"/>
 *     &lt;enumeration value="UnknownTask"/>
 *     &lt;enumeration value="TaskSolved"/>
 *     &lt;enumeration value="TaskUnavailable"/>
 *     &lt;enumeration value="AccessDenied"/>
 *     &lt;enumeration value="UnknownError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceResultErrorCode")
@XmlEnum
public enum ServiceResultErrorCode {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("AuthorizationError")
    AUTHORIZATION_ERROR("AuthorizationError"),
    @XmlEnumValue("RequestTimeout")
    REQUEST_TIMEOUT("RequestTimeout"),
    @XmlEnumValue("ServerUnavailable")
    SERVER_UNAVAILABLE("ServerUnavailable"),
    @XmlEnumValue("ApiVersionMismatch")
    API_VERSION_MISMATCH("ApiVersionMismatch"),
    @XmlEnumValue("UnknownUser")
    UNKNOWN_USER("UnknownUser"),
    @XmlEnumValue("UnknownTask")
    UNKNOWN_TASK("UnknownTask"),
    @XmlEnumValue("TaskSolved")
    TASK_SOLVED("TaskSolved"),
    @XmlEnumValue("TaskUnavailable")
    TASK_UNAVAILABLE("TaskUnavailable"),
    @XmlEnumValue("AccessDenied")
    ACCESS_DENIED("AccessDenied"),
    @XmlEnumValue("UnknownError")
    UNKNOWN_ERROR("UnknownError");
    private final String value;

    ServiceResultErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceResultErrorCode fromValue(String v) {
        for (ServiceResultErrorCode c: ServiceResultErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
