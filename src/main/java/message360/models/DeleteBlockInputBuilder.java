/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

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
     * Email address to remove from block list
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