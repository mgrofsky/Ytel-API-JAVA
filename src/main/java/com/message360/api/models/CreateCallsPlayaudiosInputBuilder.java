/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.message360.api.models;

import java.util.*;

public class CreateCallsPlayaudiosInputBuilder {
    //the instance to build
    private CreateCallsPlayaudiosInput createCallsPlayaudiosInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCallsPlayaudiosInputBuilder() {
        createCallsPlayaudiosInput = new CreateCallsPlayaudiosInput();
    }

    /**
     * The unique identifier of each call resource
     */
    public CreateCallsPlayaudiosInputBuilder callSid(String callSid) {
        createCallsPlayaudiosInput.setCallSid(callSid);
        return this;
    }

    /**
     * URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav
     */
    public CreateCallsPlayaudiosInputBuilder audioUrl(String audioUrl) {
        createCallsPlayaudiosInput.setAudioUrl(audioUrl);
        return this;
    }

    /**
     * Valid alphanumeric string that should be played to the In-progress call.
     */
    public CreateCallsPlayaudiosInputBuilder sayText(String sayText) {
        createCallsPlayaudiosInput.setSayText(sayText);
        return this;
    }

    /**
     * Time limit in seconds for audio play back
     */
    public CreateCallsPlayaudiosInputBuilder length(Integer length) {
        createCallsPlayaudiosInput.setLength(length);
        return this;
    }

    /**
     * The leg of the call audio will be played to
     */
    public CreateCallsPlayaudiosInputBuilder direction(DirectionEnum direction) {
        createCallsPlayaudiosInput.setDirection(direction);
        return this;
    }

    /**
     * If false, all other audio will be muted
     */
    public CreateCallsPlayaudiosInputBuilder mix(Boolean mix) {
        createCallsPlayaudiosInput.setMix(mix);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCallsPlayaudiosInput build() {
        return createCallsPlayaudiosInput;
    }
}