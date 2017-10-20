/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ListBouncesInputBuilder {
    //the instance to build
    private ListBouncesInput listBouncesInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListBouncesInputBuilder() {
        listBouncesInput = new ListBouncesInput();
    }

    /**
     * Response type format xml or json
     */
    public ListBouncesInputBuilder responseType(String responseType) {
        listBouncesInput.setResponseType(responseType);
        return this;
    }

    /**
     * The record to start the list at
     */
    public ListBouncesInputBuilder offset(String offset) {
        listBouncesInput.setOffset(offset);
        return this;
    }

    /**
     * The maximum number of records to return
     */
    public ListBouncesInputBuilder limit(String limit) {
        listBouncesInput.setLimit(limit);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListBouncesInput build() {
        return listBouncesInput;
    }
}