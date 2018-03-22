/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ViewAccountInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4866700557939278755L;
    private String date;
    private String responseType = "json";
    /** GETTER
     * Filter account information based on date.
     */
    @JsonGetter("Date")
    public String getDate ( ) { 
        return this.date;
    }
    
    /** SETTER
     * Filter account information based on date.
     */
    @JsonSetter("Date")
    public void setDate (String value) { 
        this.date = value;
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
 