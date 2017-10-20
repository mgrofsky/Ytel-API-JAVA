/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ViewKeywordInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5745558646578444124L;
    private String keywordid;
    private String responseType;
    /** GETTER
     * The unique identifier of each keyword
     */
    @JsonGetter("Keywordid")
    public String getKeywordid ( ) { 
        return this.keywordid;
    }
    
    /** SETTER
     * The unique identifier of each keyword
     */
    @JsonSetter("Keywordid")
    public void setKeywordid (String value) { 
        this.keywordid = value;
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
 