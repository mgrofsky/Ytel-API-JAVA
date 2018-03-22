/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DeleteLetterInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5593077251369543808L;
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
 