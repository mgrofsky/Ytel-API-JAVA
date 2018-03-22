/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MassUpdateNumberInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5086794808971301448L;
    private String phoneNumber;
    private String voiceUrl;
    private String responseType = "json";
    private String friendlyName;
    private HttpActionEnum voiceMethod;
    private String voiceFallbackUrl;
    private HttpActionEnum voiceFallbackMethod;
    private String hangupCallback;
    private HttpActionEnum hangupCallbackMethod;
    private String heartbeatUrl;
    private HttpActionEnum heartbeatMethod;
    private String smsUrl;
    private HttpActionEnum smsMethod;
    private String smsFallbackUrl;
    private HttpActionEnum smsFallbackMethod;
    /** GETTER
     * A valid comma(,) separated Ytel numbers. (E.164 format).
     */
    @JsonGetter("PhoneNumber")
    public String getPhoneNumber ( ) { 
        return this.phoneNumber;
    }
    
    /** SETTER
     * A valid comma(,) separated Ytel numbers. (E.164 format).
     */
    @JsonSetter("PhoneNumber")
    public void setPhoneNumber (String value) { 
        this.phoneNumber = value;
    }
 
    /** GETTER
     * The URL returning InboundXML incoming calls should execute when connected.
     */
    @JsonGetter("VoiceUrl")
    public String getVoiceUrl ( ) { 
        return this.voiceUrl;
    }
    
    /** SETTER
     * The URL returning InboundXML incoming calls should execute when connected.
     */
    @JsonSetter("VoiceUrl")
    public void setVoiceUrl (String value) { 
        this.voiceUrl = value;
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
     * A human-readable value for labeling the number.
     */
    @JsonGetter("FriendlyName")
    public String getFriendlyName ( ) { 
        return this.friendlyName;
    }
    
    /** SETTER
     * A human-readable value for labeling the number.
     */
    @JsonSetter("FriendlyName")
    public void setFriendlyName (String value) { 
        this.friendlyName = value;
    }
 
    /** GETTER
     * Specifies the HTTP method used to request the VoiceUrl once incoming call connects.
     */
    @JsonGetter("VoiceMethod")
    public HttpActionEnum getVoiceMethod ( ) { 
        return this.voiceMethod;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the VoiceUrl once incoming call connects.
     */
    @JsonSetter("VoiceMethod")
    public void setVoiceMethod (HttpActionEnum value) { 
        this.voiceMethod = value;
    }
 
    /** GETTER
     * URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url
     */
    @JsonGetter("VoiceFallbackUrl")
    public String getVoiceFallbackUrl ( ) { 
        return this.voiceFallbackUrl;
    }
    
    /** SETTER
     * URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url
     */
    @JsonSetter("VoiceFallbackUrl")
    public void setVoiceFallbackUrl (String value) { 
        this.voiceFallbackUrl = value;
    }
 
    /** GETTER
     * Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects.
     */
    @JsonGetter("VoiceFallbackMethod")
    public HttpActionEnum getVoiceFallbackMethod ( ) { 
        return this.voiceFallbackMethod;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects.
     */
    @JsonSetter("VoiceFallbackMethod")
    public void setVoiceFallbackMethod (HttpActionEnum value) { 
        this.voiceFallbackMethod = value;
    }
 
    /** GETTER
     * URL that can be requested to receive notification when and how incoming call has ended.
     */
    @JsonGetter("HangupCallback")
    public String getHangupCallback ( ) { 
        return this.hangupCallback;
    }
    
    /** SETTER
     * URL that can be requested to receive notification when and how incoming call has ended.
     */
    @JsonSetter("HangupCallback")
    public void setHangupCallback (String value) { 
        this.hangupCallback = value;
    }
 
    /** GETTER
     * The HTTP method Ytel will use when requesting the HangupCallback URL.
     */
    @JsonGetter("HangupCallbackMethod")
    public HttpActionEnum getHangupCallbackMethod ( ) { 
        return this.hangupCallbackMethod;
    }
    
    /** SETTER
     * The HTTP method Ytel will use when requesting the HangupCallback URL.
     */
    @JsonSetter("HangupCallbackMethod")
    public void setHangupCallbackMethod (HttpActionEnum value) { 
        this.hangupCallbackMethod = value;
    }
 
    /** GETTER
     * URL that can be used to monitor the phone number.
     */
    @JsonGetter("HeartbeatUrl")
    public String getHeartbeatUrl ( ) { 
        return this.heartbeatUrl;
    }
    
    /** SETTER
     * URL that can be used to monitor the phone number.
     */
    @JsonSetter("HeartbeatUrl")
    public void setHeartbeatUrl (String value) { 
        this.heartbeatUrl = value;
    }
 
    /** GETTER
     * The HTTP method Ytel will use when requesting the HeartbeatUrl.
     */
    @JsonGetter("HeartbeatMethod")
    public HttpActionEnum getHeartbeatMethod ( ) { 
        return this.heartbeatMethod;
    }
    
    /** SETTER
     * The HTTP method Ytel will use when requesting the HeartbeatUrl.
     */
    @JsonSetter("HeartbeatMethod")
    public void setHeartbeatMethod (HttpActionEnum value) { 
        this.heartbeatMethod = value;
    }
 
    /** GETTER
     * URL requested when an SMS is received.
     */
    @JsonGetter("SmsUrl")
    public String getSmsUrl ( ) { 
        return this.smsUrl;
    }
    
    /** SETTER
     * URL requested when an SMS is received.
     */
    @JsonSetter("SmsUrl")
    public void setSmsUrl (String value) { 
        this.smsUrl = value;
    }
 
    /** GETTER
     * The HTTP method Ytel will use when requesting the SmsUrl.
     */
    @JsonGetter("SmsMethod")
    public HttpActionEnum getSmsMethod ( ) { 
        return this.smsMethod;
    }
    
    /** SETTER
     * The HTTP method Ytel will use when requesting the SmsUrl.
     */
    @JsonSetter("SmsMethod")
    public void setSmsMethod (HttpActionEnum value) { 
        this.smsMethod = value;
    }
 
    /** GETTER
     * URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
     */
    @JsonGetter("SmsFallbackUrl")
    public String getSmsFallbackUrl ( ) { 
        return this.smsFallbackUrl;
    }
    
    /** SETTER
     * URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
     */
    @JsonSetter("SmsFallbackUrl")
    public void setSmsFallbackUrl (String value) { 
        this.smsFallbackUrl = value;
    }
 
    /** GETTER
     * The HTTP method Ytel will use when URL requested if the SmsUrl is not available.
     */
    @JsonGetter("SmsFallbackMethod")
    public HttpActionEnum getSmsFallbackMethod ( ) { 
        return this.smsFallbackMethod;
    }
    
    /** SETTER
     * The HTTP method Ytel will use when URL requested if the SmsUrl is not available.
     */
    @JsonSetter("SmsFallbackMethod")
    public void setSmsFallbackMethod (HttpActionEnum value) { 
        this.smsFallbackMethod = value;
    }
 
}
 