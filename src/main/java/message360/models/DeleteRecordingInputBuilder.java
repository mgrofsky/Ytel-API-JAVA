/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class DeleteRecordingInputBuilder {
    //the instance to build
    private DeleteRecordingInput deleteRecordingInput;

    /**
     * Default constructor to initialize the instance
     */
    public DeleteRecordingInputBuilder() {
        deleteRecordingInput = new DeleteRecordingInput();
    }

    /**
     * The unique identifier for a recording.
     */
    public DeleteRecordingInputBuilder recordingsid(String recordingsid) {
        deleteRecordingInput.setRecordingsid(recordingsid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public DeleteRecordingInputBuilder responseType(String responseType) {
        deleteRecordingInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DeleteRecordingInput build() {
        return deleteRecordingInput;
    }
}