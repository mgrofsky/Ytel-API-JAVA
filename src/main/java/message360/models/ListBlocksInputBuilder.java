/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

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
     * Where to start in the output list
     */
    public ListBlocksInputBuilder offset(String offset) {
        listBlocksInput.setOffset(offset);
        return this;
    }

    /**
     * Maximum number of records to return
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