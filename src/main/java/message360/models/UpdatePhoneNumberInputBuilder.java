/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/01/2016
 */
package message360.models;

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

    public UpdatePhoneNumberInputBuilder phoneNumber(String phoneNumber) {
        updatePhoneNumberInput.setPhoneNumber(phoneNumber);
        return this;
    }

    public UpdatePhoneNumberInputBuilder friendlyName(String friendlyName) {
        updatePhoneNumberInput.setFriendlyName(friendlyName);
        return this;
    }

    /**
     * URL requested once the call connects
     */
    public UpdatePhoneNumberInputBuilder voiceUrl(String voiceUrl) {
        updatePhoneNumberInput.setVoiceUrl(voiceUrl);
        return this;
    }

    public UpdatePhoneNumberInputBuilder voiceMethod(HttpAction voiceMethod) {
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

    public UpdatePhoneNumberInputBuilder voiceFallbackMethod(HttpAction voiceFallbackMethod) {
        updatePhoneNumberInput.setVoiceFallbackMethod(voiceFallbackMethod);
        return this;
    }

    public UpdatePhoneNumberInputBuilder hangupCallback(String hangupCallback) {
        updatePhoneNumberInput.setHangupCallback(hangupCallback);
        return this;
    }

    public UpdatePhoneNumberInputBuilder hangupCallbackMethod(HttpAction hangupCallbackMethod) {
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
    public UpdatePhoneNumberInputBuilder heartbeatMethod(HttpAction heartbeatMethod) {
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

    public UpdatePhoneNumberInputBuilder smsMethod(HttpAction smsMethod) {
        updatePhoneNumberInput.setSmsMethod(smsMethod);
        return this;
    }

    /**
     * URL requested once the call connects
     */
    public UpdatePhoneNumberInputBuilder smsFallbackUrl(String smsFallbackUrl) {
        updatePhoneNumberInput.setSmsFallbackUrl(smsFallbackUrl);
        return this;
    }

    /**
     * URL requested if the sms URL is not available
     */
    public UpdatePhoneNumberInputBuilder smsFallbackMethod(HttpAction smsFallbackMethod) {
        updatePhoneNumberInput.setSmsFallbackMethod(smsFallbackMethod);
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
     * Build the instance with the given values
     */
    public UpdatePhoneNumberInput build() {
        return updatePhoneNumberInput;
    }
}