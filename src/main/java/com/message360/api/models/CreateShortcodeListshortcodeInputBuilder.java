/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.message360.api.models;

import java.util.*;

public class CreateShortcodeListshortcodeInputBuilder {
    //the instance to build
    private CreateShortcodeListshortcodeInput createShortcodeListshortcodeInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateShortcodeListshortcodeInputBuilder() {
        createShortcodeListshortcodeInput = new CreateShortcodeListshortcodeInput();
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public CreateShortcodeListshortcodeInputBuilder page(Integer page) {
        createShortcodeListshortcodeInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public CreateShortcodeListshortcodeInputBuilder pagesize(Integer pagesize) {
        createShortcodeListshortcodeInput.setPagesize(pagesize);
        return this;
    }

    /**
     * Only list keywords of shortcode
     */
    public CreateShortcodeListshortcodeInputBuilder shortcode(String shortcode) {
        createShortcodeListshortcodeInput.setShortcode(shortcode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateShortcodeListshortcodeInput build() {
        return createShortcodeListshortcodeInput;
    }
}