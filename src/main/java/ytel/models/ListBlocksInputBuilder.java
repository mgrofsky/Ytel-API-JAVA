/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ListBlocksInputBuilder {
    //the instance to build
    private ListBlocksInput listBlocksInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListBlocksInputBuilder() {
        listBlocksInput = new ListBlocksInput();
    }

    /**
     * Response type format xml or json
     */
    public ListBlocksInputBuilder responseType(String responseType) {
        listBlocksInput.setResponseType(responseType);
        return this;
    }

    /**
     * The starting point of the list of blocked emails that should be returned.
     */
    public ListBlocksInputBuilder offset(String offset) {
        listBlocksInput.setOffset(offset);
        return this;
    }

    /**
     * The count of results that should be returned.
     */
    public ListBlocksInputBuilder limit(String limit) {
        listBlocksInput.setLimit(limit);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListBlocksInput build() {
        return listBlocksInput;
    }
}