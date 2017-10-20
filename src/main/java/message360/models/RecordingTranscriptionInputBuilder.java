/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

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
     * Unique Recording sid
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