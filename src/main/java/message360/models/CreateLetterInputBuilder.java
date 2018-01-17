/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateLetterInputBuilder {
    //the instance to build
    private CreateLetterInput createLetterInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateLetterInputBuilder() {
        createLetterInput = new CreateLetterInput();
    }

    /**
     * The AddressId or an object structured when creating an address by addresses/Create.
     */
    public CreateLetterInputBuilder to(String to) {
        createLetterInput.setTo(to);
        return this;
    }

    /**
     * The AddressId or an object structured when creating an address by addresses/Create.
     */
    public CreateLetterInputBuilder from(String from) {
        createLetterInput.setFrom(from);
        return this;
    }

    /**
     * Set an existing letter by attaching its LetterId.
     */
    public CreateLetterInputBuilder attachbyid(String attachbyid) {
        createLetterInput.setAttachbyid(attachbyid);
        return this;
    }

    /**
     * File can be a 8.5"x11" PDF uploaded file or URL that links to a file.
     */
    public CreateLetterInputBuilder file(String file) {
        createLetterInput.setFile(file);
        return this;
    }

    /**
     * Specify if letter should be printed in color.
     */
    public CreateLetterInputBuilder color(String color) {
        createLetterInput.setColor(color);
        return this;
    }

    /**
     * Response Type either json or xml
     */
    public CreateLetterInputBuilder responseType(String responseType) {
        createLetterInput.setResponseType(responseType);
        return this;
    }

    /**
     * A description for the letter.
     */
    public CreateLetterInputBuilder description(String description) {
        createLetterInput.setDescription(description);
        return this;
    }

    /**
     * Add an extra service to your letter. Options are "certified" or "registered". Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50.
     */
    public CreateLetterInputBuilder extraservice(String extraservice) {
        createLetterInput.setExtraservice(extraservice);
        return this;
    }

    /**
     * Specify if letter should be printed on both sides.
     */
    public CreateLetterInputBuilder doublesided(String doublesided) {
        createLetterInput.setDoublesided(doublesided);
        return this;
    }

    /**
     * Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page.
     */
    public CreateLetterInputBuilder template(String template) {
        createLetterInput.setTemplate(template);
        return this;
    }

    /**
     * A string value that contains HTML markup.
     */
    public CreateLetterInputBuilder htmldata(String htmldata) {
        createLetterInput.setHtmldata(htmldata);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateLetterInput build() {
        return createLetterInput;
    }
}