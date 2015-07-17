
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceResultOfTopicInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceResultOfTopicInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api1.controller.diana.javarush.com/}serviceResult">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{http://api1.controller.diana.javarush.com/}TopicInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceResultOfTopicInfo", propOrder = {
    "result"
})
public class ServiceResultOfTopicInfo
    extends ServiceResult
{

    @XmlElement(name = "Result")
    protected TopicInfo result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link TopicInfo }
     *     
     */
    public TopicInfo getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicInfo }
     *     
     */
    public void setResult(TopicInfo value) {
        this.result = value;
    }

}
