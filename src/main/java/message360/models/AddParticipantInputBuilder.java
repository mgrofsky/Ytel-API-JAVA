/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class AddParticipantInputBuilder {
    //the instance to build
    private AddParticipantInput addParticipantInput;

    /**
     * Default constructor to initialize the instance
     */
    public AddParticipantInputBuilder() {
        addParticipantInput = new AddParticipantInput();
    }

    /**
     * The unique identifier for a conference object.
     */
    public AddParticipantInputBuilder conferenceSid(String conferenceSid) {
        addParticipantInput.setConferenceSid(conferenceSid);
        return this;
    }

    /**
     * The phone number of the participant to be added.
     */
    public AddParticipantInputBuilder participantNumber(String participantNumber) {
        addParticipantInput.setParticipantNumber(participantNumber);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public AddParticipantInputBuilder responseType(String responseType) {
        addParticipantInput.setResponseType(responseType);
        return this;
    }

    /**
     * Specifies if participant should be muted.
     */
    public AddParticipantInputBuilder muted(Boolean muted) {
        addParticipantInput.setMuted(muted);
        return this;
    }

    /**
     * Specifies if the participant should hear audio in the conference.
     */
    public AddParticipantInputBuilder deaf(Boolean deaf) {
        addParticipantInput.setDeaf(deaf);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AddParticipantInput build() {
        return addParticipantInput;
    }
}