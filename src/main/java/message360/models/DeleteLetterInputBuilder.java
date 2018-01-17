/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class DeleteLetterInputBuilder {
    //the instance to build
    private DeleteLetterInput deleteLetterInput;

    /**
     * Default constructor to initialize the instance
     */
    public DeleteLetterInputBuilder() {
        deleteLetterInput = new DeleteLetterInput();
    }

    /**
     * The unique identifier for a letter object.
     */
    public DeleteLetterInputBuilder lettersid(String lettersid) {
        deleteLetterInput.setLettersid(lettersid);
        return this;
    }

    /**
     * Response Type either json or xml
     */
    public DeleteLetterInputBuilder responseType(String responseType) {
        deleteLetterInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DeleteLetterInput build() {
        return deleteLetterInput;
    }
}