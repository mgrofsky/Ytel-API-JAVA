/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

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
    public ViewConferenceInputBuilder conferencesid(String conferencesid) {
        viewConferenceInput.setConferencesid(conferencesid);
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