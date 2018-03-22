/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

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
     * The unique identifier for the voice call.
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