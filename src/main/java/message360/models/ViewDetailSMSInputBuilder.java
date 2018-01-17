/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ViewDetailSMSInputBuilder {
    //the instance to build
    private ViewDetailSMSInput viewDetailSMSInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewDetailSMSInputBuilder() {
        viewDetailSMSInput = new ViewDetailSMSInput();
    }

    /**
     * The unique identifier for a sms message.
     */
    public ViewDetailSMSInputBuilder messageSid(String messageSid) {
        viewDetailSMSInput.setMessageSid(messageSid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public ViewDetailSMSInputBuilder responseType(String responseType) {
        viewDetailSMSInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewDetailSMSInput build() {
        return viewDetailSMSInput;
    }
}