/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class InterruptedCallInputBuilder {
    //the instance to build
    private InterruptedCallInput interruptedCallInput;

    /**
     * Default constructor to initialize the instance
     */
    public InterruptedCallInputBuilder() {
        interruptedCallInput = new InterruptedCallInput();
    }

    /**
     * The unique identifier for voice call that is in progress.
     */
    public InterruptedCallInputBuilder callSid(String callSid) {
        interruptedCallInput.setCallSid(callSid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public InterruptedCallInputBuilder responseType(String responseType) {
        interruptedCallInput.setResponseType(responseType);
        return this;
    }

    /**
     * URL the in-progress call will be redirected to
     */
    public InterruptedCallInputBuilder url(String url) {
        interruptedCallInput.setUrl(url);
        return this;
    }

    /**
     * The method used to request the above Url parameter
     */
    public InterruptedCallInputBuilder method(HttpActionEnum method) {
        interruptedCallInput.setMethod(method);
        return this;
    }

    /**
     * Status to set the in-progress call to
     */
    public InterruptedCallInputBuilder status(InterruptedCallStatusEnum status) {
        interruptedCallInput.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public InterruptedCallInput build() {
        return interruptedCallInput;
    }
}