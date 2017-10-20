/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class HangupParticipantInputBuilder {
    //the instance to build
    private HangupParticipantInput hangupParticipantInput;

    /**
     * Default constructor to initialize the instance
     */
    public HangupParticipantInputBuilder() {
        hangupParticipantInput = new HangupParticipantInput();
    }

    /**
     * The unique identifier for a conference object.
     */
    public HangupParticipantInputBuilder conferenceSid(String conferenceSid) {
        hangupParticipantInput.setConferenceSid(conferenceSid);
        return this;
    }

    /**
     * The unique identifier for a participant object.
     */
    public HangupParticipantInputBuilder participantSid(String participantSid) {
        hangupParticipantInput.setParticipantSid(participantSid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public HangupParticipantInputBuilder responseType(String responseType) {
        hangupParticipantInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public HangupParticipantInput build() {
        return hangupParticipantInput;
    }
}