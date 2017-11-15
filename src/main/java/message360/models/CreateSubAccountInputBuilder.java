/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateSubAccountInputBuilder {
    //the instance to build
    private CreateSubAccountInput createSubAccountInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateSubAccountInputBuilder() {
        createSubAccountInput = new CreateSubAccountInput();
    }

    /**
     * Sub account user first name
     */
    public CreateSubAccountInputBuilder firstName(String firstName) {
        createSubAccountInput.setFirstName(firstName);
        return this;
    }

    /**
     * sub account user last name
     */
    public CreateSubAccountInputBuilder lastName(String lastName) {
        createSubAccountInput.setLastName(lastName);
        return this;
    }

    /**
     * Sub account email address
     */
    public CreateSubAccountInputBuilder email(String email) {
        createSubAccountInput.setEmail(email);
        return this;
    }

    /**
     * Descriptive name of the sub account
     */
    public CreateSubAccountInputBuilder friendlyName(String friendlyName) {
        createSubAccountInput.setFriendlyName(friendlyName);
        return this;
    }

    /**
     * The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.
     */
    public CreateSubAccountInputBuilder password(String password) {
        createSubAccountInput.setPassword(password);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateSubAccountInputBuilder responseType(String responseType) {
        createSubAccountInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateSubAccountInput build() {
        return createSubAccountInput;
    }
}