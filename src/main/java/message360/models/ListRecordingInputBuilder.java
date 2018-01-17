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
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public ListRecordingInputBuilder page(Integer page) {
        listRecordingInput.setPage(page);
        return this;
    }

    /**
     * The count of objects to return per page.
     */
    public ListRecordingInputBuilder pagesize(Integer pagesize) {
        listRecordingInput.setPagesize(pagesize);
        return this;
    }

    /**
     * Filter results by creation date
     */
    public ListRecordingInputBuilder datecreated(String datecreated) {
        listRecordingInput.setDatecreated(datecreated);
        return this;
    }

    /**
     * The unique identifier for a call.
     */
    public ListRecordingInputBuilder callsid(String callsid) {
        listRecordingInput.setCallsid(callsid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListRecordingInput build() {
        return listRecordingInput;
    }
}