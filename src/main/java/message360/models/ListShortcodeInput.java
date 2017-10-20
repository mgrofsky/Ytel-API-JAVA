/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListShortcodeInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5397376312690097780L;
    private String responseType;
    private String shortcode;
    private String to;
    private Date dateSent;
    private Integer page;
    private Integer pageSize;
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
     * Only list messages sent from this Short Code
     */
    @JsonGetter("Shortcode")
    public String getShortcode ( ) { 
        return this.shortcode;
    }
    
    /** SETTER
     * Only list messages sent from this Short Code
     */
    @JsonSetter("Shortcode")
    public void setShortcode (String value) { 
        this.shortcode = value;
    }
 
    /** GETTER
     * Only list messages sent to this number
     */
    @JsonGetter("To")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * Only list messages sent to this number
     */
    @JsonSetter("To")
    public void setTo (String value) { 
        this.to = value;
    }
 
    /** GETTER
     * Only list messages sent with the specified date
     */
    @JsonGetter("DateSent")
    public Date getDateSent ( ) { 
        return this.dateSent;
    }
    
    /** SETTER
     * Only list messages sent with the specified date
     */
    @JsonSetter("DateSent")
    public void setDateSent (Date value) { 
        this.dateSent = value;
    }
 
    /** GETTER
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    @JsonGetter("Page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    @JsonSetter("Page")
    public void setPage (Integer value) { 
        this.page = value;
    }
 
    /** GETTER
     * The count of objects to return per page.
     */
    @JsonGetter("PageSize")
    public Integer getPageSize ( ) { 
        return this.pageSize;
    }
    
    /** SETTER
     * The count of objects to return per page.
     */
    @JsonSetter("PageSize")
    public void setPageSize (Integer value) { 
        this.pageSize = value;
    }
 
}
 