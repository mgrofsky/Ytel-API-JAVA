/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class MessageModelBuilder {
    //the instance to build
    private MessageModel messageModel;

    /**
     * Default constructor to initialize the instance
     */
    public MessageModelBuilder() {
        messageModel = new MessageModel();
    }

    public MessageModelBuilder apiVersion(String apiVersion) {
        messageModel.setApiVersion(apiVersion);
        return this;
    }

    public MessageModelBuilder messageSid(String messageSid) {
        messageModel.setMessageSid(messageSid);
        return this;
    }

    public MessageModelBuilder from(String from) {
        messageModel.setFrom(from);
        return this;
    }

    public MessageModelBuilder to(String to) {
        messageModel.setTo(to);
        return this;
    }

    public MessageModelBuilder messagePrice(String messagePrice) {
        messageModel.setMessagePrice(messagePrice);
        return this;
    }

    public MessageModelBuilder body(String body) {
        messageModel.setBody(body);
        return this;
    }

    public MessageModelBuilder dateSent(String dateSent) {
        messageModel.setDateSent(dateSent);
        return this;
    }

    public MessageModelBuilder status(String status) {
        messageModel.setStatus(status);
        return this;
    }

    public MessageModelBuilder templateId(String templateId) {
        messageModel.setTemplateId(templateId);
        return this;
    }

    public MessageModelBuilder templateData(TemplateDataModel templateData) {
        messageModel.setTemplateData(templateData);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MessageModel build() {
        return messageModel;
    }
}