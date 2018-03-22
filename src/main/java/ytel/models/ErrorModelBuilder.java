/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ErrorModelBuilder {
    //the instance to build
    private ErrorModel errorModel;

    /**
     * Default constructor to initialize the instance
     */
    public ErrorModelBuilder() {
        errorModel = new ErrorModel();
    }

    public ErrorModelBuilder code(String code) {
        errorModel.setCode(code);
        return this;
    }

    public ErrorModelBuilder message(String message) {
        errorModel.setMessage(message);
        return this;
    }

    public ErrorModelBuilder moreInfo(List<String> moreInfo) {
        errorModel.setMoreInfo(moreInfo);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ErrorModel build() {
        return errorModel;
    }
}