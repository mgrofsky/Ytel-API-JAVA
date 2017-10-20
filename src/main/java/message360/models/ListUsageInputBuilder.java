/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ListUsageInputBuilder {
    //the instance to build
    private ListUsageInput listUsageInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListUsageInputBuilder() {
        listUsageInput = new ListUsageInput();
    }

    /**
     * Response type format xml or json
     */
    public ListUsageInputBuilder responseType(String responseType) {
        listUsageInput.setResponseType(responseType);
        return this;
    }

    /**
     * Product Code
     */
    public ListUsageInputBuilder productCode(ProductCodeEnum productCode) {
        listUsageInput.setProductCode(productCode);
        return this;
    }

    /**
     * Start Usage Date
     */
    public ListUsageInputBuilder startDate(String startDate) {
        listUsageInput.setStartDate(startDate);
        return this;
    }

    /**
     * End Usage Date
     */
    public ListUsageInputBuilder endDate(String endDate) {
        listUsageInput.setEndDate(endDate);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListUsageInput build() {
        return listUsageInput;
    }
}