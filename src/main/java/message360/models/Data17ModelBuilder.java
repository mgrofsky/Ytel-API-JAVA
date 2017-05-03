/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class Data17ModelBuilder {
    //the instance to build
    private Data17Model data17Model;

    /**
     * Default constructor to initialize the instance
     */
    public Data17ModelBuilder() {
        data17Model = new Data17Model();
    }

    public Data17ModelBuilder companyname(String companyname) {
        data17Model.setCompanyname(companyname);
        return this;
    }

    public Data17ModelBuilder otpcode(int otpcode) {
        data17Model.setOtpcode(otpcode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Data17Model build() {
        return data17Model;
    }
}