/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 11/11/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateBuyNumberInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4631918453111739102L;
    private String phoneNumber;
    private String responseType = "json";
    /** GETTER
     * Phone number to be purchase
     */
    @JsonGetter("PhoneNumber")
    public String getPhoneNumber ( ) { 
        return this.phoneNumber;
    }
    
    /** SETTER
     * Phone number to be purchase
     */
    @JsonSetter("PhoneNumber")
    public void setPhoneNumber (String value) { 
        this.phoneNumber = value;
    }
 
    /** GETTER
     * Response format, xml or json
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response format, xml or json
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
    }
 
}
 