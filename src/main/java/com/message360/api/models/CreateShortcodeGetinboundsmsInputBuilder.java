/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.message360.api.models;

import java.util.*;

public class CreateShortcodeGetinboundsmsInputBuilder {
    //the instance to build
    private CreateShortcodeGetinboundsmsInput createShortcodeGetinboundsmsInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateShortcodeGetinboundsmsInputBuilder() {
        createShortcodeGetinboundsmsInput = new CreateShortcodeGetinboundsmsInput();
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public CreateShortcodeGetinboundsmsInputBuilder page(Integer page) {
        createShortcodeGetinboundsmsInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public CreateShortcodeGetinboundsmsInputBuilder pagesize(Integer pagesize) {
        createShortcodeGetinboundsmsInput.setPagesize(pagesize);
        return this;
    }

    /**
     * From Number to Inbound ShortCode
     */
    public CreateShortcodeGetinboundsmsInputBuilder from(String from) {
        createShortcodeGetinboundsmsInput.setFrom(from);
        return this;
    }

    /**
     * Only list messages sent to this Short Code
     */
    public CreateShortcodeGetinboundsmsInputBuilder shortcode(String shortcode) {
        createShortcodeGetinboundsmsInput.setShortcode(shortcode);
        return this;
    }

    /**
     * Only list messages sent with the specified date
     */
    public CreateShortcodeGetinboundsmsInputBuilder datecreated(String datecreated) {
        createShortcodeGetinboundsmsInput.setDatecreated(datecreated);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateShortcodeGetinboundsmsInput build() {
        return createShortcodeGetinboundsmsInput;
    }
}