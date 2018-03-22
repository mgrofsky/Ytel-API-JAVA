/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ListLettersInputBuilder {
    //the instance to build
    private ListLettersInput listLettersInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListLettersInputBuilder() {
        listLettersInput = new ListLettersInput();
    }

    /**
     * Response Type either json or xml
     */
    public ListLettersInputBuilder responseType(String responseType) {
        listLettersInput.setResponseType(responseType);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public ListLettersInputBuilder page(Integer page) {
        listLettersInput.setPage(page);
        return this;
    }

    /**
     * The count of objects to return per page.
     */
    public ListLettersInputBuilder pagesize(Integer pagesize) {
        listLettersInput.setPagesize(pagesize);
        return this;
    }

    /**
     * The unique identifier for a letter object.
     */
    public ListLettersInputBuilder lettersid(String lettersid) {
        listLettersInput.setLettersid(lettersid);
        return this;
    }

    /**
     * The date the letter was created.
     */
    public ListLettersInputBuilder dateCreated(String dateCreated) {
        listLettersInput.setDateCreated(dateCreated);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListLettersInput build() {
        return listLettersInput;
    }
}