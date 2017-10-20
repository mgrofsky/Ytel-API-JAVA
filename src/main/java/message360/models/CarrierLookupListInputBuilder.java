/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CarrierLookupListInputBuilder {
    //the instance to build
    private CarrierLookupListInput carrierLookupListInput;

    /**
     * Default constructor to initialize the instance
     */
    public CarrierLookupListInputBuilder() {
        carrierLookupListInput = new CarrierLookupListInput();
    }

    /**
     * Response type format xml or json
     */
    public CarrierLookupListInputBuilder responseType(String responseType) {
        carrierLookupListInput.setResponseType(responseType);
        return this;
    }

    /**
     * Page Number
     */
    public CarrierLookupListInputBuilder page(Integer page) {
        carrierLookupListInput.setPage(page);
        return this;
    }

    /**
     * Page Size
     */
    public CarrierLookupListInputBuilder pagesize(Integer pagesize) {
        carrierLookupListInput.setPagesize(pagesize);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CarrierLookupListInput build() {
        return carrierLookupListInput;
    }
}