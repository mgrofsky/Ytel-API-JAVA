/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.message360.api.models;

import java.util.*;

public class CreateDedicatedshortcodeListshortcodeInputBuilder {
    //the instance to build
    private CreateDedicatedshortcodeListshortcodeInput createDedicatedshortcodeListshortcodeInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateDedicatedshortcodeListshortcodeInputBuilder() {
        createDedicatedshortcodeListshortcodeInput = new CreateDedicatedshortcodeListshortcodeInput();
    }

    /**
     * Only list Short Code Assignment sent from this Short Code
     */
    public CreateDedicatedshortcodeListshortcodeInputBuilder shortcode(String shortcode) {
        createDedicatedshortcodeListshortcodeInput.setShortcode(shortcode);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public CreateDedicatedshortcodeListshortcodeInputBuilder page(String page) {
        createDedicatedshortcodeListshortcodeInput.setPage(page);
        return this;
    }

    /**
     * The count of objects to return per page.
     */
    public CreateDedicatedshortcodeListshortcodeInputBuilder pagesize(String pagesize) {
        createDedicatedshortcodeListshortcodeInput.setPagesize(pagesize);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateDedicatedshortcodeListshortcodeInput build() {
        return createDedicatedshortcodeListshortcodeInput;
    }
}