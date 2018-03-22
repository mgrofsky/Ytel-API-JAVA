/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class DeleteBouncesInputBuilder {
    //the instance to build
    private DeleteBouncesInput deleteBouncesInput;

    /**
     * Default constructor to initialize the instance
     */
    public DeleteBouncesInputBuilder() {
        deleteBouncesInput = new DeleteBouncesInput();
    }

    /**
     * Response type format xml or json
     */
    public DeleteBouncesInputBuilder responseType(String responseType) {
        deleteBouncesInput.setResponseType(responseType);
        return this;
    }

    /**
     * The email address to be remove from the bounced email list.
     */
    public DeleteBouncesInputBuilder email(String email) {
        deleteBouncesInput.setEmail(email);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DeleteBouncesInput build() {
        return deleteBouncesInput;
    }
}