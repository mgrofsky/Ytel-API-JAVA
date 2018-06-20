/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.message360.api.models;

import java.util.*;

public class CreateShortcodeSendsmsInputBuilder {
    //the instance to build
    private CreateShortcodeSendsmsInput createShortcodeSendsmsInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateShortcodeSendsmsInputBuilder() {
        createShortcodeSendsmsInput = new CreateShortcodeSendsmsInput();
    }

    /**
     * The Short Code number that is the sender of this message
     */
    public CreateShortcodeSendsmsInputBuilder shortcode(String shortcode) {
        createShortcodeSendsmsInput.setShortcode(shortcode);
        return this;
    }

    /**
     * A valid 10-digit number that should receive the message
     */
    public CreateShortcodeSendsmsInputBuilder to(String to) {
        createShortcodeSendsmsInput.setTo(to);
        return this;
    }

    /**
     * The unique identifier for the template used for the message
     */
    public CreateShortcodeSendsmsInputBuilder templateid(UUID templateid) {
        createShortcodeSendsmsInput.setTemplateid(templateid);
        return this;
    }

    /**
     * format of your data, example: {companyname}:test,{otpcode}:1234
     */
    public CreateShortcodeSendsmsInputBuilder data(String data) {
        createShortcodeSendsmsInput.setData(data);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required URL once the Short Code message is sent.
     */
    public CreateShortcodeSendsmsInputBuilder method(String method) {
        createShortcodeSendsmsInput.setMethod(method);
        return this;
    }

    /**
     * URL that can be requested to receive notification when Short Code message was sent.
     */
    public CreateShortcodeSendsmsInputBuilder messageStatusCallback(String messageStatusCallback) {
        createShortcodeSendsmsInput.setMessageStatusCallback(messageStatusCallback);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateShortcodeSendsmsInput build() {
        return createShortcodeSendsmsInput;
    }
}