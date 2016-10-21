/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 10/21/2016
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
     * @param    callsid    Required parameter: Call Sid id for particular Call
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createViewCall(
                final String callsid,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createViewCallAsync(callsid, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * View Call Response
     * @param    callsid    Required parameter: Call Sid id for particular Call
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createViewCallAsync(
                final String callsid,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == callsid)
            throw new NullPointerException("The parameter \"callsid\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/calls/viewcalls.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4684995103869378536L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5755616074266808621L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4930536516531311544L;
            {
                    put( "callsid", callsid );
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
     * @param    fromCountryCode    Required parameter: from country code
     * @param    from    Required parameter: This number to display on Caller ID as calling
     * @param    toCountryCode    Required parameter: To cuntry code number
     * @param    to    Required parameter: To number
     * @param    url    Required parameter: URL requested once the call connects
     * @param    method    Optional parameter: Specifies the HTTP method used to request the required URL once call connects.
     * @param    statusCallBackUrl    Optional parameter: specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     * @param    statusCallBackMethod    Optional parameter: Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     * @param    fallBackUrl    Optional parameter: URL requested if the initial Url parameter fails or encounters an error
     * @param    fallBackMethod    Optional parameter: Specifies the HTTP method used to request the required FallbackUrl once call connects.
     * @param    heartBeatUrl    Optional parameter: URL that can be requested every 60 seconds during the call to notify of elapsed tim
     * @param    heartBeatMethod    Optional parameter: Specifies the HTTP method used to request HeartbeatUrl.
     * @param    timeout    Optional parameter: Time (in seconds) Message360 should wait while the call is ringing before canceling the call
     * @param    playDtmf    Optional parameter: DTMF Digits to play to the call once it connects. 0-9, #, or *
     * @param    hideCallerId    Optional parameter: Specifies if the caller id will be hidden
     * @param    record    Optional parameter: Specifies if the call should be recorded
     * @param    recordCallBackUrl    Optional parameter: Recording parameters will be sent here upon completion
     * @param    recordCallBackMethod    Optional parameter: Method used to request the RecordCallback URL.
     * @param    transcribe    Optional parameter: Specifies if the call recording should be transcribed
     * @param    transcribeCallBackUrl    Optional parameter: Transcription parameters will be sent here upon completion
     * @param    ifMachine    Optional parameter: How Message360 should handle the receiving numbers voicemail machine
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createMakeCall(
                final String fromCountryCode,
                final String from,
                final String toCountryCode,
                final String to,
                final String url,
                final HttpMethod method,
                final String statusCallBackUrl,
                final HttpMethod statusCallBackMethod,
                final String fallBackUrl,
                final HttpMethod fallBackMethod,
                final String heartBeatUrl,
                final Boolean heartBeatMethod,
                final Integer timeout,
                final String playDtmf,
                final Boolean hideCallerId,
                final Boolean record,
                final String recordCallBackUrl,
                final HttpMethod recordCallBackMethod,
                final Boolean transcribe,
                final String transcribeCallBackUrl,
                final IfMachine ifMachine,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createMakeCallAsync(fromCountryCode, from, toCountryCode, to, url, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl, ifMachine, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * You can experiment with initiating a call through Message360 and view the request response generated when doing so and get the response in json
     * @param    fromCountryCode    Required parameter: from country code
     * @param    from    Required parameter: This number to display on Caller ID as calling
     * @param    toCountryCode    Required parameter: To cuntry code number
     * @param    to    Required parameter: To number
     * @param    url    Required parameter: URL requested once the call connects
     * @param    method    Optional parameter: Specifies the HTTP method used to request the required URL once call connects.
     * @param    statusCallBackUrl    Optional parameter: specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     * @param    statusCallBackMethod    Optional parameter: Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     * @param    fallBackUrl    Optional parameter: URL requested if the initial Url parameter fails or encounters an error
     * @param    fallBackMethod    Optional parameter: Specifies the HTTP method used to request the required FallbackUrl once call connects.
     * @param    heartBeatUrl    Optional parameter: URL that can be requested every 60 seconds during the call to notify of elapsed tim
     * @param    heartBeatMethod    Optional parameter: Specifies the HTTP method used to request HeartbeatUrl.
     * @param    timeout    Optional parameter: Time (in seconds) Message360 should wait while the call is ringing before canceling the call
     * @param    playDtmf    Optional parameter: DTMF Digits to play to the call once it connects. 0-9, #, or *
     * @param    hideCallerId    Optional parameter: Specifies if the caller id will be hidden
     * @param    record    Optional parameter: Specifies if the call should be recorded
     * @param    recordCallBackUrl    Optional parameter: Recording parameters will be sent here upon completion
     * @param    recordCallBackMethod    Optional parameter: Method used to request the RecordCallback URL.
     * @param    transcribe    Optional parameter: Specifies if the call recording should be transcribed
     * @param    transcribeCallBackUrl    Optional parameter: Transcription parameters will be sent here upon completion
     * @param    ifMachine    Optional parameter: How Message360 should handle the receiving numbers voicemail machine
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createMakeCallAsync(
                final String fromCountryCode,
                final String from,
                final String toCountryCode,
                final String to,
                final String url,
                final HttpMethod method,
                final String statusCallBackUrl,
                final HttpMethod statusCallBackMethod,
                final String fallBackUrl,
                final HttpMethod fallBackMethod,
                final String heartBeatUrl,
                final Boolean heartBeatMethod,
                final Integer timeout,
                final String playDtmf,
                final Boolean hideCallerId,
                final Boolean record,
                final String recordCallBackUrl,
                final HttpMethod recordCallBackMethod,
                final Boolean transcribe,
                final String transcribeCallBackUrl,
                final IfMachine ifMachine,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == fromCountryCode)
            throw new NullPointerException("The parameter \"fromCountryCode\" is a required parameter and cannot be null.");

        if (null == from)
            throw new NullPointerException("The parameter \"from\" is a required parameter and cannot be null.");

        if (null == toCountryCode)
            throw new NullPointerException("The parameter \"toCountryCode\" is a required parameter and cannot be null.");

        if (null == to)
            throw new NullPointerException("The parameter \"to\" is a required parameter and cannot be null.");

        if (null == url)
            throw new NullPointerException("The parameter \"url\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/calls/makecall.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4742614679746211958L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5004353850095123077L;
            {
                    put( "Method", (null != method) ? method.value() : null );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4849386335530458501L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4880677988466117286L;
            {
                    put( "FromCountryCode", fromCountryCode );
                    put( "From", from );
                    put( "ToCountryCode", toCountryCode );
                    put( "To", to );
                    put( "Url", url );
                    put( "StatusCallBackUrl", statusCallBackUrl );
                    put( "StatusCallBackMethod", (null != statusCallBackMethod) ? statusCallBackMethod.value() : null );
                    put( "FallBackUrl", fallBackUrl );
                    put( "FallBackMethod", (null != fallBackMethod) ? fallBackMethod.value() : null );
                    put( "HeartBeatUrl", heartBeatUrl );
                    put( "HeartBeatMethod", heartBeatMethod );
                    put( "Timeout", timeout );
                    put( "PlayDtmf", playDtmf );
                    put( "HideCallerId", hideCallerId );
                    put( "Record", record );
                    put( "RecordCallBackUrl", recordCallBackUrl );
                    put( "RecordCallBackMethod", (null != recordCallBackMethod) ? recordCallBackMethod.value() : null );
                    put( "Transcribe", transcribe );
                    put( "TranscribeCallBackUrl", transcribeCallBackUrl );
                    put( "IfMachine", (null != ifMachine) ? ifMachine.value() : null );
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
     * @param    length    Required parameter: Time limit in seconds for audio play back
     * @param    direction    Required parameter: The leg of the call audio will be played to
     * @param    loop    Required parameter: Repeat audio playback indefinitely
     * @param    mix    Required parameter: If false, all other audio will be muted
     * @param    callSid    Optional parameter: The unique identifier of each call resource
     * @param    audioUrl    Optional parameter: URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createPlayAudio(
                final int length,
                final Direction direction,
                final boolean loop,
                final boolean mix,
                final String callSid,
                final String audioUrl,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createPlayAudioAsync(length, direction, loop, mix, callSid, audioUrl, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Play Dtmf and send the Digit
     * @param    length    Required parameter: Time limit in seconds for audio play back
     * @param    direction    Required parameter: The leg of the call audio will be played to
     * @param    loop    Required parameter: Repeat audio playback indefinitely
     * @param    mix    Required parameter: If false, all other audio will be muted
     * @param    callSid    Optional parameter: The unique identifier of each call resource
     * @param    audioUrl    Optional parameter: URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createPlayAudioAsync(
                final int length,
                final Direction direction,
                final boolean loop,
                final boolean mix,
                final String callSid,
                final String audioUrl,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == direction)
            throw new NullPointerException("The parameter \"direction\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/calls/playaudios.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5599318719677794116L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4625761546500810028L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5667944604526155269L;
            {
                    put( "Length", length );
                    put( "Direction", (null != direction) ? direction.value() : null );
                    put( "Loop", loop );
                    put( "Mix", mix );
                    put( "CallSid", callSid );
                    put( "AudioUrl", audioUrl );
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
     * @param    callSid    Required parameter: The unique identifier of each call resource
     * @param    record    Required parameter: Set true to initiate recording or false to terminate recording
     * @param    direction    Optional parameter: The leg of the call to record
     * @param    timeLimit    Optional parameter: Time in seconds the recording duration should not exceed
     * @param    callBackUrl    Optional parameter: URL consulted after the recording completes
     * @param    fileformat    Optional parameter: Format of the recording file. Can be .mp3 or .wav
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createRecordCall(
                final String callSid,
                final boolean record,
                final Direction direction,
                final Integer timeLimit,
                final String callBackUrl,
                final AudioFormat fileformat,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createRecordCallAsync(callSid, record, direction, timeLimit, callBackUrl, fileformat, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Record a Call
     * @param    callSid    Required parameter: The unique identifier of each call resource
     * @param    record    Required parameter: Set true to initiate recording or false to terminate recording
     * @param    direction    Optional parameter: The leg of the call to record
     * @param    timeLimit    Optional parameter: Time in seconds the recording duration should not exceed
     * @param    callBackUrl    Optional parameter: URL consulted after the recording completes
     * @param    fileformat    Optional parameter: Format of the recording file. Can be .mp3 or .wav
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createRecordCallAsync(
                final String callSid,
                final boolean record,
                final Direction direction,
                final Integer timeLimit,
                final String callBackUrl,
                final AudioFormat fileformat,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == callSid)
            throw new NullPointerException("The parameter \"callSid\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/calls/recordcalls.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5005359263013626800L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5660792628317723367L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5484239026532122999L;
            {
                    put( "CallSid", callSid );
                    put( "Record", record );
                    put( "Direction", (null != direction) ? direction.value() : null );
                    put( "TimeLimit", timeLimit );
                    put( "CallBackUrl", callBackUrl );
                    put( "Fileformat", (null != fileformat) ? fileformat.value() : null );
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
     * @param    callSid    Required parameter: Example: 
     * @param    audioDirection    Optional parameter: Example: 
     * @param    pitchSemiTones    Optional parameter: value between -14 and 14
     * @param    pitchOctaves    Optional parameter: value between -1 and 1
     * @param    pitch    Optional parameter: value greater than 0
     * @param    rate    Optional parameter: value greater than 0
     * @param    tempo    Optional parameter: value greater than 0
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createVoiceEffect(
                final String callSid,
                final AudioDirection audioDirection,
                final Double pitchSemiTones,
                final Double pitchOctaves,
                final Double pitch,
                final Double rate,
                final Double tempo,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createVoiceEffectAsync(callSid, audioDirection, pitchSemiTones, pitchOctaves, pitch, rate, tempo, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Voice Effect
     * @param    callSid    Required parameter: Example: 
     * @param    audioDirection    Optional parameter: Example: 
     * @param    pitchSemiTones    Optional parameter: value between -14 and 14
     * @param    pitchOctaves    Optional parameter: value between -1 and 1
     * @param    pitch    Optional parameter: value greater than 0
     * @param    rate    Optional parameter: value greater than 0
     * @param    tempo    Optional parameter: value greater than 0
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createVoiceEffectAsync(
                final String callSid,
                final AudioDirection audioDirection,
                final Double pitchSemiTones,
                final Double pitchOctaves,
                final Double pitch,
                final Double rate,
                final Double tempo,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == callSid)
            throw new NullPointerException("The parameter \"callSid\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/calls/voiceeffect.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5088967189357401347L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5043746059774683449L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4956047912231800837L;
            {
                    put( "CallSid", callSid );
                    put( "AudioDirection", (null != audioDirection) ? audioDirection.value() : null );
                    put( "PitchSemiTones", pitchSemiTones );
                    put( "PitchOctaves", pitchOctaves );
                    put( "Pitch", pitch );
                    put( "Rate", rate );
                    put( "Tempo", tempo );
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
     * @param    callSid    Required parameter: The unique identifier of each call resource
     * @param    playDtmf    Required parameter: DTMF digits to play to the call. 0-9, #, *, W, or w
     * @param    playDtmfDirection    Optional parameter: The leg of the call DTMF digits should be sent to
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createSendDigit(
                final String callSid,
                final String playDtmf,
                final Direction playDtmfDirection,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createSendDigitAsync(callSid, playDtmf, playDtmfDirection, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Play Dtmf and send the Digit
     * @param    callSid    Required parameter: The unique identifier of each call resource
     * @param    playDtmf    Required parameter: DTMF digits to play to the call. 0-9, #, *, W, or w
     * @param    playDtmfDirection    Optional parameter: The leg of the call DTMF digits should be sent to
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createSendDigitAsync(
                final String callSid,
                final String playDtmf,
                final Direction playDtmfDirection,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == callSid)
            throw new NullPointerException("The parameter \"callSid\" is a required parameter and cannot be null.");

        if (null == playDtmf)
            throw new NullPointerException("The parameter \"playDtmf\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/calls/senddigits.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5320917020059106638L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5307242391787390389L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4917531484256430617L;
            {
                    put( "CallSid", callSid );
                    put( "PlayDtmf", playDtmf );
                    put( "PlayDtmfDirection", (null != playDtmfDirection) ? playDtmfDirection.value() : null );
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
     * @param    callSid    Required parameter: Call SId
     * @param    url    Optional parameter: URL the in-progress call will be redirected to
     * @param    method    Optional parameter: The method used to request the above Url parameter
     * @param    status    Optional parameter: Status to set the in-progress call to
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the String response from the API call 
     */
    public String createInterruptedCall(
                final String callSid,
                final String url,
                final HttpMethod method,
                final InterruptedCallStatus status,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createInterruptedCallAsync(callSid, url, method, status, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Interrupt the Call by Call Sid
     * @param    callSid    Required parameter: Call SId
     * @param    url    Optional parameter: URL the in-progress call will be redirected to
     * @param    method    Optional parameter: The method used to request the above Url parameter
     * @param    status    Optional parameter: Status to set the in-progress call to
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createInterruptedCallAsync(
                final String callSid,
                final String url,
                final HttpMethod method,
                final InterruptedCallStatus status,
                final String responseType,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == callSid)
            throw new NullPointerException("The parameter \"callSid\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/calls/interruptcalls.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4778955652876340771L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5738617322426937962L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4955753063919931897L;
            {
                    put( "CallSid", callSid );
                    put( "Url", url );
                    put( "Method", (null != method) ? method.value() : null );
                    put( "Status", (null != status) ? status.value() : null );
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
     * @param    page    Optional parameter: Which page of the overall response will be returned. Zero indexed
     * @param    pageSize    Optional parameter: Number of individual resources listed in the response per page
     * @param    to    Optional parameter: Only list calls to this number
     * @param    from    Optional parameter: Only list calls from this number
     * @param    dateCreated    Optional parameter: Only list calls starting within the specified date range
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createListCalls(
                final String page,
                final String pageSize,
                final String to,
                final String from,
                final String dateCreated,
                final String responseType
    ) throws Throwable {
        APICallBackCatcher<Object> callback = new APICallBackCatcher<Object>();
        createListCallsAsync(page, pageSize, to, from, dateCreated, responseType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        callback.getResult();
    }

    /**
     * A list of calls associated with your Message360 account
     * @param    page    Optional parameter: Which page of the overall response will be returned. Zero indexed
     * @param    pageSize    Optional parameter: Number of individual resources listed in the response per page
     * @param    to    Optional parameter: Only list calls to this number
     * @param    from    Optional parameter: Only list calls from this number
     * @param    dateCreated    Optional parameter: Only list calls starting within the specified date range
     * @param    responseType    Optional parameter: Response format, xml or json
     * @return    Returns the void response from the API call 
     */
    public void createListCallsAsync(
                final String page,
                final String pageSize,
                final String to,
                final String from,
                final String dateCreated,
                final String responseType,
                final APICallBack<Object> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/calls/listcalls.{ResponseType}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4873646466754277880L;
            {
                    put( "ResponseType", (null != responseType) ? responseType : "json" );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5244221713069073490L;
            {
                    put( "user-agent", "message360-api" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5164032079870654915L;
            {
                    put( "Page", page );
                    put( "PageSize", pageSize );
                    put( "To", to );
                    put( "From", from );
                    put( "DateCreated", dateCreated );
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

                            //let the caller know of the success
                            callBack.onSuccess(_context, _context);
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