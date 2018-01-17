/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ListSMSInputBuilder {
    //the instance to build
    private ListSMSInput listSMSInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListSMSInputBuilder() {
        listSMSInput = new ListSMSInput();
    }

    /**
     * Response type format xml or json
     */
    public ListSMSInputBuilder responseType(String responseType) {
        listSMSInput.setResponseType(responseType);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public ListSMSInputBuilder page(Integer page) {
        listSMSInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public ListSMSInputBuilder pageSize(Integer pageSize) {
        listSMSInput.setPageSize(pageSize);
        return this;
    }

    /**
     * Filter SMS message objects from this valid 10-digit phone number (E.164 format).
     */
    public ListSMSInputBuilder from(String from) {
        listSMSInput.setFrom(from);
        return this;
    }

    /**
     * Filter SMS message objects to this valid 10-digit phone number (E.164 format).
     */
    public ListSMSInputBuilder to(String to) {
        listSMSInput.setTo(to);
        return this;
    }

    /**
     * Only list SMS messages sent in the specified date range
     */
    public ListSMSInputBuilder dateSent(String dateSent) {
        listSMSInput.setDateSent(dateSent);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListSMSInput build() {
        return listSMSInput;
    }
}