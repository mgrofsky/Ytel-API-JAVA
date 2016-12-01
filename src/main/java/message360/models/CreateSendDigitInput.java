/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/01/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateSendDigitInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4896704381853924603L;
    private String callSid;
    private String playDtmf;
    private Direction playDtmfDirection;
    private String responseType = "json";
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
     * DTMF digits to play to the call. 0-9, #, *, W, or w
     */
    @JsonGetter("PlayDtmf")
    public String getPlayDtmf ( ) { 
        return this.playDtmf;
    }
    
    /** SETTER
     * DTMF digits to play to the call. 0-9, #, *, W, or w
     */
    @JsonSetter("PlayDtmf")
    public void setPlayDtmf (String value) { 
        this.playDtmf = value;
    }
 
    /** GETTER
     * The leg of the call DTMF digits should be sent to
     */
    @JsonGetter("PlayDtmfDirection")
    public Direction getPlayDtmfDirection ( ) { 
        return this.playDtmfDirection;
    }
    
    /** SETTER
     * The leg of the call DTMF digits should be sent to
     */
    @JsonSetter("PlayDtmfDirection")
    public void setPlayDtmfDirection (Direction value) { 
        this.playDtmfDirection = value;
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
 