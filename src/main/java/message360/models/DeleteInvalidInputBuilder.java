/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

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

    public DeleteInvalidInputBuilder email(String email) {
        deleteInvalidInput.setEmail(email);
        return this;
    }

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