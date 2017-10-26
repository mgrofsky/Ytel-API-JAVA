/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateConferenceInputBuilder {
    //the instance to build
    private CreateConferenceInput createConferenceInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateConferenceInputBuilder() {
        createConferenceInput = new CreateConferenceInput();
    }

    /**
     * This number to display on Caller ID as calling
     */
    public CreateConferenceInputBuilder from(String from) {
        createConferenceInput.setFrom(from);
        return this;
    }

    /**
     * To number
     */
    public CreateConferenceInputBuilder to(String to) {
        createConferenceInput.setTo(to);
        return this;
    }

    /**
     * URL requested once the call connects
     */
    public CreateConferenceInputBuilder url(String url) {
        createConferenceInput.setUrl(url);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required URL once call connects.
     */
    public CreateConferenceInputBuilder method(HttpActionEnum method) {
        createConferenceInput.setMethod(method);
        return this;
    }

    /**
     * Recording parameters will be sent here upon completion.
     */
    public CreateConferenceInputBuilder recordCallbackUrl(String recordCallbackUrl) {
        createConferenceInput.setRecordCallbackUrl(recordCallbackUrl);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateConferenceInputBuilder responseType(String responseType) {
        createConferenceInput.setResponseType(responseType);
        return this;
    }

    /**
     * URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished.
     */
    public CreateConferenceInputBuilder statusCallBackUrl(String statusCallBackUrl) {
        createConferenceInput.setStatusCallBackUrl(statusCallBackUrl);
        return this;
    }

    /**
     * Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     */
    public CreateConferenceInputBuilder statusCallBackMethod(HttpActionEnum statusCallBackMethod) {
        createConferenceInput.setStatusCallBackMethod(statusCallBackMethod);
        return this;
    }

    /**
     * URL requested if the initial Url parameter fails or encounters an error
     */
    public CreateConferenceInputBuilder fallBackUrl(String fallBackUrl) {
        createConferenceInput.setFallBackUrl(fallBackUrl);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required FallbackUrl once call connects.
     */
    public CreateConferenceInputBuilder fallBackMethod(HttpActionEnum fallBackMethod) {
        createConferenceInput.setFallBackMethod(fallBackMethod);
        return this;
    }

    /**
     * Specifies if the conference should be recorded.
     */
    public CreateConferenceInputBuilder record(Boolean record) {
        createConferenceInput.setRecord(record);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required URL once conference connects.
     */
    public CreateConferenceInputBuilder recordCallbackMethod(HttpActionEnum recordCallbackMethod) {
        createConferenceInput.setRecordCallbackMethod(recordCallbackMethod);
        return this;
    }

    /**
     * Schedule conference in future. Schedule time must be greater than current time
     */
    public CreateConferenceInputBuilder schdeuleTime(String schdeuleTime) {
        createConferenceInput.setSchdeuleTime(schdeuleTime);
        return this;
    }

    /**
     * The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set.
     */
    public CreateConferenceInputBuilder timeout(Integer timeout) {
        createConferenceInput.setTimeout(timeout);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateConferenceInput build() {
        return createConferenceInput;
    }
}