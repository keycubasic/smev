package org.keycube.smev.service;

import io.quarkiverse.cxf.annotation.CXFClient;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;
import ru.fms.sx.kernel.webservices.incomingrequests.v2_4_3.IncomingRequestsServiceV243;
import ru.gosuslugi.smev.rev111111.*;

@Slf4j
@ApplicationScoped
public class CxfClientService {

    @CXFClient("smev")
    IncomingRequestsServiceV243 client;

    public BookRequestResponseMessage bookRequest(ServiceRequestMessage requestMessage) {
        return client.bookRequest(requestMessage);
    }

    public GetDictionaryValuesResponseMessage getDictionaryValues(GetDictionaryValuesMessage dictionaryValuesMessage) {
        return client.getDictionaryValues(dictionaryValuesMessage);
    }

    public GetResultResponseMessage getResult(GetResultMessage resultMessage) {
        return client.getResult(resultMessage);
    }

    public GetTaskTypesResponseMessage getTaskTypes(GetTaskTypesMessage taskTypesMessage) {
        return client.getTaskTypes(taskTypesMessage);
    }

    public ProcessTaskResponseMessage processTask(ServiceRequestMessage requestMessage) {
        return client.processTask(requestMessage);
    }

    public SendErrorReportResponseMessage sendErrorReport(SendErrorReportMessage message) {
        return client.sendErrorReport(message);
    }

}
