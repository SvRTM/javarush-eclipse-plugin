
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MessageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsRead" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SendTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SenderVkSocialId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecipientVkSocialId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageInfo", propOrder = {
    "id",
    "subject",
    "body",
    "isRead",
    "sendTime",
    "senderVkSocialId",
    "recipientVkSocialId"
})
public class MessageInfo {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "Body")
    protected String body;
    @XmlElement(name = "IsRead")
    protected boolean isRead;
    @XmlElement(name = "SendTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendTime;
    @XmlElement(name = "SenderVkSocialId")
    protected String senderVkSocialId;
    @XmlElement(name = "RecipientVkSocialId")
    protected String recipientVkSocialId;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the isRead property.
     * 
     */
    public boolean isIsRead() {
        return isRead;
    }

    /**
     * Sets the value of the isRead property.
     * 
     */
    public void setIsRead(boolean value) {
        this.isRead = value;
    }

    /**
     * Gets the value of the sendTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendTime() {
        return sendTime;
    }

    /**
     * Sets the value of the sendTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendTime(XMLGregorianCalendar value) {
        this.sendTime = value;
    }

    /**
     * Gets the value of the senderVkSocialId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderVkSocialId() {
        return senderVkSocialId;
    }

    /**
     * Sets the value of the senderVkSocialId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderVkSocialId(String value) {
        this.senderVkSocialId = value;
    }

    /**
     * Gets the value of the recipientVkSocialId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientVkSocialId() {
        return recipientVkSocialId;
    }

    /**
     * Sets the value of the recipientVkSocialId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientVkSocialId(String value) {
        this.recipientVkSocialId = value;
    }

}
