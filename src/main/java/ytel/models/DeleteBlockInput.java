/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DeleteBlockInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4924556654856607991L;
    private String email;
    private String responseType = "json";
    /** GETTER
     * The email address to be remove from the blocked list.
     */
    @JsonGetter("Email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * The email address to be remove from the blocked list.
     */
    @JsonSetter("Email")
    public void setEmail (String value) { 
        this.email = value;
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
 