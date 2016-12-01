/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/01/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateVerifyAddressInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5270484694732081738L;
    private String addressid;
    private String responseType = "json";
    /** GETTER
     * The identifier of the address to be verified.
     */
    @JsonGetter("addressid")
    public String getAddressid ( ) { 
        return this.addressid;
    }
    
    /** SETTER
     * The identifier of the address to be verified.
     */
    @JsonSetter("addressid")
    public void setAddressid (String value) { 
        this.addressid = value;
    }
 
    /** GETTER
     * Response type either JSON or xml
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response type either JSON or xml
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
    }
 
}
 