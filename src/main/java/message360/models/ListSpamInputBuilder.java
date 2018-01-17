/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ListSpamInputBuilder {
    //the instance to build
    private ListSpamInput listSpamInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListSpamInputBuilder() {
        listSpamInput = new ListSpamInput();
    }

    /**
     * Response type format xml or json
     */
    public ListSpamInputBuilder responseType(String responseType) {
        listSpamInput.setResponseType(responseType);
        return this;
    }

    /**
     * The starting point of the list of spam emails that should be returned.
     */
    public ListSpamInputBuilder offset(String offset) {
        listSpamInput.setOffset(offset);
        return this;
    }

    /**
     * The count of results that should be returned.
     */
    public ListSpamInputBuilder limit(String limit) {
        listSpamInput.setLimit(limit);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListSpamInput build() {
        return listSpamInput;
    }
}