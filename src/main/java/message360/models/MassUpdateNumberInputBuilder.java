/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class MassUpdateNumberInputBuilder {
    //the instance to build
    private MassUpdateNumberInput massUpdateNumberInput;

    /**
     * Default constructor to initialize the instance
     */
    public MassUpdateNumberInputBuilder() {
        massUpdateNumberInput = new MassUpdateNumberInput();
    }

    /**
     * A valid comma(,) separated message360 numbers. (E.164 format).
     */
    public MassUpdateNumberInputBuilder phoneNumber(String phoneNumber) {
        massUpdateNumberInput.setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * The URL returning InboundXML incoming calls should execute when connected.
     */
    public MassUpdateNumberInputBuilder voiceUrl(String voiceUrl) {
        massUpdateNumberInput.setVoiceUrl(voiceUrl);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public MassUpdateNumberInputBuilder responseType(String responseType) {
        massUpdateNumberInput.setResponseType(responseType);
        return this;
    }

    /**
     * A human-readable value for labeling the number.
     */
    public MassUpdateNumberInputBuilder friendlyName(String friendlyName) {
        massUpdateNumberInput.setFriendlyName(friendlyName);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the VoiceUrl once incoming call connects.
     */
    public MassUpdateNumberInputBuilder voiceMethod(HttpActionEnum voiceMethod) {
        massUpdateNumberInput.setVoiceMethod(voiceMethod);
        return this;
    }

    /**
     * URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url
     */
    public MassUpdateNumberInputBuilder voiceFallbackUrl(String voiceFallbackUrl) {
        massUpdateNumberInput.setVoiceFallbackUrl(voiceFallbackUrl);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects.
     */
    public MassUpdateNumberInputBuilder voiceFallbackMethod(HttpActionEnum voiceFallbackMethod) {
        massUpdateNumberInput.setVoiceFallbackMethod(voiceFallbackMethod);
        return this;
    }

    /**
     * URL that can be requested to receive notification when and how incoming call has ended.
     */
    public MassUpdateNumberInputBuilder hangupCallback(String hangupCallback) {
        massUpdateNumberInput.setHangupCallback(hangupCallback);
        return this;
    }

    /**
     * The HTTP method message360 will use when requesting the HangupCallback URL.
     */
    public MassUpdateNumberInputBuilder hangupCallbackMethod(HttpActionEnum hangupCallbackMethod) {
        massUpdateNumberInput.setHangupCallbackMethod(hangupCallbackMethod);
        return this;
    }

    /**
     * URL that can be used to monitor the phone number.
     */
    public MassUpdateNumberInputBuilder heartbeatUrl(String heartbeatUrl) {
        massUpdateNumberInput.setHeartbeatUrl(heartbeatUrl);
        return this;
    }

    /**
     * The HTTP method message360 will use when requesting the HeartbeatUrl.
     */
    public MassUpdateNumberInputBuilder heartbeatMethod(HttpActionEnum heartbeatMethod) {
        massUpdateNumberInput.setHeartbeatMethod(heartbeatMethod);
        return this;
    }

    /**
     * URL requested when an SMS is received.
     */
    public MassUpdateNumberInputBuilder smsUrl(String smsUrl) {
        massUpdateNumberInput.setSmsUrl(smsUrl);
        return this;
    }

    /**
     * The HTTP method message360 will use when requesting the SmsUrl.
     */
    public MassUpdateNumberInputBuilder smsMethod(HttpActionEnum smsMethod) {
        massUpdateNumberInput.setSmsMethod(smsMethod);
        return this;
    }

    /**
     * URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
     */
    public MassUpdateNumberInputBuilder smsFallbackUrl(String smsFallbackUrl) {
        massUpdateNumberInput.setSmsFallbackUrl(smsFallbackUrl);
        return this;
    }

    /**
     * The HTTP method message360 will use when URL requested if the SmsUrl is not available.
     */
    public MassUpdateNumberInputBuilder smsFallbackMethod(HttpActionEnum smsFallbackMethod) {
        massUpdateNumberInput.setSmsFallbackMethod(smsFallbackMethod);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MassUpdateNumberInput build() {
        return massUpdateNumberInput;
    }
}