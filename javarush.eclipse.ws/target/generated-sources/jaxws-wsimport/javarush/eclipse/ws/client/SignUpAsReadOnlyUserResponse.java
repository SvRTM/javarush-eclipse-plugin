
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignUpAsReadOnlyUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignUpAsReadOnlyUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://api1.controller.diana.javarush.com/}ServiceResultOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignUpAsReadOnlyUserResponse", propOrder = {
    "_return"
})
public class SignUpAsReadOnlyUserResponse {

    @XmlElement(name = "return")
    protected ServiceResultOfString _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResultOfString }
     *     
     */
    public ServiceResultOfString getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResultOfString }
     *     
     */
    public void setReturn(ServiceResultOfString value) {
        this._return = value;
    }

}