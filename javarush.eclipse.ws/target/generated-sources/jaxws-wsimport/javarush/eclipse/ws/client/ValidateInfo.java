
package javarush.eclipse.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validateInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compilationStatus" type="{http://api1.controller.diana.javarush.com/}CompilationStatus" minOccurs="0"/>
 *         &lt;element name="compilationOutput" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="runStatus" type="{http://api1.controller.diana.javarush.com/}RunStatus" minOccurs="0"/>
 *         &lt;element name="runOutput" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validationStatus" type="{http://api1.controller.diana.javarush.com/}ValidationStatus" minOccurs="0"/>
 *         &lt;element name="validationPassedTestCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="validationMaxTestCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Attempts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BetterThan" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AvgAttempts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="helpTestStatus" type="{http://api1.controller.diana.javarush.com/}HelpTestStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateInfo", propOrder = {
    "compilationStatus",
    "compilationOutput",
    "runStatus",
    "runOutput",
    "validationStatus",
    "validationPassedTestCount",
    "validationMaxTestCount",
    "attempts",
    "betterThan",
    "avgAttempts",
    "helpTestStatus"
})
public class ValidateInfo {

    protected CompilationStatus compilationStatus;
    protected String compilationOutput;
    protected RunStatus runStatus;
    protected String runOutput;
    protected ValidationStatus validationStatus;
    protected int validationPassedTestCount;
    protected int validationMaxTestCount;
    @XmlElement(name = "Attempts")
    protected int attempts;
    @XmlElement(name = "BetterThan")
    protected int betterThan;
    @XmlElement(name = "AvgAttempts")
    protected String avgAttempts;
    protected HelpTestStatus helpTestStatus;

    /**
     * Gets the value of the compilationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CompilationStatus }
     *     
     */
    public CompilationStatus getCompilationStatus() {
        return compilationStatus;
    }

    /**
     * Sets the value of the compilationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompilationStatus }
     *     
     */
    public void setCompilationStatus(CompilationStatus value) {
        this.compilationStatus = value;
    }

    /**
     * Gets the value of the compilationOutput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompilationOutput() {
        return compilationOutput;
    }

    /**
     * Sets the value of the compilationOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompilationOutput(String value) {
        this.compilationOutput = value;
    }

    /**
     * Gets the value of the runStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RunStatus }
     *     
     */
    public RunStatus getRunStatus() {
        return runStatus;
    }

    /**
     * Sets the value of the runStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunStatus }
     *     
     */
    public void setRunStatus(RunStatus value) {
        this.runStatus = value;
    }

    /**
     * Gets the value of the runOutput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunOutput() {
        return runOutput;
    }

    /**
     * Sets the value of the runOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunOutput(String value) {
        this.runOutput = value;
    }

    /**
     * Gets the value of the validationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationStatus }
     *     
     */
    public ValidationStatus getValidationStatus() {
        return validationStatus;
    }

    /**
     * Sets the value of the validationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationStatus }
     *     
     */
    public void setValidationStatus(ValidationStatus value) {
        this.validationStatus = value;
    }

    /**
     * Gets the value of the validationPassedTestCount property.
     * 
     */
    public int getValidationPassedTestCount() {
        return validationPassedTestCount;
    }

    /**
     * Sets the value of the validationPassedTestCount property.
     * 
     */
    public void setValidationPassedTestCount(int value) {
        this.validationPassedTestCount = value;
    }

    /**
     * Gets the value of the validationMaxTestCount property.
     * 
     */
    public int getValidationMaxTestCount() {
        return validationMaxTestCount;
    }

    /**
     * Sets the value of the validationMaxTestCount property.
     * 
     */
    public void setValidationMaxTestCount(int value) {
        this.validationMaxTestCount = value;
    }

    /**
     * Gets the value of the attempts property.
     * 
     */
    public int getAttempts() {
        return attempts;
    }

    /**
     * Sets the value of the attempts property.
     * 
     */
    public void setAttempts(int value) {
        this.attempts = value;
    }

    /**
     * Gets the value of the betterThan property.
     * 
     */
    public int getBetterThan() {
        return betterThan;
    }

    /**
     * Sets the value of the betterThan property.
     * 
     */
    public void setBetterThan(int value) {
        this.betterThan = value;
    }

    /**
     * Gets the value of the avgAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgAttempts() {
        return avgAttempts;
    }

    /**
     * Sets the value of the avgAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgAttempts(String value) {
        this.avgAttempts = value;
    }

    /**
     * Gets the value of the helpTestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link HelpTestStatus }
     *     
     */
    public HelpTestStatus getHelpTestStatus() {
        return helpTestStatus;
    }

    /**
     * Sets the value of the helpTestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link HelpTestStatus }
     *     
     */
    public void setHelpTestStatus(HelpTestStatus value) {
        this.helpTestStatus = value;
    }

}
