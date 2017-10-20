/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

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
     * Callback status method, POST or GET
     */
    public SendDedicatedShortcodeInputBuilder method(String method) {
        sendDedicatedShortcodeInput.setMethod(method);
        return this;
    }

    /**
     * Callback url for SMS status
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