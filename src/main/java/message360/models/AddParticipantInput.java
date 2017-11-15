/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AddParticipantInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5441050754380904944L;
    private String conferencesid;
    private String participantnumber;
    private String responseType = "json";
    private Boolean muted;
    private Boolean deaf;
    /** GETTER
     * Unique Conference Sid
     */
    @JsonGetter("conferencesid")
    public String getConferencesid ( ) { 
        return this.conferencesid;
    }
    
    /** SETTER
     * Unique Conference Sid
     */
    @JsonSetter("conferencesid")
    public void setConferencesid (String value) { 
        this.conferencesid = value;
    }
 
    /** GETTER
     * Particiant Number
     */
    @JsonGetter("participantnumber")
    public String getParticipantnumber ( ) { 
        return this.participantnumber;
    }
    
    /** SETTER
     * Particiant Number
     */
    @JsonSetter("participantnumber")
    public void setParticipantnumber (String value) { 
        this.participantnumber = value;
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
     * add muted
     */
    @JsonGetter("muted")
    public Boolean getMuted ( ) { 
        return this.muted;
    }
    
    /** SETTER
     * add muted
     */
    @JsonSetter("muted")
    public void setMuted (Boolean value) { 
        this.muted = value;
    }
 
    /** GETTER
     * add without volume
     */
    @JsonGetter("deaf")
    public Boolean getDeaf ( ) { 
        return this.deaf;
    }
    
    /** SETTER
     * add without volume
     */
    @JsonSetter("deaf")
    public void setDeaf (Boolean value) { 
        this.deaf = value;
    }
 
}
 