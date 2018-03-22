/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

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
     * Your Ytel Account SID
     */
    public CreateTokenInputBuilder accountSid(String accountSid) {
        createTokenInput.setAccountSid(accountSid);
        return this;
    }

    /**
     * Your Ytel Token
     */
    public CreateTokenInputBuilder authToken(String authToken) {
        createTokenInput.setAuthToken(authToken);
        return this;
    }

    /**
     * WebRTC username authentication
     */
    public CreateTokenInputBuilder username(String username) {
        createTokenInput.setUsername(username);
        return this;
    }

    /**
     * WebRTC password authentication
     */
    public CreateTokenInputBuilder password(String password) {
        createTokenInput.setPassword(password);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateTokenInput build() {
        return createTokenInput;
    }
}