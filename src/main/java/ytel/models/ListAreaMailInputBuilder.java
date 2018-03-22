/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ListAreaMailInputBuilder {
    //the instance to build
    private ListAreaMailInput listAreaMailInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListAreaMailInputBuilder() {
        listAreaMailInput = new ListAreaMailInput();
    }

    /**
     * Response Type either json or xml
     */
    public ListAreaMailInputBuilder responseType(String responseType) {
        listAreaMailInput.setResponseType(responseType);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public ListAreaMailInputBuilder page(Integer page) {
        listAreaMailInput.setPage(page);
        return this;
    }

    /**
     * The count of objects to return per page.
     */
    public ListAreaMailInputBuilder pagesize(Integer pagesize) {
        listAreaMailInput.setPagesize(pagesize);
        return this;
    }

    /**
     * The unique identifier for an AreaMail object.
     */
    public ListAreaMailInputBuilder areamailsid(String areamailsid) {
        listAreaMailInput.setAreamailsid(areamailsid);
        return this;
    }

    /**
     * The date the AreaMail was created.
     */
    public ListAreaMailInputBuilder dateCreated(String dateCreated) {
        listAreaMailInput.setDateCreated(dateCreated);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListAreaMailInput build() {
        return listAreaMailInput;
    }
}