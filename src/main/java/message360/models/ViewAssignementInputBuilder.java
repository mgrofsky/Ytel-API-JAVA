/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ViewAssignementInputBuilder {
    //the instance to build
    private ViewAssignementInput viewAssignementInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewAssignementInputBuilder() {
        viewAssignementInput = new ViewAssignementInput();
    }

    /**
     * List of valid Shortcode to your message360 account
     */
    public ViewAssignementInputBuilder shortcode(String shortcode) {
        viewAssignementInput.setShortcode(shortcode);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public ViewAssignementInputBuilder responseType(String responseType) {
        viewAssignementInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewAssignementInput build() {
        return viewAssignementInput;
    }
}