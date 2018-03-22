/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AddParticipantInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5662308387301836632L;
    private String conferenceSid;
    private String participantNumber;
    private String responseType = "json";
    private Boolean muted;
    private Boolean deaf;
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
     * The phone number of the participant to be added.
     */
    @JsonGetter("ParticipantNumber")
    public String getParticipantNumber ( ) { 
        return this.participantNumber;
    }
    
    /** SETTER
     * The phone number of the participant to be added.
     */
    @JsonSetter("ParticipantNumber")
    public void setParticipantNumber (String value) { 
        this.participantNumber = value;
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
     * Specifies if participant should be muted.
     */
    @JsonGetter("Muted")
    public Boolean getMuted ( ) { 
        return this.muted;
    }
    
    /** SETTER
     * Specifies if participant should be muted.
     */
    @JsonSetter("Muted")
    public void setMuted (Boolean value) { 
        this.muted = value;
    }
 
    /** GETTER
     * Specifies if the participant should hear audio in the conference.
     */
    @JsonGetter("Deaf")
    public Boolean getDeaf ( ) { 
        return this.deaf;
    }
    
    /** SETTER
     * Specifies if the participant should hear audio in the conference.
     */
    @JsonSetter("Deaf")
    public void setDeaf (Boolean value) { 
        this.deaf = value;
    }
 
}
 