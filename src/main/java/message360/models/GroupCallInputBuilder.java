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

    public GroupCallInputBuilder from(String from) {
        groupCallInput.setFrom(from);
        return this;
    }

    public GroupCallInputBuilder to(String to) {
        groupCallInput.setTo(to);
        return this;
    }

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

    public GroupCallInputBuilder method(HttpActionEnum method) {
        groupCallInput.setMethod(method);
        return this;
    }

    public GroupCallInputBuilder statusCallBackUrl(String statusCallBackUrl) {
        groupCallInput.setStatusCallBackUrl(statusCallBackUrl);
        return this;
    }

    public GroupCallInputBuilder statusCallBackMethod(HttpActionEnum statusCallBackMethod) {
        groupCallInput.setStatusCallBackMethod(statusCallBackMethod);
        return this;
    }

    public GroupCallInputBuilder fallBackUrl(String fallBackUrl) {
        groupCallInput.setFallBackUrl(fallBackUrl);
        return this;
    }

    public GroupCallInputBuilder fallBackMethod(HttpActionEnum fallBackMethod) {
        groupCallInput.setFallBackMethod(fallBackMethod);
        return this;
    }

    public GroupCallInputBuilder heartBeatUrl(String heartBeatUrl) {
        groupCallInput.setHeartBeatUrl(heartBeatUrl);
        return this;
    }

    public GroupCallInputBuilder heartBeatMethod(HttpActionEnum heartBeatMethod) {
        groupCallInput.setHeartBeatMethod(heartBeatMethod);
        return this;
    }

    public GroupCallInputBuilder timeout(Integer timeout) {
        groupCallInput.setTimeout(timeout);
        return this;
    }

    public GroupCallInputBuilder playDtmf(String playDtmf) {
        groupCallInput.setPlayDtmf(playDtmf);
        return this;
    }

    public GroupCallInputBuilder hideCallerId(String hideCallerId) {
        groupCallInput.setHideCallerId(hideCallerId);
        return this;
    }

    public GroupCallInputBuilder record(Boolean record) {
        groupCallInput.setRecord(record);
        return this;
    }

    public GroupCallInputBuilder recordCallBackUrl(String recordCallBackUrl) {
        groupCallInput.setRecordCallBackUrl(recordCallBackUrl);
        return this;
    }

    public GroupCallInputBuilder recordCallBackMethod(HttpActionEnum recordCallBackMethod) {
        groupCallInput.setRecordCallBackMethod(recordCallBackMethod);
        return this;
    }

    public GroupCallInputBuilder transcribe(Boolean transcribe) {
        groupCallInput.setTranscribe(transcribe);
        return this;
    }

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