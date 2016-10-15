/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 10/15/2016
 */
package message360.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import message360.*;
import message360.models.*;
import message360.exceptions.*;
import message360.http.client.HttpClient;
import message360.http.client.HttpContext;
import message360.http.request.HttpRequest;
import message360.http.response.HttpResponse;
import message360.http.response.HttpStringResponse;
import message360.http.client.APICallBack;
import message360.controllers.syncwrapper.APICallBackCatcher;

public class PhoneNumberController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static PhoneNumberController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the PhoneNumberController class 
     */
    public static PhoneNumberController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new PhoneNumberController();
            }
        }
        return instance;
    }

    /**
     * Available Phone Number
     * @param    numberType    Required parameter: Number type either SMS,Voice or all
     * @param    areaCode    Required parameter: Phone Number Area Code
     * @param    pageSize    Optional parameter: Page Size
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createAvailablePhoneNumber(
                final String numberType,
                final String areaCode,
                final Integer pageSize,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createAvailablePhoneNumberAsync(numberType, areaCode, pageSize, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Available Phone Number
     * @param    numberType    Required parameter: Number type either SMS,Voice or all
     * @param    areaCode    Required parameter: Phone Number Area Code
     * @param    pageSize    Optional parameter: Page Size
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createAvailablePhoneNumberAsync(
                final String numberType,
                final String areaCode,
                final Integer pageSize,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == numberType)
            throw new NullPointerException("The parameter \"numberType\" is a required parameter and cannot be null.");

        if (null == areaCode)
            throw new NullPointerException("The parameter \"areaCode\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/incomingphone/availablenumber.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5602957762370123458L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4771372407844264211L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5675159726731020221L;
            {
                    put( "NumberType", numberType );
                    put( "AreaCode", areaCode );
                    put( "PageSize", pageSize );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters),
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * List Account's Phone number details
     * @param    page    Optional parameter: Which page of the overall response will be returned. Zero indexed
     * @param    pageSize    Optional parameter: Number of individual resources listed in the response per page
     * @param    numberType    Optional parameter: Example: 
     * @param    friendlyName    Optional parameter: Example: 
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createListNumber(
                final Integer page,
                final Integer pageSize,
                final String numberType,
                final String friendlyName,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createListNumberAsync(page, pageSize, numberType, friendlyName, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * List Account's Phone number details
     * @param    page    Optional parameter: Which page of the overall response will be returned. Zero indexed
     * @param    pageSize    Optional parameter: Number of individual resources listed in the response per page
     * @param    numberType    Optional parameter: Example: 
     * @param    friendlyName    Optional parameter: Example: 
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createListNumberAsync(
                final Integer page,
                final Integer pageSize,
                final String numberType,
                final String friendlyName,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/incomingphone/listnumber.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4856853983209925475L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5587151264570952719L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5096105483712188520L;
            {
                    put( "Page", page );
                    put( "PageSize", pageSize );
                    put( "NumberType", numberType );
                    put( "FriendlyName", friendlyName );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters),
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Release number from account
     * @param    phoneNumber    Required parameter: Phone number to be relase
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createReleaseNumber(
                final String phoneNumber,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createReleaseNumberAsync(phoneNumber, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Release number from account
     * @param    phoneNumber    Required parameter: Phone number to be relase
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createReleaseNumberAsync(
                final String phoneNumber,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == phoneNumber)
            throw new NullPointerException("The parameter \"phoneNumber\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/incomingphone/releasenumber.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5558773917188838928L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4829402065497893348L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5497880268823447945L;
            {
                    put( "PhoneNumber", phoneNumber );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters),
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Buy Phone Number 
     * @param    phoneNumber    Required parameter: Phone number to be purchase
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createBuyNumber(
                final String phoneNumber,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createBuyNumberAsync(phoneNumber, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Buy Phone Number 
     * @param    phoneNumber    Required parameter: Phone number to be purchase
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createBuyNumberAsync(
                final String phoneNumber,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == phoneNumber)
            throw new NullPointerException("The parameter \"phoneNumber\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/incomingphone/buynumber.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4616933729493896459L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4777919749574356390L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5681342721561804799L;
            {
                    put( "PhoneNumber", phoneNumber );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters),
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Get Phone Number Details
     * @param    phoneNumber    Required parameter: Get Phone number Detail
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createViewNumberDetails(
                final String phoneNumber,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createViewNumberDetailsAsync(phoneNumber, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get Phone Number Details
     * @param    phoneNumber    Required parameter: Get Phone number Detail
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createViewNumberDetailsAsync(
                final String phoneNumber,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == phoneNumber)
            throw new NullPointerException("The parameter \"phoneNumber\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/incomingphone/viewnumber.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5228650383383208934L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5586418583180407005L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4686744611593783716L;
            {
                    put( "PhoneNumber", phoneNumber );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters),
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Update Phone Number Details
     * @param    phoneNumber    Required parameter: Example: 
     * @param    friendlyName    Optional parameter: Example: 
     * @param    voiceUrl    Optional parameter: URL requested once the call connects
     * @param    voiceMethod    Optional parameter: Example: 
     * @param    voiceFallbackUrl    Optional parameter: URL requested if the voice URL is not available
     * @param    voiceFallbackMethod    Optional parameter: Example: 
     * @param    hangupCallback    Optional parameter: Example: 
     * @param    hangupCallbackMethod    Optional parameter: Example: 
     * @param    heartbeatUrl    Optional parameter: URL requested once the call connects
     * @param    heartbeatMethod    Optional parameter: URL that can be requested every 60 seconds during the call to notify of elapsed time
     * @param    smsUrl    Optional parameter: URL requested when an SMS is received
     * @param    smsMethod    Optional parameter: Example: 
     * @param    smsFallbackUrl    Optional parameter: URL requested once the call connects
     * @param    smsFallbackMethod    Optional parameter: URL requested if the sms URL is not available
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String updatePhoneNumber(
                final String phoneNumber,
                final String friendlyName,
                final String voiceUrl,
                final HttpMethodEnum voiceMethod,
                final String voiceFallbackUrl,
                final HttpMethodEnum voiceFallbackMethod,
                final String hangupCallback,
                final HttpMethodEnum hangupCallbackMethod,
                final String heartbeatUrl,
                final HttpMethodEnum heartbeatMethod,
                final String smsUrl,
                final HttpMethodEnum smsMethod,
                final String smsFallbackUrl,
                final HttpMethodEnum smsFallbackMethod,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        updatePhoneNumberAsync(phoneNumber, friendlyName, voiceUrl, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Update Phone Number Details
     * @param    phoneNumber    Required parameter: Example: 
     * @param    friendlyName    Optional parameter: Example: 
     * @param    voiceUrl    Optional parameter: URL requested once the call connects
     * @param    voiceMethod    Optional parameter: Example: 
     * @param    voiceFallbackUrl    Optional parameter: URL requested if the voice URL is not available
     * @param    voiceFallbackMethod    Optional parameter: Example: 
     * @param    hangupCallback    Optional parameter: Example: 
     * @param    hangupCallbackMethod    Optional parameter: Example: 
     * @param    heartbeatUrl    Optional parameter: URL requested once the call connects
     * @param    heartbeatMethod    Optional parameter: URL that can be requested every 60 seconds during the call to notify of elapsed time
     * @param    smsUrl    Optional parameter: URL requested when an SMS is received
     * @param    smsMethod    Optional parameter: Example: 
     * @param    smsFallbackUrl    Optional parameter: URL requested once the call connects
     * @param    smsFallbackMethod    Optional parameter: URL requested if the sms URL is not available
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void updatePhoneNumberAsync(
                final String phoneNumber,
                final String friendlyName,
                final String voiceUrl,
                final HttpMethodEnum voiceMethod,
                final String voiceFallbackUrl,
                final HttpMethodEnum voiceFallbackMethod,
                final String hangupCallback,
                final HttpMethodEnum hangupCallbackMethod,
                final String heartbeatUrl,
                final HttpMethodEnum heartbeatMethod,
                final String smsUrl,
                final HttpMethodEnum smsMethod,
                final String smsFallbackUrl,
                final HttpMethodEnum smsFallbackMethod,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == phoneNumber)
            throw new NullPointerException("The parameter \"phoneNumber\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/incomingphone/updatenumber.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5261163729257314426L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5104749737740028914L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4916011006963223871L;
            {
                    put( "PhoneNumber", phoneNumber );
                    put( "FriendlyName", friendlyName );
                    put( "VoiceUrl", voiceUrl );
                    put( "VoiceMethod", (null != voiceMethod) ? voiceMethod.value() : null );
                    put( "VoiceFallbackUrl", voiceFallbackUrl );
                    put( "VoiceFallbackMethod", (null != voiceFallbackMethod) ? voiceFallbackMethod.value() : null );
                    put( "HangupCallback", hangupCallback );
                    put( "HangupCallbackMethod", (null != hangupCallbackMethod) ? hangupCallbackMethod.value() : null );
                    put( "HeartbeatUrl", heartbeatUrl );
                    put( "HeartbeatMethod", (null != heartbeatMethod) ? heartbeatMethod.value() : null );
                    put( "SmsUrl", smsUrl );
                    put( "SmsMethod", (null != smsMethod) ? smsMethod.value() : null );
                    put( "SmsFallbackUrl", smsFallbackUrl );
                    put( "SmsFallbackMethod", (null != smsFallbackMethod) ? smsFallbackMethod.value() : null );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters),
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}