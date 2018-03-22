/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ViewSharedShortcodesInputBuilder {
    //the instance to build
    private ViewSharedShortcodesInput viewSharedShortcodesInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewSharedShortcodesInputBuilder() {
        viewSharedShortcodesInput = new ViewSharedShortcodesInput();
    }

    /**
     * Message sid
     */
    public ViewSharedShortcodesInputBuilder messagesid(String messagesid) {
        viewSharedShortcodesInput.setMessagesid(messagesid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public ViewSharedShortcodesInputBuilder responseType(String responseType) {
        viewSharedShortcodesInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewSharedShortcodesInput build() {
        return viewSharedShortcodesInput;
    }
}