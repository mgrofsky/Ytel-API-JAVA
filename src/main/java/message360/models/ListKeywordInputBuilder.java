/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

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
     * Which page of the overall response will be returned. Zero indexed
     */
    public ListKeywordInputBuilder page(Integer page) {
        listKeywordInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public ListKeywordInputBuilder pageSize(Integer pageSize) {
        listKeywordInput.setPageSize(pageSize);
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