/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.message360.api.models;

import java.util.*;

public class CreateSmsGetinboundsmsInputBuilder {
    //the instance to build
    private CreateSmsGetinboundsmsInput createSmsGetinboundsmsInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateSmsGetinboundsmsInputBuilder() {
        createSmsGetinboundsmsInput = new CreateSmsGetinboundsmsInput();
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public CreateSmsGetinboundsmsInputBuilder page(Integer page) {
        createSmsGetinboundsmsInput.setPage(page);
        return this;
    }

    /**
     * The count of objects to return per page.
     */
    public CreateSmsGetinboundsmsInputBuilder pageSize(Integer pageSize) {
        createSmsGetinboundsmsInput.setPageSize(pageSize);
        return this;
    }

    /**
     * Filter SMS message objects from this valid 10-digit phone number (E.164 format).
     */
    public CreateSmsGetinboundsmsInputBuilder from(String from) {
        createSmsGetinboundsmsInput.setFrom(from);
        return this;
    }

    /**
     * Filter SMS message objects to this valid 10-digit phone number (E.164 format).
     */
    public CreateSmsGetinboundsmsInputBuilder to(String to) {
        createSmsGetinboundsmsInput.setTo(to);
        return this;
    }

    /**
     * Filter sms message objects by this date.
     */
    public CreateSmsGetinboundsmsInputBuilder dateSent(String dateSent) {
        createSmsGetinboundsmsInput.setDateSent(dateSent);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateSmsGetinboundsmsInput build() {
        return createSmsGetinboundsmsInput;
    }
}