/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ViewPostcardInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5499037602746240516L;
    private String postcardid;
    private String responseType = "json";
    /** GETTER
     * The unique identifier for a postcard object.
     */
    @JsonGetter("postcardid")
    public String getPostcardid ( ) { 
        return this.postcardid;
    }
    
    /** SETTER
     * The unique identifier for a postcard object.
     */
    @JsonSetter("postcardid")
    public void setPostcardid (String value) { 
        this.postcardid = value;
    }
 
    /** GETTER
     * Response Type either json or xml
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response Type either json or xml
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
    }
 
}
 