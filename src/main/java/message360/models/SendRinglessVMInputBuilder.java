/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class SendRinglessVMInputBuilder {
    //the instance to build
    private SendRinglessVMInput sendRinglessVMInput;

    /**
     * Default constructor to initialize the instance
     */
    public SendRinglessVMInputBuilder() {
        sendRinglessVMInput = new SendRinglessVMInput();
    }

    /**
     * This number to display on Caller ID as calling
     */
    public SendRinglessVMInputBuilder from(String from) {
        sendRinglessVMInput.setFrom(from);
        return this;
    }

    /**
     * Alternate caller ID required for RVM
     */
    public SendRinglessVMInputBuilder rVMCallerId(String rVMCallerId) {
        sendRinglessVMInput.setRVMCallerId(rVMCallerId);
        return this;
    }

    /**
     * To number
     */
    public SendRinglessVMInputBuilder to(String to) {
        sendRinglessVMInput.setTo(to);
        return this;
    }

    /**
     * URL to an audio file
     */
    public SendRinglessVMInputBuilder voiceMailURL(String voiceMailURL) {
        sendRinglessVMInput.setVoiceMailURL(voiceMailURL);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public SendRinglessVMInputBuilder responseType(String responseType) {
        sendRinglessVMInput.setResponseType(responseType);
        return this;
    }

    /**
     * Not currently used in this version
     */
    public SendRinglessVMInputBuilder method(String method) {
        sendRinglessVMInput.setMethod(method);
        return this;
    }

    /**
     * URL to post the status of the Ringless request
     */
    public SendRinglessVMInputBuilder statusCallBackUrl(String statusCallBackUrl) {
        sendRinglessVMInput.setStatusCallBackUrl(statusCallBackUrl);
        return this;
    }

    /**
     * POST or GET
     */
    public SendRinglessVMInputBuilder statsCallBackMethod(String statsCallBackMethod) {
        sendRinglessVMInput.setStatsCallBackMethod(statsCallBackMethod);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SendRinglessVMInput build() {
        return sendRinglessVMInput;
    }
}