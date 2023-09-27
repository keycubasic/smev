package org.keycube.smev.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.xml.ws.soap.SOAPFaultException;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.resteasy.reactive.RestResponse;
import org.jboss.resteasy.reactive.server.ServerExceptionMapper;
import org.keycube.smev.factory.CxfClientFactory;
import org.keycube.smev.service.CxfClientService;
import ru.fms.sx.kernel.webservices.border.basetypes.*;
import ru.gosuslugi.smev.rev111111.*;
import org.keycube.smev.exception.CxfClientException;
import org.keycube.smev.factory.TypeMethod;

@Slf4j
@Path("/expired-passports")
@Tag(name = "Проверка актуальных сведений о российских паспортах")
public class CxfClientResource {

    @Inject
    CxfClientFactory factory;
    @Inject
    CxfClientService service;

    @GET
    @Path("book-request")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Запросить исполнение", description = "Метод инициирует исполнение запроса с отложенным ответом и возвращает № задачи, инициированной на исполнение в СК. Используется для запросов в рамках Межведомственного взаимодействия.")
    @APIResponses(
            value = {
                    @APIResponse(
                            responseCode = "200",
                            description = "Ресурс был извлечён и передан в теле сообщения"),
                    @APIResponse(
                            responseCode = "500",
                            description = "Сервер столкнулся с неожиданной ошибкой, которая помешала ему выполнить запрос")
            })
    public RestResponse<BookRequestResponseMessageType> bookRequest(@Parameter(description = "Серия паспорта", required = true) @QueryParam("series") String series,
                                                                    @Parameter(description = "Номер паспорта", required = true) @QueryParam("number") String number,
                                                                    @Parameter(description = "Дата выдачи паспорта (DD.MM.YYYY)") @QueryParam("date") String date) {
        ServiceRequestMessage request = factory.createServiceRequestMessage(TypeMethod.BR, series, number, date);
        BookRequestResponseMessage response = service.bookRequest(request);
        return RestResponse.ok(response.getMessageData().getAppData());
    }

    @GET
    @Path("get-dictionary-values")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Запросить значения справочника")
    @APIResponses(
            value = {
                    @APIResponse(
                            responseCode = "200",
                            description = "Ресурс был извлечён и передан в теле сообщения"),
                    @APIResponse(
                            responseCode = "500",
                            description = "Сервер столкнулся с неожиданной ошибкой, которая помешала ему выполнить запрос")
            })
    public RestResponse<GetDictionaryValuesResponseMessageType> getDictionaryValues() {
        GetDictionaryValuesMessage request = factory.createGetDictionaryValuesMessage();
        GetDictionaryValuesResponseMessage response = service.getDictionaryValues(request);
        return RestResponse.ok(response.getMessageData().getAppData());
    }

    @GET
    @Path("get-result")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Запросить результат", description = "Метод по № задачи возвращает либо результат (если он уже готов), либо сообщение об ошибке (если результат ещё не готов). Используется для запросов в рамках Межведомственного взаимодействия.")
    @APIResponses(
            value = {
                    @APIResponse(
                            responseCode = "200",
                            description = "Ресурс был извлечён и передан в теле сообщения"),
                    @APIResponse(
                            responseCode = "500",
                            description = "Сервер столкнулся с неожиданной ошибкой, которая помешала ему выполнить запрос")
            })
    public RestResponse<GetResultResponseMessageType> getResult(@Parameter(description = "Идентификатор сообщения-запроса, инициировавшего взаимодействие") @QueryParam("requestIdRef") String requestIdRef,
                                                                @Parameter(description = "Идентификатор сообщения-запроса, инициировавшего цепочку из нескольких запросов-ответов, объединенных единым процессом в рамках взаимодействия") @QueryParam("originRequestIdRef") String originRequestIdRef,
                                                                @Parameter(description = "Номер задачи", required = true) @QueryParam("taskId") String taskId) {
        GetResultMessage request = factory.createGetResultMessage(requestIdRef, originRequestIdRef, taskId);
        GetResultResponseMessage response = service.getResult(request);
        return RestResponse.ok(response.getMessageData().getAppData());
    }

    @GET
    @Path("get-task-types")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Запросить список типов запросов", description = "Метод возвращает список типов запросов, доступных для данного пользователя.")
    @APIResponses(
            value = {
                    @APIResponse(
                            responseCode = "200",
                            description = "Ресурс был извлечён и передан в теле сообщения"),
                    @APIResponse(
                            responseCode = "500",
                            description = "Сервер столкнулся с неожиданной ошибкой, которая помешала ему выполнить запрос"
                    )
            })
    public RestResponse<GetTaskTypesResponseMessageType> getTaskTypes() {
        GetTaskTypesMessage request = factory.createGetTaskTypesMessage();
        GetTaskTypesResponseMessage response = service.getTaskTypes(request);
        return RestResponse.ok(response.getMessageData().getAppData());
    }

    @GET
    @Path("process-task")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Исполнить запрос", description = "Метод обрабатывает запрос с мгновенным ответом и синхронно возвращает № задачи и Результат её исполнения. Используется как для мгновенных запросов в рамках Межведомственного взаимодействия, так и для работы с ЕПГУ.")
    @APIResponses(
            value = {
                    @APIResponse(
                            responseCode = "200",
                            description = "Ресурс был извлечён и передан в теле сообщения"),
                    @APIResponse(
                            responseCode = "500",
                            description = "Сервер столкнулся с неожиданной ошибкой, которая помешала ему выполнить запрос")
            })
    public RestResponse<ProcessTaskResponseMessageType> processTask(@Parameter(description = "Серия паспорта", required = true) @QueryParam("series") String series,
                                                                    @Parameter(description = "Номер паспорта", required = true) @QueryParam("number") String number,
                                                                    @Parameter(description = "Дата выдачи паспорта (DD.MM.YYYY)") @QueryParam("date") String date) {
        ServiceRequestMessage request = factory.createServiceRequestMessage(TypeMethod.PT, series, number, date);
        ProcessTaskResponseMessage response = service.processTask(request);
        return RestResponse.ok(response.getMessageData().getAppData());
    }

    @POST
    @Path("send-error-report")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Известить об ошибке", description = "Метод используется для извещения МВД России о некорректной информации, обнаруженной в одном из базовых реестров МВД России по линии миграционно-регистрационной работы в результате исполнения одного из запросов.")
    @APIResponses(
            value = {
                    @APIResponse(
                            responseCode = "200",
                            description = "Ресурс был извлечён и передан в теле сообщения"),
                    @APIResponse(
                            responseCode = "500",
                            description = "Сервер столкнулся с неожиданной ошибкой, которая помешала ему выполнить запрос")
            })
    public RestResponse<SendErrorReportResponseMessageType> sendErrorReport(@RequestBody SendErrorReportMessageType error) {
        SendErrorReportMessage request = factory.createSendErrorReportMessage(error.getTaskId(), error.getErrorReport());
        SendErrorReportResponseMessage response = service.sendErrorReport(request);
        return RestResponse.ok(response.getMessageData().getAppData());
    }

    @ServerExceptionMapper
    public RestResponse<CxfClientException> soapFaultExceptionMapper(SOAPFaultException fault) {
        String message = fault.getMessage();
        log.error(message);
        int index = fault.getMessage().indexOf(":");
        return RestResponse.status(RestResponse.Status.INTERNAL_SERVER_ERROR,
                new CxfClientException(message.substring(0, index),
                        message.substring(index + 1).trim()));
    }

}