/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ListInboundShortcodeInputBuilder {
    //the instance to build
    private ListInboundShortcodeInput listInboundShortcodeInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListInboundShortcodeInputBuilder() {
        listInboundShortcodeInput = new ListInboundShortcodeInput();
    }

    /**
     * Response type format xml or json
     */
    public ListInboundShortcodeInputBuilder responseType(String responseType) {
        listInboundShortcodeInput.setResponseType(responseType);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public ListInboundShortcodeInputBuilder page(Integer page) {
        listInboundShortcodeInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public ListInboundShortcodeInputBuilder pagesize(Integer pagesize) {
        listInboundShortcodeInput.setPagesize(pagesize);
        return this;
    }

    /**
     * Only list SMS messages sent from this number
     */
    public ListInboundShortcodeInputBuilder from(String from) {
        listInboundShortcodeInput.setFrom(from);
        return this;
    }

    /**
     * Only list SMS messages sent to Shortcode
     */
    public ListInboundShortcodeInputBuilder shortcode(String shortcode) {
        listInboundShortcodeInput.setShortcode(shortcode);
        return this;
    }

    /**
     * Only list SMS messages sent in the specified date MAKE REQUEST
     */
    public ListInboundShortcodeInputBuilder datecreated(String datecreated) {
        listInboundShortcodeInput.setDatecreated(datecreated);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListInboundShortcodeInput build() {
        return listInboundShortcodeInput;
    }
}