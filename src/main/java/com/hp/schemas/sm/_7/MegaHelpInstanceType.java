
package com.hp.schemas.sm._7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.hp.schemas.sm._7.common.ArrayType;
import com.hp.schemas.sm._7.common.AttachmentsType;
import com.hp.schemas.sm._7.common.DateTimeType;
import com.hp.schemas.sm._7.common.DecimalType;
import com.hp.schemas.sm._7.common.StringType;
import com.hp.schemas.sm._7.common.StructureType;


/**
 * &lt;p&gt;Java class for MegaHelpInstanceType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MegaHelpInstanceType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Id" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Action" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CallBackContact" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ContactName" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AlternateContact" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MenuCode" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Title" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Region" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NeedTime" type="{http://schemas.hp.com/SM/7/Common}DateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Description" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;extension base="{http://schemas.hp.com/SM/7/Common}ArrayType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="Description" type="{http://schemas.hp.com/SM/7/Common}StringType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/extension&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="htmlAttr" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;extension base="{http://schemas.hp.com/SM/7/Common}ArrayType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="htmlAttr" type="{http://schemas.hp.com/SM/7/Common}StringType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/extension&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="add.fields" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;extension base="{http://schemas.hp.com/SM/7/Common}ArrayType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="add.fields" maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *                     &amp;lt;complexType&amp;gt;
 *                       &amp;lt;complexContent&amp;gt;
 *                         &amp;lt;extension base="{http://schemas.hp.com/SM/7/Common}StructureType"&amp;gt;
 *                           &amp;lt;sequence&amp;gt;
 *                             &amp;lt;element name="addOnAttrName" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="addOnAttrType" type="{http://schemas.hp.com/SM/7/Common}DecimalType" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="addOnAttrValue" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/&amp;gt;
 *                           &amp;lt;/sequence&amp;gt;
 *                         &amp;lt;/extension&amp;gt;
 *                       &amp;lt;/complexContent&amp;gt;
 *                     &amp;lt;/complexType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/extension&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="CrmId" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Sysdesc" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;extension base="{http://schemas.hp.com/SM/7/Common}ArrayType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="Sysdesc" type="{http://schemas.hp.com/SM/7/Common}StringType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/extension&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="QuestionId" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="QuestionFormId" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ApprovalId" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="attachments" type="{http://schemas.hp.com/SM/7/Common}AttachmentsType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="query" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="uniquequery" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="recordid" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="updatecounter" type="{http://www.w3.org/2001/XMLSchema}long" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MegaHelpInstanceType", propOrder = {
    "id",
    "action",
    "callBackContact",
    "contactName",
    "alternateContact",
    "menuCode",
    "title",
    "region",
    "needTime",
    "description",
    "htmlAttr",
    "addFields",
    "crmId",
    "sysdesc",
    "questionId",
    "questionFormId",
    "approvalId",
    "attachments"
})
public class MegaHelpInstanceType {

    @XmlElementRef(name = "Id", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> id;
    @XmlElementRef(name = "Action", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> action;
    @XmlElementRef(name = "CallBackContact", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> callBackContact;
    @XmlElementRef(name = "ContactName", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> contactName;
    @XmlElementRef(name = "AlternateContact", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> alternateContact;
    @XmlElementRef(name = "MenuCode", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> menuCode;
    @XmlElementRef(name = "Title", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> title;
    @XmlElementRef(name = "Region", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> region;
    @XmlElementRef(name = "NeedTime", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> needTime;
    @XmlElement(name = "Description")
    protected MegaHelpInstanceType.Description description;
    protected MegaHelpInstanceType.HtmlAttr htmlAttr;
    @XmlElement(name = "add.fields")
    protected MegaHelpInstanceType.AddFields addFields;
    @XmlElementRef(name = "CrmId", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> crmId;
    @XmlElement(name = "Sysdesc")
    protected MegaHelpInstanceType.Sysdesc sysdesc;
    @XmlElementRef(name = "QuestionId", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> questionId;
    @XmlElementRef(name = "QuestionFormId", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> questionFormId;
    @XmlElementRef(name = "ApprovalId", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> approvalId;
    @XmlElementRef(name = "attachments", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<AttachmentsType> attachments;
    @XmlAttribute(name = "query")
    protected String query;
    @XmlAttribute(name = "uniquequery")
    protected String uniquequery;
    @XmlAttribute(name = "recordid")
    protected String recordid;
    @XmlAttribute(name = "updatecounter")
    protected Long updatecounter;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setId(JAXBElement<StringType> value) {
        this.id = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setAction(JAXBElement<StringType> value) {
        this.action = value;
    }

    /**
     * Gets the value of the callBackContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getCallBackContact() {
        return callBackContact;
    }

    /**
     * Sets the value of the callBackContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setCallBackContact(JAXBElement<StringType> value) {
        this.callBackContact = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setContactName(JAXBElement<StringType> value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the alternateContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getAlternateContact() {
        return alternateContact;
    }

    /**
     * Sets the value of the alternateContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setAlternateContact(JAXBElement<StringType> value) {
        this.alternateContact = value;
    }

    /**
     * Gets the value of the menuCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getMenuCode() {
        return menuCode;
    }

    /**
     * Sets the value of the menuCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setMenuCode(JAXBElement<StringType> value) {
        this.menuCode = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setTitle(JAXBElement<StringType> value) {
        this.title = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setRegion(JAXBElement<StringType> value) {
        this.region = value;
    }

    /**
     * Gets the value of the needTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getNeedTime() {
        return needTime;
    }

    /**
     * Sets the value of the needTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setNeedTime(JAXBElement<DateTimeType> value) {
        this.needTime = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link MegaHelpInstanceType.Description }
     *     
     */
    public MegaHelpInstanceType.Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link MegaHelpInstanceType.Description }
     *     
     */
    public void setDescription(MegaHelpInstanceType.Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the htmlAttr property.
     * 
     * @return
     *     possible object is
     *     {@link MegaHelpInstanceType.HtmlAttr }
     *     
     */
    public MegaHelpInstanceType.HtmlAttr getHtmlAttr() {
        return htmlAttr;
    }

    /**
     * Sets the value of the htmlAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MegaHelpInstanceType.HtmlAttr }
     *     
     */
    public void setHtmlAttr(MegaHelpInstanceType.HtmlAttr value) {
        this.htmlAttr = value;
    }

    /**
     * Gets the value of the addFields property.
     * 
     * @return
     *     possible object is
     *     {@link MegaHelpInstanceType.AddFields }
     *     
     */
    public MegaHelpInstanceType.AddFields getAddFields() {
        return addFields;
    }

    /**
     * Sets the value of the addFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link MegaHelpInstanceType.AddFields }
     *     
     */
    public void setAddFields(MegaHelpInstanceType.AddFields value) {
        this.addFields = value;
    }

    /**
     * Gets the value of the crmId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getCrmId() {
        return crmId;
    }

    /**
     * Sets the value of the crmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setCrmId(JAXBElement<StringType> value) {
        this.crmId = value;
    }

    /**
     * Gets the value of the sysdesc property.
     * 
     * @return
     *     possible object is
     *     {@link MegaHelpInstanceType.Sysdesc }
     *     
     */
    public MegaHelpInstanceType.Sysdesc getSysdesc() {
        return sysdesc;
    }

    /**
     * Sets the value of the sysdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MegaHelpInstanceType.Sysdesc }
     *     
     */
    public void setSysdesc(MegaHelpInstanceType.Sysdesc value) {
        this.sysdesc = value;
    }

    /**
     * Gets the value of the questionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getQuestionId() {
        return questionId;
    }

    /**
     * Sets the value of the questionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setQuestionId(JAXBElement<StringType> value) {
        this.questionId = value;
    }

    /**
     * Gets the value of the questionFormId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getQuestionFormId() {
        return questionFormId;
    }

    /**
     * Sets the value of the questionFormId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setQuestionFormId(JAXBElement<StringType> value) {
        this.questionFormId = value;
    }

    /**
     * Gets the value of the approvalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getApprovalId() {
        return approvalId;
    }

    /**
     * Sets the value of the approvalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setApprovalId(JAXBElement<StringType> value) {
        this.approvalId = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AttachmentsType }{@code >}
     *     
     */
    public JAXBElement<AttachmentsType> getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AttachmentsType }{@code >}
     *     
     */
    public void setAttachments(JAXBElement<AttachmentsType> value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the uniquequery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniquequery() {
        return uniquequery;
    }

    /**
     * Sets the value of the uniquequery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniquequery(String value) {
        this.uniquequery = value;
    }

    /**
     * Gets the value of the recordid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordid() {
        return recordid;
    }

    /**
     * Sets the value of the recordid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordid(String value) {
        this.recordid = value;
    }

    /**
     * Gets the value of the updatecounter property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpdatecounter() {
        return updatecounter;
    }

    /**
     * Sets the value of the updatecounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpdatecounter(Long value) {
        this.updatecounter = value;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;extension base="{http://schemas.hp.com/SM/7/Common}ArrayType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="add.fields" maxOccurs="unbounded" minOccurs="0"&amp;gt;
     *           &amp;lt;complexType&amp;gt;
     *             &amp;lt;complexContent&amp;gt;
     *               &amp;lt;extension base="{http://schemas.hp.com/SM/7/Common}StructureType"&amp;gt;
     *                 &amp;lt;sequence&amp;gt;
     *                   &amp;lt;element name="addOnAttrName" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="addOnAttrType" type="{http://schemas.hp.com/SM/7/Common}DecimalType" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="addOnAttrValue" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/&amp;gt;
     *                 &amp;lt;/sequence&amp;gt;
     *               &amp;lt;/extension&amp;gt;
     *             &amp;lt;/complexContent&amp;gt;
     *           &amp;lt;/complexType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/extension&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "addFields"
    })
    public static class AddFields
        extends ArrayType
    {

        @XmlElement(name = "add.fields")
        protected List<MegaHelpInstanceType.AddFields.AddFields> addFields;

        /**
         * Gets the value of the addFields property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the addFields property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getAddFields().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MegaHelpInstanceType.AddFields.AddFields }
         * 
         * 
         */
        public List<MegaHelpInstanceType.AddFields.AddFields> getAddFields() {
            if (addFields == null) {
                addFields = new ArrayList<MegaHelpInstanceType.AddFields.AddFields>();
            }
            return this.addFields;
        }


        /**
         * &lt;p&gt;Java class for anonymous complex type.
         * 
         * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
         * 
         * &lt;pre&gt;
         * &amp;lt;complexType&amp;gt;
         *   &amp;lt;complexContent&amp;gt;
         *     &amp;lt;extension base="{http://schemas.hp.com/SM/7/Common}StructureType"&amp;gt;
         *       &amp;lt;sequence&amp;gt;
         *         &amp;lt;element name="addOnAttrName" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="addOnAttrType" type="{http://schemas.hp.com/SM/7/Common}DecimalType" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="addOnAttrValue" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/&amp;gt;
         *       &amp;lt;/sequence&amp;gt;
         *     &amp;lt;/extension&amp;gt;
         *   &amp;lt;/complexContent&amp;gt;
         * &amp;lt;/complexType&amp;gt;
         * &lt;/pre&gt;
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "addOnAttrName",
            "addOnAttrType",
            "addOnAttrValue"
        })
        public static class AddFields
            extends StructureType
        {

            @XmlElementRef(name = "addOnAttrName", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
            protected JAXBElement<StringType> addOnAttrName;
            @XmlElementRef(name = "addOnAttrType", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
            protected JAXBElement<DecimalType> addOnAttrType;
            @XmlElementRef(name = "addOnAttrValue", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
            protected JAXBElement<StringType> addOnAttrValue;

            /**
             * Gets the value of the addOnAttrName property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
             *     
             */
            public JAXBElement<StringType> getAddOnAttrName() {
                return addOnAttrName;
            }

            /**
             * Sets the value of the addOnAttrName property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
             *     
             */
            public void setAddOnAttrName(JAXBElement<StringType> value) {
                this.addOnAttrName = value;
            }

            /**
             * Gets the value of the addOnAttrType property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link DecimalType }{@code >}
             *     
             */
            public JAXBElement<DecimalType> getAddOnAttrType() {
                return addOnAttrType;
            }

            /**
             * Sets the value of the addOnAttrType property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link DecimalType }{@code >}
             *     
             */
            public void setAddOnAttrType(JAXBElement<DecimalType> value) {
                this.addOnAttrType = value;
            }

            /**
             * Gets the value of the addOnAttrValue property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
             *     
             */
            public JAXBElement<StringType> getAddOnAttrValue() {
                return addOnAttrValue;
            }

            /**
             * Sets the value of the addOnAttrValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
             *     
             */
            public void setAddOnAttrValue(JAXBElement<StringType> value) {
                this.addOnAttrValue = value;
            }

        }

    }


    /**
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;extension base="{http://schemas.hp.com/SM/7/Common}ArrayType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="Description" type="{http://schemas.hp.com/SM/7/Common}StringType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/extension&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class Description
        extends ArrayType
    {

        @XmlElement(name = "Description")
        protected List<StringType> description;

        /**
         * Gets the value of the description property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the description property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getDescription().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link StringType }
         * 
         * 
         */
        public List<StringType> getDescription() {
            if (description == null) {
                description = new ArrayList<StringType>();
            }
            return this.description;
        }

    }


    /**
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;extension base="{http://schemas.hp.com/SM/7/Common}ArrayType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="htmlAttr" type="{http://schemas.hp.com/SM/7/Common}StringType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/extension&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "htmlAttr"
    })
    public static class HtmlAttr
        extends ArrayType
    {

        protected List<StringType> htmlAttr;

        /**
         * Gets the value of the htmlAttr property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the htmlAttr property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getHtmlAttr().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link StringType }
         * 
         * 
         */
        public List<StringType> getHtmlAttr() {
            if (htmlAttr == null) {
                htmlAttr = new ArrayList<StringType>();
            }
            return this.htmlAttr;
        }

    }


    /**
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;extension base="{http://schemas.hp.com/SM/7/Common}ArrayType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="Sysdesc" type="{http://schemas.hp.com/SM/7/Common}StringType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/extension&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sysdesc"
    })
    public static class Sysdesc
        extends ArrayType
    {

        @XmlElement(name = "Sysdesc")
        protected List<StringType> sysdesc;

        /**
         * Gets the value of the sysdesc property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the sysdesc property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSysdesc().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link StringType }
         * 
         * 
         */
        public List<StringType> getSysdesc() {
            if (sysdesc == null) {
                sysdesc = new ArrayList<StringType>();
            }
            return this.sysdesc;
        }

    }

}
