
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionInfoStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriptionInfoStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="CREATED"/>
 *     &lt;enumeration value="ACTIVATED"/>
 *     &lt;enumeration value="ACTIVATED_IN_CREDIT"/>
 *     &lt;enumeration value="ACTIVATED_LIMITED"/>
 *     &lt;enumeration value="PAUSED"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="DISABLED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubscriptionInfoStatus")
@XmlEnum
public enum SubscriptionInfoStatus {

    UNKNOWN,
    CREATED,
    ACTIVATED,
    ACTIVATED_IN_CREDIT,
    ACTIVATED_LIMITED,
    PAUSED,
    EXPIRED,
    DISABLED;

    public String value() {
        return name();
    }

    public static SubscriptionInfoStatus fromValue(String v) {
        return valueOf(v);
    }

}
