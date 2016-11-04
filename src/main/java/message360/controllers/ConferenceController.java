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

public class ConferenceController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static ConferenceController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the ConferenceController class 
     */
    public static ConferenceController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new ConferenceController();
            }
        }
        return instance;
    }

    /**
     * View Participant
     * @param    conferenceSid    Required parameter: unique conference sid
     * @param    participantSid    Required parameter: Example: 
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createViewParticipant(
                final String conferenceSid,
                final String participantSid,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createViewParticipantAsync(conferenceSid, participantSid, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * View Participant
     * @param    conferenceSid    Required parameter: unique conference sid
     * @param    participantSid    Required parameter: Example: 
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createViewParticipantAsync(
                final String conferenceSid,
                final String participantSid,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == conferenceSid)
            throw new NullPointerException("The parameter \"conferenceSid\" is a required parameter and cannot be null.");

        if (null == participantSid)
            throw new NullPointerException("The parameter \"participantSid\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/conferences/viewparticipant.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5337234348764436480L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5513263162545748891L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5174272504000521562L;
            {
                    put( "ConferenceSid", conferenceSid );
                    put( "ParticipantSid", participantSid );
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
     * List Participant
     * @param    conferenceSid    Required parameter: unique conference sid
     * @param    page    Optional parameter: page number
     * @param    pagesize    Optional parameter: Example: 
     * @param    muted    Optional parameter: Example: 
     * @param    deaf    Optional parameter: Example: 
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createListParticipant(
                final String conferenceSid,
                final Integer page,
                final Integer pagesize,
                final Boolean muted,
                final Boolean deaf,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createListParticipantAsync(conferenceSid, page, pagesize, muted, deaf, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * List Participant
     * @param    conferenceSid    Required parameter: unique conference sid
     * @param    page    Optional parameter: page number
     * @param    pagesize    Optional parameter: Example: 
     * @param    muted    Optional parameter: Example: 
     * @param    deaf    Optional parameter: Example: 
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createListParticipantAsync(
                final String conferenceSid,
                final Integer page,
                final Integer pagesize,
                final Boolean muted,
                final Boolean deaf,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == conferenceSid)
            throw new NullPointerException("The parameter \"conferenceSid\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/conferences/listparticipant.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4775926082895129738L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4733384008533536333L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4707805803887699165L;
            {
                    put( "ConferenceSid", conferenceSid );
                    put( "Page", page );
                    put( "Pagesize", pagesize );
                    put( "Muted", muted );
                    put( "Deaf", deaf );
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
     * Add Participant in conference 
     * @param    conferencesid    Required parameter: Unique Conference Sid
     * @param    participantnumber    Required parameter: Particiant Number
     * @param    tocountrycode    Required parameter: Example: 
     * @param    muted    Optional parameter: Example: 
     * @param    deaf    Optional parameter: Example: 
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String addParticipant(
                final String conferencesid,
                final String participantnumber,
                final int tocountrycode,
                final Boolean muted,
                final Boolean deaf,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        addParticipantAsync(conferencesid, participantnumber, tocountrycode, muted, deaf, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Add Participant in conference 
     * @param    conferencesid    Required parameter: Unique Conference Sid
     * @param    participantnumber    Required parameter: Particiant Number
     * @param    tocountrycode    Required parameter: Example: 
     * @param    muted    Optional parameter: Example: 
     * @param    deaf    Optional parameter: Example: 
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void addParticipantAsync(
                final String conferencesid,
                final String participantnumber,
                final int tocountrycode,
                final Boolean muted,
                final Boolean deaf,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == conferencesid)
            throw new NullPointerException("The parameter \"conferencesid\" is a required parameter and cannot be null.");

        if (null == participantnumber)
            throw new NullPointerException("The parameter \"participantnumber\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/conferences/addParticipant.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5181555934670376116L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5200380504711229464L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5696536902155050860L;
            {
                    put( "conferencesid", conferencesid );
                    put( "participantnumber", participantnumber );
                    put( "tocountrycode", tocountrycode );
                    put( "muted", muted );
                    put( "deaf", deaf );
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
     * View Conference
     * @param    conferencesid    Required parameter: The unique identifier of each conference resource
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createViewConference(
                final String conferencesid,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createViewConferenceAsync(conferencesid, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * View Conference
     * @param    conferencesid    Required parameter: The unique identifier of each conference resource
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createViewConferenceAsync(
                final String conferencesid,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == conferencesid)
            throw new NullPointerException("The parameter \"conferencesid\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/conferences/viewconference.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5018516055442392143L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5089599379742186367L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5045499340146395609L;
            {
                    put( "conferencesid", conferencesid );
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
     * List Conference
     * @param    page    Optional parameter: Which page of the overall response will be returned. Zero indexed
     * @param    pageSize    Optional parameter: Number of individual resources listed in the response per page
     * @param    friendlyName    Optional parameter: Only return conferences with the specified FriendlyName
     * @param    status    Optional parameter: Example: 
     * @param    dateCreated    Optional parameter: Example: 
     * @param    dateUpdated    Optional parameter: Example: 
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createListConference(
                final Integer page,
                final Integer pageSize,
                final String friendlyName,
                final InterruptedCallStatus status,
                final String dateCreated,
                final String dateUpdated,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createListConferenceAsync(page, pageSize, friendlyName, status, dateCreated, dateUpdated, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * List Conference
     * @param    page    Optional parameter: Which page of the overall response will be returned. Zero indexed
     * @param    pageSize    Optional parameter: Number of individual resources listed in the response per page
     * @param    friendlyName    Optional parameter: Only return conferences with the specified FriendlyName
     * @param    status    Optional parameter: Example: 
     * @param    dateCreated    Optional parameter: Example: 
     * @param    dateUpdated    Optional parameter: Example: 
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createListConferenceAsync(
                final Integer page,
                final Integer pageSize,
                final String friendlyName,
                final InterruptedCallStatus status,
                final String dateCreated,
                final String dateUpdated,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/conferences/listconference.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4881096829055662479L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4910167331392163690L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5731694562230230435L;
            {
                    put( "Page", page );
                    put( "PageSize", pageSize );
                    put( "FriendlyName", friendlyName );
                    put( "Status", (null != status) ? status.value() : null );
                    put( "DateCreated", dateCreated );
                    put( "DateUpdated", dateUpdated );
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