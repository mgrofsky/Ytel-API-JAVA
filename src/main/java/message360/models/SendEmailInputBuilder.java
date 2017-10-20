/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class SendEmailInputBuilder {
    //the instance to build
    private SendEmailInput sendEmailInput;

    /**
     * Default constructor to initialize the instance
     */
    public SendEmailInputBuilder() {
        sendEmailInput = new SendEmailInput();
    }

    /**
     * The to email address
     */
    public SendEmailInputBuilder to(String to) {
        sendEmailInput.setTo(to);
        return this;
    }

    /**
     * The from email address
     */
    public SendEmailInputBuilder from(String from) {
        sendEmailInput.setFrom(from);
        return this;
    }

    /**
     * email format type, html or text
     */
    public SendEmailInputBuilder type(SendEmailAsEnum type) {
        sendEmailInput.setType(type);
        return this;
    }

    /**
     * Email subject
     */
    public SendEmailInputBuilder subject(String subject) {
        sendEmailInput.setSubject(subject);
        return this;
    }

    /**
     * The body of the email message
     */
    public SendEmailInputBuilder message(String message) {
        sendEmailInput.setMessage(message);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public SendEmailInputBuilder responseType(String responseType) {
        sendEmailInput.setResponseType(responseType);
        return this;
    }

    /**
     * CC Email address
     */
    public SendEmailInputBuilder cc(String cc) {
        sendEmailInput.setCc(cc);
        return this;
    }

    /**
     * BCC Email address
     */
    public SendEmailInputBuilder bcc(String bcc) {
        sendEmailInput.setBcc(bcc);
        return this;
    }

    /**
     * File to be attached.File must be less than 7MB.
     */
    public SendEmailInputBuilder attachment(String attachment) {
        sendEmailInput.setAttachment(attachment);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SendEmailInput build() {
        return sendEmailInput;
    }
}