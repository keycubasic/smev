
package ru.gosuslugi.smev.rev111111;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.gosuslugi.smev.rev111111 package. 
 * <p>An ObjectFactory allows you to programmatically 
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
@ApplicationScoped
public class ObjectFactory {

    private static final QName _Header_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "Header");
    private static final QName _BaseMessage_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "BaseMessage");
    private static final QName _Message_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "Message");
    private static final QName _MessageData_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "MessageData");
    private static final QName _AppData_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "AppData");
    private static final QName _AppDocument_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "AppDocument");
    private static final QName _Sender_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "Sender");
    private static final QName _Recipient_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "Recipient");
    private static final QName _Originator_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "Originator");
    private static final QName _TypeCode_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "TypeCode");
    private static final QName _Date_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "Date");
    private static final QName _RequestIdRef_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "RequestIdRef");
    private static final QName _OriginRequestIdRef_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "OriginRequestIdRef");
    private static final QName _ServiceCode_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "ServiceCode");
    private static final QName _CaseNumber_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "CaseNumber");
    private static final QName _MessageId_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "MessageId");
    private static final QName _TimeStamp_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "TimeStamp");
    private static final QName _NodeId_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "NodeId");
    private static final QName _MessageClass_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "MessageClass");
    private static final QName _Status_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "Status");
    private static final QName _ExchangeType_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "ExchangeType");
    private static final QName _BinaryData_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "BinaryData");
    private static final QName _Reference_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "Reference");
    private static final QName _DigestValue_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "DigestValue");
    private static final QName _TestMsg_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "TestMsg");
    private static final QName _RequestCode_QNAME = new QName("http://smev.gosuslugi.ru/rev111111", "RequestCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.gosuslugi.smev.rev111111
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     * @return
     *     the new instance of {@link HeaderType }
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link BaseMessageType }
     * 
     * @return
     *     the new instance of {@link BaseMessageType }
     */
    public BaseMessageType createBaseMessageType() {
        return new BaseMessageType();
    }

    /**
     * Create an instance of {@link MessageType }
     * 
     * @return
     *     the new instance of {@link MessageType }
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link MessageDataType }
     * 
     * @return
     *     the new instance of {@link MessageDataType }
     */
    public MessageDataType createMessageDataType() {
        return new MessageDataType();
    }

    /**
     * Create an instance of {@link AppDataType }
     * 
     * @return
     *     the new instance of {@link AppDataType }
     */
    public AppDataType createAppDataType() {
        return new AppDataType();
    }

    /**
     * Create an instance of {@link AppDocumentType }
     * 
     * @return
     *     the new instance of {@link AppDocumentType }
     */
    public AppDocumentType createAppDocumentType() {
        return new AppDocumentType();
    }

    /**
     * Create an instance of {@link OrgExternalType }
     * 
     * @return
     *     the new instance of {@link OrgExternalType }
     */
    public OrgExternalType createOrgExternalType() {
        return new OrgExternalType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     * @return
     *     the new instance of {@link ReferenceType }
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link BookRequestResponseMessage }
     * 
     * @return
     *     the new instance of {@link BookRequestResponseMessage }
     */
    public BookRequestResponseMessage createBookRequestResponseMessage() {
        return new BookRequestResponseMessage();
    }

    /**
     * Create an instance of {@link BookRequestResponseMessageData }
     * 
     * @return
     *     the new instance of {@link BookRequestResponseMessageData }
     */
    public BookRequestResponseMessageData createBookRequestResponseMessageData() {
        return new BookRequestResponseMessageData();
    }

    /**
     * Create an instance of {@link GetTaskTypesMessage }
     * 
     * @return
     *     the new instance of {@link GetTaskTypesMessage }
     */
    public GetTaskTypesMessage createGetTaskTypesMessage() {
        return new GetTaskTypesMessage();
    }

    /**
     * Create an instance of {@link GetTaskTypesMessageData }
     * 
     * @return
     *     the new instance of {@link GetTaskTypesMessageData }
     */
    public GetTaskTypesMessageData createGetTaskTypesMessageData() {
        return new GetTaskTypesMessageData();
    }

    /**
     * Create an instance of {@link GetTaskTypesResponseMessage }
     * 
     * @return
     *     the new instance of {@link GetTaskTypesResponseMessage }
     */
    public GetTaskTypesResponseMessage createGetTaskTypesResponseMessage() {
        return new GetTaskTypesResponseMessage();
    }

    /**
     * Create an instance of {@link GetTaskTypesResponseMessageData }
     * 
     * @return
     *     the new instance of {@link GetTaskTypesResponseMessageData }
     */
    public GetTaskTypesResponseMessageData createGetTaskTypesResponseMessageData() {
        return new GetTaskTypesResponseMessageData();
    }

    /**
     * Create an instance of {@link GetDictionaryValuesMessage }
     * 
     * @return
     *     the new instance of {@link GetDictionaryValuesMessage }
     */
    public GetDictionaryValuesMessage createGetDictionaryValuesMessage() {
        return new GetDictionaryValuesMessage();
    }

    /**
     * Create an instance of {@link GetDictionaryValuesMessageData }
     * 
     * @return
     *     the new instance of {@link GetDictionaryValuesMessageData }
     */
    public GetDictionaryValuesMessageData createGetDictionaryValuesMessageData() {
        return new GetDictionaryValuesMessageData();
    }

    /**
     * Create an instance of {@link GetDictionaryValuesResponseMessage }
     * 
     * @return
     *     the new instance of {@link GetDictionaryValuesResponseMessage }
     */
    public GetDictionaryValuesResponseMessage createGetDictionaryValuesResponseMessage() {
        return new GetDictionaryValuesResponseMessage();
    }

    /**
     * Create an instance of {@link GetDictionaryValuesResponseMessageData }
     * 
     * @return
     *     the new instance of {@link GetDictionaryValuesResponseMessageData }
     */
    public GetDictionaryValuesResponseMessageData createGetDictionaryValuesResponseMessageData() {
        return new GetDictionaryValuesResponseMessageData();
    }

    /**
     * Create an instance of {@link ServiceRequestMessage }
     * 
     * @return
     *     the new instance of {@link ServiceRequestMessage }
     */
    public ServiceRequestMessage createServiceRequestMessage() {
        return new ServiceRequestMessage();
    }

    /**
     * Create an instance of {@link ServiceRequestMessageData }
     * 
     * @return
     *     the new instance of {@link ServiceRequestMessageData }
     */
    public ServiceRequestMessageData createServiceRequestMessageData() {
        return new ServiceRequestMessageData();
    }

    /**
     * Create an instance of {@link ProcessTaskResponseMessage }
     * 
     * @return
     *     the new instance of {@link ProcessTaskResponseMessage }
     */
    public ProcessTaskResponseMessage createProcessTaskResponseMessage() {
        return new ProcessTaskResponseMessage();
    }

    /**
     * Create an instance of {@link ProcessTaskResponseMessageData }
     * 
     * @return
     *     the new instance of {@link ProcessTaskResponseMessageData }
     */
    public ProcessTaskResponseMessageData createProcessTaskResponseMessageData() {
        return new ProcessTaskResponseMessageData();
    }

    /**
     * Create an instance of {@link GetResultMessage }
     * 
     * @return
     *     the new instance of {@link GetResultMessage }
     */
    public GetResultMessage createGetResultMessage() {
        return new GetResultMessage();
    }

    /**
     * Create an instance of {@link GetResultMessageData }
     * 
     * @return
     *     the new instance of {@link GetResultMessageData }
     */
    public GetResultMessageData createGetResultMessageData() {
        return new GetResultMessageData();
    }

    /**
     * Create an instance of {@link GetResultResponseMessage }
     * 
     * @return
     *     the new instance of {@link GetResultResponseMessage }
     */
    public GetResultResponseMessage createGetResultResponseMessage() {
        return new GetResultResponseMessage();
    }

    /**
     * Create an instance of {@link GetResultResponseMessageData }
     * 
     * @return
     *     the new instance of {@link GetResultResponseMessageData }
     */
    public GetResultResponseMessageData createGetResultResponseMessageData() {
        return new GetResultResponseMessageData();
    }

    /**
     * Create an instance of {@link SendErrorReportMessage }
     * 
     * @return
     *     the new instance of {@link SendErrorReportMessage }
     */
    public SendErrorReportMessage createSendErrorReportMessage() {
        return new SendErrorReportMessage();
    }

    /**
     * Create an instance of {@link SendErrorReportMessageData }
     * 
     * @return
     *     the new instance of {@link SendErrorReportMessageData }
     */
    public SendErrorReportMessageData createSendErrorReportMessageData() {
        return new SendErrorReportMessageData();
    }

    /**
     * Create an instance of {@link SendErrorReportResponseMessage }
     * 
     * @return
     *     the new instance of {@link SendErrorReportResponseMessage }
     */
    public SendErrorReportResponseMessage createSendErrorReportResponseMessage() {
        return new SendErrorReportResponseMessage();
    }

    /**
     * Create an instance of {@link SendErrorReportResponseMessageData }
     * 
     * @return
     *     the new instance of {@link SendErrorReportResponseMessageData }
     */
    public SendErrorReportResponseMessageData createSendErrorReportResponseMessageData() {
        return new SendErrorReportResponseMessageData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderType }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "Header")
    public JAXBElement<HeaderType> createHeader(HeaderType value) {
        return new JAXBElement<>(_Header_QNAME, HeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaseMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "BaseMessage")
    public JAXBElement<BaseMessageType> createBaseMessage(BaseMessageType value) {
        return new JAXBElement<>(_BaseMessage_QNAME, BaseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MessageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "Message")
    public JAXBElement<MessageType> createMessage(MessageType value) {
        return new JAXBElement<>(_Message_QNAME, MessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MessageDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "MessageData")
    public JAXBElement<MessageDataType> createMessageData(MessageDataType value) {
        return new JAXBElement<>(_MessageData_QNAME, MessageDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AppDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "AppData")
    public JAXBElement<AppDataType> createAppData(AppDataType value) {
        return new JAXBElement<>(_AppData_QNAME, AppDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppDocumentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AppDocumentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "AppDocument")
    public JAXBElement<AppDocumentType> createAppDocument(AppDocumentType value) {
        return new JAXBElement<>(_AppDocument_QNAME, AppDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrgExternalType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrgExternalType }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "Sender")
    public JAXBElement<OrgExternalType> createSender(OrgExternalType value) {
        return new JAXBElement<>(_Sender_QNAME, OrgExternalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrgExternalType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrgExternalType }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "Recipient")
    public JAXBElement<OrgExternalType> createRecipient(OrgExternalType value) {
        return new JAXBElement<>(_Recipient_QNAME, OrgExternalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrgExternalType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrgExternalType }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "Originator")
    public JAXBElement<OrgExternalType> createOriginator(OrgExternalType value) {
        return new JAXBElement<>(_Originator_QNAME, OrgExternalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypeCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "TypeCode")
    public JAXBElement<TypeCodeType> createTypeCode(TypeCodeType value) {
        return new JAXBElement<>(_TypeCode_QNAME, TypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "Date")
    public JAXBElement<XMLGregorianCalendar> createDate(XMLGregorianCalendar value) {
        return new JAXBElement<>(_Date_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "RequestIdRef")
    public JAXBElement<String> createRequestIdRef(String value) {
        return new JAXBElement<>(_RequestIdRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "OriginRequestIdRef")
    public JAXBElement<String> createOriginRequestIdRef(String value) {
        return new JAXBElement<>(_OriginRequestIdRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "ServiceCode")
    public JAXBElement<String> createServiceCode(String value) {
        return new JAXBElement<>(_ServiceCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "CaseNumber")
    public JAXBElement<String> createCaseNumber(String value) {
        return new JAXBElement<>(_CaseNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "MessageId")
    public JAXBElement<String> createMessageId(String value) {
        return new JAXBElement<>(_MessageId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "TimeStamp")
    public JAXBElement<XMLGregorianCalendar> createTimeStamp(XMLGregorianCalendar value) {
        return new JAXBElement<>(_TimeStamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "NodeId")
    public JAXBElement<String> createNodeId(String value) {
        return new JAXBElement<>(_NodeId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageClassType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MessageClassType }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "MessageClass")
    public JAXBElement<MessageClassType> createMessageClass(MessageClassType value) {
        return new JAXBElement<>(_MessageClass_QNAME, MessageClassType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "Status")
    public JAXBElement<StatusType> createStatus(StatusType value) {
        return new JAXBElement<>(_Status_QNAME, StatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "ExchangeType")
    public JAXBElement<String> createExchangeType(String value) {
        return new JAXBElement<>(_ExchangeType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "BinaryData")
    public JAXBElement<byte[]> createBinaryData(byte[] value) {
        return new JAXBElement<>(_BinaryData_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "Reference")
    public JAXBElement<ReferenceType> createReference(ReferenceType value) {
        return new JAXBElement<>(_Reference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "DigestValue")
    public JAXBElement<byte[]> createDigestValue(byte[] value) {
        return new JAXBElement<>(_DigestValue_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "TestMsg")
    public JAXBElement<String> createTestMsg(String value) {
        return new JAXBElement<>(_TestMsg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev111111", name = "RequestCode")
    public JAXBElement<String> createRequestCode(String value) {
        return new JAXBElement<>(_RequestCode_QNAME, String.class, null, value);
    }

}
