/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class CarrierLookupInputBuilder {
    //the instance to build
    private CarrierLookupInput carrierLookupInput;

    /**
     * Default constructor to initialize the instance
     */
    public CarrierLookupInputBuilder() {
        carrierLookupInput = new CarrierLookupInput();
    }

    /**
     * A valid 10-digit number (E.164 format).
     */
    public CarrierLookupInputBuilder phoneNumber(String phoneNumber) {
        carrierLookupInput.setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CarrierLookupInputBuilder responseType(String responseType) {
        carrierLookupInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CarrierLookupInput build() {
        return carrierLookupInput;
    }
}