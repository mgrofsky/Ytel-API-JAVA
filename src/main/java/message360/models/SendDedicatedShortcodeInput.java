/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SendDedicatedShortcodeInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5475024420669290460L;
    private int shortcode;
    private double to;
    private String body;
    private String responseType = "json";
    private String method;
    private String messagestatuscallback;
    /** GETTER
     * Your dedicated shortcode
     */
    @JsonGetter("shortcode")
    public int getShortcode ( ) { 
        return this.shortcode;
    }
    
    /** SETTER
     * Your dedicated shortcode
     */
    @JsonSetter("shortcode")
    public void setShortcode (int value) { 
        this.shortcode = value;
    }
 
    /** GETTER
     * The number to send your SMS to
     */
    @JsonGetter("to")
    public double getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * The number to send your SMS to
     */
    @JsonSetter("to")
    public void setTo (double value) { 
        this.to = value;
    }
 
    /** GETTER
     * The body of your message
     */
    @JsonGetter("body")
    public String getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * The body of your message
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
     * Callback status method, POST or GET
     */
    @JsonGetter("method")
    public String getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * Callback status method, POST or GET
     */
    @JsonSetter("method")
    public void setMethod (String value) { 
        this.method = value;
    }
 
    /** GETTER
     * Callback url for SMS status
     */
    @JsonGetter("messagestatuscallback")
    public String getMessagestatuscallback ( ) { 
        return this.messagestatuscallback;
    }
    
    /** SETTER
     * Callback url for SMS status
     */
    @JsonSetter("messagestatuscallback")
    public void setMessagestatuscallback (String value) { 
        this.messagestatuscallback = value;
    }
 
}
 