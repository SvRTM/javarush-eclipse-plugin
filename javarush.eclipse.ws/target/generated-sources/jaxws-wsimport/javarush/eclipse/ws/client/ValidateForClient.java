
package javarush.eclipse.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateForClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateForClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classList" type="{http://api1.controller.diana.javarush.com/}ClassDataInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateForClient", propOrder = {
    "sessionId",
    "taskKey",
    "classList",
    "inData"
})
public class ValidateForClient {

    protected String sessionId;
    protected String taskKey;
    protected List<ClassDataInfo> classList;
    protected String inData;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the taskKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskKey() {
        return taskKey;
    }

    /**
     * Sets the value of the taskKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskKey(String value) {
        this.taskKey = value;
    }

    /**
     * Gets the value of the classList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassDataInfo }
     * 
     * 
     */
    public List<ClassDataInfo> getClassList() {
        if (classList == null) {
            classList = new ArrayList<ClassDataInfo>();
        }
        return this.classList;
    }

    /**
     * Gets the value of the inData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInData() {
        return inData;
    }

    /**
     * Sets the value of the inData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInData(String value) {
        this.inData = value;
    }

}
