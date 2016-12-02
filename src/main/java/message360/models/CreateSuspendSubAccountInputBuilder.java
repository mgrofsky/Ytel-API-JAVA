/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/02/2016
 */
package message360.models;

import java.util.*;

public class CreateSuspendSubAccountInputBuilder {
    //the instance to build
    private CreateSuspendSubAccountInput createSuspendSubAccountInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateSuspendSubAccountInputBuilder() {
        createSuspendSubAccountInput = new CreateSuspendSubAccountInput();
    }

    public CreateSuspendSubAccountInputBuilder subaccountsid(String subaccountsid) {
        createSuspendSubAccountInput.setSubaccountsid(subaccountsid);
        return this;
    }

    public CreateSuspendSubAccountInputBuilder activate(ActivateStatus activate) {
        createSuspendSubAccountInput.setActivate(activate);
        return this;
    }

    public CreateSuspendSubAccountInputBuilder responseType(String responseType) {
        createSuspendSubAccountInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateSuspendSubAccountInput build() {
        return createSuspendSubAccountInput;
    }
}