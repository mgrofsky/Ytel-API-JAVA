/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CheckFundsInputBuilder {
    //the instance to build
    private CheckFundsInput checkFundsInput;

    /**
     * Default constructor to initialize the instance
     */
    public CheckFundsInputBuilder() {
        checkFundsInput = new CheckFundsInput();
    }

    /**
     * Your message360 Account SID
     */
    public CheckFundsInputBuilder accountSid(String accountSid) {
        checkFundsInput.setAccountSid(accountSid);
        return this;
    }

    /**
     * Your message360 Token
     */
    public CheckFundsInputBuilder authToken(String authToken) {
        checkFundsInput.setAuthToken(authToken);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CheckFundsInput build() {
        return checkFundsInput;
    }
}