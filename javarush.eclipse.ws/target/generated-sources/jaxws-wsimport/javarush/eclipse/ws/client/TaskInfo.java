
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
 * <p>Java class for TaskInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaskKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://api1.controller.diana.javarush.com/}TaskInfoType" minOccurs="0"/>
 *         &lt;element name="Teacher" type="{http://api1.controller.diana.javarush.com/}TaskInfoTeacher" minOccurs="0"/>
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Lesson" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Status" type="{http://api1.controller.diana.javarush.com/}UserTaskStatus" minOccurs="0"/>
 *         &lt;element name="InterestRating" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DifficultyRating" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Question" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Silver" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HelpMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HelpCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Helps" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Helps" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VkSocialId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskInfo", propOrder = {
    "taskKey",
    "title",
    "description",
    "type",
    "teacher",
    "level",
    "lesson",
    "number",
    "status",
    "interestRating",
    "difficultyRating",
    "comment",
    "question",
    "answer",
    "gold",
    "silver",
    "helpMax",
    "helpCount",
    "helps",
    "vkSocialId"
})
public class TaskInfo {

    @XmlElement(name = "TaskKey")
    protected String taskKey;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Type")
    protected TaskInfoType type;
    @XmlElement(name = "Teacher")
    protected TaskInfoTeacher teacher;
    @XmlElement(name = "Level")
    protected int level;
    @XmlElement(name = "Lesson")
    protected int lesson;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "Status")
    protected UserTaskStatus status;
    @XmlElement(name = "InterestRating")
    protected int interestRating;
    @XmlElement(name = "DifficultyRating")
    protected int difficultyRating;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "Question")
    protected String question;
    @XmlElement(name = "Answer")
    protected String answer;
    @XmlElement(name = "Gold")
    protected int gold;
    @XmlElement(name = "Silver")
    protected int silver;
    @XmlElement(name = "HelpMax")
    protected int helpMax;
    @XmlElement(name = "HelpCount")
    protected int helpCount;
    @XmlElementRef(name = "Helps", type = JAXBElement.class, required = false)
    protected JAXBElement<TaskInfo.Helps> helps;
    @XmlElement(name = "VkSocialId")
    protected String vkSocialId;

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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TaskInfoType }
     *     
     */
    public TaskInfoType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskInfoType }
     *     
     */
    public void setType(TaskInfoType value) {
        this.type = value;
    }

    /**
     * Gets the value of the teacher property.
     * 
     * @return
     *     possible object is
     *     {@link TaskInfoTeacher }
     *     
     */
    public TaskInfoTeacher getTeacher() {
        return teacher;
    }

    /**
     * Sets the value of the teacher property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskInfoTeacher }
     *     
     */
    public void setTeacher(TaskInfoTeacher value) {
        this.teacher = value;
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
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link UserTaskStatus }
     *     
     */
    public UserTaskStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserTaskStatus }
     *     
     */
    public void setStatus(UserTaskStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the interestRating property.
     * 
     */
    public int getInterestRating() {
        return interestRating;
    }

    /**
     * Sets the value of the interestRating property.
     * 
     */
    public void setInterestRating(int value) {
        this.interestRating = value;
    }

    /**
     * Gets the value of the difficultyRating property.
     * 
     */
    public int getDifficultyRating() {
        return difficultyRating;
    }

    /**
     * Sets the value of the difficultyRating property.
     * 
     */
    public void setDifficultyRating(int value) {
        this.difficultyRating = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the question property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestion(String value) {
        this.question = value;
    }

    /**
     * Gets the value of the answer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswer(String value) {
        this.answer = value;
    }

    /**
     * Gets the value of the gold property.
     * 
     */
    public int getGold() {
        return gold;
    }

    /**
     * Sets the value of the gold property.
     * 
     */
    public void setGold(int value) {
        this.gold = value;
    }

    /**
     * Gets the value of the silver property.
     * 
     */
    public int getSilver() {
        return silver;
    }

    /**
     * Sets the value of the silver property.
     * 
     */
    public void setSilver(int value) {
        this.silver = value;
    }

    /**
     * Gets the value of the helpMax property.
     * 
     */
    public int getHelpMax() {
        return helpMax;
    }

    /**
     * Sets the value of the helpMax property.
     * 
     */
    public void setHelpMax(int value) {
        this.helpMax = value;
    }

    /**
     * Gets the value of the helpCount property.
     * 
     */
    public int getHelpCount() {
        return helpCount;
    }

    /**
     * Sets the value of the helpCount property.
     * 
     */
    public void setHelpCount(int value) {
        this.helpCount = value;
    }

    /**
     * Gets the value of the helps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaskInfo.Helps }{@code >}
     *     
     */
    public JAXBElement<TaskInfo.Helps> getHelps() {
        return helps;
    }

    /**
     * Sets the value of the helps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaskInfo.Helps }{@code >}
     *     
     */
    public void setHelps(JAXBElement<TaskInfo.Helps> value) {
        this.helps = value;
    }

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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Helps" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "helps"
    })
    public static class Helps {

        @XmlElement(name = "Helps", nillable = true)
        protected List<String> helps;

        /**
         * Gets the value of the helps property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the helps property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHelps().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getHelps() {
            if (helps == null) {
                helps = new ArrayList<String>();
            }
            return this.helps;
        }

    }

}
