/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ViewNumberDetailsInputBuilder {
    //the instance to build
    private ViewNumberDetailsInput viewNumberDetailsInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewNumberDetailsInputBuilder() {
        viewNumberDetailsInput = new ViewNumberDetailsInput();
    }

    /**
     * A valid message360 10-digit phone number (E.164 format).
     */
    public ViewNumberDetailsInputBuilder phoneNumber(String phoneNumber) {
        viewNumberDetailsInput.setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public ViewNumberDetailsInputBuilder responseType(String responseType) {
        viewNumberDetailsInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewNumberDetailsInput build() {
        return viewNumberDetailsInput;
    }
}