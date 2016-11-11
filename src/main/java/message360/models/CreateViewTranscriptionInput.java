/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 11/11/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateViewTranscriptionInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4612681685103406988L;
    private String transcriptionSid;
    private String responseType = "json";
    /** GETTER
     * Unique Transcription ID
     */
    @JsonGetter("TranscriptionSid")
    public String getTranscriptionSid ( ) { 
        return this.transcriptionSid;
    }
    
    /** SETTER
     * Unique Transcription ID
     */
    @JsonSetter("TranscriptionSid")
    public void setTranscriptionSid (String value) { 
        this.transcriptionSid = value;
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
 