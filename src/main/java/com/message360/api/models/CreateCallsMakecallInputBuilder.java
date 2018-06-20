/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.message360.api.models;

import java.util.*;

public class CreateCallsMakecallInputBuilder {
    //the instance to build
    private CreateCallsMakecallInput createCallsMakecallInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCallsMakecallInputBuilder() {
        createCallsMakecallInput = new CreateCallsMakecallInput();
    }

    /**
     * A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
     */
    public CreateCallsMakecallInputBuilder from(String from) {
        createCallsMakecallInput.setFrom(from);
        return this;
    }

    /**
     * To number
     */
    public CreateCallsMakecallInputBuilder to(String to) {
        createCallsMakecallInput.setTo(to);
        return this;
    }

    /**
     * URL requested once the call connects
     */
    public CreateCallsMakecallInputBuilder url(String url) {
        createCallsMakecallInput.setUrl(url);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required URL once call connects.
     */
    public CreateCallsMakecallInputBuilder method(String method) {
        createCallsMakecallInput.setMethod(method);
        return this;
    }

    /**
     * URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
     */
    public CreateCallsMakecallInputBuilder statusCallBackUrl(String statusCallBackUrl) {
        createCallsMakecallInput.setStatusCallBackUrl(statusCallBackUrl);
        return this;
    }

    /**
     * Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     */
    public CreateCallsMakecallInputBuilder statusCallBackMethod(String statusCallBackMethod) {
        createCallsMakecallInput.setStatusCallBackMethod(statusCallBackMethod);
        return this;
    }

    /**
     * URL requested if the initial Url parameter fails or encounters an error
     */
    public CreateCallsMakecallInputBuilder fallBackUrl(String fallBackUrl) {
        createCallsMakecallInput.setFallBackUrl(fallBackUrl);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required FallbackUrl once call connects.
     */
    public CreateCallsMakecallInputBuilder fallBackMethod(String fallBackMethod) {
        createCallsMakecallInput.setFallBackMethod(fallBackMethod);
        return this;
    }

    /**
     * URL that can be requested every 60 seconds during the call to notify of elapsed tim
     */
    public CreateCallsMakecallInputBuilder heartBeatUrl(String heartBeatUrl) {
        createCallsMakecallInput.setHeartBeatUrl(heartBeatUrl);
        return this;
    }

    /**
     * Specifies the HTTP method used to request HeartbeatUrl.
     */
    public CreateCallsMakecallInputBuilder heartBeatMethod(String heartBeatMethod) {
        createCallsMakecallInput.setHeartBeatMethod(heartBeatMethod);
        return this;
    }

    /**
     * Time (in seconds) Ytel should wait while the call is ringing before canceling the call
     */
    public CreateCallsMakecallInputBuilder timeout(Integer timeout) {
        createCallsMakecallInput.setTimeout(timeout);
        return this;
    }

    /**
     * DTMF Digits to play to the call once it connects. 0-9, #, or *
     */
    public CreateCallsMakecallInputBuilder playDtmf(String playDtmf) {
        createCallsMakecallInput.setPlayDtmf(playDtmf);
        return this;
    }

    /**
     * Specifies if the caller id will be hidden
     */
    public CreateCallsMakecallInputBuilder hideCallerId(Boolean hideCallerId) {
        createCallsMakecallInput.setHideCallerId(hideCallerId);
        return this;
    }

    /**
     * Specifies if the call should be recorded
     */
    public CreateCallsMakecallInputBuilder record(Boolean record) {
        createCallsMakecallInput.setRecord(record);
        return this;
    }

    /**
     * Recording parameters will be sent here upon completion
     */
    public CreateCallsMakecallInputBuilder recordCallBackUrl(String recordCallBackUrl) {
        createCallsMakecallInput.setRecordCallBackUrl(recordCallBackUrl);
        return this;
    }

    /**
     * Method used to request the RecordCallback URL.
     */
    public CreateCallsMakecallInputBuilder recordCallBackMethod(String recordCallBackMethod) {
        createCallsMakecallInput.setRecordCallBackMethod(recordCallBackMethod);
        return this;
    }

    /**
     * Specifies if the call recording should be transcribed
     */
    public CreateCallsMakecallInputBuilder transcribe(Boolean transcribe) {
        createCallsMakecallInput.setTranscribe(transcribe);
        return this;
    }

    /**
     * Transcription parameters will be sent here upon completion
     */
    public CreateCallsMakecallInputBuilder transcribeCallBackUrl(String transcribeCallBackUrl) {
        createCallsMakecallInput.setTranscribeCallBackUrl(transcribeCallBackUrl);
        return this;
    }

    /**
     * How Ytel should handle the receiving numbers voicemail machine
     */
    public CreateCallsMakecallInputBuilder ifMachine(IfMachineEnum ifMachine) {
        createCallsMakecallInput.setIfMachine(ifMachine);
        return this;
    }

    /**
     * URL requested when IfMachine=continue
     */
    public CreateCallsMakecallInputBuilder ifMachineUrl(String ifMachineUrl) {
        createCallsMakecallInput.setIfMachineUrl(ifMachineUrl);
        return this;
    }

    /**
     * Method used to request the IfMachineUrl.
     */
    public CreateCallsMakecallInputBuilder ifMachineMethod(String ifMachineMethod) {
        createCallsMakecallInput.setIfMachineMethod(ifMachineMethod);
        return this;
    }

    /**
     * Specify if survey should be enable or not
     */
    public CreateCallsMakecallInputBuilder feedback(Boolean feedback) {
        createCallsMakecallInput.setFeedback(feedback);
        return this;
    }

    /**
     * The unique identifier for the survey.
     */
    public CreateCallsMakecallInputBuilder surveyId(String surveyId) {
        createCallsMakecallInput.setSurveyId(surveyId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCallsMakecallInput build() {
        return createCallsMakecallInput;
    }
}