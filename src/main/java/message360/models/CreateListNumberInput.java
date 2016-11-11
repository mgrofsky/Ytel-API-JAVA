/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 11/11/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateListNumberInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5043377538892316737L;
    private Integer page;
    private Integer pageSize;
    private String numberType;
    private String friendlyName;
    private String responseType = "json";
    /** GETTER
     * Which page of the overall response will be returned. Zero indexed
     */
    @JsonGetter("Page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * Which page of the overall response will be returned. Zero indexed
     */
    @JsonSetter("Page")
    public void setPage (Integer value) { 
        this.page = value;
    }
 
    /** GETTER
     * Number of individual resources listed in the response per page
     */
    @JsonGetter("PageSize")
    public Integer getPageSize ( ) { 
        return this.pageSize;
    }
    
    /** SETTER
     * Number of individual resources listed in the response per page
     */
    @JsonSetter("PageSize")
    public void setPageSize (Integer value) { 
        this.pageSize = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("NumberType")
    public String getNumberType ( ) { 
        return this.numberType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("NumberType")
    public void setNumberType (String value) { 
        this.numberType = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("FriendlyName")
    public String getFriendlyName ( ) { 
        return this.friendlyName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("FriendlyName")
    public void setFriendlyName (String value) { 
        this.friendlyName = value;
    }
 
    /** GETTER
     * Response format, xml or json
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response format, xml or json
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
    }
 
}
 