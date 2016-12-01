/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/01/2016
 */
package message360.models;

import java.util.*;

public class CreateAuthenticateNumberInputBuilder {
    //the instance to build
    private CreateAuthenticateNumberInput createAuthenticateNumberInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateAuthenticateNumberInputBuilder() {
        createAuthenticateNumberInput = new CreateAuthenticateNumberInput();
    }

    /**
     * Phone number to authenticate for use
     */
    public CreateAuthenticateNumberInputBuilder phoneNumber(String phoneNumber) {
        createAuthenticateNumberInput.setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * Your message360 Account SID
     */
    public CreateAuthenticateNumberInputBuilder accountSid(String accountSid) {
        createAuthenticateNumberInput.setAccountSid(accountSid);
        return this;
    }

    /**
     * Your message360 token
     */
    public CreateAuthenticateNumberInputBuilder authToken(String authToken) {
        createAuthenticateNumberInput.setAuthToken(authToken);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateAuthenticateNumberInput build() {
        return createAuthenticateNumberInput;
    }
}