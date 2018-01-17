/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ListAddressInputBuilder {
    //the instance to build
    private ListAddressInput listAddressInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListAddressInputBuilder() {
        listAddressInput = new ListAddressInput();
    }

    /**
     * Response Type either json or xml
     */
    public ListAddressInputBuilder responseType(String responseType) {
        listAddressInput.setResponseType(responseType);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public ListAddressInputBuilder page(Integer page) {
        listAddressInput.setPage(page);
        return this;
    }

    /**
     * How many results to return, default is 10, max is 100, must be an integer
     */
    public ListAddressInputBuilder pagesize(Integer pagesize) {
        listAddressInput.setPagesize(pagesize);
        return this;
    }

    /**
     * addresses Sid
     */
    public ListAddressInputBuilder addressid(String addressid) {
        listAddressInput.setAddressid(addressid);
        return this;
    }

    /**
     * date created address.
     */
    public ListAddressInputBuilder dateCreated(String dateCreated) {
        listAddressInput.setDateCreated(dateCreated);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListAddressInput build() {
        return listAddressInput;
    }
}