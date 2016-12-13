/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/12/2016
 */
package message360.models;

import java.util.*;

public class CreateVerifyAddressInputBuilder {
    //the instance to build
    private CreateVerifyAddressInput createVerifyAddressInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateVerifyAddressInputBuilder() {
        createVerifyAddressInput = new CreateVerifyAddressInput();
    }

    /**
     * The identifier of the address to be verified.
     */
    public CreateVerifyAddressInputBuilder addressid(String addressid) {
        createVerifyAddressInput.setAddressid(addressid);
        return this;
    }

    /**
     * Response type either JSON or xml
     */
    public CreateVerifyAddressInputBuilder responseType(String responseType) {
        createVerifyAddressInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateVerifyAddressInput build() {
        return createVerifyAddressInput;
    }
}