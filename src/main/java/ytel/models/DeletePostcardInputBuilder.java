/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class DeletePostcardInputBuilder {
    //the instance to build
    private DeletePostcardInput deletePostcardInput;

    /**
     * Default constructor to initialize the instance
     */
    public DeletePostcardInputBuilder() {
        deletePostcardInput = new DeletePostcardInput();
    }

    /**
     * The unique identifier of a postcard object.
     */
    public DeletePostcardInputBuilder postcardid(String postcardid) {
        deletePostcardInput.setPostcardid(postcardid);
        return this;
    }

    /**
     * Response Type either json or xml
     */
    public DeletePostcardInputBuilder responseType(String responseType) {
        deletePostcardInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DeletePostcardInput build() {
        return deletePostcardInput;
    }
}