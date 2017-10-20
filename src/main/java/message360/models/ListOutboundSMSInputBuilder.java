/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ListOutboundSMSInputBuilder {
    //the instance to build
    private ListOutboundSMSInput listOutboundSMSInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListOutboundSMSInputBuilder() {
        listOutboundSMSInput = new ListOutboundSMSInput();
    }

    /**
     * Response type format xml or json
     */
    public ListOutboundSMSInputBuilder responseType(String responseType) {
        listOutboundSMSInput.setResponseType(responseType);
        return this;
    }

    /**
     * Which page of the overall response will be returned. Zero indexed
     */
    public ListOutboundSMSInputBuilder page(Integer page) {
        listOutboundSMSInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public ListOutboundSMSInputBuilder pagesize(Integer pagesize) {
        listOutboundSMSInput.setPagesize(pagesize);
        return this;
    }

    /**
     * Messages sent from this number
     */
    public ListOutboundSMSInputBuilder from(String from) {
        listOutboundSMSInput.setFrom(from);
        return this;
    }

    /**
     * Messages sent to this number
     */
    public ListOutboundSMSInputBuilder to(String to) {
        listOutboundSMSInput.setTo(to);
        return this;
    }

    /**
     * Only list SMS messages sent in the specified date range
     */
    public ListOutboundSMSInputBuilder datesent(String datesent) {
        listOutboundSMSInput.setDatesent(datesent);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListOutboundSMSInput build() {
        return listOutboundSMSInput;
    }
}