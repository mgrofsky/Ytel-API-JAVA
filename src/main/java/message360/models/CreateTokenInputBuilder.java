/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 11/11/2016
 */
package message360.models;

import java.util.*;

public class CreateTokenInputBuilder {
    //the instance to build
    private CreateTokenInput createTokenInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateTokenInputBuilder() {
        createTokenInput = new CreateTokenInput();
    }

    /**
     * Your message360 Account SID
     */
    public CreateTokenInputBuilder accountSid(String accountSid) {
        createTokenInput.setAccountSid(accountSid);
        return this;
    }

    /**
     * Your message360 Token
     */
    public CreateTokenInputBuilder authToken(String authToken) {
        createTokenInput.setAuthToken(authToken);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateTokenInput build() {
        return createTokenInput;
    }
}