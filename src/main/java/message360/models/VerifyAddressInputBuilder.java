/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class VerifyAddressInputBuilder {
    //the instance to build
    private VerifyAddressInput verifyAddressInput;

    /**
     * Default constructor to initialize the instance
     */
    public VerifyAddressInputBuilder() {
        verifyAddressInput = new VerifyAddressInput();
    }

    /**
     * The identifier of the address to be verified.
     */
    public VerifyAddressInputBuilder addressSID(String addressSID) {
        verifyAddressInput.setAddressSID(addressSID);
        return this;
    }

    /**
     * Response type either json or xml
     */
    public VerifyAddressInputBuilder responseType(String responseType) {
        verifyAddressInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VerifyAddressInput build() {
        return verifyAddressInput;
    }
}