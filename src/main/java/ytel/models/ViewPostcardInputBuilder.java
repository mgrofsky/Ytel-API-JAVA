/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ViewPostcardInputBuilder {
    //the instance to build
    private ViewPostcardInput viewPostcardInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewPostcardInputBuilder() {
        viewPostcardInput = new ViewPostcardInput();
    }

    /**
     * The unique identifier for a postcard object.
     */
    public ViewPostcardInputBuilder postcardid(String postcardid) {
        viewPostcardInput.setPostcardid(postcardid);
        return this;
    }

    /**
     * Response Type either json or xml
     */
    public ViewPostcardInputBuilder responseType(String responseType) {
        viewPostcardInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewPostcardInput build() {
        return viewPostcardInput;
    }
}