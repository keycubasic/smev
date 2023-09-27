package org.keycube.smev.factory;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import ru.fms.sx.kernel.webservices.border.basetypes.*;
import ru.gosuslugi.smev.rev111111.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static ru.gosuslugi.smev.rev111111.StatusType.PING;
import static ru.gosuslugi.smev.rev111111.StatusType.REQUEST;
import static ru.gosuslugi.smev.rev111111.TypeCodeType.GSRV;

@Slf4j
@ApplicationScoped
public class CxfClientFactory {

    static MessageType message;
    @Inject
    ru.gosuslugi.smev.rev111111.ObjectFactory factory;
    @Inject
    ru.fms.sx.kernel.webservices.border.basetypes.ObjectFactory baseFactory;
    @ConfigProperty(name = "cxf.smev.message.sender.code")
    String senderCode;
    @ConfigProperty(name = "cxf.smev.message.sender.name")
    String senderName;
    @ConfigProperty(name = "cxf.smev.message.recipient.code")
    String recipientCode;
    @ConfigProperty(name = "cxf.smev.message.recipient.name")
    String recipientName;
    @ConfigProperty(name = "cxf.smev.message.originator.code")
    String originatorCode;
    @ConfigProperty(name = "cxf.smev.message.originator.name")
    String originatorName;
    @ConfigProperty(name = "cxf.smev.message.exchangeType")
    String exchangeType;
    @ConfigProperty(name = "cxf.smev.message.serviceCode")
    String serviceCode;
    @ConfigProperty(name = "cxf.smev.message.caseNumber")
    String caseNumber;
    @ConfigProperty(name = "cxf.smev.message.testMsg")
    String testMsg;
    @ConfigProperty(name = "cxf.smev.messageData.appData.user.organization")
    String organization;
    @ConfigProperty(name = "cxf.smev.messageData.appData.user.person.id")
    String personId;
    @ConfigProperty(name = "cxf.smev.messageData.appData.user.person.firstName")
    String personFirstName;
    @ConfigProperty(name = "cxf.smev.messageData.appData.user.person.secondName")
    String personSecondName;
    @ConfigProperty(name = "cxf.smev.messageData.appData.user.person.lastName")
    String personLastName;
    @ConfigProperty(name = "cxf.smev.messageData.appData.serviceCode")
    String dataServiceCode;
    @ConfigProperty(name = "cxf.smev.messageData.appData.versionCode")
    String versionCode;
    @ConfigProperty(name = "cxf.smev.messageData.appData.parameters.series")
    String seriesParam;
    @ConfigProperty(name = "cxf.smev.messageData.appData.parameters.number")
    String numberParam;
    @ConfigProperty(name = "cxf.smev.messageData.appData.parameters.date")
    String dateParam;
    @ConfigProperty(name = "cxf.smev.messageData.appData.dictionaryCode")
    String dictionaryCode;

    @PostConstruct
    void init() {
        message = factory.createMessageType();
        message.setSender(createOrgExternal(senderCode, senderName));
        message.setRecipient(createOrgExternal(recipientCode, recipientName));
        message.setOriginator(createOrgExternal(originatorCode, originatorName));
        message.setTypeCode(GSRV);
        message.setExchangeType(exchangeType);
        message.setServiceCode(serviceCode);
        message.setCaseNumber(caseNumber);
        message.setTestMsg(testMsg);
    }

