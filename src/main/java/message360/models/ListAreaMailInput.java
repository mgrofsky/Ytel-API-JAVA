/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListAreaMailInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5347115461285105768L;
    private String responseType = "json";
    private Integer page = 1;
    private Integer pagesize = 10;
    private String areamailsid;
    private String dateCreated;
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
 
    /** GETTER
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    @JsonGetter("page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    @JsonSetter("page")
    public void setPage (Integer value) { 
        this.page = value;
    }
 
    /** GETTER
     * The count of objects to return per page.
     */
    @JsonGetter("pagesize")
    public Integer getPagesize ( ) { 
        return this.pagesize;
    }
    
    /** SETTER
     * The count of objects to return per page.
     */
    @JsonSetter("pagesize")
    public void setPagesize (Integer value) { 
        this.pagesize = value;
    }
 
    /** GETTER
     * The unique identifier for an AreaMail object.
     */
    @JsonGetter("areamailsid")
    public String getAreamailsid ( ) { 
        return this.areamailsid;
    }
    
    /** SETTER
     * The unique identifier for an AreaMail object.
     */
    @JsonSetter("areamailsid")
    public void setAreamailsid (String value) { 
        this.areamailsid = value;
    }
 
    /** GETTER
     * The date the AreaMail was created.
     */
    @JsonGetter("dateCreated")
    public String getDateCreated ( ) { 
        return this.dateCreated;
    }
    
    /** SETTER
     * The date the AreaMail was created.
     */
    @JsonSetter("dateCreated")
    public void setDateCreated (String value) { 
        this.dateCreated = value;
    }
 
}
 