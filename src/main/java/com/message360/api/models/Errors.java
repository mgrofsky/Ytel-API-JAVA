/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.message360.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Errors 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5210297617732670653L;
    private List<Error> error;
    /** GETTER
     * Error Description
     */
    @JsonGetter("Error")
    public List<Error> getError ( ) { 
        return this.error;
    }
    
    /** SETTER
     * Error Description
     */
    @JsonSetter("Error")
    public void setError (List<Error> value) { 
        this.error = value;
    }
 
}
 