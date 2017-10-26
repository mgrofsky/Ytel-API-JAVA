/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class GroupCallInputBuilder {
    //the instance to build
    private GroupCallInput groupCallInput;

    /**
     * Default constructor to initialize the instance
     */
    public GroupCallInputBuilder() {
        groupCallInput = new GroupCallInput();
    }

    /**
     * This number to display on Caller ID as calling
     */
    public GroupCallInputBuilder from(String from) {
        groupCallInput.setFrom(from);
        return this;
    }

    /**
     * Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222
     */
    public GroupCallInputBuilder to(String to) {
        groupCallInput.setTo(to);
        return this;
    }

    /**
     * URL requested once the call connects
     */
    public GroupCallInputBuilder url(String url) {
        groupCallInput.setUrl(url);
        return this;
    }

    public GroupCallInputBuilder responseType(String responseType) {
        groupCallInput.setResponseType(responseType);
        return this;
    }

    /**
     * Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, *
     */
    public GroupCallInputBuilder groupConfirmKey(String groupConfirmKey) {
        groupCallInput.setGroupConfirmKey(groupConfirmKey);
        return this;
    }

    /**
     * Specify the audio file you want to play when the called party picks up the call
     */
    public GroupCallInputBuilder groupConfirmFile(AudioFormatEnum groupConfirmFile) {
        groupCallInput.setGroupConfirmFile(groupConfirmFile);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required URL once call connects.
     */
    public GroupCallInputBuilder method(HttpActionEnum method) {
        groupCallInput.setMethod(method);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required URL once call connects.
     */
    public GroupCallInputBuilder statusCallBackUrl(String statusCallBackUrl) {
        groupCallInput.setStatusCallBackUrl(statusCallBackUrl);
        return this;
    }

    /**
     * Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     */
    public GroupCallInputBuilder statusCallBackMethod(HttpActionEnum statusCallBackMethod) {
        groupCallInput.setStatusCallBackMethod(statusCallBackMethod);
        return this;
    }

    /**
     * URL requested if the initial Url parameter fails or encounters an error
     */
    public GroupCallInputBuilder fallBackUrl(String fallBackUrl) {
        groupCallInput.setFallBackUrl(fallBackUrl);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required FallbackUrl once call connects.
     */
    public GroupCallInputBuilder fallBackMethod(HttpActionEnum fallBackMethod) {
        groupCallInput.setFallBackMethod(fallBackMethod);
        return this;
    }

    /**
     * URL that can be requested every 60 seconds during the call to notify of elapsed tim
     */
    public GroupCallInputBuilder heartBeatUrl(String heartBeatUrl) {
        groupCallInput.setHeartBeatUrl(heartBeatUrl);
        return this;
    }

    /**
     * Specifies the HTTP method used to request HeartbeatUrl.
     */
    public GroupCallInputBuilder heartBeatMethod(HttpActionEnum heartBeatMethod) {
        groupCallInput.setHeartBeatMethod(heartBeatMethod);
        return this;
    }

    /**
     * Time (in seconds) Message360 should wait while the call is ringing before canceling the call
     */
    public GroupCallInputBuilder timeout(Integer timeout) {
        groupCallInput.setTimeout(timeout);
        return this;
    }

    /**
     * DTMF Digits to play to the call once it connects. 0-9, #, or *
     */
    public GroupCallInputBuilder playDtmf(String playDtmf) {
        groupCallInput.setPlayDtmf(playDtmf);
        return this;
    }

    /**
     * Specifies if the caller id will be hidden
     */
    public GroupCallInputBuilder hideCallerId(String hideCallerId) {
        groupCallInput.setHideCallerId(hideCallerId);
        return this;
    }

    /**
     * Specifies if the call should be recorded
     */
    public GroupCallInputBuilder record(Boolean record) {
        groupCallInput.setRecord(record);
        return this;
    }

    /**
     * Recording parameters will be sent here upon completion
     */
    public GroupCallInputBuilder recordCallBackUrl(String recordCallBackUrl) {
        groupCallInput.setRecordCallBackUrl(recordCallBackUrl);
        return this;
    }

    /**
     * Method used to request the RecordCallback URL.
     */
    public GroupCallInputBuilder recordCallBackMethod(HttpActionEnum recordCallBackMethod) {
        groupCallInput.setRecordCallBackMethod(recordCallBackMethod);
        return this;
    }

    /**
     * Specifies if the call recording should be transcribed
     */
    public GroupCallInputBuilder transcribe(Boolean transcribe) {
        groupCallInput.setTranscribe(transcribe);
        return this;
    }

    /**
     * Transcription parameters will be sent here upon completion
     */
    public GroupCallInputBuilder transcribeCallBackUrl(String transcribeCallBackUrl) {
        groupCallInput.setTranscribeCallBackUrl(transcribeCallBackUrl);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GroupCallInput build() {
        return groupCallInput;
    }
}