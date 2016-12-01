/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/01/2016
 */
package message360.models;

import java.util.*;

public class CreateViewAddressInputBuilder {
    //the instance to build
    private CreateViewAddressInput createViewAddressInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateViewAddressInputBuilder() {
        createViewAddressInput = new CreateViewAddressInput();
    }

    /**
     * The identifier of the address to be retrieved.
     */
    public CreateViewAddressInputBuilder addressId(String addressId) {
        createViewAddressInput.setAddressId(addressId);
        return this;
    }

    /**
     * Response Type either json or xml
     */
    public CreateViewAddressInputBuilder responseType(String responseType) {
        createViewAddressInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateViewAddressInput build() {
        return createViewAddressInput;
    }
}