/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

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
     * unique conference sid
     */
    public ViewParticipantInputBuilder conferenceSid(String conferenceSid) {
        viewParticipantInput.setConferenceSid(conferenceSid);
        return this;
    }

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