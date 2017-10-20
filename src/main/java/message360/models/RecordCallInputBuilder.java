/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class RecordCallInputBuilder {
    //the instance to build
    private RecordCallInput recordCallInput;

    /**
     * Default constructor to initialize the instance
     */
    public RecordCallInputBuilder() {
        recordCallInput = new RecordCallInput();
    }

    /**
     * The unique identifier of each call resource
     */
    public RecordCallInputBuilder callSid(String callSid) {
        recordCallInput.setCallSid(callSid);
        return this;
    }

    /**
     * Set true to initiate recording or false to terminate recording
     */
    public RecordCallInputBuilder record(boolean record) {
        recordCallInput.setRecord(record);
        return this;
    }

    /**
     * Response format, xml or json
     */
    public RecordCallInputBuilder responseType(String responseType) {
        recordCallInput.setResponseType(responseType);
        return this;
    }

    /**
     * The leg of the call to record
     */
    public RecordCallInputBuilder direction(DirectionEnum direction) {
        recordCallInput.setDirection(direction);
        return this;
    }

    /**
     * Time in seconds the recording duration should not exceed
     */
    public RecordCallInputBuilder timeLimit(Integer timeLimit) {
        recordCallInput.setTimeLimit(timeLimit);
        return this;
    }

    /**
     * URL consulted after the recording completes
     */
    public RecordCallInputBuilder callBackUrl(String callBackUrl) {
        recordCallInput.setCallBackUrl(callBackUrl);
        return this;
    }

    /**
     * Format of the recording file. Can be .mp3 or .wav
     */
    public RecordCallInputBuilder fileformat(AudioFormatEnum fileformat) {
        recordCallInput.setFileformat(fileformat);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RecordCallInput build() {
        return recordCallInput;
    }
}