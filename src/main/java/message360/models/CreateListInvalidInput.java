/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/12/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateListInvalidInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5379516680459974950L;
    private String responseType = "json";
    private String offet;
    private String limit;
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
     * Starting record for listing out emails
     */
    @JsonGetter("offet")
    public String getOffet ( ) { 
        return this.offet;
    }
    
    /** SETTER
     * Starting record for listing out emails
     */
    @JsonSetter("offet")
    public void setOffet (String value) { 
        this.offet = value;
    }
 
    /** GETTER
     * Maximum number of records to return
     */
    @JsonGetter("limit")
    public String getLimit ( ) { 
        return this.limit;
    }
    
    /** SETTER
     * Maximum number of records to return
     */
    @JsonSetter("limit")
    public void setLimit (String value) { 
        this.limit = value;
    }
 
}
 