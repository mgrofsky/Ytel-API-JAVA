/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
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

public class SubAccountController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static SubAccountController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the SubAccountController class 
     */
    public static SubAccountController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new SubAccountController();
            }
        }
        return instance;
    }

    /**
     * Delete sub account or merge numbers into parent
     * @param    DeleteSubAccountInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String deleteSubAccount(
                final DeleteSubAccountInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        deleteSubAccountAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Delete sub account or merge numbers into parent
     * @param    DeleteSubAccountInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void deleteSubAccountAsync(
                final DeleteSubAccountInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getSubAccountSID())
            throw new NullPointerException("The property \"SubAccountSID\" in the input object cannot be null.");

        if (null == input.getMergeNumber())
            throw new NullPointerException("The property \"MergeNumber\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/user/deletesubaccount.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5720960026888020641L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5627792948009039176L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5153373199777685166L;
            {
                    put( "SubAccountSID", input.getSubAccountSID() );
                    put( "MergeNumber", (input.getMergeNumber() != null) ? input.getMergeNumber().value() : 0 );
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
     * Suspend or unsuspend
     * @param    SuspendSubAccountInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String suspendSubAccount(
                final SuspendSubAccountInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        suspendSubAccountAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Suspend or unsuspend
     * @param    SuspendSubAccountInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void suspendSubAccountAsync(
                final SuspendSubAccountInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getSubAccountSID())
            throw new NullPointerException("The property \"SubAccountSID\" in the input object cannot be null.");

        if (null == input.getActivate())
            throw new NullPointerException("The property \"Activate\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/user/subaccountactivation.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4847100785355970132L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4875233947207221462L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5675611391214034981L;
            {
                    put( "SubAccountSID", input.getSubAccountSID() );
                    put( "Activate", (input.getActivate() != null) ? input.getActivate().value() : 0 );
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
     * Create a sub user account under the parent account
     * @param    CreateSubAccountInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String createSubAccount(
                final CreateSubAccountInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createSubAccountAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Create a sub user account under the parent account
     * @param    CreateSubAccountInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void createSubAccountAsync(
                final CreateSubAccountInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getFirstName())
            throw new NullPointerException("The property \"FirstName\" in the input object cannot be null.");

        if (null == input.getLastName())
            throw new NullPointerException("The property \"LastName\" in the input object cannot be null.");

        if (null == input.getEmail())
            throw new NullPointerException("The property \"Email\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/user/createsubaccount.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4925005438552272863L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5620080392486800244L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5303051846622602961L;
            {
                    put( "FirstName", input.getFirstName() );
                    put( "LastName", input.getLastName() );
                    put( "Email", input.getEmail() );
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