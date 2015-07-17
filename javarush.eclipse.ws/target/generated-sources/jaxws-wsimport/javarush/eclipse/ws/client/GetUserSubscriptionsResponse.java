
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUserSubscriptionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserSubscriptionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://api1.controller.diana.javarush.com/}serviceResultOfSubscriptionInfoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserSubscriptionsResponse", propOrder = {
    "_return"
})
public class GetUserSubscriptionsResponse {

    @XmlElement(name = "return")
    protected ServiceResultOfSubscriptionInfoList _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResultOfSubscriptionInfoList }
     *     
     */
    public ServiceResultOfSubscriptionInfoList getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResultOfSubscriptionInfoList }
     *     
     */
    public void setReturn(ServiceResultOfSubscriptionInfoList value) {
        this._return = value;
    }

}
