/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class DataModelBuilder {
    //the instance to build
    private DataModel dataModel;

    /**
     * Default constructor to initialize the instance
     */
    public DataModelBuilder() {
        dataModel = new DataModel();
    }

    public DataModelBuilder companyname(String companyname) {
        dataModel.setCompanyname(companyname);
        return this;
    }

    public DataModelBuilder otpcode(int otpcode) {
        dataModel.setOtpcode(otpcode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DataModel build() {
        return dataModel;
    }
}