/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class AudioURLTranscriptionInputBuilder {
    //the instance to build
    private AudioURLTranscriptionInput audioURLTranscriptionInput;

    /**
     * Default constructor to initialize the instance
     */
    public AudioURLTranscriptionInputBuilder() {
        audioURLTranscriptionInput = new AudioURLTranscriptionInput();
    }

    /**
     * URL pointing to the location of the audio file that is to be transcribed.
     */
    public AudioURLTranscriptionInputBuilder audiourl(String audiourl) {
        audioURLTranscriptionInput.setAudiourl(audiourl);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public AudioURLTranscriptionInputBuilder responseType(String responseType) {
        audioURLTranscriptionInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AudioURLTranscriptionInput build() {
        return audioURLTranscriptionInput;
    }
}