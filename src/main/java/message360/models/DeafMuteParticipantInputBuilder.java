/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class DeafMuteParticipantInputBuilder {
    //the instance to build
    private DeafMuteParticipantInput deafMuteParticipantInput;

    /**
     * Default constructor to initialize the instance
     */
    public DeafMuteParticipantInputBuilder() {
        deafMuteParticipantInput = new DeafMuteParticipantInput();
    }

    public DeafMuteParticipantInputBuilder conferenceSid(String conferenceSid) {
        deafMuteParticipantInput.setConferenceSid(conferenceSid);
        return this;
    }

    public DeafMuteParticipantInputBuilder participantSid(String participantSid) {
        deafMuteParticipantInput.setParticipantSid(participantSid);
        return this;
    }

    /**
     * Response Type either json or xml
     */
    public DeafMuteParticipantInputBuilder responseType(String responseType) {
        deafMuteParticipantInput.setResponseType(responseType);
        return this;
    }

    public DeafMuteParticipantInputBuilder muted(Boolean muted) {
        deafMuteParticipantInput.setMuted(muted);
        return this;
    }

    public DeafMuteParticipantInputBuilder deaf(Boolean deaf) {
        deafMuteParticipantInput.setDeaf(deaf);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DeafMuteParticipantInput build() {
        return deafMuteParticipantInput;
    }
}