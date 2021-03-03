
package com.hp.schemas.sm._7;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.hp.schemas.sm._7.common.AttachmentsType;
import com.hp.schemas.sm._7.common.DateTimeType;
import com.hp.schemas.sm._7.common.DecimalType;
import com.hp.schemas.sm._7.common.StringType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hp.schemas.sm._7 package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MegaHelpInstanceTypeId_QNAME = new QName("http://schemas.hp.com/SM/7", "Id");
    private final static QName _MegaHelpInstanceTypeAction_QNAME = new QName("http://schemas.hp.com/SM/7", "Action");
    private final static QName _MegaHelpInstanceTypeCallBackContact_QNAME = new QName("http://schemas.hp.com/SM/7", "CallBackContact");
    private final static QName _MegaHelpInstanceTypeContactName_QNAME = new QName("http://schemas.hp.com/SM/7", "ContactName");
    private final static QName _MegaHelpInstanceTypeAlternateContact_QNAME = new QName("http://schemas.hp.com/SM/7", "AlternateContact");
    private final static QName _MegaHelpInstanceTypeMenuCode_QNAME = new QName("http://schemas.hp.com/SM/7", "MenuCode");
    private final static QName _MegaHelpInstanceTypeTitle_QNAME = new QName("http://schemas.hp.com/SM/7", "Title");
    private final static QName _MegaHelpInstanceTypeRegion_QNAME = new QName("http://schemas.hp.com/SM/7", "Region");
    private final static QName _MegaHelpInstanceTypeNeedTime_QNAME = new QName("http://schemas.hp.com/SM/7", "NeedTime");
    private final static QName _MegaHelpInstanceTypeCrmId_QNAME = new QName("http://schemas.hp.com/SM/7", "CrmId");
    private final static QName _MegaHelpInstanceTypeQuestionId_QNAME = new QName("http://schemas.hp.com/SM/7", "QuestionId");
    private final static QName _MegaHelpInstanceTypeQuestionFormId_QNAME = new QName("http://schemas.hp.com/SM/7", "QuestionFormId");
    private final static QName _MegaHelpInstanceTypeApprovalId_QNAME = new QName("http://schemas.hp.com/SM/7", "ApprovalId");
    private final static QName _MegaHelpInstanceTypeAttachments_QNAME = new QName("http://schemas.hp.com/SM/7", "attachments");
    private final static QName _MegaHelpInstanceTypeAddFieldsAddFieldsAddOnAttrName_QNAME = new QName("http://schemas.hp.com/SM/7", "addOnAttrName");
    private final static QName _MegaHelpInstanceTypeAddFieldsAddFieldsAddOnAttrType_QNAME = new QName("http://schemas.hp.com/SM/7", "addOnAttrType");
    private final static QName _MegaHelpInstanceTypeAddFieldsAddFieldsAddOnAttrValue_QNAME = new QName("http://schemas.hp.com/SM/7", "addOnAttrValue");
    private final static QName _MegaHelpKeysTypeNumber_QNAME = new QName("http://schemas.hp.com/SM/7", "number");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hp.schemas.sm._7
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MegaHelpInstanceType }
     * 
     */
    public MegaHelpInstanceType createMegaHelpInstanceType() {
        return new MegaHelpInstanceType();
    }

    /**
     * Create an instance of {@link MegaHelpInstanceType.AddFields }
     * 
     */
    public MegaHelpInstanceType.AddFields createMegaHelpInstanceTypeAddFields() {
        return new MegaHelpInstanceType.AddFields();
    }

    /**
     * Create an instance of {@link RetrieveMegaHelpRequest }
     * 
     */
    public RetrieveMegaHelpRequest createRetrieveMegaHelpRequest() {
        return new RetrieveMegaHelpRequest();
    }

    /**
     * Create an instance of {@link MegaHelpModelType }
     * 
     */
    public MegaHelpModelType createMegaHelpModelType() {
        return new MegaHelpModelType();
    }

    /**
     * Create an instance of {@link RetrieveMegaHelpResponse }
     * 
     */
    public RetrieveMegaHelpResponse createRetrieveMegaHelpResponse() {
        return new RetrieveMegaHelpResponse();
    }

    /**
     * Create an instance of {@link RetrieveMegaHelpKeysListRequest }
     * 
     */
    public RetrieveMegaHelpKeysListRequest createRetrieveMegaHelpKeysListRequest() {
        return new RetrieveMegaHelpKeysListRequest();
    }

    /**
     * Create an instance of {@link RetrieveMegaHelpKeysListResponse }
     * 
     */
    public RetrieveMegaHelpKeysListResponse createRetrieveMegaHelpKeysListResponse() {
        return new RetrieveMegaHelpKeysListResponse();
    }

    /**
     * Create an instance of {@link MegaHelpKeysType }
     * 
     */
    public MegaHelpKeysType createMegaHelpKeysType() {
        return new MegaHelpKeysType();
    }

    /**
     * Create an instance of {@link RetrieveMegaHelpListRequest }
     * 
     */
    public RetrieveMegaHelpListRequest createRetrieveMegaHelpListRequest() {
        return new RetrieveMegaHelpListRequest();
    }

    /**
     * Create an instance of {@link RetrieveMegaHelpListResponse }
     * 
     */
    public RetrieveMegaHelpListResponse createRetrieveMegaHelpListResponse() {
        return new RetrieveMegaHelpListResponse();
    }

    /**
     * Create an instance of {@link CreateMegaHelpRequest }
     * 
     */
    public CreateMegaHelpRequest createCreateMegaHelpRequest() {
        return new CreateMegaHelpRequest();
    }

    /**
     * Create an instance of {@link CreateMegaHelpResponse }
     * 
     */
    public CreateMegaHelpResponse createCreateMegaHelpResponse() {
        return new CreateMegaHelpResponse();
    }

    /**
     * Create an instance of {@link MegaHelpInstanceType.Description }
     * 
     */
    public MegaHelpInstanceType.Description createMegaHelpInstanceTypeDescription() {
        return new MegaHelpInstanceType.Description();
    }

    /**
     * Create an instance of {@link MegaHelpInstanceType.HtmlAttr }
     * 
     */
    public MegaHelpInstanceType.HtmlAttr createMegaHelpInstanceTypeHtmlAttr() {
        return new MegaHelpInstanceType.HtmlAttr();
    }

    /**
     * Create an instance of {@link MegaHelpInstanceType.Sysdesc }
     * 
     */
    public MegaHelpInstanceType.Sysdesc createMegaHelpInstanceTypeSysdesc() {
        return new MegaHelpInstanceType.Sysdesc();
    }

    /**
     * Create an instance of {@link MegaHelpInstanceType.AddFields.AddFields }
     * 
     */
    public MegaHelpInstanceType.AddFields.AddFields createMegaHelpInstanceTypeAddFieldsAddFields() {
        return new MegaHelpInstanceType.AddFields.AddFields();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.hp.com/SM/7", name = "Id", scope = MegaHelpInstanceType.class)
    public JAXBElement<StringType> createMegaHelpInstanceTypeId(StringType value) {
        return new JAXBElement<StringType>(_MegaHelpInstanceTypeId_QNAME, StringType.class, MegaHelpInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.hp.com/SM/7", name = "Action", scope = MegaHelpInstanceType.class)
    public JAXBElement<StringType> createMegaHelpInstanceTypeAction(StringType value) {
        return new JAXBElement<StringType>(_MegaHelpInstanceTypeAction_QNAME, StringType.class, MegaHelpInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.hp.com/SM/7", name = "CallBackContact", scope = MegaHelpInstanceType.class)
    public JAXBElement<StringType> createMegaHelpInstanceTypeCallBackContact(StringType value) {
        return new JAXBElement<StringType>(_MegaHelpInstanceTypeCallBackContact_QNAME, StringType.class, MegaHelpInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.hp.com/SM/7", name = "ContactName", scope = MegaHelpInstanceType.class)
    public JAXBElement<StringType> createMegaHelpInstanceTypeContactName(StringType value) {
        return new JAXBElement<StringType>(_MegaHelpInstanceTypeContactName_QNAME, StringType.class, MegaHelpInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.hp.com/SM/7", name = "AlternateContact", scope = MegaHelpInstanceType.class)
    public JAXBElement<StringType> createMegaHelpInstanceTypeAlternateContact(StringType value) {
        return new JAXBElement<StringType>(_MegaHelpInstanceTypeAlternateContact_QNAME, StringType.class, MegaHelpInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.hp.com/SM/7", name = "MenuCode", scope = MegaHelpInstanceType.class)
    public JAXBElement<StringType> createMegaHelpInstanceTypeMenuCode(StringType value) {
        return new JAXBElement<StringType>(_MegaHelpInstanceTypeMenuCode_QNAME, StringType.class, MegaHelpInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.hp.com/SM/7", name = "Title", scope = MegaHelpInstanceType.class)
    public JAXBElement<StringType> createMegaHelpInstanceTypeTitle(StringType value) {
        return new JAXBElement<StringType>(_MegaHelpInstanceTypeTitle_QNAME, StringType.class, MegaHelpInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.hp.com/SM/7", name = "Region", scope = MegaHelpInstanceType.class)
    public JAXBElement<StringType> createMegaHelpInstanceTypeRegion(StringType value) {
        return new JAXBElement<StringType>(_MegaHelpInstanceTypeRegion_QNAME, StringType.class, MegaHelpInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.hp.com/SM/7", name = "NeedTime", scope = MegaHelpInstanceType.class)
    public JAXBElement<DateTimeType> createMegaHelpInstanceTypeNeedTime(DateTimeType value) {
        return new JAXBElement<DateTimeType>(_MegaHelpInstanceTypeNeedTime_QNAME, DateTimeType.class, MegaHelpInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.hp.com/SM/7", name = "CrmId", scope = MegaHelpInstanceType.class)
    public JAXBElement<StringType> createMegaHelpInstanceTypeCrmId(StringType value) {
        return new JAXBElement<StringType>(_MegaHelpInstanceTypeCrmId_QNAME, StringType.class, MegaHelpInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.hp.com/SM/7", name = "QuestionId", scope = MegaHelpInstanceType.class)
    public JAXBElement<StringType> createMegaHelpInstanceTypeQuestionId(StringType value) {
        return new JAXBElement<StringType>(_MegaHelpInstanceTypeQuestionId_QNAME, StringType.class, MegaHelpInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.hp.com/SM/7", name = "QuestionFormId", scope = MegaHelpInstanceType.class)
    public JAXBElement<StringType> createMegaHelpInstanceTypeQuestionFormId(StringType value) {
        return new JAXBElement<StringType>(_MegaHelpInstanceTypeQuestionFormId_QNAME, StringType.class, MegaHelpInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.hp.com/SM/7", name = "ApprovalId", scope = MegaHelpInstanceType.class)
    public JAXBElement<StringType> createMegaHelpInstanceTypeApprovalId(StringType value) {
        return new JAXBElement<StringType>(_MegaHelpInstanceTypeApprovalId_QNAME, StringType.class, MegaHelpInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttachmentsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.hp.com/SM/7", name = "attachments", scope = MegaHelpInstanceType.class)
    public JAXBElement<AttachmentsType> createMegaHelpInstanceTypeAttachments(AttachmentsType value) {
        return new JAXBElement<AttachmentsType>(_MegaHelpInstanceTypeAttachments_QNAME, AttachmentsType.class, MegaHelpInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.hp.com/SM/7", name = "addOnAttrName", scope = MegaHelpInstanceType.AddFields.AddFields.class)
    public JAXBElement<StringType> createMegaHelpInstanceTypeAddFieldsAddFieldsAddOnAttrName(StringType value) {
        return new JAXBElement<StringType>(_MegaHelpInstanceTypeAddFieldsAddFieldsAddOnAttrName_QNAME, StringType.class, MegaHelpInstanceType.AddFields.AddFields.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecimalType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DecimalType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.hp.com/SM/7", name = "addOnAttrType", scope = MegaHelpInstanceType.AddFields.AddFields.class)
    public JAXBElement<DecimalType> createMegaHelpInstanceTypeAddFieldsAddFieldsAddOnAttrType(DecimalType value) {
        return new JAXBElement<DecimalType>(_MegaHelpInstanceTypeAddFieldsAddFieldsAddOnAttrType_QNAME, DecimalType.class, MegaHelpInstanceType.AddFields.AddFields.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.hp.com/SM/7", name = "addOnAttrValue", scope = MegaHelpInstanceType.AddFields.AddFields.class)
    public JAXBElement<StringType> createMegaHelpInstanceTypeAddFieldsAddFieldsAddOnAttrValue(StringType value) {
        return new JAXBElement<StringType>(_MegaHelpInstanceTypeAddFieldsAddFieldsAddOnAttrValue_QNAME, StringType.class, MegaHelpInstanceType.AddFields.AddFields.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecimalType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DecimalType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.hp.com/SM/7", name = "number", scope = MegaHelpKeysType.class)
    public JAXBElement<DecimalType> createMegaHelpKeysTypeNumber(DecimalType value) {
        return new JAXBElement<DecimalType>(_MegaHelpKeysTypeNumber_QNAME, DecimalType.class, MegaHelpKeysType.class, value);
    }

}
