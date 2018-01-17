/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ViewAreaMailInputBuilder {
    //the instance to build
    private ViewAreaMailInput viewAreaMailInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewAreaMailInputBuilder() {
        viewAreaMailInput = new ViewAreaMailInput();
    }

    /**
     * The unique identifier for an AreaMail object.
     */
    public ViewAreaMailInputBuilder areamailid(String areamailid) {
        viewAreaMailInput.setAreamailid(areamailid);
        return this;
    }

    /**
     * Response Type either json or xml
     */
    public ViewAreaMailInputBuilder responseType(String responseType) {
        viewAreaMailInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewAreaMailInput build() {
        return viewAreaMailInput;
    }
}