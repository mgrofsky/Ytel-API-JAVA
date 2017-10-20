/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

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