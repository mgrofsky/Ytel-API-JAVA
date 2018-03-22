/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import ytel.*;
import ytel.models.*;
import ytel.exceptions.*;
import ytel.http.client.HttpClient;
import ytel.http.client.HttpContext;
import ytel.http.request.HttpRequest;
import ytel.http.response.HttpResponse;
import ytel.http.response.HttpStringResponse;
import ytel.http.client.APICallBack;
import ytel.controllers.syncwrapper.APICallBackCatcher;

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
     * Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.
     * @param    AvailablePhoneNumberInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String availablePhoneNumber(
                final AvailablePhoneNumberInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        availablePhoneNumberAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.
     * @param    AvailablePhoneNumberInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void availablePhoneNumberAsync(
                final AvailablePhoneNumberInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getNumbertype())
            throw new NullPointerException("The property \"Numbertype\" in the input object cannot be null.");

        if (null == input.getAreacode())
            throw new NullPointerException("The property \"Areacode\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/incomingphone/availablenumber.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5725142868752844281L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4795988937761405136L;
            {
                    put( "user-agent", "ytel-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4728124447472175226L;
            {
                    put( "numbertype", (input.getNumbertype() != null) ? input.getNumbertype().value() : null );
                    put( "areacode", input.getAreacode() );
                    put( "pagesize", input.getPagesize() );
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
     * Remove a purchased Ytel number from your account.
     * @param    MassReleaseNumberInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String massReleaseNumber(
                final MassReleaseNumberInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        massReleaseNumberAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Remove a purchased Ytel number from your account.
     * @param    MassReleaseNumberInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void massReleaseNumberAsync(
                final MassReleaseNumberInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getPhoneNumber())
            throw new NullPointerException("The property \"PhoneNumber\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/incomingphone/massreleasenumber.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5509460565447613508L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4737089098758607796L;
            {
                    put( "user-agent", "ytel-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4664146224101818317L;
            {
                    put( "PhoneNumber", input.getPhoneNumber() );
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
     * Retrieve the details for a phone number by its number.
     * @param    ViewNumberDetailsInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String viewNumberDetails(
                final ViewNumberDetailsInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        viewNumberDetailsAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Retrieve the details for a phone number by its number.
     * @param    ViewNumberDetailsInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void viewNumberDetailsAsync(
                final ViewNumberDetailsInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getPhoneNumber())
            throw new NullPointerException("The property \"PhoneNumber\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/incomingphone/viewnumber.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4611809779844384567L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4669791375319590672L;
            {
                    put( "user-agent", "ytel-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5487245424144116675L;
            {
                    put( "PhoneNumber", input.getPhoneNumber() );
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
     * Remove a purchased Ytel number from your account.
     * @param    ReleaseNumberInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String releaseNumber(
                final ReleaseNumberInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        releaseNumberAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Remove a purchased Ytel number from your account.
     * @param    ReleaseNumberInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void releaseNumberAsync(
                final ReleaseNumberInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getPhoneNumber())
            throw new NullPointerException("The property \"PhoneNumber\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/incomingphone/releasenumber.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4706378754073612583L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5489331641520056504L;
            {
                    put( "user-agent", "ytel-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5166558299970481100L;
            {
                    put( "PhoneNumber", input.getPhoneNumber() );
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
     * Purchase a phone number to be used with your Ytel account
     * @param    BuyNumberInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String buyNumber(
                final BuyNumberInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        buyNumberAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Purchase a phone number to be used with your Ytel account
     * @param    BuyNumberInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void buyNumberAsync(
                final BuyNumberInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getPhoneNumber())
            throw new NullPointerException("The property \"PhoneNumber\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/incomingphone/buynumber.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4736196912878198859L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5359074814247020339L;
            {
                    put( "user-agent", "ytel-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5000928349928939015L;
            {
                    put( "PhoneNumber", input.getPhoneNumber() );
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
     * Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
     * @param    UpdatePhoneNumberInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String updatePhoneNumber(
                final UpdatePhoneNumberInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        updatePhoneNumberAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
     * @param    UpdatePhoneNumberInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void updatePhoneNumberAsync(
                final UpdatePhoneNumberInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getPhoneNumber())
            throw new NullPointerException("The property \"PhoneNumber\" in the input object cannot be null.");

        if (null == input.getVoiceUrl())
            throw new NullPointerException("The property \"VoiceUrl\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/incomingphone/updatenumber.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5367268075994675173L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5356800049644835894L;
            {
                    put( "user-agent", "ytel-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5736636053687986204L;
            {
                    put( "PhoneNumber", input.getPhoneNumber() );
                    put( "VoiceUrl", input.getVoiceUrl() );
                    put( "FriendlyName", input.getFriendlyName() );
                    put( "VoiceMethod", (input.getVoiceMethod() != null) ? input.getVoiceMethod().value() : null );
                    put( "VoiceFallbackUrl", input.getVoiceFallbackUrl() );
                    put( "VoiceFallbackMethod", (input.getVoiceFallbackMethod() != null) ? input.getVoiceFallbackMethod().value() : null );
                    put( "HangupCallback", input.getHangupCallback() );
                    put( "HangupCallbackMethod", (input.getHangupCallbackMethod() != null) ? input.getHangupCallbackMethod().value() : null );
                    put( "HeartbeatUrl", input.getHeartbeatUrl() );
                    put( "HeartbeatMethod", (input.getHeartbeatMethod() != null) ? input.getHeartbeatMethod().value() : null );
                    put( "SmsUrl", input.getSmsUrl() );
                    put( "SmsMethod", (input.getSmsMethod() != null) ? input.getSmsMethod().value() : null );
                    put( "SmsFallbackUrl", input.getSmsFallbackUrl() );
                    put( "SmsFallbackMethod", (input.getSmsFallbackMethod() != null) ? input.getSmsFallbackMethod().value() : null );
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
     * Transfer phone number that has been purchased for from one account to another account.
     * @param    TransferNumberInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String transferNumber(
                final TransferNumberInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        transferNumberAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Transfer phone number that has been purchased for from one account to another account.
     * @param    TransferNumberInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void transferNumberAsync(
                final TransferNumberInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getPhonenumber())
            throw new NullPointerException("The property \"Phonenumber\" in the input object cannot be null.");

        if (null == input.getFromaccountsid())
            throw new NullPointerException("The property \"Fromaccountsid\" in the input object cannot be null.");

        if (null == input.getToaccountsid())
            throw new NullPointerException("The property \"Toaccountsid\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/incomingphone/transferphonenumbers.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4628154934091408429L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5665656778034253848L;
            {
                    put( "user-agent", "ytel-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4968842799697420932L;
            {
                    put( "phonenumber", input.getPhonenumber() );
                    put( "fromaccountsid", input.getFromaccountsid() );
                    put( "toaccountsid", input.getToaccountsid() );
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
     * Retrieve a list of purchased phones numbers associated with your Ytel account.
     * @param    ListNumberInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String listNumber(
                final ListNumberInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        listNumberAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Retrieve a list of purchased phones numbers associated with your Ytel account.
     * @param    ListNumberInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void listNumberAsync(
                final ListNumberInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/incomingphone/listnumber.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5666406252437672051L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5179570100282256788L;
            {
                    put( "user-agent", "ytel-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4718020595427819624L;
            {
                    put( "Page", input.getPage() );
                    put( "PageSize", input.getPageSize() );
                    put( "NumberType", (input.getNumberType() != null) ? input.getNumberType().value() : null );
                    put( "FriendlyName", input.getFriendlyName() );
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
     * Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
     * @param    MassUpdateNumberInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String massUpdateNumber(
                final MassUpdateNumberInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        massUpdateNumberAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
     * @param    MassUpdateNumberInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void massUpdateNumberAsync(
                final MassUpdateNumberInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getPhoneNumber())
            throw new NullPointerException("The property \"PhoneNumber\" in the input object cannot be null.");

        if (null == input.getVoiceUrl())
            throw new NullPointerException("The property \"VoiceUrl\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/incomingphone/massupdatenumber.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5599427303784305173L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5370330737093760205L;
            {
                    put( "user-agent", "ytel-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5242677960470053587L;
            {
                    put( "PhoneNumber", input.getPhoneNumber() );
                    put( "VoiceUrl", input.getVoiceUrl() );
                    put( "FriendlyName", input.getFriendlyName() );
                    put( "VoiceMethod", (input.getVoiceMethod() != null) ? input.getVoiceMethod().value() : null );
                    put( "VoiceFallbackUrl", input.getVoiceFallbackUrl() );
                    put( "VoiceFallbackMethod", (input.getVoiceFallbackMethod() != null) ? input.getVoiceFallbackMethod().value() : null );
                    put( "HangupCallback", input.getHangupCallback() );
                    put( "HangupCallbackMethod", (input.getHangupCallbackMethod() != null) ? input.getHangupCallbackMethod().value() : null );
                    put( "HeartbeatUrl", input.getHeartbeatUrl() );
                    put( "HeartbeatMethod", (input.getHeartbeatMethod() != null) ? input.getHeartbeatMethod().value() : null );
                    put( "SmsUrl", input.getSmsUrl() );
                    put( "SmsMethod", (input.getSmsMethod() != null) ? input.getSmsMethod().value() : null );
                    put( "SmsFallbackUrl", input.getSmsFallbackUrl() );
                    put( "SmsFallbackMethod", (input.getSmsFallbackMethod() != null) ? input.getSmsFallbackMethod().value() : null );
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
     * Get DID Score Number
     * @param    GetDIDScoreNumberInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String getDIDScoreNumber(
                final GetDIDScoreNumberInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        getDIDScoreNumberAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get DID Score Number
     * @param    GetDIDScoreNumberInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void getDIDScoreNumberAsync(
                final GetDIDScoreNumberInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getPhonenumber())
            throw new NullPointerException("The property \"Phonenumber\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/incomingphone/getdidscore.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5647297011136907112L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5469888106357686045L;
            {
                    put( "user-agent", "ytel-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5366476816791042751L;
            {
                    put( "Phonenumber", input.getPhonenumber() );
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
     * Purchase a selected number of DID's from specific area codes to be used with your Ytel account.
     * @param    BulkBuyNumberInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String bulkBuyNumber(
                final BulkBuyNumberInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        bulkBuyNumberAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Purchase a selected number of DID's from specific area codes to be used with your Ytel account.
     * @param    BulkBuyNumberInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void bulkBuyNumberAsync(
                final BulkBuyNumberInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getNumberType())
            throw new NullPointerException("The property \"NumberType\" in the input object cannot be null.");

        if (null == input.getAreaCode())
            throw new NullPointerException("The property \"AreaCode\" in the input object cannot be null.");

        if (null == input.getQuantity())
            throw new NullPointerException("The property \"Quantity\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/incomingphone/bulkbuy.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4618386732929158315L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5624894478327615261L;
            {
                    put( "user-agent", "ytel-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4875850321671461488L;
            {
                    put( "NumberType", (input.getNumberType() != null) ? input.getNumberType().value() : null );
                    put( "AreaCode", input.getAreaCode() );
                    put( "Quantity", input.getQuantity() );
                    put( "Leftover", input.getLeftover() );
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