/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SendSharedShortcodeInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4953820188023971812L;
    private String shortcode;
    private String to;
    private UUID templateid;
    private String responseType = "json";
    private String data;
    private HttpActionEnum method = HttpActionEnum.GET;
    private String messageStatusCallback;
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
     * A valid 10-digit number that should receive the message
     */
    @JsonGetter("to")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * A valid 10-digit number that should receive the message
     */
    @JsonSetter("to")
    public void setTo (String value) { 
        this.to = value;
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
    public HttpActionEnum getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the required URL once the Short Code message is sent.
     */
    @JsonSetter("Method")
    public void setMethod (HttpActionEnum value) { 
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
 