/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ReleaseNumberInputBuilder {
    //the instance to build
    private ReleaseNumberInput releaseNumberInput;

    /**
     * Default constructor to initialize the instance
     */
    public ReleaseNumberInputBuilder() {
        releaseNumberInput = new ReleaseNumberInput();
    }

    /**
     * Phone number to be relase
     */
    public ReleaseNumberInputBuilder phoneNumber(String phoneNumber) {
        releaseNumberInput.setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public ReleaseNumberInputBuilder responseType(String responseType) {
        releaseNumberInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ReleaseNumberInput build() {
        return releaseNumberInput;
    }
}