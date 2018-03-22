/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ListKeywordInputBuilder {
    //the instance to build
    private ListKeywordInput listKeywordInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListKeywordInputBuilder() {
        listKeywordInput = new ListKeywordInput();
    }

    /**
     * Response type format xml or json
     */
    public ListKeywordInputBuilder responseType(String responseType) {
        listKeywordInput.setResponseType(responseType);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public ListKeywordInputBuilder page(Integer page) {
        listKeywordInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public ListKeywordInputBuilder pagesize(Integer pagesize) {
        listKeywordInput.setPagesize(pagesize);
        return this;
    }

    /**
     * Only list keywords of keyword
     */
    public ListKeywordInputBuilder keyword(String keyword) {
        listKeywordInput.setKeyword(keyword);
        return this;
    }

    /**
     * Only list keywords of shortcode
     */
    public ListKeywordInputBuilder shortcode(Integer shortcode) {
        listKeywordInput.setShortcode(shortcode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListKeywordInput build() {
        return listKeywordInput;
    }
}