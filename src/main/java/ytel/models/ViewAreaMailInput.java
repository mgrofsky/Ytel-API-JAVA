/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ViewAreaMailInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5734615616801833711L;
    private String areamailid;
    private String responseType = "json";
    /** GETTER
     * The unique identifier for an AreaMail object.
     */
    @JsonGetter("areamailid")
    public String getAreamailid ( ) { 
        return this.areamailid;
    }
    
    /** SETTER
     * The unique identifier for an AreaMail object.
     */
    @JsonSetter("areamailid")
    public void setAreamailid (String value) { 
        this.areamailid = value;
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
 