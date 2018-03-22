/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class BuyNumberInputBuilder {
    //the instance to build
    private BuyNumberInput buyNumberInput;

    /**
     * Default constructor to initialize the instance
     */
    public BuyNumberInputBuilder() {
        buyNumberInput = new BuyNumberInput();
    }

    /**
     * A valid 10-digit Ytel number (E.164 format).
     */
    public BuyNumberInputBuilder phoneNumber(String phoneNumber) {
        buyNumberInput.setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public BuyNumberInputBuilder responseType(String responseType) {
        buyNumberInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BuyNumberInput build() {
        return buyNumberInput;
    }
}