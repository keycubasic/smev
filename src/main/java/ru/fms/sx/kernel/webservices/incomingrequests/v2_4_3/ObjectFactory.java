
package ru.fms.sx.kernel.webservices.incomingrequests.v2_4_3;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import ru.gosuslugi.smev.rev111111.BookRequestResponseMessage;
import ru.gosuslugi.smev.rev111111.GetDictionaryValuesMessage;
import ru.gosuslugi.smev.rev111111.GetDictionaryValuesResponseMessage;
import ru.gosuslugi.smev.rev111111.GetResultMessage;
import ru.gosuslugi.smev.rev111111.GetResultResponseMessage;
import ru.gosuslugi.smev.rev111111.GetTaskTypesMessage;
import ru.gosuslugi.smev.rev111111.GetTaskTypesResponseMessage;
import ru.gosuslugi.smev.rev111111.ProcessTaskResponseMessage;
import ru.gosuslugi.smev.rev111111.SendErrorReportMessage;
import ru.gosuslugi.smev.rev111111.SendErrorReportResponseMessage;
import ru.gosuslugi.smev.rev111111.ServiceRequestMessage;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.fms.sx.kernel.webservices.incomingrequests.v2_4_3 package. 
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
public class ObjectFactory {

    private static final QName _BookRequest_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "bookRequest");
    private static final QName _BookRequestResponse_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "bookRequestResponse");
    private static final QName _GetTaskTypes_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "getTaskTypes");
    private static final QName _GetTaskTypesResponse_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "getTaskTypesResponse");
    private static final QName _GetDictionaryValues_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "getDictionaryValues");
    private static final QName _GetDictionaryValuesResponse_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "getDictionaryValuesResponse");
    private static final QName _ProcessTask_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "processTask");
    private static final QName _ProcessTaskResponse_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "processTaskResponse");
    private static final QName _GetResult_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "getResult");
    private static final QName _GetResultResponse_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "getResultResponse");
    private static final QName _SendErrorReport_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "sendErrorReport");
    private static final QName _SendErrorReportResponse_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "sendErrorReportResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.fms.sx.kernel.webservices.incomingrequests.v2_4_3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "bookRequest")
    public JAXBElement<ServiceRequestMessage> createBookRequest(ServiceRequestMessage value) {
        return new JAXBElement<>(_BookRequest_QNAME, ServiceRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookRequestResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BookRequestResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "bookRequestResponse")
    public JAXBElement<BookRequestResponseMessage> createBookRequestResponse(BookRequestResponseMessage value) {
        return new JAXBElement<>(_BookRequestResponse_QNAME, BookRequestResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaskTypesMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTaskTypesMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "getTaskTypes")
    public JAXBElement<GetTaskTypesMessage> createGetTaskTypes(GetTaskTypesMessage value) {
        return new JAXBElement<>(_GetTaskTypes_QNAME, GetTaskTypesMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaskTypesResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTaskTypesResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "getTaskTypesResponse")
    public JAXBElement<GetTaskTypesResponseMessage> createGetTaskTypesResponse(GetTaskTypesResponseMessage value) {
        return new JAXBElement<>(_GetTaskTypesResponse_QNAME, GetTaskTypesResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDictionaryValuesMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDictionaryValuesMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "getDictionaryValues")
    public JAXBElement<GetDictionaryValuesMessage> createGetDictionaryValues(GetDictionaryValuesMessage value) {
        return new JAXBElement<>(_GetDictionaryValues_QNAME, GetDictionaryValuesMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDictionaryValuesResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDictionaryValuesResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "getDictionaryValuesResponse")
    public JAXBElement<GetDictionaryValuesResponseMessage> createGetDictionaryValuesResponse(GetDictionaryValuesResponseMessage value) {
        return new JAXBElement<>(_GetDictionaryValuesResponse_QNAME, GetDictionaryValuesResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "processTask")
    public JAXBElement<ServiceRequestMessage> createProcessTask(ServiceRequestMessage value) {
        return new JAXBElement<>(_ProcessTask_QNAME, ServiceRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessTaskResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessTaskResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "processTaskResponse")
    public JAXBElement<ProcessTaskResponseMessage> createProcessTaskResponse(ProcessTaskResponseMessage value) {
        return new JAXBElement<>(_ProcessTaskResponse_QNAME, ProcessTaskResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetResultMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "getResult")
    public JAXBElement<GetResultMessage> createGetResult(GetResultMessage value) {
        return new JAXBElement<>(_GetResult_QNAME, GetResultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetResultResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "getResultResponse")
    public JAXBElement<GetResultResponseMessage> createGetResultResponse(GetResultResponseMessage value) {
        return new JAXBElement<>(_GetResultResponse_QNAME, GetResultResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendErrorReportMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendErrorReportMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "sendErrorReport")
    public JAXBElement<SendErrorReportMessage> createSendErrorReport(SendErrorReportMessage value) {
        return new JAXBElement<>(_SendErrorReport_QNAME, SendErrorReportMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendErrorReportResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendErrorReportResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "sendErrorReportResponse")
    public JAXBElement<SendErrorReportResponseMessage> createSendErrorReportResponse(SendErrorReportResponseMessage value) {
        return new JAXBElement<>(_SendErrorReportResponse_QNAME, SendErrorReportResponseMessage.class, null, value);
    }

}
