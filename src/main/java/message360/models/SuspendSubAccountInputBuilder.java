/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class SuspendSubAccountInputBuilder {
    //the instance to build
    private SuspendSubAccountInput suspendSubAccountInput;

    /**
     * Default constructor to initialize the instance
     */
    public SuspendSubAccountInputBuilder() {
        suspendSubAccountInput = new SuspendSubAccountInput();
    }

    /**
     * The SubaccountSid to be activated or suspended
     */
    public SuspendSubAccountInputBuilder subAccountSID(String subAccountSID) {
        suspendSubAccountInput.setSubAccountSID(subAccountSID);
        return this;
    }

    /**
     * 0 to suspend or 1 to activate
     */
    public SuspendSubAccountInputBuilder activate(ActivateStatusEnum activate) {
        suspendSubAccountInput.setActivate(activate);
        return this;
    }

    public SuspendSubAccountInputBuilder responseType(String responseType) {
        suspendSubAccountInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SuspendSubAccountInput build() {
        return suspendSubAccountInput;
    }
}