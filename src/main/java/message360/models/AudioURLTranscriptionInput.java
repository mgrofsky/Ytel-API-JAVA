/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AudioURLTranscriptionInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4739752545628708430L;
    private String audiourl;
    private String responseType = "json";
    /** GETTER
     * URL pointing to the location of the audio file that is to be transcribed.
     */
    @JsonGetter("audiourl")
    public String getAudiourl ( ) { 
        return this.audiourl;
    }
    
    /** SETTER
     * URL pointing to the location of the audio file that is to be transcribed.
     */
    @JsonSetter("audiourl")
    public void setAudiourl (String value) { 
        this.audiourl = value;
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
 