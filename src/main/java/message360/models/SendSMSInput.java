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
    private static final long serialVersionUID = 5092838558938835250L;
    private String from;
    private String to;
    private String body;
    private String responseType = "json";
    private HttpActionEnum method;
    private String messageStatusCallback;
    private Boolean smartsms = false;
    private Boolean deliveryStatus = false;
    /** GETTER
     * The 10-digit SMS-enabled message360 number (E.164 format) in which the message is sent.
     */
    @JsonGetter("From")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * The 10-digit SMS-enabled message360 number (E.164 format) in which the message is sent.
     */
    @JsonSetter("From")
    public void setFrom (String value) { 
        this.from = value;
    }
 
    /** GETTER
     * The 10-digit phone number (E.164 format) that will receive the message.
     */
    @JsonGetter("To")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * The 10-digit phone number (E.164 format) that will receive the message.
     */
    @JsonSetter("To")
    public void setTo (String value) { 
        this.to = value;
    }
 
    /** GETTER
     * The body message that is to be sent in the text.
     */
    @JsonGetter("Body")
    public String getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * The body message that is to be sent in the text.
     */
    @JsonSetter("Body")
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
    @JsonGetter("Method")
    public HttpActionEnum getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the required URL once SMS sent.
     */
    @JsonSetter("Method")
    public void setMethod (HttpActionEnum value) { 
        this.method = value;
    }
 
    /** GETTER
     * URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.
     */
    @JsonGetter("MessageStatusCallback")
    public String getMessageStatusCallback ( ) { 
        return this.messageStatusCallback;
    }
    
    /** SETTER
     * URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.
     */
    @JsonSetter("MessageStatusCallback")
    public void setMessageStatusCallback (String value) { 
        this.messageStatusCallback = value;
    }
 
    /** GETTER
     * Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message.
     */
    @JsonGetter("Smartsms")
    public Boolean getSmartsms ( ) { 
        return this.smartsms;
    }
    
    /** SETTER
     * Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message.
     */
    @JsonSetter("Smartsms")
    public void setSmartsms (Boolean value) { 
        this.smartsms = value;
    }
 
    /** GETTER
     * Delivery reports are a method to tell your system if the message has arrived on the destination phone.
     */
    @JsonGetter("DeliveryStatus")
    public Boolean getDeliveryStatus ( ) { 
        return this.deliveryStatus;
    }
    
    /** SETTER
     * Delivery reports are a method to tell your system if the message has arrived on the destination phone.
     */
    @JsonSetter("DeliveryStatus")
    public void setDeliveryStatus (Boolean value) { 
        this.deliveryStatus = value;
    }
 
}
 