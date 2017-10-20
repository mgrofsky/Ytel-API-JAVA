/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListInboundShortcodeInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5394205132944743536L;
    private String responseType;
    private String page;
    private String pageSize;
    private String from;
    private String shortcode;
    private Date dateReceived;
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
     * Only list SMS messages sent from this number
     */
    @JsonGetter("From")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * Only list SMS messages sent from this number
     */
    @JsonSetter("From")
    public void setFrom (String value) { 
        this.from = value;
    }
 
    /** GETTER
     * Only list SMS messages sent to Shortcode
     */
    @JsonGetter("Shortcode")
    public String getShortcode ( ) { 
        return this.shortcode;
    }
    
    /** SETTER
     * Only list SMS messages sent to Shortcode
     */
    @JsonSetter("Shortcode")
    public void setShortcode (String value) { 
        this.shortcode = value;
    }
 
    /** GETTER
     * Only list SMS messages sent in the specified date MAKE REQUEST
     */
    @JsonGetter("DateReceived")
    public Date getDateReceived ( ) { 
        return this.dateReceived;
    }
    
    /** SETTER
     * Only list SMS messages sent in the specified date MAKE REQUEST
     */
    @JsonSetter("DateReceived")
    public void setDateReceived (Date value) { 
        this.dateReceived = value;
    }
 
}
 