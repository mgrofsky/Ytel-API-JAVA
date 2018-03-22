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

public class LetterController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static LetterController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the LetterController class 
     */
    public static LetterController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new LetterController();
            }
        }
        return instance;
    }

    /**
     * Retrieve a letter object by its LetterSid.
     * @param    ViewLetterInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String viewLetter(
                final ViewLetterInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        viewLetterAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Retrieve a letter object by its LetterSid.
     * @param    ViewLetterInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void viewLetterAsync(
                final ViewLetterInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getLettersid())
            throw new NullPointerException("The property \"Lettersid\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/letter/viewletter.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4882261329132192718L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5212668094023289484L;
            {
                    put( "user-agent", "ytel-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4834915202105387997L;
            {
                    put( "lettersid", input.getLettersid() );
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
     * Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.
     * @param    CreateLetterInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String createLetter(
                final CreateLetterInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createLetterAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.
     * @param    CreateLetterInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void createLetterAsync(
                final CreateLetterInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getTo())
            throw new NullPointerException("The property \"To\" in the input object cannot be null.");

        if (null == input.getFrom())
            throw new NullPointerException("The property \"From\" in the input object cannot be null.");

        if (null == input.getAttachbyid())
            throw new NullPointerException("The property \"Attachbyid\" in the input object cannot be null.");

        if (null == input.getFile())
            throw new NullPointerException("The property \"File\" in the input object cannot be null.");

        if (null == input.getColor())
            throw new NullPointerException("The property \"Color\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/letter/create.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5469480439011399180L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5285418116639224732L;
            {
                    put( "user-agent", "ytel-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5494829408130710267L;
            {
                    put( "to", input.getTo() );
                    put( "from", input.getFrom() );
                    put( "attachbyid", input.getAttachbyid() );
                    put( "file", input.getFile() );
                    put( "color", input.getColor() );
                    put( "description", input.getDescription() );
                    put( "extraservice", input.getExtraservice() );
                    put( "doublesided", input.getDoublesided() );
                    put( "template", input.getTemplate() );
                    put( "htmldata", input.getHtmldata() );
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
     * Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.
     * @param    ListLettersInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String listLetters(
                final ListLettersInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        listLettersAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.
     * @param    ListLettersInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void listLettersAsync(
                final ListLettersInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/letter/listsletter.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4804784429775004063L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5279991627175316761L;
            {
                    put( "user-agent", "ytel-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4877614949804195545L;
            {
                    put( "page", input.getPage() );
                    put( "pagesize", input.getPagesize() );
                    put( "lettersid", input.getLettersid() );
                    put( "dateCreated", input.getDateCreated() );
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
     * Remove a letter object by its LetterId.
     * @param    DeleteLetterInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String deleteLetter(
                final DeleteLetterInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        deleteLetterAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Remove a letter object by its LetterId.
     * @param    DeleteLetterInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void deleteLetterAsync(
                final DeleteLetterInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getLettersid())
            throw new NullPointerException("The property \"Lettersid\" in the input object cannot be null.");

        if (null == input.getResponseType())
            throw new NullPointerException("The property \"ResponseType\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/letter/delete.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5464201374587078328L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4653524547815025533L;
            {
                    put( "user-agent", "ytel-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4956818814614292841L;
            {
                    put( "lettersid", input.getLettersid() );
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