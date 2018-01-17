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
     * A valid 10-digit message360 number (E.164 format).
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