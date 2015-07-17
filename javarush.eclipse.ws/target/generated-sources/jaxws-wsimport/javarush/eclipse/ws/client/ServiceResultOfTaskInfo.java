
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceResultOfTaskInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceResultOfTaskInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api1.controller.diana.javarush.com/}serviceResult">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{http://api1.controller.diana.javarush.com/}TaskInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceResultOfTaskInfo", propOrder = {
    "result"
})
public class ServiceResultOfTaskInfo
    extends ServiceResult
{

    @XmlElement(name = "Result")
    protected TaskInfo result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link TaskInfo }
     *     
     */
    public TaskInfo getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskInfo }
     *     
     */
    public void setResult(TaskInfo value) {
        this.result = value;
    }

}
