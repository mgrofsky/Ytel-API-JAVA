/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class VoiceEffectInputBuilder {
    //the instance to build
    private VoiceEffectInput voiceEffectInput;

    /**
     * Default constructor to initialize the instance
     */
    public VoiceEffectInputBuilder() {
        voiceEffectInput = new VoiceEffectInput();
    }

    /**
     * The unique identifier for the in-progress voice call.
     */
    public VoiceEffectInputBuilder callSid(String callSid) {
        voiceEffectInput.setCallSid(callSid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public VoiceEffectInputBuilder responseType(String responseType) {
        voiceEffectInput.setResponseType(responseType);
        return this;
    }

    /**
     * The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream.
     */
    public VoiceEffectInputBuilder audioDirection(AudioDirectionEnum audioDirection) {
        voiceEffectInput.setAudioDirection(audioDirection);
        return this;
    }

    /**
     * value between -14 and 14
     */
    public VoiceEffectInputBuilder pitchSemiTones(Double pitchSemiTones) {
        voiceEffectInput.setPitchSemiTones(pitchSemiTones);
        return this;
    }

    /**
     * value between -1 and 1
     */
    public VoiceEffectInputBuilder pitchOctaves(Double pitchOctaves) {
        voiceEffectInput.setPitchOctaves(pitchOctaves);
        return this;
    }

    /**
     * value greater than 0
     */
    public VoiceEffectInputBuilder pitch(Double pitch) {
        voiceEffectInput.setPitch(pitch);
        return this;
    }

    /**
     * value greater than 0
     */
    public VoiceEffectInputBuilder rate(Double rate) {
        voiceEffectInput.setRate(rate);
        return this;
    }

    /**
     * value greater than 0
     */
    public VoiceEffectInputBuilder tempo(Double tempo) {
        voiceEffectInput.setTempo(tempo);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VoiceEffectInput build() {
        return voiceEffectInput;
    }
}