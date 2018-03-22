/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class TransferNumberInputBuilder {
    //the instance to build
    private TransferNumberInput transferNumberInput;

    /**
     * Default constructor to initialize the instance
     */
    public TransferNumberInputBuilder() {
        transferNumberInput = new TransferNumberInput();
    }

    /**
     * A valid 10-digit Ytel number (E.164 format).
     */
    public TransferNumberInputBuilder phonenumber(String phonenumber) {
        transferNumberInput.setPhonenumber(phonenumber);
        return this;
    }

    /**
     * A specific Accountsid from where Number is getting transfer.
     */
    public TransferNumberInputBuilder fromaccountsid(String fromaccountsid) {
        transferNumberInput.setFromaccountsid(fromaccountsid);
        return this;
    }

    /**
     * A specific Accountsid to which Number is getting transfer.
     */
    public TransferNumberInputBuilder toaccountsid(String toaccountsid) {
        transferNumberInput.setToaccountsid(toaccountsid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public TransferNumberInputBuilder responseType(String responseType) {
        transferNumberInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TransferNumberInput build() {
        return transferNumberInput;
    }
}