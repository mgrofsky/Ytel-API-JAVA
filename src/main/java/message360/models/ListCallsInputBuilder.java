/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ListCallsInputBuilder {
    //the instance to build
    private ListCallsInput listCallsInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListCallsInputBuilder() {
        listCallsInput = new ListCallsInput();
    }

    /**
     * Response type format xml or json
     */
    public ListCallsInputBuilder responseType(String responseType) {
        listCallsInput.setResponseType(responseType);
        return this;
    }

    /**
     * Which page of the overall response will be returned. Zero indexed
     */
    public ListCallsInputBuilder page(Integer page) {
        listCallsInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public ListCallsInputBuilder pageSize(Integer pageSize) {
        listCallsInput.setPageSize(pageSize);
        return this;
    }

    /**
     * Only list calls to this number
     */
    public ListCallsInputBuilder to(String to) {
        listCallsInput.setTo(to);
        return this;
    }

    /**
     * Only list calls from this number
     */
    public ListCallsInputBuilder from(String from) {
        listCallsInput.setFrom(from);
        return this;
    }

    /**
     * Only list calls starting within the specified date range
     */
    public ListCallsInputBuilder dateCreated(String dateCreated) {
        listCallsInput.setDateCreated(dateCreated);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListCallsInput build() {
        return listCallsInput;
    }
}