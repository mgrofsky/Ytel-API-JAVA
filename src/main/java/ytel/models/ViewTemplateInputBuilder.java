/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

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
    public ViewTemplateInputBuilder templateId(UUID templateId) {
        viewTemplateInput.setTemplateId(templateId);
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