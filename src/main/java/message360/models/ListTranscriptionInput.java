/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListTranscriptionInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5568823046269395348L;
    private String responseType = "json";
    private Integer page = 1;
    private Integer pageSize = 10;
    private StatusEnum status;
    private String dateTranscribed;
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
     * page number
     */
    @JsonGetter("Page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * page number
     */
    @JsonSetter("Page")
    public void setPage (Integer value) { 
        this.page = value;
    }
 
    /** GETTER
     * Amount of data per page
     */
    @JsonGetter("PageSize")
    public Integer getPageSize ( ) { 
        return this.pageSize;
    }
    
    /** SETTER
     * Amount of data per page
     */
    @JsonSetter("PageSize")
    public void setPageSize (Integer value) { 
        this.pageSize = value;
    }
 
    /** GETTER
     * Transcription status
     */
    @JsonGetter("Status")
    public StatusEnum getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Transcription status
     */
    @JsonSetter("Status")
    public void setStatus (StatusEnum value) { 
        this.status = value;
    }
 
    /** GETTER
     * Transcription date
     */
    @JsonGetter("DateTranscribed")
    public String getDateTranscribed ( ) { 
        return this.dateTranscribed;
    }
    
    /** SETTER
     * Transcription date
     */
    @JsonSetter("DateTranscribed")
    public void setDateTranscribed (String value) { 
        this.dateTranscribed = value;
    }
 
}
 