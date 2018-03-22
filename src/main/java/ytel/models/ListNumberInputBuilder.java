/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ListNumberInputBuilder {
    //the instance to build
    private ListNumberInput listNumberInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListNumberInputBuilder() {
        listNumberInput = new ListNumberInput();
    }

    /**
     * Response type format xml or json
     */
    public ListNumberInputBuilder responseType(String responseType) {
        listNumberInput.setResponseType(responseType);
        return this;
    }

    /**
     * Which page of the overall response will be returned. Page indexing starts at 1.
     */
    public ListNumberInputBuilder page(Integer page) {
        listNumberInput.setPage(page);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public ListNumberInputBuilder pageSize(Integer pageSize) {
        listNumberInput.setPageSize(pageSize);
        return this;
    }

    /**
     * The capability supported by the number.Number type either SMS,Voice or all
     */
    public ListNumberInputBuilder numberType(NumberTypeEnum numberType) {
        listNumberInput.setNumberType(numberType);
        return this;
    }

    /**
     * A human-readable label added to the number object.
     */
    public ListNumberInputBuilder friendlyName(String friendlyName) {
        listNumberInput.setFriendlyName(friendlyName);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListNumberInput build() {
        return listNumberInput;
    }
}