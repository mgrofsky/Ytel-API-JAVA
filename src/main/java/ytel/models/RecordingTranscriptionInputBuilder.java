/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class RecordingTranscriptionInputBuilder {
    //the instance to build
    private RecordingTranscriptionInput recordingTranscriptionInput;

    /**
     * Default constructor to initialize the instance
     */
    public RecordingTranscriptionInputBuilder() {
        recordingTranscriptionInput = new RecordingTranscriptionInput();
    }

    /**
     * The unique identifier for a recording object.
     */
    public RecordingTranscriptionInputBuilder recordingSid(String recordingSid) {
        recordingTranscriptionInput.setRecordingSid(recordingSid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public RecordingTranscriptionInputBuilder responseType(String responseType) {
        recordingTranscriptionInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RecordingTranscriptionInput build() {
        return recordingTranscriptionInput;
    }
}