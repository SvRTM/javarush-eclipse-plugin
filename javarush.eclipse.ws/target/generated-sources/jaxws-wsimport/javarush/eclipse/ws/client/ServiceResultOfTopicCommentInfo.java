
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceResultOfTopicCommentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceResultOfTopicCommentInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api1.controller.diana.javarush.com/}serviceResult">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{http://api1.controller.diana.javarush.com/}TopicCommentInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceResultOfTopicCommentInfo", propOrder = {
    "result"
})
public class ServiceResultOfTopicCommentInfo
    extends ServiceResult
{

    @XmlElement(name = "Result")
    protected TopicCommentInfo result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link TopicCommentInfo }
     *     
     */
    public TopicCommentInfo getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicCommentInfo }
     *     
     */
    public void setResult(TopicCommentInfo value) {
        this.result = value;
    }

}
