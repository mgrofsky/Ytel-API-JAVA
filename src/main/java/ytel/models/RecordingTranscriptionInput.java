/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class RecordingTranscriptionInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5510889165909298962L;
    private String recordingSid;
    private String responseType = "json";
    /** GETTER
     * The unique identifier for a recording object.
     */
    @JsonGetter("recordingSid")
    public String getRecordingSid ( ) { 
        return this.recordingSid;
    }
    
    /** SETTER
     * The unique identifier for a recording object.
     */
    @JsonSetter("recordingSid")
    public void setRecordingSid (String value) { 
        this.recordingSid = value;
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
 