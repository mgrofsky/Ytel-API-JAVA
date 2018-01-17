/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ViewDedicatedShortcodeAssignmentInputBuilder {
    //the instance to build
    private ViewDedicatedShortcodeAssignmentInput viewDedicatedShortcodeAssignmentInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewDedicatedShortcodeAssignmentInputBuilder() {
        viewDedicatedShortcodeAssignmentInput = new ViewDedicatedShortcodeAssignmentInput();
    }

    /**
     * List of valid Dedicated Short Code to your message360 account
     */
    public ViewDedicatedShortcodeAssignmentInputBuilder shortcode(String shortcode) {
        viewDedicatedShortcodeAssignmentInput.setShortcode(shortcode);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public ViewDedicatedShortcodeAssignmentInputBuilder responseType(String responseType) {
        viewDedicatedShortcodeAssignmentInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewDedicatedShortcodeAssignmentInput build() {
        return viewDedicatedShortcodeAssignmentInput;
    }
}