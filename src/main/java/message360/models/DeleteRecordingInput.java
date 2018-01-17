/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DeleteRecordingInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5297416952879836188L;
    private String recordingsid;
    private String responseType = "json";
    /** GETTER
     * The unique identifier for a recording.
     */
    @JsonGetter("recordingsid")
    public String getRecordingsid ( ) { 
        return this.recordingsid;
    }
    
    /** SETTER
     * The unique identifier for a recording.
     */
    @JsonSetter("recordingsid")
    public void setRecordingsid (String value) { 
        this.recordingsid = value;
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
 