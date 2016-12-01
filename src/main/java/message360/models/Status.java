/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/01/2016
 */
package message360.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum Status {
    INPROGRESS, //TODO: Write general description for this element
    SUCCESS, //TODO: Write general description for this element
    FAILURE; //TODO: Write general description for this element

    private static TreeMap<String, Status> valueMap = new TreeMap<String, Status>();
    private String value;

    static {
        INPROGRESS.value = "inprogress";
        SUCCESS.value = "success";
        FAILURE.value = "failure";

        valueMap.put("inprogress", INPROGRESS);
        valueMap.put("success", SUCCESS);
        valueMap.put("failure", FAILURE);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Status fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of Status values to list of string values
     * @param toConvert The list of Status values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<Status> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (Status enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 