/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class PlayConferenceAudioInputBuilder {
    //the instance to build
    private PlayConferenceAudioInput playConferenceAudioInput;

    /**
     * Default constructor to initialize the instance
     */
    public PlayConferenceAudioInputBuilder() {
        playConferenceAudioInput = new PlayConferenceAudioInput();
    }

    /**
     * The unique identifier for a conference object.
     */
    public PlayConferenceAudioInputBuilder conferenceSid(String conferenceSid) {
        playConferenceAudioInput.setConferenceSid(conferenceSid);
        return this;
    }

    /**
     * The unique identifier for a participant object.
     */
    public PlayConferenceAudioInputBuilder participantSid(String participantSid) {
        playConferenceAudioInput.setParticipantSid(participantSid);
        return this;
    }

    /**
     * The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon.
     */
    public PlayConferenceAudioInputBuilder audioUrl(AudioFormatEnum audioUrl) {
        playConferenceAudioInput.setAudioUrl(audioUrl);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public PlayConferenceAudioInputBuilder responseType(String responseType) {
        playConferenceAudioInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PlayConferenceAudioInput build() {
        return playConferenceAudioInput;
    }
}