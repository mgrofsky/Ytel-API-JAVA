/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ViewTemplateInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5647936154975443428L;
    private UUID templateId;
    private String responseType = "json";
    /** GETTER
     * The unique identifier for a template object
     */
    @JsonGetter("TemplateId")
    public UUID getTemplateId ( ) { 
        return this.templateId;
    }
    
    /** SETTER
     * The unique identifier for a template object
     */
    @JsonSetter("TemplateId")
    public void setTemplateId (UUID value) { 
        this.templateId = value;
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
 