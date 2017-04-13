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

public class CallController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static CallController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the CallController class 
     */
    public static CallController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new CallController();
            }
        }
        return instance;
    }

    /**
     * View Call Response
     * @param    CreateViewCallInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String createViewCall(
                final CreateViewCallInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createViewCallAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * View Call Response
     * @param    CreateViewCallInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void createViewCallAsync(
                final CreateViewCallInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getCallsid())
            throw new NullPointerException("The property \"Callsid\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/calls/viewcalls.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5727848083113904558L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5289722658191153660L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4913747125938600629L;
            {
                    put( "callsid", input.getCallsid() );
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
     * Group Call
     * @param    CreateGroupCallInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String createGroupCall(
                final CreateGroupCallInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createGroupCallAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Group Call
     * @param    CreateGroupCallInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void createGroupCallAsync(
                final CreateGroupCallInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getFromCountryCode())
            throw new NullPointerException("The property \"FromCountryCode\" in the input object cannot be null.");

        if (null == input.getFrom())
            throw new NullPointerException("The property \"From\" in the input object cannot be null.");

        if (null == input.getToCountryCode())
            throw new NullPointerException("The property \"ToCountryCode\" in the input object cannot be null.");

        if (null == input.getTo())
            throw new NullPointerException("The property \"To\" in the input object cannot be null.");

        if (null == input.getUrl())
            throw new NullPointerException("The property \"Url\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/calls/groupcall.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5288485228762514128L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4776622227031694846L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5334817775295086936L;
            {
                    put( "FromCountryCode", input.getFromCountryCode() );
                    put( "From", input.getFrom() );
                    put( "ToCountryCode", input.getToCountryCode() );
                    put( "To", input.getTo() );
                    put( "Url", input.getUrl() );
                    put( "Method", (input.getMethod() != null) ? input.getMethod().value() : null );
                    put( "StatusCallBackUrl", input.getStatusCallBackUrl() );
                    put( "StatusCallBackMethod", (input.getStatusCallBackMethod() != null) ? input.getStatusCallBackMethod().value() : null );
                    put( "FallBackUrl", input.getFallBackUrl() );
                    put( "FallBackMethod", (input.getFallBackMethod() != null) ? input.getFallBackMethod().value() : null );
                    put( "HeartBeatUrl", input.getHeartBeatUrl() );
                    put( "HeartBeatMethod", (input.getHeartBeatMethod() != null) ? input.getHeartBeatMethod().value() : null );
                    put( "Timeout", input.getTimeout() );
                    put( "PlayDtmf", input.getPlayDtmf() );
                    put( "HideCallerId", input.getHideCallerId() );
                    put( "Record", input.getRecord() );
                    put( "RecordCallBackUrl", input.getRecordCallBackUrl() );
                    put( "RecordCallBackMethod", (input.getRecordCallBackMethod() != null) ? input.getRecordCallBackMethod().value() : null );
                    put( "Transcribe", input.getTranscribe() );
                    put( "TranscribeCallBackUrl", input.getTranscribeCallBackUrl() );
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
     * Voice Effect
     * @param    CreateVoiceEffectInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String createVoiceEffect(
                final CreateVoiceEffectInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createVoiceEffectAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Voice Effect
     * @param    CreateVoiceEffectInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void createVoiceEffectAsync(
                final CreateVoiceEffectInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getCallSid())
            throw new NullPointerException("The property \"CallSid\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/calls/voiceeffect.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5594900827251221479L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5651929939790756378L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4836562445378907898L;
            {
                    put( "CallSid", input.getCallSid() );
                    put( "AudioDirection", (input.getAudioDirection() != null) ? input.getAudioDirection().value() : null );
                    put( "PitchSemiTones", input.getPitchSemiTones() );
                    put( "PitchOctaves", input.getPitchOctaves() );
                    put( "Pitch", input.getPitch() );
                    put( "Rate", input.getRate() );
                    put( "Tempo", input.getTempo() );
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
     * Record a Call
     * @param    CreateRecordCallInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String createRecordCall(
                final CreateRecordCallInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createRecordCallAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Record a Call
     * @param    CreateRecordCallInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void createRecordCallAsync(
                final CreateRecordCallInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getCallSid())
            throw new NullPointerException("The property \"CallSid\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/calls/recordcalls.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5391743266793338467L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5596511048837463052L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5196600622488588060L;
            {
                    put( "CallSid", input.getCallSid() );
                    put( "Record", input.getRecord() );
                    put( "Direction", (input.getDirection() != null) ? input.getDirection().value() : null );
                    put( "TimeLimit", input.getTimeLimit() );
                    put( "CallBackUrl", input.getCallBackUrl() );
                    put( "Fileformat", (input.getFileformat() != null) ? input.getFileformat().value() : null );
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
     * Play Dtmf and send the Digit
     * @param    CreatePlayAudioInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String createPlayAudio(
                final CreatePlayAudioInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createPlayAudioAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Play Dtmf and send the Digit
     * @param    CreatePlayAudioInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void createPlayAudioAsync(
                final CreatePlayAudioInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getCallSid())
            throw new NullPointerException("The property \"CallSid\" in the input object cannot be null.");

        if (null == input.getAudioUrl())
            throw new NullPointerException("The property \"AudioUrl\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/calls/playaudios.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5632315534146071841L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4932224656944705892L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5010924960244196309L;
            {
                    put( "CallSid", input.getCallSid() );
                    put( "AudioUrl", input.getAudioUrl() );
                    put( "Length", input.getLength() );
                    put( "Direction", (input.getDirection() != null) ? input.getDirection().value() : null );
                    put( "Loop", input.getLoop() );
                    put( "Mix", input.getMix() );
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
     * Interrupt the Call by Call Sid
     * @param    CreateInterruptedCallInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String createInterruptedCall(
                final CreateInterruptedCallInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createInterruptedCallAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Interrupt the Call by Call Sid
     * @param    CreateInterruptedCallInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void createInterruptedCallAsync(
                final CreateInterruptedCallInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getCallSid())
            throw new NullPointerException("The property \"CallSid\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/calls/interruptcalls.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4955329931295508565L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4902475185402872485L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5742975968071668717L;
            {
                    put( "CallSid", input.getCallSid() );
                    put( "Url", input.getUrl() );
                    put( "Method", (input.getMethod() != null) ? input.getMethod().value() : null );
                    put( "Status", (input.getStatus() != null) ? input.getStatus().value() : null );
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
     * Play Dtmf and send the Digit
     * @param    CreateSendDigitInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String createSendDigit(
                final CreateSendDigitInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createSendDigitAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Play Dtmf and send the Digit
     * @param    CreateSendDigitInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void createSendDigitAsync(
                final CreateSendDigitInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getCallSid())
            throw new NullPointerException("The property \"CallSid\" in the input object cannot be null.");

        if (null == input.getPlayDtmf())
            throw new NullPointerException("The property \"PlayDtmf\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/calls/senddigits.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5296019889935365939L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5272909781783920745L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5571873022806155366L;
            {
                    put( "CallSid", input.getCallSid() );
                    put( "PlayDtmf", input.getPlayDtmf() );
                    put( "PlayDtmfDirection", (input.getPlayDtmfDirection() != null) ? input.getPlayDtmfDirection().value() : null );
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
     * You can experiment with initiating a call through Message360 and view the request response generated when doing so and get the response in json
     * @param    CreateMakeCallInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String createMakeCall(
                final CreateMakeCallInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createMakeCallAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * You can experiment with initiating a call through Message360 and view the request response generated when doing so and get the response in json
     * @param    CreateMakeCallInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void createMakeCallAsync(
                final CreateMakeCallInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getFromCountryCode())
            throw new NullPointerException("The property \"FromCountryCode\" in the input object cannot be null.");

        if (null == input.getFrom())
            throw new NullPointerException("The property \"From\" in the input object cannot be null.");

        if (null == input.getToCountryCode())
            throw new NullPointerException("The property \"ToCountryCode\" in the input object cannot be null.");

        if (null == input.getTo())
            throw new NullPointerException("The property \"To\" in the input object cannot be null.");

        if (null == input.getUrl())
            throw new NullPointerException("The property \"Url\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/calls/makecall.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5625247225704006129L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5455492434934913501L;
            {
                    put( "Method", (input.getMethod() != null) ? input.getMethod().value() : null );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4700143672590710561L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4781734528577003922L;
            {
                    put( "FromCountryCode", input.getFromCountryCode() );
                    put( "From", input.getFrom() );
                    put( "ToCountryCode", input.getToCountryCode() );
                    put( "To", input.getTo() );
                    put( "Url", input.getUrl() );
                    put( "StatusCallBackUrl", input.getStatusCallBackUrl() );
                    put( "StatusCallBackMethod", (input.getStatusCallBackMethod() != null) ? input.getStatusCallBackMethod().value() : null );
                    put( "FallBackUrl", input.getFallBackUrl() );
                    put( "FallBackMethod", (input.getFallBackMethod() != null) ? input.getFallBackMethod().value() : null );
                    put( "HeartBeatUrl", input.getHeartBeatUrl() );
                    put( "HeartBeatMethod", input.getHeartBeatMethod() );
                    put( "Timeout", input.getTimeout() );
                    put( "PlayDtmf", input.getPlayDtmf() );
                    put( "HideCallerId", input.getHideCallerId() );
                    put( "Record", input.getRecord() );
                    put( "RecordCallBackUrl", input.getRecordCallBackUrl() );
                    put( "RecordCallBackMethod", (input.getRecordCallBackMethod() != null) ? input.getRecordCallBackMethod().value() : null );
                    put( "Transcribe", input.getTranscribe() );
                    put( "TranscribeCallBackUrl", input.getTranscribeCallBackUrl() );
                    put( "IfMachine", (input.getIfMachine() != null) ? input.getIfMachine().value() : null );
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
     * A list of calls associated with your Message360 account
     * @param    CreateListCallsInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String createListCalls(
                final CreateListCallsInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createListCallsAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * A list of calls associated with your Message360 account
     * @param    CreateListCallsInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void createListCallsAsync(
                final CreateListCallsInput input,
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/calls/listcalls.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4629157770073891962L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5579607480854075820L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5671228273363429987L;
            {
                    put( "Page", input.getPage() );
                    put( "PageSize", input.getPageSize() );
                    put( "To", input.getTo() );
                    put( "From", input.getFrom() );
                    put( "DateCreated", input.getDateCreated() );
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
     * API endpoint used to send a Ringless Voicemail
     * @param    CreateSendRinglessVMInput    Object containing request parameters
     * @return    Returns the String response from the API call 
     */
    public String createSendRinglessVM(
                final CreateSendRinglessVMInput input
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createSendRinglessVMAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * API endpoint used to send a Ringless Voicemail
     * @param    CreateSendRinglessVMInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void createSendRinglessVMAsync(
                final CreateSendRinglessVMInput input,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == input.getFromCountryCode())
            throw new NullPointerException("The property \"FromCountryCode\" in the input object cannot be null.");

        if (null == input.getFrom())
            throw new NullPointerException("The property \"From\" in the input object cannot be null.");

        if (null == input.getToCountryCode())
            throw new NullPointerException("The property \"ToCountryCode\" in the input object cannot be null.");

        if (null == input.getTo())
            throw new NullPointerException("The property \"To\" in the input object cannot be null.");

        if (null == input.getVoiceMailURL())
            throw new NullPointerException("The property \"VoiceMailURL\" in the input object cannot be null.");

        if (null == input.getMethod())
            throw new NullPointerException("The property \"Method\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/calls/makeringlessvoicemailcall.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5302866851204038660L;
            {
                    put( "ResponseType", input.getResponseType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4752397155252902666L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5200825800592890932L;
            {
                    put( "FromCountryCode", input.getFromCountryCode() );
                    put( "From", input.getFrom() );
                    put( "ToCountryCode", input.getToCountryCode() );
                    put( "To", input.getTo() );
                    put( "VoiceMailURL", input.getVoiceMailURL() );
                    put( "Method", input.getMethod() );
                    put( "StatusCallBackUrl", input.getStatusCallBackUrl() );
                    put( "StatsCallBackMethod", input.getStatsCallBackMethod() );
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