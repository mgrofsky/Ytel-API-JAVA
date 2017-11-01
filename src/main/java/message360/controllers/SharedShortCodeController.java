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

public class SharedShortCodeController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static SharedShortCodeController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the SharedShortCodeController class 
     */
    public static SharedShortCodeController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new SharedShortCodeController();
            }
        }
        return instance;
    }

    /**
     * View a Shared ShortCode Template
     * @param    ViewTemplateInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String viewTemplate(
                final ViewTemplateInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        viewTemplateAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * View a Shared ShortCode Template
     * @param    ViewTemplateInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void viewTemplateAsync(
                final ViewTemplateInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getTemplateid())
            throw new NullPointerException("The property \"Templateid\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/template/view.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4863817456859447727L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4762507116273180666L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5410630689833516593L;
            {
                    put( "templateid", input.getTemplateid() );
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
     * View a ShortCode Message
     * @param    ViewSharedShortcodesInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String viewSharedShortcodes(
                final ViewSharedShortcodesInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        viewSharedShortcodesAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * View a ShortCode Message
     * @param    ViewSharedShortcodesInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void viewSharedShortcodesAsync(
                final ViewSharedShortcodesInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getMessagesid())
            throw new NullPointerException("The property \"Messagesid\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/shortcode/viewsms.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5093826110908892715L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4777489742263497102L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5705417893437953886L;
            {
                    put( "messagesid", input.getMessagesid() );
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
     * List ShortCode Messages
     * @param    ListOutboundSharedShortcodesInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String listOutboundSharedShortcodes(
                final ListOutboundSharedShortcodesInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        listOutboundSharedShortcodesAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * List ShortCode Messages
     * @param    ListOutboundSharedShortcodesInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void listOutboundSharedShortcodesAsync(
                final ListOutboundSharedShortcodesInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/shortcode/listsms.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5649668843954998585L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5417481048708361148L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5175962799682557516L;
            {
                    put( "page", input.getPage() );
                    put( "pagesize", input.getPagesize() );
                    put( "from", input.getFrom() );
                    put( "to", input.getTo() );
                    put( "datesent", input.getDatesent() );
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
     * List All Inbound ShortCode
     * @param    ListInboundSharedShortcodesInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String listInboundSharedShortcodes(
                final ListInboundSharedShortcodesInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        listInboundSharedShortcodesAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * List All Inbound ShortCode
     * @param    ListInboundSharedShortcodesInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void listInboundSharedShortcodesAsync(
                final ListInboundSharedShortcodesInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/shortcode/getinboundsms.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5293992580860088551L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5760052310042793878L;
            {
                    put( "DateReceived", input.getDateReceived() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5201113404237648925L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4747409786416172889L;
            {
                    put( "page", input.getPage() );
                    put( "pagesize", input.getPagesize() );
                    put( "from", input.getFrom() );
                    put( "Shortcode", input.getShortcode() );
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
     * Send an SMS from a message360 ShortCode
     * @param    SendSharedShortcodeInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String sendSharedShortcode(
                final SendSharedShortcodeInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        sendSharedShortcodeAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Send an SMS from a message360 ShortCode
     * @param    SendSharedShortcodeInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void sendSharedShortcodeAsync(
                final SendSharedShortcodeInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getShortcode())
            throw new NullPointerException("The property \"Shortcode\" in the input object cannot be null.");

        if (null == input.getTo())
            throw new NullPointerException("The property \"To\" in the input object cannot be null.");

        if (null == input.getTemplateid())
            throw new NullPointerException("The property \"Templateid\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        if (null == input.getData())
            throw new NullPointerException("The property \"Data\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/shortcode/sendsms.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5527423248011330069L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4957497988739731729L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5532642136974269029L;
            {
                    put( "shortcode", input.getShortcode() );
                    put( "to", input.getTo() );
                    put( "templateid", input.getTemplateid() );
                    put( "data", input.getData() );
                    put( "Method", (input.getMethod() != null) ? input.getMethod().value() : "GET" );
                    put( "MessageStatusCallback", input.getMessageStatusCallback() );
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
     * List Shortcode Templates by Type
     * @param    ListTemplatesInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String listTemplates(
                final ListTemplatesInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        listTemplatesAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * List Shortcode Templates by Type
     * @param    ListTemplatesInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void listTemplatesAsync(
                final ListTemplatesInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/template/lists.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4636589069471364611L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5658194185499719097L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4912474253535585968L;
            {
                    put( "type", input.getType() );
                    put( "page", input.getPage() );
                    put( "pagesize", input.getPagesize() );
                    put( "Shortcode", input.getShortcode() );
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
     * View a set of properties for a single keyword.
     * @param    ViewKeywordInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String viewKeyword(
                final ViewKeywordInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        viewKeywordAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * View a set of properties for a single keyword.
     * @param    ViewKeywordInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void viewKeywordAsync(
                final ViewKeywordInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getKeywordid())
            throw new NullPointerException("The property \"Keywordid\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/keyword/view.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4707545897264585410L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4828155138236991136L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5209263068027889484L;
            {
                    put( "Keywordid", input.getKeywordid() );
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
     * Retrieve a list of keywords associated with your message360 account.
     * @param    ListKeywordInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String listKeyword(
                final ListKeywordInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        listKeywordAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Retrieve a list of keywords associated with your message360 account.
     * @param    ListKeywordInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void listKeywordAsync(
                final ListKeywordInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/keyword/lists.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4752343749298347388L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5306633341961562357L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5268129183619706982L;
            {
                    put( "Page", input.getPage() );
                    put( "PageSize", input.getPageSize() );
                    put( "Keyword", input.getKeyword() );
                    put( "Shortcode", input.getShortcode() );
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
     * The response returned here contains all resource properties associated with the given Shortcode.
     * @param    ViewAssignementInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String viewAssignement(
                final ViewAssignementInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        viewAssignementAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * The response returned here contains all resource properties associated with the given Shortcode.
     * @param    ViewAssignementInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void viewAssignementAsync(
                final ViewAssignementInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getShortcode())
            throw new NullPointerException("The property \"Shortcode\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/shortcode/viewshortcode.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4756199283796080923L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5135435284276955742L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5654726660792190564L;
            {
                    put( "Shortcode", input.getShortcode() );
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
     * Retrieve a list of shortcode assignment associated with your message360 account.
     * @param    ListAssignmentInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String listAssignment(
                final ListAssignmentInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        listAssignmentAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Retrieve a list of shortcode assignment associated with your message360 account.
     * @param    ListAssignmentInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void listAssignmentAsync(
                final ListAssignmentInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/shortcode/listshortcode.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5613422430347686253L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4954424388073838808L;
            {
                    put( "Shortcode", input.getShortcode() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5056524876361181234L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4955744152952246594L;
            {
                    put( "Page", input.getPage() );
                    put( "PageSize", input.getPageSize() );
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
     * TODO: type endpoint description here
     * @param    UpdateAssignmentInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String updateAssignment(
                final UpdateAssignmentInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        updateAssignmentAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * TODO: type endpoint description here
     * @param    UpdateAssignmentInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void updateAssignmentAsync(
                final UpdateAssignmentInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getShortcode())
            throw new NullPointerException("The property \"Shortcode\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/shortcode/updateshortcode.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5448631305398023809L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4778229222947166533L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5466508880859916201L;
            {
                    put( "Shortcode", input.getShortcode() );
                    put( "FriendlyName", input.getFriendlyName() );
                    put( "CallbackUrl", input.getCallbackUrl() );
                    put( "CallbackMethod", (input.getCallbackMethod() != null) ? input.getCallbackMethod().value() : null );
                    put( "FallbackUrl", input.getFallbackUrl() );
                    put( "FallbackUrlMethod", (input.getFallbackUrlMethod() != null) ? input.getFallbackUrlMethod().value() : null );
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