/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ListTranscriptionInputBuilder {
    //the instance to build
    private ListTranscriptionInput listTranscriptionInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListTranscriptionInputBuilder() {
        listTranscriptionInput = new ListTranscriptionInput();
    }

    /**
     * Response type format xml or json
     */
    public ListTranscriptionInputBuilder responseType(String responseType) {
        listTranscriptionInput.setResponseType(responseType);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public ListTranscriptionInputBuilder page(Integer page) {
        listTranscriptionInput.setPage(page);
        return this;
    }

    /**
     * The count of objects to return per page.
     */
    public ListTranscriptionInputBuilder pagesize(Integer pagesize) {
        listTranscriptionInput.setPagesize(pagesize);
        return this;
    }

    /**
     * The state of the transcription.
     */
    public ListTranscriptionInputBuilder status(StatusEnum status) {
        listTranscriptionInput.setStatus(status);
        return this;
    }

    /**
     * The date the transcription took place.
     */
    public ListTranscriptionInputBuilder dateTranscribed(String dateTranscribed) {
        listTranscriptionInput.setDateTranscribed(dateTranscribed);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListTranscriptionInput build() {
        return listTranscriptionInput;
    }
}