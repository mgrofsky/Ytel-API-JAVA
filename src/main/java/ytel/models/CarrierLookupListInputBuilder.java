/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

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
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public CarrierLookupListInputBuilder page(Integer page) {
        carrierLookupListInput.setPage(page);
        return this;
    }

    /**
     * The count of objects to return per page.
     */
    public CarrierLookupListInputBuilder pageSize(Integer pageSize) {
        carrierLookupListInput.setPageSize(pageSize);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CarrierLookupListInput build() {
        return carrierLookupListInput;
    }
}