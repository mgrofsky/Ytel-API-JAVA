/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class DeleteUnsubscribesInputBuilder {
    //the instance to build
    private DeleteUnsubscribesInput deleteUnsubscribesInput;

    /**
     * Default constructor to initialize the instance
     */
    public DeleteUnsubscribesInputBuilder() {
        deleteUnsubscribesInput = new DeleteUnsubscribesInput();
    }

    /**
     * A valid email address that is to be remove from the unsubscribe list.
     */
    public DeleteUnsubscribesInputBuilder email(String email) {
        deleteUnsubscribesInput.setEmail(email);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public DeleteUnsubscribesInputBuilder responseType(String responseType) {
        deleteUnsubscribesInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DeleteUnsubscribesInput build() {
        return deleteUnsubscribesInput;
    }
}