/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ViewRecordingInputBuilder {
    //the instance to build
    private ViewRecordingInput viewRecordingInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewRecordingInputBuilder() {
        viewRecordingInput = new ViewRecordingInput();
    }

    /**
     * The unique identifier for the recording.
     */
    public ViewRecordingInputBuilder recordingsid(String recordingsid) {
        viewRecordingInput.setRecordingsid(recordingsid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public ViewRecordingInputBuilder responseType(String responseType) {
        viewRecordingInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewRecordingInput build() {
        return viewRecordingInput;
    }
}