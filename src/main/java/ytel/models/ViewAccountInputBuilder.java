/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ViewAccountInputBuilder {
    //the instance to build
    private ViewAccountInput viewAccountInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewAccountInputBuilder() {
        viewAccountInput = new ViewAccountInput();
    }

    /**
     * Filter account information based on date.
     */
    public ViewAccountInputBuilder date(String date) {
        viewAccountInput.setDate(date);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public ViewAccountInputBuilder responseType(String responseType) {
        viewAccountInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewAccountInput build() {
        return viewAccountInput;
    }
}