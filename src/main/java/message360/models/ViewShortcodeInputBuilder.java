/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ViewShortcodeInputBuilder {
    //the instance to build
    private ViewShortcodeInput viewShortcodeInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewShortcodeInputBuilder() {
        viewShortcodeInput = new ViewShortcodeInput();
    }

    /**
     * The unique identifier for the sms resource
     */
    public ViewShortcodeInputBuilder messageSid(String messageSid) {
        viewShortcodeInput.setMessageSid(messageSid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public ViewShortcodeInputBuilder responseType(String responseType) {
        viewShortcodeInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewShortcodeInput build() {
        return viewShortcodeInput;
    }
}