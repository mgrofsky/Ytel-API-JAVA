/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

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

    public ListTranscriptionInputBuilder page(Integer page) {
        listTranscriptionInput.setPage(page);
        return this;
    }

    public ListTranscriptionInputBuilder pageSize(Integer pageSize) {
        listTranscriptionInput.setPageSize(pageSize);
        return this;
    }

    public ListTranscriptionInputBuilder status(StatusEnum status) {
        listTranscriptionInput.setStatus(status);
        return this;
    }

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