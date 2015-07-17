
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HelpTestStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HelpTestStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="MISPRINT"/>
 *     &lt;enumeration value="NO_OUTPUT"/>
 *     &lt;enumeration value="NEGATIVE_NUMBERS_SUPPORT"/>
 *     &lt;enumeration value="EQUAL_NUMBERS_SUPPORT"/>
 *     &lt;enumeration value="MIN_BUT_MAX"/>
 *     &lt;enumeration value="MAX_BUT_MIN"/>
 *     &lt;enumeration value="TOO_MACH_OUTPUT"/>
 *     &lt;enumeration value="HELP_TOO_LITTLE_OUTPUT"/>
 *     &lt;enumeration value="HELP_ZERO_NUMBERS_SUPPORT"/>
 *     &lt;enumeration value="HELP_PARAMS_ORDER_REVERSED"/>
 *     &lt;enumeration value="ONE_LINE_EXPECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HelpTestStatus")
@XmlEnum
public enum HelpTestStatus {

    UNKNOWN,
    MISPRINT,
    NO_OUTPUT,
    NEGATIVE_NUMBERS_SUPPORT,
    EQUAL_NUMBERS_SUPPORT,
    MIN_BUT_MAX,
    MAX_BUT_MIN,
    TOO_MACH_OUTPUT,
    HELP_TOO_LITTLE_OUTPUT,
    HELP_ZERO_NUMBERS_SUPPORT,
    HELP_PARAMS_ORDER_REVERSED,
    ONE_LINE_EXPECTED;

    public String value() {
        return name();
    }

    public static HelpTestStatus fromValue(String v) {
        return valueOf(v);
    }

}
