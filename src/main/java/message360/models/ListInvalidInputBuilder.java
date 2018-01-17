/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ListInvalidInputBuilder {
    //the instance to build
    private ListInvalidInput listInvalidInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListInvalidInputBuilder() {
        listInvalidInput = new ListInvalidInput();
    }

    /**
     * Response type format xml or json
     */
    public ListInvalidInputBuilder responseType(String responseType) {
        listInvalidInput.setResponseType(responseType);
        return this;
    }

    /**
     * The starting point of the list of invalid emails that should be returned.
     */
    public ListInvalidInputBuilder offset(String offset) {
        listInvalidInput.setOffset(offset);
        return this;
    }

    /**
     * The count of results that should be returned.
     */
    public ListInvalidInputBuilder limit(String limit) {
        listInvalidInput.setLimit(limit);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListInvalidInput build() {
        return listInvalidInput;
    }
}