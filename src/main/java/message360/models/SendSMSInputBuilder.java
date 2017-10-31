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
     * SMS enabled Message360 number to send this message from
     */
    public SendSMSInputBuilder from(String from) {
        sendSMSInput.setFrom(from);
        return this;
    }

    /**
     * Number to send the SMS to
     */
    public SendSMSInputBuilder to(String to) {
        sendSMSInput.setTo(to);
        return this;
    }

    /**
     * Text Message To Send
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
    public SendSMSInputBuilder messagestatuscallback(String messagestatuscallback) {
        sendSMSInput.setMessagestatuscallback(messagestatuscallback);
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
     * Build the instance with the given values
     */
    public SendSMSInput build() {
        return sendSMSInput;
    }
}