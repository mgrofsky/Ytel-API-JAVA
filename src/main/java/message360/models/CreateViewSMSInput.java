/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/12/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateViewSMSInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5201453792873250684L;
    private String messagesid;
    private String responseType = "json";
    /** GETTER
     * Message sid
     */
    @JsonGetter("messagesid")
    public String getMessagesid ( ) { 
        return this.messagesid;
    }
    
    /** SETTER
     * Message sid
     */
    @JsonSetter("messagesid")
    public void setMessagesid (String value) { 
        this.messagesid = value;
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
 