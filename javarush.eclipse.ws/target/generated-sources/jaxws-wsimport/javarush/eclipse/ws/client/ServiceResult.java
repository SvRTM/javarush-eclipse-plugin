
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{http://api1.controller.diana.javarush.com/}ServiceResultErrorCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceResult", propOrder = {
    "errorMessage",
    "errorCode"
})
@XmlSeeAlso({
    ServiceResultOfTopicCommentListInfo.class,
    ServiceResultOfTopicInfo.class,
    ServiceResultOfValidationInfo.class,
    ServiceResultOfInteger.class,
    ServiceResultOfMessageInfoList.class,
    ServiceResultOfTopicCommentInfo.class,
    ServiceResultOfUserInfoList.class,
    ServiceResultOfByteArray.class,
    ServiceResultOfTaskInfoList.class,
    ServiceResultOfTopicListInfo.class,
    ServiceResultOfBoolean.class,
    ServiceResultOfString.class,
    ServiceResultOfUserInfo.class,
    ServiceResultOfClassDataInfoList.class,
    ServiceResultOfMessageInfo.class,
    ServiceResultOfSubscriptionInfoList.class,
    ServiceResultOfTaskInfo.class
})
public class ServiceResult {

    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "ErrorCode")
    protected ServiceResultErrorCode errorCode;

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResultErrorCode }
     *     
     */
    public ServiceResultErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResultErrorCode }
     *     
     */
    public void setErrorCode(ServiceResultErrorCode value) {
        this.errorCode = value;
    }

}
