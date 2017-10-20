/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

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
     * Phone number to be purchase
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