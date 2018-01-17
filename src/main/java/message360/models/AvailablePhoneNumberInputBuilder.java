/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class AvailablePhoneNumberInputBuilder {
    //the instance to build
    private AvailablePhoneNumberInput availablePhoneNumberInput;

    /**
     * Default constructor to initialize the instance
     */
    public AvailablePhoneNumberInputBuilder() {
        availablePhoneNumberInput = new AvailablePhoneNumberInput();
    }

    /**
     * Number type either SMS,Voice or all
     */
    public AvailablePhoneNumberInputBuilder numbertype(NumberTypeEnum numbertype) {
        availablePhoneNumberInput.setNumbertype(numbertype);
        return this;
    }

    /**
     * Specifies the area code for the returned list of available numbers. Only available for North American numbers.
     */
    public AvailablePhoneNumberInputBuilder areacode(String areacode) {
        availablePhoneNumberInput.setAreacode(areacode);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public AvailablePhoneNumberInputBuilder responseType(String responseType) {
        availablePhoneNumberInput.setResponseType(responseType);
        return this;
    }

    /**
     * The count of objects to return.
     */
    public AvailablePhoneNumberInputBuilder pagesize(Integer pagesize) {
        availablePhoneNumberInput.setPagesize(pagesize);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AvailablePhoneNumberInput build() {
        return availablePhoneNumberInput;
    }
}