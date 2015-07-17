
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionInfoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriptionInfoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="LEVELS_11_20"/>
 *     &lt;enumeration value="LEVELS_21_30"/>
 *     &lt;enumeration value="LEVELS_31_40"/>
 *     &lt;enumeration value="JAVA_CORE_11_40"/>
 *     &lt;enumeration value="MONTH_11_40"/>
 *     &lt;enumeration value="VOLUNTEER_11_40"/>
 *     &lt;enumeration value="JAVA_CORE_11_40_LIMITED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubscriptionInfoType")
@XmlEnum
public enum SubscriptionInfoType {

    UNKNOWN,
    LEVELS_11_20,
    LEVELS_21_30,
    LEVELS_31_40,
    JAVA_CORE_11_40,
    MONTH_11_40,
    VOLUNTEER_11_40,
    JAVA_CORE_11_40_LIMITED;

    public String value() {
        return name();
    }

    public static SubscriptionInfoType fromValue(String v) {
        return valueOf(v);
    }

}
