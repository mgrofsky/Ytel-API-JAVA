/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ViewAddressInputBuilder {
    //the instance to build
    private ViewAddressInput viewAddressInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewAddressInputBuilder() {
        viewAddressInput = new ViewAddressInput();
    }

    /**
     * The identifier of the address to be retrieved.
     */
    public ViewAddressInputBuilder addressid(String addressid) {
        viewAddressInput.setAddressid(addressid);
        return this;
    }

    /**
     * Response Type either json or xml
     */
    public ViewAddressInputBuilder responseType(String responseType) {
        viewAddressInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewAddressInput build() {
        return viewAddressInput;
    }
}