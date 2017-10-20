/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListKeywordInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4708864583852390734L;
    private String responseType;
    private String page;
    private String pageSize;
    private String keyword;
    private String shortcode;
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
 
    /** GETTER
     * Which page of the overall response will be returned. Zero indexed
     */
    @JsonGetter("Page")
    public String getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * Which page of the overall response will be returned. Zero indexed
     */
    @JsonSetter("Page")
    public void setPage (String value) { 
        this.page = value;
    }
 
    /** GETTER
     * Number of individual resources listed in the response per page
     */
    @JsonGetter("PageSize")
    public String getPageSize ( ) { 
        return this.pageSize;
    }
    
    /** SETTER
     * Number of individual resources listed in the response per page
     */
    @JsonSetter("PageSize")
    public void setPageSize (String value) { 
        this.pageSize = value;
    }
 
    /** GETTER
     * Only list keywords of keyword
     */
    @JsonGetter("Keyword")
    public String getKeyword ( ) { 
        return this.keyword;
    }
    
    /** SETTER
     * Only list keywords of keyword
     */
    @JsonSetter("Keyword")
    public void setKeyword (String value) { 
        this.keyword = value;
    }
 
    /** GETTER
     * Only list keywords of shortcode MAKE REQUEST
     */
    @JsonGetter("Shortcode")
    public String getShortcode ( ) { 
        return this.shortcode;
    }
    
    /** SETTER
     * Only list keywords of shortcode MAKE REQUEST
     */
    @JsonSetter("Shortcode")
    public void setShortcode (String value) { 
        this.shortcode = value;
    }
 
}
 