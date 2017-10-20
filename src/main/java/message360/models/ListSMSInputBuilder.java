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
     * Which page of the overall response will be returned. Zero indexed
     */
    public ListSMSInputBuilder page(Integer page) {
        listSMSInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public ListSMSInputBuilder pagesize(Integer pagesize) {
        listSMSInput.setPagesize(pagesize);
        return this;
    }

    /**
     * Messages sent from this number
     */
    public ListSMSInputBuilder from(String from) {
        listSMSInput.setFrom(from);
        return this;
    }

    /**
     * Messages sent to this number
     */
    public ListSMSInputBuilder to(String to) {
        listSMSInput.setTo(to);
        return this;
    }

    /**
     * Only list SMS messages sent in the specified date range
     */
    public ListSMSInputBuilder datesent(String datesent) {
        listSMSInput.setDatesent(datesent);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListSMSInput build() {
        return listSMSInput;
    }
}