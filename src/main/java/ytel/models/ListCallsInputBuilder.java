/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

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
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
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
     * Filter calls that were sent to this 10-digit number (E.164 format).
     */
    public ListCallsInputBuilder to(String to) {
        listCallsInput.setTo(to);
        return this;
    }

    /**
     * Filter calls that were sent from this 10-digit number (E.164 format).
     */
    public ListCallsInputBuilder from(String from) {
        listCallsInput.setFrom(from);
        return this;
    }

    /**
     * Return calls that are from a specified date.
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