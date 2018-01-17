/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ViewShortcodeInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5081530207719659753L;
    private String messageSid;
    private String responseType = "json";
    /** GETTER
     * The unique identifier for the sms resource
     */
    @JsonGetter("MessageSid")
    public String getMessageSid ( ) { 
        return this.messageSid;
    }
    
    /** SETTER
     * The unique identifier for the sms resource
     */
    @JsonSetter("MessageSid")
    public void setMessageSid (String value) { 
        this.messageSid = value;
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
 
}
 