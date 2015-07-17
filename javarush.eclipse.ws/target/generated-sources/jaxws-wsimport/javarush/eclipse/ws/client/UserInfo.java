
package javarush.eclipse.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VkSocialId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JarSeacretKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JarInfoForumInvitation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhotoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Lesson" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Experience" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SilverMoney" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GoldMoney" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Taskts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Taskts" type="{http://api1.controller.diana.javarush.com/}TaskInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Statistics" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Statistics" type="{http://api1.controller.diana.javarush.com/}UserStatisticInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TaskSolvingCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TaskSolvedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LecturesCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="JarReferenceKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInfo", propOrder = {
    "vkSocialId",
    "jarSeacretKey",
    "jarInfoForumInvitation",
    "displayName",
    "photoUrl",
    "level",
    "lesson",
    "experience",
    "silverMoney",
    "goldMoney",
    "taskts",
    "statistics",
    "taskSolvingCount",
    "taskSolvedCount",
    "lecturesCount",
    "jarReferenceKey"
})
public class UserInfo {

    @XmlElement(name = "VkSocialId")
    protected String vkSocialId;
    @XmlElement(name = "JarSeacretKey")
    protected String jarSeacretKey;
    @XmlElement(name = "JarInfoForumInvitation")
    protected String jarInfoForumInvitation;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "PhotoUrl")
    protected String photoUrl;
    @XmlElement(name = "Level")
    protected int level;
    @XmlElement(name = "Lesson")
    protected int lesson;
    @XmlElement(name = "Experience")
    protected int experience;
    @XmlElement(name = "SilverMoney")
    protected int silverMoney;
    @XmlElement(name = "GoldMoney")
    protected int goldMoney;
    @XmlElementRef(name = "Taskts", type = JAXBElement.class, required = false)
    protected JAXBElement<UserInfo.Taskts> taskts;
    @XmlElementRef(name = "Statistics", type = JAXBElement.class, required = false)
    protected JAXBElement<UserInfo.Statistics> statistics;
    @XmlElement(name = "TaskSolvingCount")
    protected int taskSolvingCount;
    @XmlElement(name = "TaskSolvedCount")
    protected int taskSolvedCount;
    @XmlElement(name = "LecturesCount")
    protected int lecturesCount;
    @XmlElement(name = "JarReferenceKey")
    protected String jarReferenceKey;

    /**
     * Gets the value of the vkSocialId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVkSocialId() {
        return vkSocialId;
    }

    /**
     * Sets the value of the vkSocialId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVkSocialId(String value) {
        this.vkSocialId = value;
    }

    /**
     * Gets the value of the jarSeacretKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJarSeacretKey() {
        return jarSeacretKey;
    }

    /**
     * Sets the value of the jarSeacretKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJarSeacretKey(String value) {
        this.jarSeacretKey = value;
    }

    /**
     * Gets the value of the jarInfoForumInvitation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJarInfoForumInvitation() {
        return jarInfoForumInvitation;
    }

    /**
     * Sets the value of the jarInfoForumInvitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJarInfoForumInvitation(String value) {
        this.jarInfoForumInvitation = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the photoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * Sets the value of the photoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoUrl(String value) {
        this.photoUrl = value;
    }

    /**
     * Gets the value of the level property.
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * Gets the value of the lesson property.
     * 
     */
    public int getLesson() {
        return lesson;
    }

    /**
     * Sets the value of the lesson property.
     * 
     */
    public void setLesson(int value) {
        this.lesson = value;
    }

    /**
     * Gets the value of the experience property.
     * 
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Sets the value of the experience property.
     * 
     */
    public void setExperience(int value) {
        this.experience = value;
    }

    /**
     * Gets the value of the silverMoney property.
     * 
     */
    public int getSilverMoney() {
        return silverMoney;
    }

    /**
     * Sets the value of the silverMoney property.
     * 
     */
    public void setSilverMoney(int value) {
        this.silverMoney = value;
    }

    /**
     * Gets the value of the goldMoney property.
     * 
     */
    public int getGoldMoney() {
        return goldMoney;
    }

    /**
     * Sets the value of the goldMoney property.
     * 
     */
    public void setGoldMoney(int value) {
        this.goldMoney = value;
    }

    /**
     * Gets the value of the taskts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserInfo.Taskts }{@code >}
     *     
     */
    public JAXBElement<UserInfo.Taskts> getTaskts() {
        return taskts;
    }

    /**
     * Sets the value of the taskts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserInfo.Taskts }{@code >}
     *     
     */
    public void setTaskts(JAXBElement<UserInfo.Taskts> value) {
        this.taskts = value;
    }

    /**
     * Gets the value of the statistics property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserInfo.Statistics }{@code >}
     *     
     */
    public JAXBElement<UserInfo.Statistics> getStatistics() {
        return statistics;
    }

    /**
     * Sets the value of the statistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserInfo.Statistics }{@code >}
     *     
     */
    public void setStatistics(JAXBElement<UserInfo.Statistics> value) {
        this.statistics = value;
    }

    /**
     * Gets the value of the taskSolvingCount property.
     * 
     */
    public int getTaskSolvingCount() {
        return taskSolvingCount;
    }

    /**
     * Sets the value of the taskSolvingCount property.
     * 
     */
    public void setTaskSolvingCount(int value) {
        this.taskSolvingCount = value;
    }

    /**
     * Gets the value of the taskSolvedCount property.
     * 
     */
    public int getTaskSolvedCount() {
        return taskSolvedCount;
    }

    /**
     * Sets the value of the taskSolvedCount property.
     * 
     */
    public void setTaskSolvedCount(int value) {
        this.taskSolvedCount = value;
    }

    /**
     * Gets the value of the lecturesCount property.
     * 
     */
    public int getLecturesCount() {
        return lecturesCount;
    }

    /**
     * Sets the value of the lecturesCount property.
     * 
     */
    public void setLecturesCount(int value) {
        this.lecturesCount = value;
    }

    /**
     * Gets the value of the jarReferenceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJarReferenceKey() {
        return jarReferenceKey;
    }

    /**
     * Sets the value of the jarReferenceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJarReferenceKey(String value) {
        this.jarReferenceKey = value;
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
     *         &lt;element name="Statistics" type="{http://api1.controller.diana.javarush.com/}UserStatisticInfo" maxOccurs="unbounded" minOccurs="0"/>
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
        "statistics"
    })
    public static class Statistics {

        @XmlElement(name = "Statistics", nillable = true)
        protected List<UserStatisticInfo> statistics;

        /**
         * Gets the value of the statistics property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statistics property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatistics().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UserStatisticInfo }
         * 
         * 
         */
        public List<UserStatisticInfo> getStatistics() {
            if (statistics == null) {
                statistics = new ArrayList<UserStatisticInfo>();
            }
            return this.statistics;
        }

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
     *         &lt;element name="Taskts" type="{http://api1.controller.diana.javarush.com/}TaskInfo" maxOccurs="unbounded" minOccurs="0"/>
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
        "taskts"
    })
    public static class Taskts {

        @XmlElement(name = "Taskts", nillable = true)
        protected List<TaskInfo> taskts;

        /**
         * Gets the value of the taskts property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taskts property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaskts().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TaskInfo }
         * 
         * 
         */
        public List<TaskInfo> getTaskts() {
            if (taskts == null) {
                taskts = new ArrayList<TaskInfo>();
            }
            return this.taskts;
        }

    }

}
