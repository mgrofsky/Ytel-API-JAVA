/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class TemplateDataModelBuilder {
    //the instance to build
    private TemplateDataModel templateDataModel;

    /**
     * Default constructor to initialize the instance
     */
    public TemplateDataModelBuilder() {
        templateDataModel = new TemplateDataModel();
    }

    public TemplateDataModelBuilder companyname(String companyname) {
        templateDataModel.setCompanyname(companyname);
        return this;
    }

    public TemplateDataModelBuilder otpcode(String otpcode) {
        templateDataModel.setOtpcode(otpcode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TemplateDataModel build() {
        return templateDataModel;
    }
}