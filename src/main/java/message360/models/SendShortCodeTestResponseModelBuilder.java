/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class SendShortCodeTestResponseModelBuilder {
    //the instance to build
    private SendShortCodeTestResponseModel sendShortCodeTestResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public SendShortCodeTestResponseModelBuilder() {
        sendShortCodeTestResponseModel = new SendShortCodeTestResponseModel();
    }

    public SendShortCodeTestResponseModelBuilder message360(Message360Model message360) {
        sendShortCodeTestResponseModel.setMessage360(message360);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SendShortCodeTestResponseModel build() {
        return sendShortCodeTestResponseModel;
    }
}