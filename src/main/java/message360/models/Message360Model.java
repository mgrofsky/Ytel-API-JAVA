/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Message360Model 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5699892025011500457L;
    private int responseStatus;
    private int messageCount;
    private MessageModel message;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ResponseStatus")
    public int getResponseStatus ( ) { 
        return this.responseStatus;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ResponseStatus")
    public void setResponseStatus (int value) { 
        this.responseStatus = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MessageCount")
    public int getMessageCount ( ) { 
        return this.messageCount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MessageCount")
    public void setMessageCount (int value) { 
        this.messageCount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Message")
    public MessageModel getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Message")
    public void setMessage (MessageModel value) { 
        this.message = value;
    }
 
}
 