/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

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
     * Which page of the overall response will be returned. Zero indexed
     */
    public ListInboundSMSInputBuilder page(Integer page) {
        listInboundSMSInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public ListInboundSMSInputBuilder pagesize(Integer pagesize) {
        listInboundSMSInput.setPagesize(pagesize);
        return this;
    }

    /**
     * From Number to Inbound ShortCode
     */
    public ListInboundSMSInputBuilder from(String from) {
        listInboundSMSInput.setFrom(from);
        return this;
    }

    /**
     * Only list messages sent to this Short Code
     */
    public ListInboundSMSInputBuilder shortcode(String shortcode) {
        listInboundSMSInput.setShortcode(shortcode);
        return this;
    }

    /**
     * Only list messages sent with the specified date
     */
    public ListInboundSMSInputBuilder dateReceived(String dateReceived) {
        listInboundSMSInput.setDateReceived(dateReceived);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public ListInboundSMSInputBuilder pagesize(String pagesize) {
        listInboundSMSInput.setPagesize(pagesize);
        return this;
    }

    /**
     * To Number to get Inbound SMS
     */
    public ListInboundSMSInputBuilder to(String to) {
        listInboundSMSInput.setTo(to);
        return this;
    }

    /**
     * Filter sms message objects by this date.
     */
    public ListInboundSMSInputBuilder dateSent(Date dateSent) {
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