/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TemplateDataModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5126953129442425656L;
    private String companyname;
    private String otpcode;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("companyname")
    public String getCompanyname ( ) { 
        return this.companyname;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("companyname")
    public void setCompanyname (String value) { 
        this.companyname = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("otpcode")
    public String getOtpcode ( ) { 
        return this.otpcode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("otpcode")
    public void setOtpcode (String value) { 
        this.otpcode = value;
    }
 
}
 