/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ViewConferenceInputBuilder {
    //the instance to build
    private ViewConferenceInput viewConferenceInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewConferenceInputBuilder() {
        viewConferenceInput = new ViewConferenceInput();
    }

    /**
     * The unique identifier of each conference resource
     */
    public ViewConferenceInputBuilder conferenceSid(String conferenceSid) {
        viewConferenceInput.setConferenceSid(conferenceSid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public ViewConferenceInputBuilder responseType(String responseType) {
        viewConferenceInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewConferenceInput build() {
        return viewConferenceInput;
    }
}