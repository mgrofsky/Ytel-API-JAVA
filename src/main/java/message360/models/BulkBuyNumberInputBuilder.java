/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class BulkBuyNumberInputBuilder {
    //the instance to build
    private BulkBuyNumberInput bulkBuyNumberInput;

    /**
     * Default constructor to initialize the instance
     */
    public BulkBuyNumberInputBuilder() {
        bulkBuyNumberInput = new BulkBuyNumberInput();
    }

    /**
     * The capability the number supports.
     */
    public BulkBuyNumberInputBuilder numberType(NumberTypeEnum numberType) {
        bulkBuyNumberInput.setNumberType(numberType);
        return this;
    }

    /**
     * Specifies the area code for the returned list of available numbers. Only available for North American numbers.
     */
    public BulkBuyNumberInputBuilder areaCode(String areaCode) {
        bulkBuyNumberInput.setAreaCode(areaCode);
        return this;
    }

    /**
     * A positive integer that tells how many number you want to buy at a time.
     */
    public BulkBuyNumberInputBuilder quantity(String quantity) {
        bulkBuyNumberInput.setQuantity(quantity);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public BulkBuyNumberInputBuilder responseType(String responseType) {
        bulkBuyNumberInput.setResponseType(responseType);
        return this;
    }

    /**
     * If desired quantity is unavailable purchase what is available .
     */
    public BulkBuyNumberInputBuilder leftover(String leftover) {
        bulkBuyNumberInput.setLeftover(leftover);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BulkBuyNumberInput build() {
        return bulkBuyNumberInput;
    }
}