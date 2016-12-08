/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/08/2016
 */
package message360.models;

import java.util.*;

public class CreateAudioURLTranscriptionInputBuilder {
    //the instance to build
    private CreateAudioURLTranscriptionInput createAudioURLTranscriptionInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateAudioURLTranscriptionInputBuilder() {
        createAudioURLTranscriptionInput = new CreateAudioURLTranscriptionInput();
    }

    /**
     * Audio url
     */
    public CreateAudioURLTranscriptionInputBuilder audioUrl(String audioUrl) {
        createAudioURLTranscriptionInput.setAudioUrl(audioUrl);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateAudioURLTranscriptionInputBuilder responseType(String responseType) {
        createAudioURLTranscriptionInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateAudioURLTranscriptionInput build() {
        return createAudioURLTranscriptionInput;
    }
}