/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MessageModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4684397163264231577L;
    private String apiVersion;
    private String messageSid;
    private String from;
    private String to;
    private String messagePrice;
    private String body;
    private String dateSent;
    private String status;
    private String templateId;
    private TemplateDataModel templateData;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ApiVersion")
    public String getApiVersion ( ) { 
        return this.apiVersion;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ApiVersion")
    public void setApiVersion (String value) { 
        this.apiVersion = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MessageSid")
    public String getMessageSid ( ) { 
        return this.messageSid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MessageSid")
    public void setMessageSid (String value) { 
        this.messageSid = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("From")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("From")
    public void setFrom (String value) { 
        this.from = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("To")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("To")
    public void setTo (String value) { 
        this.to = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MessagePrice")
    public String getMessagePrice ( ) { 
        return this.messagePrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MessagePrice")
    public void setMessagePrice (String value) { 
        this.messagePrice = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Body")
    public String getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Body")
    public void setBody (String value) { 
        this.body = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("DateSent")
    public String getDateSent ( ) { 
        return this.dateSent;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("DateSent")
    public void setDateSent (String value) { 
        this.dateSent = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TemplateId")
    public String getTemplateId ( ) { 
        return this.templateId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TemplateId")
    public void setTemplateId (String value) { 
        this.templateId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TemplateData")
    public TemplateDataModel getTemplateData ( ) { 
        return this.templateData;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TemplateData")
    public void setTemplateData (TemplateDataModel value) { 
        this.templateData = value;
    }
 
}
 