/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/08/2016
 */
package message360.models;

import java.util.*;

public class CreateListAddressInputBuilder {
    //the instance to build
    private CreateListAddressInput createListAddressInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateListAddressInputBuilder() {
        createListAddressInput = new CreateListAddressInput();
    }

    /**
     * Return requested # of items starting the value, default=0, must be an integer
     */
    public CreateListAddressInputBuilder page(Integer page) {
        createListAddressInput.setPage(page);
        return this;
    }

    /**
     * How many results to return, default=10, max 100, must be an integer
     */
    public CreateListAddressInputBuilder pageSize(Integer pageSize) {
        createListAddressInput.setPageSize(pageSize);
        return this;
    }

    /**
     * addresses Sid
     */
    public CreateListAddressInputBuilder addressId(String addressId) {
        createListAddressInput.setAddressId(addressId);
        return this;
    }

    /**
     * date created address.
     */
    public CreateListAddressInputBuilder dateCreated(String dateCreated) {
        createListAddressInput.setDateCreated(dateCreated);
        return this;
    }

    /**
     * Response Type either json or xml
     */
    public CreateListAddressInputBuilder responseType(String responseType) {
        createListAddressInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateListAddressInput build() {
        return createListAddressInput;
    }
}