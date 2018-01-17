/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ListOutboundSharedShortcodesInputBuilder {
    //the instance to build
    private ListOutboundSharedShortcodesInput listOutboundSharedShortcodesInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListOutboundSharedShortcodesInputBuilder() {
        listOutboundSharedShortcodesInput = new ListOutboundSharedShortcodesInput();
    }

    /**
     * Response type format xml or json
     */
    public ListOutboundSharedShortcodesInputBuilder responseType(String responseType) {
        listOutboundSharedShortcodesInput.setResponseType(responseType);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public ListOutboundSharedShortcodesInputBuilder page(Integer page) {
        listOutboundSharedShortcodesInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public ListOutboundSharedShortcodesInputBuilder pagesize(Integer pagesize) {
        listOutboundSharedShortcodesInput.setPagesize(pagesize);
        return this;
    }

    /**
     * Only list messages sent from this Short Code
     */
    public ListOutboundSharedShortcodesInputBuilder shortcode(String shortcode) {
        listOutboundSharedShortcodesInput.setShortcode(shortcode);
        return this;
    }

    /**
     * Only list messages sent to this number
     */
    public ListOutboundSharedShortcodesInputBuilder to(String to) {
        listOutboundSharedShortcodesInput.setTo(to);
        return this;
    }

    /**
     * Only list SMS messages sent in the specified date range
     */
    public ListOutboundSharedShortcodesInputBuilder datesent(String datesent) {
        listOutboundSharedShortcodesInput.setDatesent(datesent);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListOutboundSharedShortcodesInput build() {
        return listOutboundSharedShortcodesInput;
    }
}