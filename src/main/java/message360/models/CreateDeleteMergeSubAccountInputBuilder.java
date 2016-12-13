/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/12/2016
 */
package message360.models;

import java.util.*;

public class CreateDeleteMergeSubAccountInputBuilder {
    //the instance to build
    private CreateDeleteMergeSubAccountInput createDeleteMergeSubAccountInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateDeleteMergeSubAccountInputBuilder() {
        createDeleteMergeSubAccountInput = new CreateDeleteMergeSubAccountInput();
    }

    public CreateDeleteMergeSubAccountInputBuilder subaccountsid(String subaccountsid) {
        createDeleteMergeSubAccountInput.setSubaccountsid(subaccountsid);
        return this;
    }

    public CreateDeleteMergeSubAccountInputBuilder mergenumber(MergeNumberStatus mergenumber) {
        createDeleteMergeSubAccountInput.setMergenumber(mergenumber);
        return this;
    }

    /**
     * Response type format either json or xml
     */
    public CreateDeleteMergeSubAccountInputBuilder responseType(String responseType) {
        createDeleteMergeSubAccountInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateDeleteMergeSubAccountInput build() {
        return createDeleteMergeSubAccountInput;
    }
}