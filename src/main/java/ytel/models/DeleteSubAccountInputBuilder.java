/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class DeleteSubAccountInputBuilder {
    //the instance to build
    private DeleteSubAccountInput deleteSubAccountInput;

    /**
     * Default constructor to initialize the instance
     */
    public DeleteSubAccountInputBuilder() {
        deleteSubAccountInput = new DeleteSubAccountInput();
    }

    /**
     * The SubaccountSid to be deleted
     */
    public DeleteSubAccountInputBuilder subAccountSID(String subAccountSID) {
        deleteSubAccountInput.setSubAccountSID(subAccountSID);
        return this;
    }

    /**
     * 0 to delete or 1 to merge numbers to parent account.
     */
    public DeleteSubAccountInputBuilder mergeNumber(MergeNumberStatusEnum mergeNumber) {
        deleteSubAccountInput.setMergeNumber(mergeNumber);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public DeleteSubAccountInputBuilder responseType(String responseType) {
        deleteSubAccountInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DeleteSubAccountInput build() {
        return deleteSubAccountInput;
    }
}