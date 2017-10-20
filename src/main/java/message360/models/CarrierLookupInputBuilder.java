/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

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
     * The number to lookup
     */
    public CarrierLookupInputBuilder phonenumber(String phonenumber) {
        carrierLookupInput.setPhonenumber(phonenumber);
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