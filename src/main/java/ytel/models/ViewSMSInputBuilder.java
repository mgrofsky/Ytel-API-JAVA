/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ViewSMSInputBuilder {
    //the instance to build
    private ViewSMSInput viewSMSInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewSMSInputBuilder() {
        viewSMSInput = new ViewSMSInput();
    }

    /**
     * The unique identifier for a sms message.
     */
    public ViewSMSInputBuilder messageSid(String messageSid) {
        viewSMSInput.setMessageSid(messageSid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public ViewSMSInputBuilder responseType(String responseType) {
        viewSMSInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewSMSInput build() {
        return viewSMSInput;
    }
}