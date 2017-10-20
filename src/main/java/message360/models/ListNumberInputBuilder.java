/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

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
     * Which page of the overall response will be returned. Zero indexed
     */
    public ListNumberInputBuilder page(Integer page) {
        listNumberInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public ListNumberInputBuilder pageSize(Integer pageSize) {
        listNumberInput.setPageSize(pageSize);
        return this;
    }

    /**
     * SMS or Voice
     */
    public ListNumberInputBuilder numberType(NumberTypeEnum numberType) {
        listNumberInput.setNumberType(numberType);
        return this;
    }

    /**
     * Friendly name of the number
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