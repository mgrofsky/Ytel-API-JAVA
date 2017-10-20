/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListInboundSMSInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5665682750271152508L;
    private String responseType = "json";
    private Integer page;
    private Integer pagesize = 10;
    private String from;
    private String shortcode;
    private String dateReceived;
    private String pagesize;
    private String to;
    private Date dateSent;
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
    @JsonGetter("page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * Which page of the overall response will be returned. Zero indexed
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
     * From Number to Inbound ShortCode
     */
    @JsonGetter("from")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * From Number to Inbound ShortCode
     */
    @JsonSetter("from")
    public void setFrom (String value) { 
        this.from = value;
    }
 
    /** GETTER
     * Only list messages sent to this Short Code
     */
    @JsonGetter("Shortcode")
    public String getShortcode ( ) { 
        return this.shortcode;
    }
    
    /** SETTER
     * Only list messages sent to this Short Code
     */
    @JsonSetter("Shortcode")
    public void setShortcode (String value) { 
        this.shortcode = value;
    }
 
    /** GETTER
     * Only list messages sent with the specified date
     */
    @JsonGetter("DateReceived")
    public String getDateReceived ( ) { 
        return this.dateReceived;
    }
    
    /** SETTER
     * Only list messages sent with the specified date
     */
    @JsonSetter("DateReceived")
    public void setDateReceived (String value) { 
        this.dateReceived = value;
    }
 
    /** GETTER
     * Number of individual resources listed in the response per page
     */
    @JsonGetter("pagesize")
    public String getPagesize ( ) { 
        return this.pagesize;
    }
    
    /** SETTER
     * Number of individual resources listed in the response per page
     */
    @JsonSetter("pagesize")
    public void setPagesize (String value) { 
        this.pagesize = value;
    }
 
    /** GETTER
     * To Number to get Inbound SMS
     */
    @JsonGetter("to")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * To Number to get Inbound SMS
     */
    @JsonSetter("to")
    public void setTo (String value) { 
        this.to = value;
    }
 
    /** GETTER
     * Filter sms message objects by this date.
     */
    @JsonGetter("DateSent")
    public Date getDateSent ( ) { 
        return this.dateSent;
    }
    
    /** SETTER
     * Filter sms message objects by this date.
     */
    @JsonSetter("DateSent")
    public void setDateSent (Date value) { 
        this.dateSent = value;
    }
 
}
 