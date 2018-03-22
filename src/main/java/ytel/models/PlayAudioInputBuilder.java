/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class PlayAudioInputBuilder {
    //the instance to build
    private PlayAudioInput playAudioInput;

    /**
     * Default constructor to initialize the instance
     */
    public PlayAudioInputBuilder() {
        playAudioInput = new PlayAudioInput();
    }

    /**
     * The unique identifier of each call resource
     */
    public PlayAudioInputBuilder callSid(String callSid) {
        playAudioInput.setCallSid(callSid);
        return this;
    }

    /**
     * URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav
     */
    public PlayAudioInputBuilder audioUrl(String audioUrl) {
        playAudioInput.setAudioUrl(audioUrl);
        return this;
    }

    /**
     * Valid alphanumeric string that should be played to the In-progress call.
     */
    public PlayAudioInputBuilder sayText(String sayText) {
        playAudioInput.setSayText(sayText);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public PlayAudioInputBuilder responseType(String responseType) {
        playAudioInput.setResponseType(responseType);
        return this;
    }

    /**
     * Time limit in seconds for audio play back
     */
    public PlayAudioInputBuilder length(Integer length) {
        playAudioInput.setLength(length);
        return this;
    }

    /**
     * The leg of the call audio will be played to
     */
    public PlayAudioInputBuilder direction(DirectionEnum direction) {
        playAudioInput.setDirection(direction);
        return this;
    }

    /**
     * If false, all other audio will be muted
     */
    public PlayAudioInputBuilder mix(Boolean mix) {
        playAudioInput.setMix(mix);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PlayAudioInput build() {
        return playAudioInput;
    }
}