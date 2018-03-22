/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ListUnsubscribesInputBuilder {
    //the instance to build
    private ListUnsubscribesInput listUnsubscribesInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListUnsubscribesInputBuilder() {
        listUnsubscribesInput = new ListUnsubscribesInput();
    }

    /**
     * Response type format xml or json
     */
    public ListUnsubscribesInputBuilder responseType(String responseType) {
        listUnsubscribesInput.setResponseType(responseType);
        return this;
    }

    /**
     * The starting point of the list of unsubscribed emails that should be returned.
     */
    public ListUnsubscribesInputBuilder offset(String offset) {
        listUnsubscribesInput.setOffset(offset);
        return this;
    }

    /**
     * The count of results that should be returned.
     */
    public ListUnsubscribesInputBuilder limit(String limit) {
        listUnsubscribesInput.setLimit(limit);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListUnsubscribesInput build() {
        return listUnsubscribesInput;
    }
}