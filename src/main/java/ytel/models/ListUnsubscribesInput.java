/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListUnsubscribesInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5499687274985159643L;
    private String responseType = "json";
    private String offset;
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
     * The starting point of the list of unsubscribed emails that should be returned.
     */
    @JsonGetter("Offset")
    public String getOffset ( ) { 
        return this.offset;
    }
    
    /** SETTER
     * The starting point of the list of unsubscribed emails that should be returned.
     */
    @JsonSetter("Offset")
    public void setOffset (String value) { 
        this.offset = value;
    }
 
    /** GETTER
     * The count of results that should be returned.
     */
    @JsonGetter("Limit")
    public String getLimit ( ) { 
        return this.limit;
    }
    
    /** SETTER
     * The count of results that should be returned.
     */
    @JsonSetter("Limit")
    public void setLimit (String value) { 
        this.limit = value;
    }
 
}
 