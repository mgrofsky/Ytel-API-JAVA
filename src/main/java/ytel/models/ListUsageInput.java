/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListUsageInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5291117354713066693L;
    private String responseType = "json";
    private ProductCodeEnum productCode = ProductCodeEnum.ALL;
    private String startDate = "2016-09-06";
    private String endDate = "2016-09-06";
    private String includeSubAccounts;
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
     * Filter usage results by product type.
     */
    @JsonGetter("ProductCode")
    public ProductCodeEnum getProductCode ( ) { 
        return this.productCode;
    }
    
    /** SETTER
     * Filter usage results by product type.
     */
    @JsonSetter("ProductCode")
    public void setProductCode (ProductCodeEnum value) { 
        this.productCode = value;
    }
 
    /** GETTER
     * Filter usage objects by start date.
     */
    @JsonGetter("startDate")
    public String getStartDate ( ) { 
        return this.startDate;
    }
    
    /** SETTER
     * Filter usage objects by start date.
     */
    @JsonSetter("startDate")
    public void setStartDate (String value) { 
        this.startDate = value;
    }
 
    /** GETTER
     * Filter usage objects by end date.
     */
    @JsonGetter("endDate")
    public String getEndDate ( ) { 
        return this.endDate;
    }
    
    /** SETTER
     * Filter usage objects by end date.
     */
    @JsonSetter("endDate")
    public void setEndDate (String value) { 
        this.endDate = value;
    }
 
    /** GETTER
     * Will include all subaccount usage data
     */
    @JsonGetter("IncludeSubAccounts")
    public String getIncludeSubAccounts ( ) { 
        return this.includeSubAccounts;
    }
    
    /** SETTER
     * Will include all subaccount usage data
     */
    @JsonSetter("IncludeSubAccounts")
    public void setIncludeSubAccounts (String value) { 
        this.includeSubAccounts = value;
    }
 
}
 