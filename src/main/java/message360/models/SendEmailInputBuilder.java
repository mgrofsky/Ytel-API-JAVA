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
     * A valid address that will receive the email. Multiple addresses can be separated by using commas.
     */
    public SendEmailInputBuilder to(String to) {
        sendEmailInput.setTo(to);
        return this;
    }

    /**
     * Specifies the type of email to be sent
     */
    public SendEmailInputBuilder type(SendEmailAsEnum type) {
        sendEmailInput.setType(type);
        return this;
    }

    /**
     * The subject of the mail. Must be a valid string.
     */
    public SendEmailInputBuilder subject(String subject) {
        sendEmailInput.setSubject(subject);
        return this;
    }

    /**
     * The email message that is to be sent in the text.
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
     * A valid address that will send the email.
     */
    public SendEmailInputBuilder from(String from) {
        sendEmailInput.setFrom(from);
        return this;
    }

    /**
     * Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas.
     */
    public SendEmailInputBuilder cc(String cc) {
        sendEmailInput.setCc(cc);
        return this;
    }

    /**
     * Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas.
     */
    public SendEmailInputBuilder bcc(String bcc) {
        sendEmailInput.setBcc(bcc);
        return this;
    }

    /**
     * A file that is attached to the email. Must be less than 7 MB in size.
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