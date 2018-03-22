/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateLetterInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5354985602451536305L;
    private String to;
    private String from;
    private String attachbyid;
    private String file;
    private String color;
    private String responseType = "json";
    private String description;
    private String extraservice;
    private String doublesided;
    private String template;
    private String htmldata;
    /** GETTER
     * The AddressId or an object structured when creating an address by addresses/Create.
     */
    @JsonGetter("to")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * The AddressId or an object structured when creating an address by addresses/Create.
     */
    @JsonSetter("to")
    public void setTo (String value) { 
        this.to = value;
    }
 
    /** GETTER
     * The AddressId or an object structured when creating an address by addresses/Create.
     */
    @JsonGetter("from")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * The AddressId or an object structured when creating an address by addresses/Create.
     */
    @JsonSetter("from")
    public void setFrom (String value) { 
        this.from = value;
    }
 
    /** GETTER
     * Set an existing letter by attaching its LetterId.
     */
    @JsonGetter("attachbyid")
    public String getAttachbyid ( ) { 
        return this.attachbyid;
    }
    
    /** SETTER
     * Set an existing letter by attaching its LetterId.
     */
    @JsonSetter("attachbyid")
    public void setAttachbyid (String value) { 
        this.attachbyid = value;
    }
 
    /** GETTER
     * File can be a 8.5"x11" PDF uploaded file or URL that links to a file.
     */
    @JsonGetter("file")
    public String getFile ( ) { 
        return this.file;
    }
    
    /** SETTER
     * File can be a 8.5"x11" PDF uploaded file or URL that links to a file.
     */
    @JsonSetter("file")
    public void setFile (String value) { 
        this.file = value;
    }
 
    /** GETTER
     * Specify if letter should be printed in color.
     */
    @JsonGetter("color")
    public String getColor ( ) { 
        return this.color;
    }
    
    /** SETTER
     * Specify if letter should be printed in color.
     */
    @JsonSetter("color")
    public void setColor (String value) { 
        this.color = value;
    }
 
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
     * A description for the letter.
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * A description for the letter.
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Add an extra service to your letter. Options are "certified" or "registered". Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50.
     */
    @JsonGetter("extraservice")
    public String getExtraservice ( ) { 
        return this.extraservice;
    }
    
    /** SETTER
     * Add an extra service to your letter. Options are "certified" or "registered". Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50.
     */
    @JsonSetter("extraservice")
    public void setExtraservice (String value) { 
        this.extraservice = value;
    }
 
    /** GETTER
     * Specify if letter should be printed on both sides.
     */
    @JsonGetter("doublesided")
    public String getDoublesided ( ) { 
        return this.doublesided;
    }
    
    /** SETTER
     * Specify if letter should be printed on both sides.
     */
    @JsonSetter("doublesided")
    public void setDoublesided (String value) { 
        this.doublesided = value;
    }
 
    /** GETTER
     * Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page.
     */
    @JsonGetter("template")
    public String getTemplate ( ) { 
        return this.template;
    }
    
    /** SETTER
     * Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page.
     */
    @JsonSetter("template")
    public void setTemplate (String value) { 
        this.template = value;
    }
 
    /** GETTER
     * A string value that contains HTML markup.
     */
    @JsonGetter("htmldata")
    public String getHtmldata ( ) { 
        return this.htmldata;
    }
    
    /** SETTER
     * A string value that contains HTML markup.
     */
    @JsonSetter("htmldata")
    public void setHtmldata (String value) { 
        this.htmldata = value;
    }
 
}
 