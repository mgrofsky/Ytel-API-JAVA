/*
 * YtelAPIV3Lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.controllers;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ytel.api.models.*;
import com.ytel.api.exceptions.*;
import com.ytel.api.APIHelper;
import com.ytel.api.Configuration;
import com.ytel.api.testing.TestHelper;
import com.ytel.api.controllers.CallController;

import com.fasterxml.jackson.core.type.TypeReference;

public class CallControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static CallController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getCall();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * A list of calls associated with your Ytel account
     * @throws Throwable
     */
    @Test
    public void testTestListCalls() throws Throwable {
        // Parameters for the API call
        Integer page = null;
        Integer pageSize = null;
        String to = null;
        String from = null;
        String dateCreated = null;

        // Set callback and perform API call
        String result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.createListCalls(page, pageSize, to, from, dateCreated);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

}
