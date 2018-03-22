/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

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
     * Your Ytel Account SID
     */
    public CheckFundsInputBuilder accountSid(String accountSid) {
        checkFundsInput.setAccountSid(accountSid);
        return this;
    }

    /**
     * Your Ytel Token
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