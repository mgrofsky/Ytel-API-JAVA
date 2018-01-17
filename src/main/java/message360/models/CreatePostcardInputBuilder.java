/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreatePostcardInputBuilder {
    //the instance to build
    private CreatePostcardInput createPostcardInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreatePostcardInputBuilder() {
        createPostcardInput = new CreatePostcardInput();
    }

    /**
     * The AddressId or an object structured when creating an address by addresses/Create.
     */
    public CreatePostcardInputBuilder to(String to) {
        createPostcardInput.setTo(to);
        return this;
    }

    /**
     * The AddressId or an object structured when creating an address by addresses/Create.
     */
    public CreatePostcardInputBuilder from(String from) {
        createPostcardInput.setFrom(from);
        return this;
    }

    /**
     * Set an existing postcard by attaching its PostcardId.
     */
    public CreatePostcardInputBuilder attachbyid(String attachbyid) {
        createPostcardInput.setAttachbyid(attachbyid);
        return this;
    }

    /**
     * A 4.25"x6.25" or 6.25"x11.25" image to use as the front of the postcard.  This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.
     */
    public CreatePostcardInputBuilder front(String front) {
        createPostcardInput.setFront(front);
        return this;
    }

    /**
     * A 4.25"x6.25" or 6.25"x11.25" image to use as the back of the postcard, supplied as a URL, local file, or HTML string.  This allows you to customize your back design, but we will still insert the recipient address for you.
     */
    public CreatePostcardInputBuilder back(String back) {
        createPostcardInput.setBack(back);
        return this;
    }

    /**
     * The message for the back of the postcard with a maximum of 350 characters.
     */
    public CreatePostcardInputBuilder message(String message) {
        createPostcardInput.setMessage(message);
        return this;
    }

    /**
     * Code for the dimensions of the media to be printed.
     */
    public CreatePostcardInputBuilder setting(String setting) {
        createPostcardInput.setSetting(setting);
        return this;
    }

    /**
     * Response Type either json or xml
     */
    public CreatePostcardInputBuilder responseType(String responseType) {
        createPostcardInput.setResponseType(responseType);
        return this;
    }

    /**
     * A description for the postcard.
     */
    public CreatePostcardInputBuilder description(String description) {
        createPostcardInput.setDescription(description);
        return this;
    }

    /**
     * A string value that contains HTML markup.
     */
    public CreatePostcardInputBuilder htmldata(String htmldata) {
        createPostcardInput.setHtmldata(htmldata);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreatePostcardInput build() {
        return createPostcardInput;
    }
}