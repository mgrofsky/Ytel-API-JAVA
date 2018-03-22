/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ViewParticipantInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4770398668955389569L;
    private String conferenceSid;
    private String participantSid;
    private String responseType = "json";
    /** GETTER
     * The unique identifier for a conference object.
     */
    @JsonGetter("ConferenceSid")
    public String getConferenceSid ( ) { 
        return this.conferenceSid;
    }
    
    /** SETTER
     * The unique identifier for a conference object.
     */
    @JsonSetter("ConferenceSid")
    public void setConferenceSid (String value) { 
        this.conferenceSid = value;
    }
 
    /** GETTER
     * The unique identifier for a participant object.
     */
    @JsonGetter("ParticipantSid")
    public String getParticipantSid ( ) { 
        return this.participantSid;
    }
    
    /** SETTER
     * The unique identifier for a participant object.
     */
    @JsonSetter("ParticipantSid")
    public void setParticipantSid (String value) { 
        this.participantSid = value;
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
 