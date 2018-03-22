/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PlayAudioInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4836527317942746183L;
    private String callSid;
    private String audioUrl;
    private String sayText;
    private String responseType = "json";
    private Integer length;
    private DirectionEnum direction;
    private Boolean mix;
    /** GETTER
     * The unique identifier of each call resource
     */
    @JsonGetter("CallSid")
    public String getCallSid ( ) { 
        return this.callSid;
    }
    
    /** SETTER
     * The unique identifier of each call resource
     */
    @JsonSetter("CallSid")
    public void setCallSid (String value) { 
        this.callSid = value;
    }
 
    /** GETTER
     * URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav
     */
    @JsonGetter("AudioUrl")
    public String getAudioUrl ( ) { 
        return this.audioUrl;
    }
    
    /** SETTER
     * URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav
     */
    @JsonSetter("AudioUrl")
    public void setAudioUrl (String value) { 
        this.audioUrl = value;
    }
 
    /** GETTER
     * Valid alphanumeric string that should be played to the In-progress call.
     */
    @JsonGetter("SayText")
    public String getSayText ( ) { 
        return this.sayText;
    }
    
    /** SETTER
     * Valid alphanumeric string that should be played to the In-progress call.
     */
    @JsonSetter("SayText")
    public void setSayText (String value) { 
        this.sayText = value;
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
 
    /** GETTER
     * Time limit in seconds for audio play back
     */
    @JsonGetter("Length")
    public Integer getLength ( ) { 
        return this.length;
    }
    
    /** SETTER
     * Time limit in seconds for audio play back
     */
    @JsonSetter("Length")
    public void setLength (Integer value) { 
        this.length = value;
    }
 
    /** GETTER
     * The leg of the call audio will be played to
     */
    @JsonGetter("Direction")
    public DirectionEnum getDirection ( ) { 
        return this.direction;
    }
    
    /** SETTER
     * The leg of the call audio will be played to
     */
    @JsonSetter("Direction")
    public void setDirection (DirectionEnum value) { 
        this.direction = value;
    }
 
    /** GETTER
     * If false, all other audio will be muted
     */
    @JsonGetter("Mix")
    public Boolean getMix ( ) { 
        return this.mix;
    }
    
    /** SETTER
     * If false, all other audio will be muted
     */
    @JsonSetter("Mix")
    public void setMix (Boolean value) { 
        this.mix = value;
    }
 
}
 