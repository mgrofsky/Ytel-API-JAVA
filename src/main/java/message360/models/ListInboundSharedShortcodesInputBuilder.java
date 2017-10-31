/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ListInboundSharedShortcodesInputBuilder {
    //the instance to build
    private ListInboundSharedShortcodesInput listInboundSharedShortcodesInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListInboundSharedShortcodesInputBuilder() {
        listInboundSharedShortcodesInput = new ListInboundSharedShortcodesInput();
    }

    /**
     * Response type format xml or json
     */
    public ListInboundSharedShortcodesInputBuilder responseType(String responseType) {
        listInboundSharedShortcodesInput.setResponseType(responseType);
        return this;
    }

    /**
     * Which page of the overall response will be returned. Zero indexed
     */
    public ListInboundSharedShortcodesInputBuilder page(Integer page) {
        listInboundSharedShortcodesInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public ListInboundSharedShortcodesInputBuilder pagesize(Integer pagesize) {
        listInboundSharedShortcodesInput.setPagesize(pagesize);
        return this;
    }

    /**
     * From Number to Inbound ShortCode
     */
    public ListInboundSharedShortcodesInputBuilder from(String from) {
        listInboundSharedShortcodesInput.setFrom(from);
        return this;
    }

    /**
     * Only list messages sent to this Short Code
     */
    public ListInboundSharedShortcodesInputBuilder shortcode(String shortcode) {
        listInboundSharedShortcodesInput.setShortcode(shortcode);
        return this;
    }

    /**
     * Only list messages sent with the specified date
     */
    public ListInboundSharedShortcodesInputBuilder dateReceived(String dateReceived) {
        listInboundSharedShortcodesInput.setDateReceived(dateReceived);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListInboundSharedShortcodesInput build() {
        return listInboundSharedShortcodesInput;
    }
}