/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

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