/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.message360.api.models;

import java.util.*;

public class CreateCallsListcallsInputBuilder {
    //the instance to build
    private CreateCallsListcallsInput createCallsListcallsInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCallsListcallsInputBuilder() {
        createCallsListcallsInput = new CreateCallsListcallsInput();
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public CreateCallsListcallsInputBuilder page(Integer page) {
        createCallsListcallsInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public CreateCallsListcallsInputBuilder pageSize(Integer pageSize) {
        createCallsListcallsInput.setPageSize(pageSize);
        return this;
    }

    /**
     * Filter calls that were sent to this 10-digit number (E.164 format).
     */
    public CreateCallsListcallsInputBuilder to(String to) {
        createCallsListcallsInput.setTo(to);
        return this;
    }

    /**
     * Filter calls that were sent from this 10-digit number (E.164 format).
     */
    public CreateCallsListcallsInputBuilder from(String from) {
        createCallsListcallsInput.setFrom(from);
        return this;
    }

    /**
     * Return calls that are from a specified date.
     */
    public CreateCallsListcallsInputBuilder dateCreated(String dateCreated) {
        createCallsListcallsInput.setDateCreated(dateCreated);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCallsListcallsInput build() {
        return createCallsListcallsInput;
    }
}