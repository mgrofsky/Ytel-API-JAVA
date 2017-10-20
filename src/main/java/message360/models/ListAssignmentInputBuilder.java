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
     * Which page of the overall response will be returned. Zero indexed
     */
    public ListAssignmentInputBuilder page(String page) {
        listAssignmentInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public ListAssignmentInputBuilder pageSize(String pageSize) {
        listAssignmentInput.setPageSize(pageSize);
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