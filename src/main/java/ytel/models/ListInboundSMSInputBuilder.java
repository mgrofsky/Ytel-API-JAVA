/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ListInboundSMSInputBuilder {
    //the instance to build
    private ListInboundSMSInput listInboundSMSInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListInboundSMSInputBuilder() {
        listInboundSMSInput = new ListInboundSMSInput();
    }

    /**
     * Response type format xml or json
     */
    public ListInboundSMSInputBuilder responseType(String responseType) {
        listInboundSMSInput.setResponseType(responseType);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public ListInboundSMSInputBuilder page(Integer page) {
        listInboundSMSInput.setPage(page);
        return this;
    }

    /**
     * The count of objects to return per page.
     */
    public ListInboundSMSInputBuilder pageSize(Integer pageSize) {
        listInboundSMSInput.setPageSize(pageSize);
        return this;
    }

    /**
     * Filter SMS message objects from this valid 10-digit phone number (E.164 format).
     */
    public ListInboundSMSInputBuilder from(String from) {
        listInboundSMSInput.setFrom(from);
        return this;
    }

    /**
     * Filter SMS message objects to this valid 10-digit phone number (E.164 format).
     */
    public ListInboundSMSInputBuilder to(String to) {
        listInboundSMSInput.setTo(to);
        return this;
    }

    /**
     * Filter sms message objects by this date.
     */
    public ListInboundSMSInputBuilder dateSent(String dateSent) {
        listInboundSMSInput.setDateSent(dateSent);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListInboundSMSInput build() {
        return listInboundSMSInput;
    }
}