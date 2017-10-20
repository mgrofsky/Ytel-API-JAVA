/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ListInvalidInputBuilder {
    //the instance to build
    private ListInvalidInput listInvalidInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListInvalidInputBuilder() {
        listInvalidInput = new ListInvalidInput();
    }

    /**
     * Response type format xml or json
     */
    public ListInvalidInputBuilder responseType(String responseType) {
        listInvalidInput.setResponseType(responseType);
        return this;
    }

    /**
     * Starting record for listing out emails
     */
    public ListInvalidInputBuilder offet(String offet) {
        listInvalidInput.setOffet(offet);
        return this;
    }

    /**
     * Maximum number of records to return
     */
    public ListInvalidInputBuilder limit(String limit) {
        listInvalidInput.setLimit(limit);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListInvalidInput build() {
        return listInvalidInput;
    }
}