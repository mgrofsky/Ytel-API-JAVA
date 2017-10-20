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
    public AvailablePhoneNumberInputBuilder numberType(NumberTypeEnum numberType) {
        availablePhoneNumberInput.setNumberType(numberType);
        return this;
    }

    /**
     * Phone Number Area Code
     */
    public AvailablePhoneNumberInputBuilder areaCode(String areaCode) {
        availablePhoneNumberInput.setAreaCode(areaCode);
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
     * Page Size
     */
    public AvailablePhoneNumberInputBuilder pageSize(Integer pageSize) {
        availablePhoneNumberInput.setPageSize(pageSize);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AvailablePhoneNumberInput build() {
        return availablePhoneNumberInput;
    }
}