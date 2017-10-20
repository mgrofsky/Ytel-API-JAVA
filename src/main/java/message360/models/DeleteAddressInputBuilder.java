/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class DeleteAddressInputBuilder {
    //the instance to build
    private DeleteAddressInput deleteAddressInput;

    /**
     * Default constructor to initialize the instance
     */
    public DeleteAddressInputBuilder() {
        deleteAddressInput = new DeleteAddressInput();
    }

    /**
     * The identifier of the address to be deleted.
     */
    public DeleteAddressInputBuilder addressSID(String addressSID) {
        deleteAddressInput.setAddressSID(addressSID);
        return this;
    }

    /**
     * Response type either json or xml
     */
    public DeleteAddressInputBuilder responseType(String responseType) {
        deleteAddressInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DeleteAddressInput build() {
        return deleteAddressInput;
    }
}