/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ViewCallInputBuilder {
    //the instance to build
    private ViewCallInput viewCallInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewCallInputBuilder() {
        viewCallInput = new ViewCallInput();
    }

    /**
     * Call Sid id for particular Call
     */
    public ViewCallInputBuilder callsid(String callsid) {
        viewCallInput.setCallsid(callsid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public ViewCallInputBuilder responseType(String responseType) {
        viewCallInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewCallInput build() {
        return viewCallInput;
    }
}