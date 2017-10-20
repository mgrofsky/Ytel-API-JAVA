/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ListTemplatesInputBuilder {
    //the instance to build
    private ListTemplatesInput listTemplatesInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListTemplatesInputBuilder() {
        listTemplatesInput = new ListTemplatesInput();
    }

    /**
     * Response type format xml or json
     */
    public ListTemplatesInputBuilder responseType(String responseType) {
        listTemplatesInput.setResponseType(responseType);
        return this;
    }

    /**
     * The type (category) of template Valid values: marketing, authorization
     */
    public ListTemplatesInputBuilder type(String type) {
        listTemplatesInput.setType(type);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public ListTemplatesInputBuilder page(Integer page) {
        listTemplatesInput.setPage(page);
        return this;
    }

    /**
     * The count of objects to return per page.
     */
    public ListTemplatesInputBuilder pagesize(Integer pagesize) {
        listTemplatesInput.setPagesize(pagesize);
        return this;
    }

    /**
     * Only list templates of type
     */
    public ListTemplatesInputBuilder shortcode(String shortcode) {
        listTemplatesInput.setShortcode(shortcode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListTemplatesInput build() {
        return listTemplatesInput;
    }
}