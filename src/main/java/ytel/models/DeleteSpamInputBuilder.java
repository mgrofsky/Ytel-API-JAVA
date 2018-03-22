/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class DeleteSpamInputBuilder {
    //the instance to build
    private DeleteSpamInput deleteSpamInput;

    /**
     * Default constructor to initialize the instance
     */
    public DeleteSpamInputBuilder() {
        deleteSpamInput = new DeleteSpamInput();
    }

    /**
     * Response type format xml or json
     */
    public DeleteSpamInputBuilder responseType(String responseType) {
        deleteSpamInput.setResponseType(responseType);
        return this;
    }

    /**
     * A valid email address that is to be remove from the spam list.
     */
    public DeleteSpamInputBuilder email(String email) {
        deleteSpamInput.setEmail(email);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DeleteSpamInput build() {
        return deleteSpamInput;
    }
}