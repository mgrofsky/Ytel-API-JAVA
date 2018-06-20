/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.message360.api.models;

import java.util.*;

public class CreateEmailListunsubscribedemailInputBuilder {
    //the instance to build
    private CreateEmailListunsubscribedemailInput createEmailListunsubscribedemailInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateEmailListunsubscribedemailInputBuilder() {
        createEmailListunsubscribedemailInput = new CreateEmailListunsubscribedemailInput();
    }

    /**
     * The starting point of the list of unsubscribed emails that should be returned.
     */
    public CreateEmailListunsubscribedemailInputBuilder offset(String offset) {
        createEmailListunsubscribedemailInput.setOffset(offset);
        return this;
    }

    /**
     * The count of results that should be returned.
     */
    public CreateEmailListunsubscribedemailInputBuilder limit(String limit) {
        createEmailListunsubscribedemailInput.setLimit(limit);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateEmailListunsubscribedemailInput build() {
        return createEmailListunsubscribedemailInput;
    }
}