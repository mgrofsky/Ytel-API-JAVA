/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ListShortcodeInputBuilder {
    //the instance to build
    private ListShortcodeInput listShortcodeInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListShortcodeInputBuilder() {
        listShortcodeInput = new ListShortcodeInput();
    }

    /**
     * Response type format xml or json
     */
    public ListShortcodeInputBuilder responseType(String responseType) {
        listShortcodeInput.setResponseType(responseType);
        return this;
    }

    /**
     * Only list messages sent from this Short Code
     */
    public ListShortcodeInputBuilder shortcode(String shortcode) {
        listShortcodeInput.setShortcode(shortcode);
        return this;
    }

    /**
     * Only list messages sent to this number
     */
    public ListShortcodeInputBuilder to(String to) {
        listShortcodeInput.setTo(to);
        return this;
    }

    /**
     * Only list messages sent with the specified date
     */
    public ListShortcodeInputBuilder dateSent(Date dateSent) {
        listShortcodeInput.setDateSent(dateSent);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public ListShortcodeInputBuilder page(Integer page) {
        listShortcodeInput.setPage(page);
        return this;
    }

    /**
     * The count of objects to return per page.
     */
    public ListShortcodeInputBuilder pageSize(Integer pageSize) {
        listShortcodeInput.setPageSize(pageSize);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListShortcodeInput build() {
        return listShortcodeInput;
    }
}