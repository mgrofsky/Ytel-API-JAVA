/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/08/2016
 */
package message360.models;

import java.util.*;

public class CreateListUnsubscribesInputBuilder {
    //the instance to build
    private CreateListUnsubscribesInput createListUnsubscribesInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateListUnsubscribesInputBuilder() {
        createListUnsubscribesInput = new CreateListUnsubscribesInput();
    }

    /**
     * Response type format xml or json
     */
    public CreateListUnsubscribesInputBuilder responseType(String responseType) {
        createListUnsubscribesInput.setResponseType(responseType);
        return this;
    }

    /**
     * Starting record of the list
     */
    public CreateListUnsubscribesInputBuilder offset(String offset) {
        createListUnsubscribesInput.setOffset(offset);
        return this;
    }

    /**
     * Maximum number of records to be returned
     */
    public CreateListUnsubscribesInputBuilder limit(String limit) {
        createListUnsubscribesInput.setLimit(limit);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateListUnsubscribesInput build() {
        return createListUnsubscribesInput;
    }
}