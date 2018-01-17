/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DeleteLetterInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5417272809577964426L;
    private String lettersid;
    private String responseType = "json";
    /** GETTER
     * The unique identifier for a letter object.
     */
    @JsonGetter("lettersid")
    public String getLettersid ( ) { 
        return this.lettersid;
    }
    
    /** SETTER
     * The unique identifier for a letter object.
     */
    @JsonSetter("lettersid")
    public void setLettersid (String value) { 
        this.lettersid = value;
    }
 
    /** GETTER
     * Response Type either json or xml
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response Type either json or xml
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
    }
 
}
 