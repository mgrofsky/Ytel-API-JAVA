/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.message360.api.models;

import java.util.*;

public class CreateCallsRecordcallsInputBuilder {
    //the instance to build
    private CreateCallsRecordcallsInput createCallsRecordcallsInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCallsRecordcallsInputBuilder() {
        createCallsRecordcallsInput = new CreateCallsRecordcallsInput();
    }

    /**
     * The unique identifier of each call resource
     */
    public CreateCallsRecordcallsInputBuilder callSid(String callSid) {
        createCallsRecordcallsInput.setCallSid(callSid);
        return this;
    }

    /**
     * Set true to initiate recording or false to terminate recording
     */
    public CreateCallsRecordcallsInputBuilder record(boolean record) {
        createCallsRecordcallsInput.setRecord(record);
        return this;
    }

    /**
     * The leg of the call to record
     */
    public CreateCallsRecordcallsInputBuilder direction(DirectionEnum direction) {
        createCallsRecordcallsInput.setDirection(direction);
        return this;
    }

    /**
     * Time in seconds the recording duration should not exceed
     */
    public CreateCallsRecordcallsInputBuilder timeLimit(Integer timeLimit) {
        createCallsRecordcallsInput.setTimeLimit(timeLimit);
        return this;
    }

    /**
     * URL consulted after the recording completes
     */
    public CreateCallsRecordcallsInputBuilder callBackUrl(String callBackUrl) {
        createCallsRecordcallsInput.setCallBackUrl(callBackUrl);
        return this;
    }

    /**
     * Format of the recording file. Can be .mp3 or .wav
     */
    public CreateCallsRecordcallsInputBuilder fileformat(FileformatEnum fileformat) {
        createCallsRecordcallsInput.setFileformat(fileformat);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCallsRecordcallsInput build() {
        return createCallsRecordcallsInput;
    }
}