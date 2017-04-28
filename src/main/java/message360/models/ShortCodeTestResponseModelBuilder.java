/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ShortCodeTestResponseModelBuilder {
    //the instance to build
    private ShortCodeTestResponseModel shortCodeTestResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public ShortCodeTestResponseModelBuilder() {
        shortCodeTestResponseModel = new ShortCodeTestResponseModel();
    }

    public ShortCodeTestResponseModelBuilder message360(Message360Model message360) {
        shortCodeTestResponseModel.setMessage360(message360);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ShortCodeTestResponseModel build() {
        return shortCodeTestResponseModel;
    }
}