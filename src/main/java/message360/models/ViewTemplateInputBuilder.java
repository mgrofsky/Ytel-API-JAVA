/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ViewTemplateInputBuilder {
    //the instance to build
    private ViewTemplateInput viewTemplateInput;

    /**
     * Default constructor to initialize the instance
     */
    public ViewTemplateInputBuilder() {
        viewTemplateInput = new ViewTemplateInput();
    }

    /**
     * The unique identifier for a template object
     */
    public ViewTemplateInputBuilder templateid(UUID templateid) {
        viewTemplateInput.setTemplateid(templateid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public ViewTemplateInputBuilder responseType(String responseType) {
        viewTemplateInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ViewTemplateInput build() {
        return viewTemplateInput;
    }
}