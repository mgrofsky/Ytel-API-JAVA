/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BuyNumberInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4980714636835145664L;
    private String phoneNumber;
    private String responseType = "json";
    /** GETTER
     * A valid 10-digit Ytel number (E.164 format).
     */
    @JsonGetter("PhoneNumber")
    public String getPhoneNumber ( ) { 
        return this.phoneNumber;
    }
    
    /** SETTER
     * A valid 10-digit Ytel number (E.164 format).
     */
    @JsonSetter("PhoneNumber")
    public void setPhoneNumber (String value) { 
        this.phoneNumber = value;
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
 