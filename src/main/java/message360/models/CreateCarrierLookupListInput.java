/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 11/11/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateCarrierLookupListInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5102984684202551600L;
    private String page;
    private String pagesize;
    private String responseType = "json";
    /** GETTER
     * Page Number
     */
    @JsonGetter("page")
    public String getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * Page Number
     */
    @JsonSetter("page")
    public void setPage (String value) { 
        this.page = value;
    }
 
    /** GETTER
     * Page Size
     */
    @JsonGetter("pagesize")
    public String getPagesize ( ) { 
        return this.pagesize;
    }
    
    /** SETTER
     * Page Size
     */
    @JsonSetter("pagesize")
    public void setPagesize (String value) { 
        this.pagesize = value;
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
 