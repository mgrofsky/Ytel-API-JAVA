/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/08/2016
 */
package message360.models;

import java.util.*;

public class CreateCarrierLookupInputBuilder {
    //the instance to build
    private CreateCarrierLookupInput createCarrierLookupInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCarrierLookupInputBuilder() {
        createCarrierLookupInput = new CreateCarrierLookupInput();
    }

    /**
     * The number to lookup
     */
    public CreateCarrierLookupInputBuilder phonenumber(String phonenumber) {
        createCarrierLookupInput.setPhonenumber(phonenumber);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateCarrierLookupInputBuilder responseType(String responseType) {
        createCarrierLookupInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCarrierLookupInput build() {
        return createCarrierLookupInput;
    }
}