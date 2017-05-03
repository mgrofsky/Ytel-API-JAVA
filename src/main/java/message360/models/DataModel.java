/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DataModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5399728922135521016L;
    private String companyname;
    private int otpcode;
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
    public int getOtpcode ( ) { 
        return this.otpcode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("otpcode")
    public void setOtpcode (int value) { 
        this.otpcode = value;
    }
 
}
 