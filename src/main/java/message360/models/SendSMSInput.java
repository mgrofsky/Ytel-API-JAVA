/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SendSMSInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5210847839865532209L;
    private String from;
    private String to;
    private String body;
    private String responseType = "json";
    private HttpActionEnum method;
    private String messagestatuscallback;
    private Boolean smartsms = false;
    private String shortcode;
    private UUID templateid;
    private String data;
    private String method = "GET";
    private String messageStatusCallback;
    /** GETTER
     * SMS enabled Message360 number to send this message from
     */
    @JsonGetter("from")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * SMS enabled Message360 number to send this message from
     */
    @JsonSetter("from")
    public void setFrom (String value) { 
        this.from = value;
    }
 
    /** GETTER
     * Number to send the SMS to
     */
    @JsonGetter("to")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * Number to send the SMS to
     */
    @JsonSetter("to")
    public void setTo (String value) { 
        this.to = value;
    }
 
    /** GETTER
     * Text Message To Send
     */
    @JsonGetter("body")
    public String getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * Text Message To Send
     */
    @JsonSetter("body")
    public void setBody (String value) { 
        this.body = value;
    }
 
    /** GETTER
     * Response type format xml or json
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response type format xml or json
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
    }
 
    /** GETTER
     * Specifies the HTTP method used to request the required URL once SMS sent.
     */
    @JsonGetter("method")
    public HttpActionEnum getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the required URL once SMS sent.
     */
    @JsonSetter("method")
    public void setMethod (HttpActionEnum value) { 
        this.method = value;
    }
 
    /** GETTER
     * URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.
     */
    @JsonGetter("messagestatuscallback")
    public String getMessagestatuscallback ( ) { 
        return this.messagestatuscallback;
    }
    
    /** SETTER
     * URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.
     */
    @JsonSetter("messagestatuscallback")
    public void setMessagestatuscallback (String value) { 
        this.messagestatuscallback = value;
    }
 
    /** GETTER
     * Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message.
     */
    @JsonGetter("smartsms")
    public Boolean getSmartsms ( ) { 
        return this.smartsms;
    }
    
    /** SETTER
     * Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message.
     */
    @JsonSetter("smartsms")
    public void setSmartsms (Boolean value) { 
        this.smartsms = value;
    }
 
    /** GETTER
     * The Short Code number that is the sender of this message
     */
    @JsonGetter("shortcode")
    public String getShortcode ( ) { 
        return this.shortcode;
    }
    
    /** SETTER
     * The Short Code number that is the sender of this message
     */
    @JsonSetter("shortcode")
    public void setShortcode (String value) { 
        this.shortcode = value;
    }
 
    /** GETTER
     * The unique identifier for the template used for the message
     */
    @JsonGetter("templateid")
    public UUID getTemplateid ( ) { 
        return this.templateid;
    }
    
    /** SETTER
     * The unique identifier for the template used for the message
     */
    @JsonSetter("templateid")
    public void setTemplateid (UUID value) { 
        this.templateid = value;
    }
 
    /** GETTER
     * format of your data, example: {companyname}:test,{otpcode}:1234
     */
    @JsonGetter("data")
    public String getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * format of your data, example: {companyname}:test,{otpcode}:1234
     */
    @JsonSetter("data")
    public void setData (String value) { 
        this.data = value;
    }
 
    /** GETTER
     * Specifies the HTTP method used to request the required URL once the Short Code message is sent.
     */
    @JsonGetter("Method")
    public String getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the required URL once the Short Code message is sent.
     */
    @JsonSetter("Method")
    public void setMethod (String value) { 
        this.method = value;
    }
 
    /** GETTER
     * URL that can be requested to receive notification when Short Code message was sent.
     */
    @JsonGetter("MessageStatusCallback")
    public String getMessageStatusCallback ( ) { 
        return this.messageStatusCallback;
    }
    
    /** SETTER
     * URL that can be requested to receive notification when Short Code message was sent.
     */
    @JsonSetter("MessageStatusCallback")
    public void setMessageStatusCallback (String value) { 
        this.messageStatusCallback = value;
    }
 
}
 