    private XMLGregorianCalendar sysdate() {
        try {
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(new Date());
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (DatatypeConfigurationException e) {
            return DatatypeFactory.newDefaultInstance().newXMLGregorianCalendar();
        }
    }

    private OrgExternalType createOrgExternal(String... params) {
        OrgExternalType orgExternalType = factory.createOrgExternalType();
        orgExternalType.setCode(params[0]);
        orgExternalType.setName(params[1]);
        return orgExternalType;
    }

    private MessageType createMessage(TypeMethod typeMethod, String... params) {
        MessageType messageType = message;
        messageType.setDate(sysdate());
        if (typeMethod == TypeMethod.GR) {
            messageType.setStatus(PING);
            messageType.setRequestIdRef(params[0]);
            messageType.setOriginRequestIdRef(params[1]);
        } else {
            messageType.setStatus(REQUEST);
        }
        return messageType;
    }

    private User createUser() {
        User user = baseFactory.createUser();
        user.setOrganization(organization);
        Person person = baseFactory.createPerson();
        person.setId(personId);
        person.setFirstName(personFirstName);
        person.setSecondName(personSecondName);
        person.setLastName(personLastName);
        user.setPerson(person);
        return user;
    }

    private ServiceRequestMessageData createServiceRequestMessageData(String... params) {
        ServiceRequestMessageData serviceRequestMessageData = factory.createServiceRequestMessageData();
        ServiceRequestMessageType appData = baseFactory.createServiceRequestMessageType();
        appData.setUser(createUser());
        appData.setServiceCode(dataServiceCode);
        appData.setVersionCode(versionCode);
        TaskParameter series = baseFactory.createTaskParameter();
        series.setName(seriesParam);
        series.setValue(params[0]);
        appData.getParameters().add(series);
        TaskParameter number = baseFactory.createTaskParameter();
        number.setName(numberParam);
        number.setValue(params[1]);
        appData.getParameters().add(number);
        TaskParameter issueDate = baseFactory.createTaskParameter();
        issueDate.setName(dateParam);
        issueDate.setValue(params[2]);
        appData.getParameters().add(issueDate);
        serviceRequestMessageData.setAppData(appData);
        return serviceRequestMessageData;
    }

    private GetDictionaryValuesMessageData createDictionaryValuesMessageData() {
        GetDictionaryValuesMessageData dictionaryValuesMessageData = factory.createGetDictionaryValuesMessageData();
        GetDictionaryValuesMessageType appData = baseFactory.createGetDictionaryValuesMessageType();
        appData.setUser(createUser());
        appData.setDictionaryCode(dictionaryCode);
        dictionaryValuesMessageData.setAppData(appData);
        return dictionaryValuesMessageData;
    }

    private GetResultMessageData createResultMessageData(String... params) {
        GetResultMessageData resultMessageData = factory.createGetResultMessageData();
        GetResultMessageType appData = baseFactory.createGetResultMessageType();
        appData.setUser(createUser());
        appData.setTaskId(params[0]);
        resultMessageData.setAppData(appData);
        return resultMessageData;
    }

    private GetTaskTypesMessageData createTaskTypesMessageData() {
        GetTaskTypesMessageData taskTypesMessageData = factory.createGetTaskTypesMessageData();
        GetTaskTypesMessageType appData = baseFactory.createGetTaskTypesMessageType();
        appData.setUser(createUser());
        taskTypesMessageData.setAppData(appData);
        return taskTypesMessageData;
    }

    private SendErrorReportMessageData createSendErrorReportMessageData(String... params) {
        SendErrorReportMessageData sendErrorReportMessageData = factory.createSendErrorReportMessageData();
        SendErrorReportMessageType appData = baseFactory.createSendErrorReportMessageType();
        appData.setUser(createUser());
        appData.setTaskId(params[0]);
        appData.setErrorReport(params[1]);
        sendErrorReportMessageData.setAppData(appData);
        return sendErrorReportMessageData;
    }

    public ServiceRequestMessage createServiceRequestMessage(TypeMethod typeMethod, String... params) {
        ServiceRequestMessage requestMessage = factory.createServiceRequestMessage();
        requestMessage.setMessage(createMessage(typeMethod));
        requestMessage.setMessageData(createServiceRequestMessageData(params));
        return requestMessage;
    }

    public GetDictionaryValuesMessage createGetDictionaryValuesMessage() {
        GetDictionaryValuesMessage dictionaryValuesMessage = factory.createGetDictionaryValuesMessage();
        dictionaryValuesMessage.setMessage(createMessage(TypeMethod.GDV));
        dictionaryValuesMessage.setMessageData(createDictionaryValuesMessageData());
        return dictionaryValuesMessage;
    }

    public GetResultMessage createGetResultMessage(String... params) {
        GetResultMessage resultMessage = factory.createGetResultMessage();
        resultMessage.setMessage(createMessage(TypeMethod.GR, params));
        resultMessage.setMessageData(createResultMessageData(params[2]));
        return resultMessage;
    }

    public GetTaskTypesMessage createGetTaskTypesMessage() {
        GetTaskTypesMessage resultMessage = factory.createGetTaskTypesMessage();
        resultMessage.setMessage(createMessage(TypeMethod.GTT));
        resultMessage.setMessageData(createTaskTypesMessageData());
        return resultMessage;
    }

    public SendErrorReportMessage createSendErrorReportMessage(String... params) {
        SendErrorReportMessage resultMessage = factory.createSendErrorReportMessage();
        resultMessage.setMessage(createMessage(TypeMethod.SER));
        resultMessage.setMessageData(createSendErrorReportMessageData(params));
        return resultMessage;
    }

}
