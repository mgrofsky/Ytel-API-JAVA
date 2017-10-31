/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DeleteAddressInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5680418200725004565L;
    private String addressSID;
    private String responseType = "json";
    /** GETTER
     * The identifier of the address to be deleted.
     */
    @JsonGetter("AddressSID")
    public String getAddressSID ( ) { 
        return this.addressSID;
    }
    
    /** SETTER
     * The identifier of the address to be deleted.
     */
    @JsonSetter("AddressSID")
    public void setAddressSID (String value) { 
        this.addressSID = value;
    }
 
    /** GETTER
     * Response type either json or xml
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response type either json or xml
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
    }
 
}
 