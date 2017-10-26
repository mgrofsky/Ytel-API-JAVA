/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ListInboundShortcodeInputBuilder {
    //the instance to build
    private ListInboundShortcodeInput listInboundShortcodeInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListInboundShortcodeInputBuilder() {
        listInboundShortcodeInput = new ListInboundShortcodeInput();
    }

    /**
     * Response type format xml or json
     */
    public ListInboundShortcodeInputBuilder responseType(String responseType) {
        listInboundShortcodeInput.setResponseType(responseType);
        return this;
    }

    /**
     * Which page of the overall response will be returned. Zero indexed
     */
    public ListInboundShortcodeInputBuilder page(Integer page) {
        listInboundShortcodeInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public ListInboundShortcodeInputBuilder pageSize(Integer pageSize) {
        listInboundShortcodeInput.setPageSize(pageSize);
        return this;
    }

    /**
     * Only list SMS messages sent from this number
     */
    public ListInboundShortcodeInputBuilder from(String from) {
        listInboundShortcodeInput.setFrom(from);
        return this;
    }

    /**
     * Only list SMS messages sent to Shortcode
     */
    public ListInboundShortcodeInputBuilder shortcode(String shortcode) {
        listInboundShortcodeInput.setShortcode(shortcode);
        return this;
    }

    /**
     * Only list SMS messages sent in the specified date MAKE REQUEST
     */
    public ListInboundShortcodeInputBuilder dateReceived(String dateReceived) {
        listInboundShortcodeInput.setDateReceived(dateReceived);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListInboundShortcodeInput build() {
        return listInboundShortcodeInput;
    }
}