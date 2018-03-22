/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ViewParticipantInputBuilder {
    //the instance to build
    private ViewParticipantInput viewParticipantInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewParticipantInputBuilder() {
        viewParticipantInput = new ViewParticipantInput();
    }

    /**
     * The unique identifier for a conference object.
     */
    public ViewParticipantInputBuilder conferenceSid(String conferenceSid) {
        viewParticipantInput.setConferenceSid(conferenceSid);
        return this;
    }

    /**
     * The unique identifier for a participant object.
     */
    public ViewParticipantInputBuilder participantSid(String participantSid) {
        viewParticipantInput.setParticipantSid(participantSid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public ViewParticipantInputBuilder responseType(String responseType) {
        viewParticipantInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewParticipantInput build() {
        return viewParticipantInput;
    }
}