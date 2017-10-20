/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ErrorModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5182990462472254033L;
    private String code;
    private String message;
    private List<String> moreInfo;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Code")
    public void setCode (String value) { 
        this.code = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Message")
    public void setMessage (String value) { 
        this.message = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MoreInfo")
    public List<String> getMoreInfo ( ) { 
        return this.moreInfo;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MoreInfo")
    public void setMoreInfo (List<String> value) { 
        this.moreInfo = value;
    }
 
}
 