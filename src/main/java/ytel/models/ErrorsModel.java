/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ErrorsModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4976415681314080055L;
    private List<ErrorModel> error;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Error")
    public List<ErrorModel> getError ( ) { 
        return this.error;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Error")
    public void setError (List<ErrorModel> value) { 
        this.error = value;
    }
 
}
 