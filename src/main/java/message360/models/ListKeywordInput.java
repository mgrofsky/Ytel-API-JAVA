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
    private static final long serialVersionUID = 5298234997786519390L;
    private String responseType = "json";
    private Integer page = 1;
    private Integer pagesize = 10;
    private String keyword;
    private Integer shortcode;
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
     * Number of individual resources listed in the response per page
     */
    @JsonGetter("pagesize")
    public Integer getPagesize ( ) { 
        return this.pagesize;
    }
    
    /** SETTER
     * Number of individual resources listed in the response per page
     */
    @JsonSetter("pagesize")
    public void setPagesize (Integer value) { 
        this.pagesize = value;
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
     * Only list keywords of shortcode
     */
    @JsonGetter("Shortcode")
    public Integer getShortcode ( ) { 
        return this.shortcode;
    }
    
    /** SETTER
     * Only list keywords of shortcode
     */
    @JsonSetter("Shortcode")
    public void setShortcode (Integer value) { 
        this.shortcode = value;
    }
 
}
 