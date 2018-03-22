/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ListPostcardsInputBuilder {
    //the instance to build
    private ListPostcardsInput listPostcardsInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListPostcardsInputBuilder() {
        listPostcardsInput = new ListPostcardsInput();
    }

    /**
     * Response Type either json or xml
     */
    public ListPostcardsInputBuilder responseType(String responseType) {
        listPostcardsInput.setResponseType(responseType);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public ListPostcardsInputBuilder page(Integer page) {
        listPostcardsInput.setPage(page);
        return this;
    }

    /**
     * The count of objects to return per page.
     */
    public ListPostcardsInputBuilder pagesize(Integer pagesize) {
        listPostcardsInput.setPagesize(pagesize);
        return this;
    }

    /**
     * The unique identifier for a postcard object.
     */
    public ListPostcardsInputBuilder postcardid(String postcardid) {
        listPostcardsInput.setPostcardid(postcardid);
        return this;
    }

    /**
     * The date the postcard was created.
     */
    public ListPostcardsInputBuilder dateCreated(String dateCreated) {
        listPostcardsInput.setDateCreated(dateCreated);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListPostcardsInput build() {
        return listPostcardsInput;
    }
}