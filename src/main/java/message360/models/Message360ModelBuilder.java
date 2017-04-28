/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class Message360ModelBuilder {
    //the instance to build
    private Message360Model message360Model;

    /**
     * Default constructor to initialize the instance
     */
    public Message360ModelBuilder() {
        message360Model = new Message360Model();
    }

    public Message360ModelBuilder responseStatus(int responseStatus) {
        message360Model.setResponseStatus(responseStatus);
        return this;
    }

    public Message360ModelBuilder messageCount(int messageCount) {
        message360Model.setMessageCount(messageCount);
        return this;
    }

    public Message360ModelBuilder message(MessageModel message) {
        message360Model.setMessage(message);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Message360Model build() {
        return message360Model;
    }
}