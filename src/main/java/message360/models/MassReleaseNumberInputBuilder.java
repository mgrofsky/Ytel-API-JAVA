/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

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
     * A valid message360 comma separated numbers (E.164 format).
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