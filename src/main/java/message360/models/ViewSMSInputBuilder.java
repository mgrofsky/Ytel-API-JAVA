/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

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
     * Message sid
     */
    public ViewSMSInputBuilder messagesid(String messagesid) {
        viewSMSInput.setMessagesid(messagesid);
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