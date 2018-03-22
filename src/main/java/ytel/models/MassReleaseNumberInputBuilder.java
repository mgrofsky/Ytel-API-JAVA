/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class MassReleaseNumberInputBuilder {
    //the instance to build
    private MassReleaseNumberInput massReleaseNumberInput;

    /**
     * Default constructor to initialize the instance
     */
    public MassReleaseNumberInputBuilder() {
        massReleaseNumberInput = new MassReleaseNumberInput();
    }

    /**
     * A valid Ytel comma separated numbers (E.164 format).
     */
    public MassReleaseNumberInputBuilder phoneNumber(String phoneNumber) {
        massReleaseNumberInput.setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public MassReleaseNumberInputBuilder responseType(String responseType) {
        massReleaseNumberInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MassReleaseNumberInput build() {
        return massReleaseNumberInput;
    }
}