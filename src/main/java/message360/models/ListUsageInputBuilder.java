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
     * Filter usage results by product type.
     */
    public ListUsageInputBuilder productCode(ProductCodeEnum productCode) {
        listUsageInput.setProductCode(productCode);
        return this;
    }

    /**
     * Filter usage objects by start date.
     */
    public ListUsageInputBuilder startDate(String startDate) {
        listUsageInput.setStartDate(startDate);
        return this;
    }

    /**
     * Filter usage objects by end date.
     */
    public ListUsageInputBuilder endDate(String endDate) {
        listUsageInput.setEndDate(endDate);
        return this;
    }

    /**
     * Will include all subaccount usage data
     */
    public ListUsageInputBuilder includeSubAccounts(String includeSubAccounts) {
        listUsageInput.setIncludeSubAccounts(includeSubAccounts);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListUsageInput build() {
        return listUsageInput;
    }
}