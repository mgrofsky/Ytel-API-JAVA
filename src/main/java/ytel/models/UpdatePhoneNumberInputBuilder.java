/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class UpdatePhoneNumberInputBuilder {
    //the instance to build
    private UpdatePhoneNumberInput updatePhoneNumberInput;

    /**
     * Default constructor to initialize the instance
     */
    public UpdatePhoneNumberInputBuilder() {
        updatePhoneNumberInput = new UpdatePhoneNumberInput();
    }

    /**
     * A valid Ytel number (E.164 format).
     */
    public UpdatePhoneNumberInputBuilder phoneNumber(String phoneNumber) {
        updatePhoneNumberInput.setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * URL requested once the call connects
     */
    public UpdatePhoneNumberInputBuilder voiceUrl(String voiceUrl) {
        updatePhoneNumberInput.setVoiceUrl(voiceUrl);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public UpdatePhoneNumberInputBuilder responseType(String responseType) {
        updatePhoneNumberInput.setResponseType(responseType);
        return this;
    }

    /**
     * Phone number friendly name description
     */
    public UpdatePhoneNumberInputBuilder friendlyName(String friendlyName) {
        updatePhoneNumberInput.setFriendlyName(friendlyName);
        return this;
    }

    /**
     * Post or Get
     */
    public UpdatePhoneNumberInputBuilder voiceMethod(HttpActionEnum voiceMethod) {
        updatePhoneNumberInput.setVoiceMethod(voiceMethod);
        return this;
    }

    /**
     * URL requested if the voice URL is not available
     */
    public UpdatePhoneNumberInputBuilder voiceFallbackUrl(String voiceFallbackUrl) {
        updatePhoneNumberInput.setVoiceFallbackUrl(voiceFallbackUrl);
        return this;
    }

    /**
     * Post or Get
     */
    public UpdatePhoneNumberInputBuilder voiceFallbackMethod(HttpActionEnum voiceFallbackMethod) {
        updatePhoneNumberInput.setVoiceFallbackMethod(voiceFallbackMethod);
        return this;
    }

    /**
     * callback url after a hangup occurs
     */
    public UpdatePhoneNumberInputBuilder hangupCallback(String hangupCallback) {
        updatePhoneNumberInput.setHangupCallback(hangupCallback);
        return this;
    }

    /**
     * Post or Get
     */
    public UpdatePhoneNumberInputBuilder hangupCallbackMethod(HttpActionEnum hangupCallbackMethod) {
        updatePhoneNumberInput.setHangupCallbackMethod(hangupCallbackMethod);
        return this;
    }

    /**
     * URL requested once the call connects
     */
    public UpdatePhoneNumberInputBuilder heartbeatUrl(String heartbeatUrl) {
        updatePhoneNumberInput.setHeartbeatUrl(heartbeatUrl);
        return this;
    }

    /**
     * URL that can be requested every 60 seconds during the call to notify of elapsed time
     */
    public UpdatePhoneNumberInputBuilder heartbeatMethod(HttpActionEnum heartbeatMethod) {
        updatePhoneNumberInput.setHeartbeatMethod(heartbeatMethod);
        return this;
    }

    /**
     * URL requested when an SMS is received
     */
    public UpdatePhoneNumberInputBuilder smsUrl(String smsUrl) {
        updatePhoneNumberInput.setSmsUrl(smsUrl);
        return this;
    }

    /**
     * Post or Get
     */
    public UpdatePhoneNumberInputBuilder smsMethod(HttpActionEnum smsMethod) {
        updatePhoneNumberInput.setSmsMethod(smsMethod);
        return this;
    }

    /**
     * URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
     */
    public UpdatePhoneNumberInputBuilder smsFallbackUrl(String smsFallbackUrl) {
        updatePhoneNumberInput.setSmsFallbackUrl(smsFallbackUrl);
        return this;
    }

    /**
     * The HTTP method Ytel will use when URL requested if the SmsUrl is not available.
     */
    public UpdatePhoneNumberInputBuilder smsFallbackMethod(HttpActionEnum smsFallbackMethod) {
        updatePhoneNumberInput.setSmsFallbackMethod(smsFallbackMethod);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdatePhoneNumberInput build() {
        return updatePhoneNumberInput;
    }
}