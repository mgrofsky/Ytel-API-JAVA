/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 11/04/2016
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

public class SMSController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static SMSController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the SMSController class 
     */
    public static SMSController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new SMSController();
            }
        }
        return instance;
    }

    /**
     * Send an SMS from a message360 number
     * @param    fromcountrycode    Required parameter: From Country Code
     * @param    from    Required parameter: SMS enabled Message360 number to send this message from
     * @param    tocountrycode    Required parameter: To country code
     * @param    to    Required parameter: Number to send the SMS to
     * @param    body    Required parameter: Text Message To Send
     * @param    method    Optional parameter: Specifies the HTTP method used to request the required URL once SMS sent.
     * @param    messagestatuscallback    Optional parameter: URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createSendSMS(
                final int fromcountrycode,
                final String from,
                final int tocountrycode,
                final String to,
                final String body,
                final HttpAction method,
                final String messagestatuscallback,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createSendSMSAsync(fromcountrycode, from, tocountrycode, to, body, method, messagestatuscallback, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Send an SMS from a message360 number
     * @param    fromcountrycode    Required parameter: From Country Code
     * @param    from    Required parameter: SMS enabled Message360 number to send this message from
     * @param    tocountrycode    Required parameter: To country code
     * @param    to    Required parameter: Number to send the SMS to
     * @param    body    Required parameter: Text Message To Send
     * @param    method    Optional parameter: Specifies the HTTP method used to request the required URL once SMS sent.
     * @param    messagestatuscallback    Optional parameter: URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createSendSMSAsync(
                final int fromcountrycode,
                final String from,
                final int tocountrycode,
                final String to,
                final String body,
                final HttpAction method,
                final String messagestatuscallback,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == from)
            throw new NullPointerException("The parameter \"from\" is a required parameter and cannot be null.");

        if (null == to)
            throw new NullPointerException("The parameter \"to\" is a required parameter and cannot be null.");

        if (null == body)
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/sms/sendsms.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5233754105260633159L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4970718081418289883L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4681812066894801112L;
            {
                    put( "fromcountrycode", fromcountrycode );
                    put( "from", from );
                    put( "tocountrycode", tocountrycode );
                    put( "to", to );
                    put( "body", body );
                    put( "method", (null != method) ? method.value() : null );
                    put( "messagestatuscallback", messagestatuscallback );
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
     * View Particular SMS
     * @param    messagesid    Required parameter: Message sid
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createViewSMS(
                final String messagesid,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createViewSMSAsync(messagesid, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * View Particular SMS
     * @param    messagesid    Required parameter: Message sid
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createViewSMSAsync(
                final String messagesid,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == messagesid)
            throw new NullPointerException("The parameter \"messagesid\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/sms/viewsms.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4874573953845098519L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5206789525434616603L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4984777777643481857L;
            {
                    put( "messagesid", messagesid );
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
     * List All SMS
     * @param    page    Optional parameter: Which page of the overall response will be returned. Zero indexed
     * @param    pagesize    Optional parameter: Number of individual resources listed in the response per page
     * @param    from    Optional parameter: Messages sent from this number
     * @param    to    Optional parameter: Messages sent to this number
     * @param    datesent    Optional parameter: Only list SMS messages sent in the specified date range
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createListSMS(
                final Integer page,
                final Integer pagesize,
                final String from,
                final String to,
                final String datesent,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createListSMSAsync(page, pagesize, from, to, datesent, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * List All SMS
     * @param    page    Optional parameter: Which page of the overall response will be returned. Zero indexed
     * @param    pagesize    Optional parameter: Number of individual resources listed in the response per page
     * @param    from    Optional parameter: Messages sent from this number
     * @param    to    Optional parameter: Messages sent to this number
     * @param    datesent    Optional parameter: Only list SMS messages sent in the specified date range
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createListSMSAsync(
                final Integer page,
                final Integer pagesize,
                final String from,
                final String to,
                final String datesent,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/sms/listsms.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4755893401676589503L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5081480714863578228L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5291953992207725035L;
            {
                    put( "page", page );
                    put( "pagesize", pagesize );
                    put( "from", from );
                    put( "to", to );
                    put( "datesent", datesent );
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
     * List All Inbound SMS
     * @param    page    Optional parameter: Which page of the overall response will be returned. Zero indexed
     * @param    pagesize    Optional parameter: Number of individual resources listed in the response per page
     * @param    from    Optional parameter: From Number to Inbound SMS
     * @param    to    Optional parameter: To Number to get Inbound SMS
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createListInboundSMS(
                final Integer page,
                final String pagesize,
                final String from,
                final String to,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createListInboundSMSAsync(page, pagesize, from, to, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * List All Inbound SMS
     * @param    page    Optional parameter: Which page of the overall response will be returned. Zero indexed
     * @param    pagesize    Optional parameter: Number of individual resources listed in the response per page
     * @param    from    Optional parameter: From Number to Inbound SMS
     * @param    to    Optional parameter: To Number to get Inbound SMS
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createListInboundSMSAsync(
                final Integer page,
                final String pagesize,
                final String from,
                final String to,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/sms/getInboundsms.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5304672937016735356L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4655453409545717892L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4731230126912965557L;
            {
                    put( "page", page );
                    put( "pagesize", pagesize );
                    put( "from", from );
                    put( "to", to );
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