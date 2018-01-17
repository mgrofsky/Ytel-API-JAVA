/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ListAssignmentInputBuilder {
    //the instance to build
    private ListAssignmentInput listAssignmentInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListAssignmentInputBuilder() {
        listAssignmentInput = new ListAssignmentInput();
    }

    /**
     * Response type format xml or json
     */
    public ListAssignmentInputBuilder responseType(String responseType) {
        listAssignmentInput.setResponseType(responseType);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public ListAssignmentInputBuilder page(Integer page) {
        listAssignmentInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public ListAssignmentInputBuilder pagesize(Integer pagesize) {
        listAssignmentInput.setPagesize(pagesize);
        return this;
    }

    /**
     * Only list keywords of shortcode
     */
    public ListAssignmentInputBuilder shortcode(String shortcode) {
        listAssignmentInput.setShortcode(shortcode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListAssignmentInput build() {
        return listAssignmentInput;
    }
}