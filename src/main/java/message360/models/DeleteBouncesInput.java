/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DeleteBouncesInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5569445854213007528L;
    private String responseType = "json";
    private String email;
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
     * The email address to be remove from the bounced email list.
     */
    @JsonGetter("Email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * The email address to be remove from the bounced email list.
     */
    @JsonSetter("Email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
}
 