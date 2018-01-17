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
     * A valid message360 Voice enabled number (E.164 format) that will be initiating the phone call.
     */
    public SendRinglessVMInputBuilder from(String from) {
        sendRinglessVMInput.setFrom(from);
        return this;
    }

    /**
     * A required secondary Caller ID for RVM to work.
     */
    public SendRinglessVMInputBuilder rVMCallerId(String rVMCallerId) {
        sendRinglessVMInput.setRVMCallerId(rVMCallerId);
        return this;
    }

    /**
     * A valid number (E.164 format) that will receive the phone call.
     */
    public SendRinglessVMInputBuilder to(String to) {
        sendRinglessVMInput.setTo(to);
        return this;
    }

    /**
     * The URL requested once the RVM connects. A set of default parameters will be sent here.
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
     * Specifies the HTTP method used to request the required URL once call connects.
     */
    public SendRinglessVMInputBuilder method(HttpActionEnum method) {
        sendRinglessVMInput.setMethod(method);
        return this;
    }

    /**
     * URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
     */
    public SendRinglessVMInputBuilder statusCallBackUrl(String statusCallBackUrl) {
        sendRinglessVMInput.setStatusCallBackUrl(statusCallBackUrl);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
     */
    public SendRinglessVMInputBuilder statsCallBackMethod(HttpActionEnum statsCallBackMethod) {
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