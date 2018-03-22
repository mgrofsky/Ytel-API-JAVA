/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class SendDedicatedShortcodeInputBuilder {
    //the instance to build
    private SendDedicatedShortcodeInput sendDedicatedShortcodeInput;

    /**
     * Default constructor to initialize the instance
     */
    public SendDedicatedShortcodeInputBuilder() {
        sendDedicatedShortcodeInput = new SendDedicatedShortcodeInput();
    }

    /**
     * Your dedicated shortcode
     */
    public SendDedicatedShortcodeInputBuilder shortcode(int shortcode) {
        sendDedicatedShortcodeInput.setShortcode(shortcode);
        return this;
    }

    /**
     * The number to send your SMS to
     */
    public SendDedicatedShortcodeInputBuilder to(double to) {
        sendDedicatedShortcodeInput.setTo(to);
        return this;
    }

    /**
     * The body of your message
     */
    public SendDedicatedShortcodeInputBuilder body(String body) {
        sendDedicatedShortcodeInput.setBody(body);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public SendDedicatedShortcodeInputBuilder responseType(String responseType) {
        sendDedicatedShortcodeInput.setResponseType(responseType);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST
     */
    public SendDedicatedShortcodeInputBuilder method(HttpActionEnum method) {
        sendDedicatedShortcodeInput.setMethod(method);
        return this;
    }

    /**
     * URL that can be requested to receive notification when Short Code message was sent.
     */
    public SendDedicatedShortcodeInputBuilder messagestatuscallback(String messagestatuscallback) {
        sendDedicatedShortcodeInput.setMessagestatuscallback(messagestatuscallback);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SendDedicatedShortcodeInput build() {
        return sendDedicatedShortcodeInput;
    }
}