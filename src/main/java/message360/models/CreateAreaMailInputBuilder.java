/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateAreaMailInputBuilder {
    //the instance to build
    private CreateAreaMailInput createAreaMailInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateAreaMailInputBuilder() {
        createAreaMailInput = new CreateAreaMailInput();
    }

    /**
     * List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043
     */
    public CreateAreaMailInputBuilder routes(String routes) {
        createAreaMailInput.setRoutes(routes);
        return this;
    }

    /**
     * Set an existing areamail by attaching its AreamailId.
     */
    public CreateAreaMailInputBuilder attachbyid(String attachbyid) {
        createAreaMailInput.setAttachbyid(attachbyid);
        return this;
    }

    /**
     * The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required
     */
    public CreateAreaMailInputBuilder front(String front) {
        createAreaMailInput.setFront(front);
        return this;
    }

    /**
     * The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.
     */
    public CreateAreaMailInputBuilder back(String back) {
        createAreaMailInput.setBack(back);
        return this;
    }

    /**
     * Response Type either json or xml
     */
    public CreateAreaMailInputBuilder responseType(String responseType) {
        createAreaMailInput.setResponseType(responseType);
        return this;
    }

    /**
     * A string value to use as a description for this AreaMail item.
     */
    public CreateAreaMailInputBuilder description(String description) {
        createAreaMailInput.setDescription(description);
        return this;
    }

    /**
     * The delivery location type.
     */
    public CreateAreaMailInputBuilder targettype(String targettype) {
        createAreaMailInput.setTargettype(targettype);
        return this;
    }

    /**
     * A string value that contains HTML markup.
     */
    public CreateAreaMailInputBuilder htmldata(String htmldata) {
        createAreaMailInput.setHtmldata(htmldata);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateAreaMailInput build() {
        return createAreaMailInput;
    }
}