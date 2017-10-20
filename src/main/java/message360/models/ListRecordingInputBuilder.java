/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ListRecordingInputBuilder {
    //the instance to build
    private ListRecordingInput listRecordingInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListRecordingInputBuilder() {
        listRecordingInput = new ListRecordingInput();
    }

    /**
     * Response type format xml or json
     */
    public ListRecordingInputBuilder responseType(String responseType) {
        listRecordingInput.setResponseType(responseType);
        return this;
    }

    /**
     * Which page of the overall response will be returned. Zero indexed
     */
    public ListRecordingInputBuilder page(Integer page) {
        listRecordingInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public ListRecordingInputBuilder pageSize(Integer pageSize) {
        listRecordingInput.setPageSize(pageSize);
        return this;
    }

    public ListRecordingInputBuilder dateCreated(String dateCreated) {
        listRecordingInput.setDateCreated(dateCreated);
        return this;
    }

    public ListRecordingInputBuilder callSid(String callSid) {
        listRecordingInput.setCallSid(callSid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListRecordingInput build() {
        return listRecordingInput;
    }
}