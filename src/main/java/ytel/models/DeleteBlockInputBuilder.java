/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class DeleteBlockInputBuilder {
    //the instance to build
    private DeleteBlockInput deleteBlockInput;

    /**
     * Default constructor to initialize the instance
     */
    public DeleteBlockInputBuilder() {
        deleteBlockInput = new DeleteBlockInput();
    }

    /**
     * The email address to be remove from the blocked list.
     */
    public DeleteBlockInputBuilder email(String email) {
        deleteBlockInput.setEmail(email);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public DeleteBlockInputBuilder responseType(String responseType) {
        deleteBlockInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DeleteBlockInput build() {
        return deleteBlockInput;
    }
}