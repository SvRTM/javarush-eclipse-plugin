
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopicFilter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TopicFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="My"/>
 *     &lt;enumeration value="Friends"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TopicFilter")
@XmlEnum
public enum TopicFilter {

    @XmlEnumValue("My")
    MY("My"),
    @XmlEnumValue("Friends")
    FRIENDS("Friends"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    TopicFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TopicFilter fromValue(String v) {
        for (TopicFilter c: TopicFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
