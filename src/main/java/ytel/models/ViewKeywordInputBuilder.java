/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ViewKeywordInputBuilder {
    //the instance to build
    private ViewKeywordInput viewKeywordInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewKeywordInputBuilder() {
        viewKeywordInput = new ViewKeywordInput();
    }

    /**
     * The unique identifier of each keyword
     */
    public ViewKeywordInputBuilder keywordid(String keywordid) {
        viewKeywordInput.setKeywordid(keywordid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public ViewKeywordInputBuilder responseType(String responseType) {
        viewKeywordInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewKeywordInput build() {
        return viewKeywordInput;
    }
}