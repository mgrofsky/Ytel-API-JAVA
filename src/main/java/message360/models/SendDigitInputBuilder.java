/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class SendDigitInputBuilder {
    //the instance to build
    private SendDigitInput sendDigitInput;

    /**
     * Default constructor to initialize the instance
     */
    public SendDigitInputBuilder() {
        sendDigitInput = new SendDigitInput();
    }

    /**
     * The unique identifier of each call resource
     */
    public SendDigitInputBuilder callSid(String callSid) {
        sendDigitInput.setCallSid(callSid);
        return this;
    }

    /**
     * DTMF digits to play to the call. 0-9, #, *, W, or w
     */
    public SendDigitInputBuilder playDtmf(String playDtmf) {
        sendDigitInput.setPlayDtmf(playDtmf);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public SendDigitInputBuilder responseType(String responseType) {
        sendDigitInput.setResponseType(responseType);
        return this;
    }

    /**
     * The leg of the call DTMF digits should be sent to
     */
    public SendDigitInputBuilder playDtmfDirection(DirectionEnum playDtmfDirection) {
        sendDigitInput.setPlayDtmfDirection(playDtmfDirection);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SendDigitInput build() {
        return sendDigitInput;
    }
}