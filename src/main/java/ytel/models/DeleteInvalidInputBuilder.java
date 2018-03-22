/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class DeleteInvalidInputBuilder {
    //the instance to build
    private DeleteInvalidInput deleteInvalidInput;

    /**
     * Default constructor to initialize the instance
     */
    public DeleteInvalidInputBuilder() {
        deleteInvalidInput = new DeleteInvalidInput();
    }

    /**
     * A valid email address that is to be remove from the invalid email list.
     */
    public DeleteInvalidInputBuilder email(String email) {
        deleteInvalidInput.setEmail(email);
        return this;
    }

    /**
     * Response Type either json or xml
     */
    public DeleteInvalidInputBuilder responseType(String responseType) {
        deleteInvalidInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DeleteInvalidInput build() {
        return deleteInvalidInput;
    }
}