/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

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
     * Starting record of the list
     */
    public ListUnsubscribesInputBuilder offset(String offset) {
        listUnsubscribesInput.setOffset(offset);
        return this;
    }

    /**
     * Maximum number of records to be returned
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