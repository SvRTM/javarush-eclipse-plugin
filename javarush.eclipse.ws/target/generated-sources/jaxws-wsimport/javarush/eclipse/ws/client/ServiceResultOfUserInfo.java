
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceResultOfUserInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceResultOfUserInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api1.controller.diana.javarush.com/}serviceResult">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{http://api1.controller.diana.javarush.com/}UserInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceResultOfUserInfo", propOrder = {
    "result"
})
public class ServiceResultOfUserInfo
    extends ServiceResult
{

    @XmlElement(name = "Result")
    protected UserInfo result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfo }
     *     
     */
    public UserInfo getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfo }
     *     
     */
    public void setResult(UserInfo value) {
        this.result = value;
    }

}
