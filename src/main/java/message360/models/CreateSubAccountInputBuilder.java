/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/01/2016
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

    public CreateSubAccountInputBuilder firstname(String firstname) {
        createSubAccountInput.setFirstname(firstname);
        return this;
    }

    public CreateSubAccountInputBuilder lastname(String lastname) {
        createSubAccountInput.setLastname(lastname);
        return this;
    }

    public CreateSubAccountInputBuilder email(String email) {
        createSubAccountInput.setEmail(email);
        return this;
    }

    /**
     * ResponseType Format either json or xml
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