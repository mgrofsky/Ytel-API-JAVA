/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SendDigitInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5744516527494234199L;
    private String callSid;
    private String playDtmf;
    private String responseType = "json";
    private DirectionEnum playDtmfDirection;
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
     * The leg of the call DTMF digits should be sent to
     */
    @JsonGetter("PlayDtmfDirection")
    public DirectionEnum getPlayDtmfDirection ( ) { 
        return this.playDtmfDirection;
    }
    
    /** SETTER
     * The leg of the call DTMF digits should be sent to
     */
    @JsonSetter("PlayDtmfDirection")
    public void setPlayDtmfDirection (DirectionEnum value) { 
        this.playDtmfDirection = value;
    }
 
}
 