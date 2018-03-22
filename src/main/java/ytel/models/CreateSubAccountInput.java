/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateSubAccountInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4977919840216046034L;
    private String firstName;
    private String lastName;
    private String email;
    private String friendlyName;
    private String password;
    private String responseType = "json";
    /** GETTER
     * Sub account user first name
     */
    @JsonGetter("FirstName")
    public String getFirstName ( ) { 
        return this.firstName;
    }
    
    /** SETTER
     * Sub account user first name
     */
    @JsonSetter("FirstName")
    public void setFirstName (String value) { 
        this.firstName = value;
    }
 
    /** GETTER
     * sub account user last name
     */
    @JsonGetter("LastName")
    public String getLastName ( ) { 
        return this.lastName;
    }
    
    /** SETTER
     * sub account user last name
     */
    @JsonSetter("LastName")
    public void setLastName (String value) { 
        this.lastName = value;
    }
 
    /** GETTER
     * Sub account email address
     */
    @JsonGetter("Email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * Sub account email address
     */
    @JsonSetter("Email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * Descriptive name of the sub account
     */
    @JsonGetter("FriendlyName")
    public String getFriendlyName ( ) { 
        return this.friendlyName;
    }
    
    /** SETTER
     * Descriptive name of the sub account
     */
    @JsonSetter("FriendlyName")
    public void setFriendlyName (String value) { 
        this.friendlyName = value;
    }
 
    /** GETTER
     * The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.
     */
    @JsonGetter("Password")
    public String getPassword ( ) { 
        return this.password;
    }
    
    /** SETTER
     * The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.
     */
    @JsonSetter("Password")
    public void setPassword (String value) { 
        this.password = value;
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
 