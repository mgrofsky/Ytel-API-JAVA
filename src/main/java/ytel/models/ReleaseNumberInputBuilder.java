/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

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
     * A valid 10-digit Ytel number (E.164 format).
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