/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetDIDScoreNumberInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5466059454042863722L;
    private String phonenumber;
    private String responseType = "json";
    /** GETTER
     * Specifies the multiple phone numbers for check updated spamscore .
     */
    @JsonGetter("Phonenumber")
    public String getPhonenumber ( ) { 
        return this.phonenumber;
    }
    
    /** SETTER
     * Specifies the multiple phone numbers for check updated spamscore .
     */
    @JsonSetter("Phonenumber")
    public void setPhonenumber (String value) { 
        this.phonenumber = value;
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
 