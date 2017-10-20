/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ViewTranscriptionInputBuilder {
    //the instance to build
    private ViewTranscriptionInput viewTranscriptionInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewTranscriptionInputBuilder() {
        viewTranscriptionInput = new ViewTranscriptionInput();
    }

    /**
     * Unique Transcription ID
     */
    public ViewTranscriptionInputBuilder transcriptionSid(String transcriptionSid) {
        viewTranscriptionInput.setTranscriptionSid(transcriptionSid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public ViewTranscriptionInputBuilder responseType(String responseType) {
        viewTranscriptionInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewTranscriptionInput build() {
        return viewTranscriptionInput;
    }
}