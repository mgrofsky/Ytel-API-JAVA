/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class SendSMSInputBuilder {
    //the instance to build
    private SendSMSInput sendSMSInput;

    /**
     * Default constructor to initialize the instance
     */
    public SendSMSInputBuilder() {
        sendSMSInput = new SendSMSInput();
    }

    /**
     * The 10-digit SMS-enabled message360 number (E.164 format) in which the message is sent.
     */
    public SendSMSInputBuilder from(String from) {
        sendSMSInput.setFrom(from);
        return this;
    }

    /**
     * The 10-digit phone number (E.164 format) that will receive the message.
     */
    public SendSMSInputBuilder to(String to) {
        sendSMSInput.setTo(to);
        return this;
    }

    /**
     * The body message that is to be sent in the text.
     */
    public SendSMSInputBuilder body(String body) {
        sendSMSInput.setBody(body);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public SendSMSInputBuilder responseType(String responseType) {
        sendSMSInput.setResponseType(responseType);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required URL once SMS sent.
     */
    public SendSMSInputBuilder method(HttpActionEnum method) {
        sendSMSInput.setMethod(method);
        return this;
    }

    /**
     * URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.
     */
    public SendSMSInputBuilder messageStatusCallback(String messageStatusCallback) {
        sendSMSInput.setMessageStatusCallback(messageStatusCallback);
        return this;
    }

    /**
     * Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message.
     */
    public SendSMSInputBuilder smartsms(Boolean smartsms) {
        sendSMSInput.setSmartsms(smartsms);
        return this;
    }

    /**
     * Delivery reports are a method to tell your system if the message has arrived on the destination phone.
     */
    public SendSMSInputBuilder deliveryStatus(Boolean deliveryStatus) {
        sendSMSInput.setDeliveryStatus(deliveryStatus);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SendSMSInput build() {
        return sendSMSInput;
    }
}