/*
 * YtelAPIV3Lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum ProductCode30Enum {
    ALL, //TODO: Write general description for this element
    ENUM_1, //TODO: Write general description for this element
    ENUM_2, //TODO: Write general description for this element
    ENUM_3, //TODO: Write general description for this element
    ENUM_4, //TODO: Write general description for this element
    TRANSCRIPTION, //TODO: Write general description for this element
    EMAIL, //TODO: Write general description for this element
    CONFERENCE, //TODO: Write general description for this element
    CARRIER, //TODO: Write general description for this element
    ENUM_9, //TODO: Write general description for this element
    ENUM_10, //TODO: Write general description for this element
    ENUM_11, //TODO: Write general description for this element
    ENUM_12, //TODO: Write general description for this element
    ENUM_13; //TODO: Write general description for this element

    private static TreeMap<Integer, ProductCode30Enum> valueMap = new TreeMap<Integer, ProductCode30Enum>();
    private Integer value;

    static {
        ALL.value = 0;
        ENUM_1.value = 1;
        ENUM_2.value = 2;
        ENUM_3.value = 3;
        ENUM_4.value = 4;
        TRANSCRIPTION.value = 5;
        EMAIL.value = 6;
        CONFERENCE.value = 7;
        CARRIER.value = 8;
        ENUM_9.value = 9;
        ENUM_10.value = 10;
        ENUM_11.value = 11;
        ENUM_12.value = 12;
        ENUM_13.value = 13;

        valueMap.put(0, ALL);
        valueMap.put(1, ENUM_1);
        valueMap.put(2, ENUM_2);
        valueMap.put(3, ENUM_3);
        valueMap.put(4, ENUM_4);
        valueMap.put(5, TRANSCRIPTION);
        valueMap.put(6, EMAIL);
        valueMap.put(7, CONFERENCE);
        valueMap.put(8, CARRIER);
        valueMap.put(9, ENUM_9);
        valueMap.put(10, ENUM_10);
        valueMap.put(11, ENUM_11);
        valueMap.put(12, ENUM_12);
        valueMap.put(13, ENUM_13);
    }

    /**
     * Returns the enum member associated with the given integer value
     * @return The enum member against the given integer value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ProductCode30Enum fromInteger(Integer toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the integer value associated with the enum member
     * @return The integer value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public Integer value() {
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
     * Convert list of ProductCode30Enum values to list of integer values
     * @param toConvert The list of ProductCode30Enum values to convert
     * @return List of representative integer values */
    public static List<Integer> toValue(List<ProductCode30Enum> toConvert) {
        if(toConvert == null)
            return null;
        List<Integer> convertedValues = new ArrayList<Integer>();
        for (ProductCode30Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 