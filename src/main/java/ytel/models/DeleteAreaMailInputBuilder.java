/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class DeleteAreaMailInputBuilder {
    //the instance to build
    private DeleteAreaMailInput deleteAreaMailInput;

    /**
     * Default constructor to initialize the instance
     */
    public DeleteAreaMailInputBuilder() {
        deleteAreaMailInput = new DeleteAreaMailInput();
    }

    /**
     * The unique identifier for an AreaMail object.
     */
    public DeleteAreaMailInputBuilder areamailid(String areamailid) {
        deleteAreaMailInput.setAreamailid(areamailid);
        return this;
    }

    /**
     * Response Type either json or xml
     */
    public DeleteAreaMailInputBuilder responseType(String responseType) {
        deleteAreaMailInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DeleteAreaMailInput build() {
        return deleteAreaMailInput;
    }
}