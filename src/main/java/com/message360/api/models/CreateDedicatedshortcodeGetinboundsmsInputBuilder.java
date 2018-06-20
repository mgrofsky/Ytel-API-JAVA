/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.message360.api.models;

import java.util.*;

public class CreateDedicatedshortcodeGetinboundsmsInputBuilder {
    //the instance to build
    private CreateDedicatedshortcodeGetinboundsmsInput createDedicatedshortcodeGetinboundsmsInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateDedicatedshortcodeGetinboundsmsInputBuilder() {
        createDedicatedshortcodeGetinboundsmsInput = new CreateDedicatedshortcodeGetinboundsmsInput();
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public CreateDedicatedshortcodeGetinboundsmsInputBuilder page(Integer page) {
        createDedicatedshortcodeGetinboundsmsInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public CreateDedicatedshortcodeGetinboundsmsInputBuilder pagesize(Integer pagesize) {
        createDedicatedshortcodeGetinboundsmsInput.setPagesize(pagesize);
        return this;
    }

    /**
     * Only list SMS messages sent from this number
     */
    public CreateDedicatedshortcodeGetinboundsmsInputBuilder from(String from) {
        createDedicatedshortcodeGetinboundsmsInput.setFrom(from);
        return this;
    }

    /**
     * Only list SMS messages sent to Shortcode
     */
    public CreateDedicatedshortcodeGetinboundsmsInputBuilder shortcode(String shortcode) {
        createDedicatedshortcodeGetinboundsmsInput.setShortcode(shortcode);
        return this;
    }

    /**
     * Only list SMS messages sent in the specified date MAKE REQUEST
     */
    public CreateDedicatedshortcodeGetinboundsmsInputBuilder datecreated(String datecreated) {
        createDedicatedshortcodeGetinboundsmsInput.setDatecreated(datecreated);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateDedicatedshortcodeGetinboundsmsInput build() {
        return createDedicatedshortcodeGetinboundsmsInput;
    }
}