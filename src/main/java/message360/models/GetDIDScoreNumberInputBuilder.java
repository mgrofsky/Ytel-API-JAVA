/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class GetDIDScoreNumberInputBuilder {
    //the instance to build
    private GetDIDScoreNumberInput getDIDScoreNumberInput;

    /**
     * Default constructor to initialize the instance
     */
    public GetDIDScoreNumberInputBuilder() {
        getDIDScoreNumberInput = new GetDIDScoreNumberInput();
    }

    /**
     * Specifies the multiple phone numbers for check updated spamscore .
     */
    public GetDIDScoreNumberInputBuilder phonenumber(String phonenumber) {
        getDIDScoreNumberInput.setPhonenumber(phonenumber);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public GetDIDScoreNumberInputBuilder responseType(String responseType) {
        getDIDScoreNumberInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetDIDScoreNumberInput build() {
        return getDIDScoreNumberInput;
    }
}