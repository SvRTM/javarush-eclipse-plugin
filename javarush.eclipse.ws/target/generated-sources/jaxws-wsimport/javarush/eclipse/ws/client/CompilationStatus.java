
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompilationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompilationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="UNKNOWN_ERROR"/>
 *     &lt;enumeration value="SAVE_ERROR"/>
 *     &lt;enumeration value="QUOTE_EXPECTED_ERROR"/>
 *     &lt;enumeration value="SEMICOLON_EXPECTED_ERROR"/>
 *     &lt;enumeration value="BRACE_EXPECTED_ERROR"/>
 *     &lt;enumeration value="PARENTHESIS_EXPECTED_ERROR"/>
 *     &lt;enumeration value="NOT_A_STATEMENT_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompilationStatus")
@XmlEnum
public enum CompilationStatus {

    SUCCESS,
    UNKNOWN_ERROR,
    SAVE_ERROR,
    QUOTE_EXPECTED_ERROR,
    SEMICOLON_EXPECTED_ERROR,
    BRACE_EXPECTED_ERROR,
    PARENTHESIS_EXPECTED_ERROR,
    NOT_A_STATEMENT_ERROR;

    public String value() {
        return name();
    }

    public static CompilationStatus fromValue(String v) {
        return valueOf(v);
    }

}
