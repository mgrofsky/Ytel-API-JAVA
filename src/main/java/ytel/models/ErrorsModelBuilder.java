/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ErrorsModelBuilder {
    //the instance to build
    private ErrorsModel errorsModel;

    /**
     * Default constructor to initialize the instance
     */
    public ErrorsModelBuilder() {
        errorsModel = new ErrorsModel();
    }

    public ErrorsModelBuilder error(List<ErrorModel> error) {
        errorsModel.setError(error);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ErrorsModel build() {
        return errorsModel;
    }
}