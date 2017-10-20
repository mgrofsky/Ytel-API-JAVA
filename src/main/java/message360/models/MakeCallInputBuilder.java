/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class MakeCallInputBuilder {
    //the instance to build
    private MakeCallInput makeCallInput;

    /**
     * Default constructor to initialize the instance
     */
    public MakeCallInputBuilder() {
        makeCallInput = new MakeCallInput();
    }

    /**
     * This number to display on Caller ID as calling
     */
    public MakeCallInputBuilder from(String from) {
        makeCallInput.setFrom(from);
        return this;
    }

    /**
     * To number
     */
    public MakeCallInputBuilder to(String to) {
        makeCallInput.setTo(to);
        return this;
    }

    /**
     * URL requested once the call connects
     */
    public MakeCallInputBuilder url(String url) {
        makeCallInput.setUrl(url);
        return this;
    }

    /**
     * The unique identifier for the survey.
     */
    public MakeCallInputBuilder surveyId(String surveyId) {
        makeCallInput.setSurveyId(surveyId);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public MakeCallInputBuilder responseType(String responseType) {
        makeCallInput.setResponseType(responseType);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required URL once call connects.
     */
    public MakeCallInputBuilder method(HttpActionEnum method) {
        makeCallInput.setMethod(method);
        return this;
    }

    /**
     * specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     */
    public MakeCallInputBuilder statusCallBackUrl(String statusCallBackUrl) {
        makeCallInput.setStatusCallBackUrl(statusCallBackUrl);
        return this;
    }

    /**
     * Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     */
    public MakeCallInputBuilder statusCallBackMethod(HttpActionEnum statusCallBackMethod) {
        makeCallInput.setStatusCallBackMethod(statusCallBackMethod);
        return this;
    }

    /**
     * URL requested if the initial Url parameter fails or encounters an error
     */
    public MakeCallInputBuilder fallBackUrl(String fallBackUrl) {
        makeCallInput.setFallBackUrl(fallBackUrl);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required FallbackUrl once call connects.
     */
    public MakeCallInputBuilder fallBackMethod(HttpActionEnum fallBackMethod) {
        makeCallInput.setFallBackMethod(fallBackMethod);
        return this;
    }

    /**
     * URL that can be requested every 60 seconds during the call to notify of elapsed tim
     */
    public MakeCallInputBuilder heartBeatUrl(String heartBeatUrl) {
        makeCallInput.setHeartBeatUrl(heartBeatUrl);
        return this;
    }

    /**
     * Specifies the HTTP method used to request HeartbeatUrl.
     */
    public MakeCallInputBuilder heartBeatMethod(Boolean heartBeatMethod) {
        makeCallInput.setHeartBeatMethod(heartBeatMethod);
        return this;
    }

    /**
     * Time (in seconds) Message360 should wait while the call is ringing before canceling the call
     */
    public MakeCallInputBuilder timeout(Integer timeout) {
        makeCallInput.setTimeout(timeout);
        return this;
    }

    /**
     * DTMF Digits to play to the call once it connects. 0-9, #, or *
     */
    public MakeCallInputBuilder playDtmf(String playDtmf) {
        makeCallInput.setPlayDtmf(playDtmf);
        return this;
    }

    /**
     * Specifies if the caller id will be hidden
     */
    public MakeCallInputBuilder hideCallerId(Boolean hideCallerId) {
        makeCallInput.setHideCallerId(hideCallerId);
        return this;
    }

    /**
     * Specifies if the call should be recorded
     */
    public MakeCallInputBuilder record(Boolean record) {
        makeCallInput.setRecord(record);
        return this;
    }

    /**
     * Recording parameters will be sent here upon completion
     */
    public MakeCallInputBuilder recordCallBackUrl(String recordCallBackUrl) {
        makeCallInput.setRecordCallBackUrl(recordCallBackUrl);
        return this;
    }

    /**
     * Method used to request the RecordCallback URL.
     */
    public MakeCallInputBuilder recordCallBackMethod(HttpActionEnum recordCallBackMethod) {
        makeCallInput.setRecordCallBackMethod(recordCallBackMethod);
        return this;
    }

    /**
     * Specifies if the call recording should be transcribed
     */
    public MakeCallInputBuilder transcribe(Boolean transcribe) {
        makeCallInput.setTranscribe(transcribe);
        return this;
    }

    /**
     * Transcription parameters will be sent here upon completion
     */
    public MakeCallInputBuilder transcribeCallBackUrl(String transcribeCallBackUrl) {
        makeCallInput.setTranscribeCallBackUrl(transcribeCallBackUrl);
        return this;
    }

    /**
     * How Message360 should handle the receiving numbers voicemail machine
     */
    public MakeCallInputBuilder ifMachine(IfMachineEnum ifMachine) {
        makeCallInput.setIfMachine(ifMachine);
        return this;
    }

    /**
     * URL requested when IfMachine=continue
     */
    public MakeCallInputBuilder ifMachineUrl(String ifMachineUrl) {
        makeCallInput.setIfMachineUrl(ifMachineUrl);
        return this;
    }

    /**
     * Method used to request the IfMachineUrl.
     */
    public MakeCallInputBuilder ifMachineMethod(HttpActionEnum ifMachineMethod) {
        makeCallInput.setIfMachineMethod(ifMachineMethod);
        return this;
    }

    /**
     * Specify if survey should be enable or not
     */
    public MakeCallInputBuilder feedback(Boolean feedback) {
        makeCallInput.setFeedback(feedback);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MakeCallInput build() {
        return makeCallInput;
    }
}