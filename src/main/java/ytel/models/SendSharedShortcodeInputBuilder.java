/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class SendSharedShortcodeInputBuilder {
    //the instance to build
    private SendSharedShortcodeInput sendSharedShortcodeInput;

    /**
     * Default constructor to initialize the instance
     */
    public SendSharedShortcodeInputBuilder() {
        sendSharedShortcodeInput = new SendSharedShortcodeInput();
    }

    /**
     * The Short Code number that is the sender of this message
     */
    public SendSharedShortcodeInputBuilder shortcode(String shortcode) {
        sendSharedShortcodeInput.setShortcode(shortcode);
        return this;
    }

    /**
     * A valid 10-digit number that should receive the message
     */
    public SendSharedShortcodeInputBuilder to(String to) {
        sendSharedShortcodeInput.setTo(to);
        return this;
    }

    /**
     * The unique identifier for the template used for the message
     */
    public SendSharedShortcodeInputBuilder templateid(UUID templateid) {
        sendSharedShortcodeInput.setTemplateid(templateid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public SendSharedShortcodeInputBuilder responseType(String responseType) {
        sendSharedShortcodeInput.setResponseType(responseType);
        return this;
    }

    /**
     * format of your data, example: {companyname}:test,{otpcode}:1234
     */
    public SendSharedShortcodeInputBuilder data(String data) {
        sendSharedShortcodeInput.setData(data);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required URL once the Short Code message is sent.
     */
    public SendSharedShortcodeInputBuilder method(HttpActionEnum method) {
        sendSharedShortcodeInput.setMethod(method);
        return this;
    }

    /**
     * URL that can be requested to receive notification when Short Code message was sent.
     */
    public SendSharedShortcodeInputBuilder messageStatusCallback(String messageStatusCallback) {
        sendSharedShortcodeInput.setMessageStatusCallback(messageStatusCallback);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SendSharedShortcodeInput build() {
        return sendSharedShortcodeInput;
    }
}