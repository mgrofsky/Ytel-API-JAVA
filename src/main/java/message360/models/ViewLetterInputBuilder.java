/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ViewLetterInputBuilder {
    //the instance to build
    private ViewLetterInput viewLetterInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewLetterInputBuilder() {
        viewLetterInput = new ViewLetterInput();
    }

    /**
     * The unique identifier for a letter object.
     */
    public ViewLetterInputBuilder lettersid(String lettersid) {
        viewLetterInput.setLettersid(lettersid);
        return this;
    }

    /**
     * Response Type either json or xml
     */
    public ViewLetterInputBuilder responseType(String responseType) {
        viewLetterInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewLetterInput build() {
        return viewLetterInput;
    }
}