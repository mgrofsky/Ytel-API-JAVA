/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ListShortCodeAssignmentInputBuilder {
    //the instance to build
    private ListShortCodeAssignmentInput listShortCodeAssignmentInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListShortCodeAssignmentInputBuilder() {
        listShortCodeAssignmentInput = new ListShortCodeAssignmentInput();
    }

    /**
     * Response type format xml or json
     */
    public ListShortCodeAssignmentInputBuilder responseType(String responseType) {
        listShortCodeAssignmentInput.setResponseType(responseType);
        return this;
    }

    /**
     * Only list Short Code Assignment sent from this Short Code
     */
    public ListShortCodeAssignmentInputBuilder shortcode(String shortcode) {
        listShortCodeAssignmentInput.setShortcode(shortcode);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public ListShortCodeAssignmentInputBuilder page(String page) {
        listShortCodeAssignmentInput.setPage(page);
        return this;
    }

    /**
     * The count of objects to return per page.
     */
    public ListShortCodeAssignmentInputBuilder pagesize(String pagesize) {
        listShortCodeAssignmentInput.setPagesize(pagesize);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListShortCodeAssignmentInput build() {
        return listShortCodeAssignmentInput;
    }
}