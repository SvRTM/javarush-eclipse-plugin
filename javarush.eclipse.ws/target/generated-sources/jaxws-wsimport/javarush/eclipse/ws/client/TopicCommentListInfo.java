
package javarush.eclipse.ws.client;

import java.util.ArrayList;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopicCommentListInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopicCommentListInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="List" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="List" type="{http://api1.controller.diana.javarush.com/}TopicCommentInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopicCommentListInfo", propOrder = {
    "list",
    "totalCount"
})
public class TopicCommentListInfo {

    @XmlElementRef(name = "List", type = JAXBElement.class, required = false)
    protected JAXBElement<TopicCommentListInfo.List> list;
    @XmlElement(name = "TotalCount")
    protected int totalCount;

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TopicCommentListInfo.List }{@code >}
     *     
     */
    public JAXBElement<TopicCommentListInfo.List> getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TopicCommentListInfo.List }{@code >}
     *     
     */
    public void setList(JAXBElement<TopicCommentListInfo.List> value) {
        this.list = value;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="List" type="{http://api1.controller.diana.javarush.com/}TopicCommentInfo" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "list"
    })
    public static class List {

        @XmlElement(name = "List", nillable = true)
        protected java.util.List<TopicCommentInfo> list;

        /**
         * Gets the value of the list property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the list property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TopicCommentInfo }
         * 
         * 
         */
        public java.util.List<TopicCommentInfo> getList() {
            if (list == null) {
                list = new ArrayList<TopicCommentInfo>();
            }
            return this.list;
        }

    }

}
