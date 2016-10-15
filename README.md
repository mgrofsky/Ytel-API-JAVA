# Getting Started

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](http://apidocs.io/illustration/java?step=import0&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](http://apidocs.io/illustration/java?step=import1&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](http://apidocs.io/illustration/java?step=import2&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](http://apidocs.io/illustration/java?step=import3&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

## How to Use

The following section explains how to use the Message360 library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](http://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](http://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](http://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](http://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](http://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *Message360* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](http://apidocs.io/illustration/java?step=testProject0&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

Clicking the ``` Add ``` button will open a dialog where you need to specify Message360 in ``` Group Id ``` and Message360 in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](http://apidocs.io/illustration/java?step=testProject1&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](http://apidocs.io/illustration/java?step=testProject2&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *Message360* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication and Initialization
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| basicAuthUserName | The username to use with basic authentication |
| basicAuthPassword | The password to use with basic authentication |



API client can be initialized as following.

```java
// Initializing Object Mapper for Serialization and Deserialization purposes
public static ObjectMapper mapper = new ObjectMapper()
{
	private static final long serialVersionUID = -174113593500315394L;
	{
		configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
};

// Configuration parameters and credentials
String basicAuthUserName = "basicAuthUserName"; // The username to use with basic authentication
String basicAuthPassword = "basicAuthPassword"; // The password to use with basic authentication

Message360Client client = new Message360Client(basicAuthUserName, basicAuthPassword);
```

## Class Reference

### <a name="list_of_controllers"></a>List of Controllers

* [ConferenceController](#conference_controller)
* [TranscriptionController](#transcription_controller)
* [PhoneNumberController](#phone_number_controller)
* [UsageController](#usage_controller)
* [SMSController](#sms_controller)
* [AccountController](#account_controller)
* [RecordingController](#recording_controller)
* [CallController](#call_controller)
* [CarrierController](#carrier_controller)

### <a name="conference_controller"></a>![Class: ](http://apidocs.io/img/class.png "message360.controllers.ConferenceController") ConferenceController

#### Get singleton instance

The singleton instance of the ``` ConferenceController ``` class can be accessed from the API Client.

```java
ConferenceController conference = client.getConference();
```

#### <a name="create_view_participant_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.ConferenceController.createViewParticipantAsync") createViewParticipantAsync

> View Participant


```java
void createViewParticipantAsync(
        final String conferenceSid,
        final String participantSid,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | unique conference sid |
| participantSid |  ``` Required ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String conferenceSid = "ConferenceSid";
String participantSid = "ParticipantSid";
String responseType = "json";
// Invoking the API call with sample inputs
conference.createViewParticipantAsync(conferenceSid, participantSid, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_list_participant_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.ConferenceController.createListParticipantAsync") createListParticipantAsync

> List Participant


```java
void createListParticipantAsync(
        final String conferenceSid,
        final Integer page,
        final Integer pagesize,
        final Boolean muted,
        final Boolean deaf,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | unique conference sid |
| page |  ``` Optional ```  | page number |
| pagesize |  ``` Optional ```  | TODO: Add a parameter description |
| muted |  ``` Optional ```  | TODO: Add a parameter description |
| deaf |  ``` Optional ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String conferenceSid = "ConferenceSid";
Integer page = 237;
Integer pagesize = 237;
Boolean muted = true;
Boolean deaf = true;
String responseType = "json";
// Invoking the API call with sample inputs
conference.createListParticipantAsync(conferenceSid, page, pagesize, muted, deaf, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="add_participant_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.ConferenceController.addParticipantAsync") addParticipantAsync

> Add Participant in conference 


```java
void addParticipantAsync(
        final String conferencesid,
        final String participantnumber,
        final int tocountrycode,
        final Boolean muted,
        final Boolean deaf,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferencesid |  ``` Required ```  | Unique Conference Sid |
| participantnumber |  ``` Required ```  | Particiant Number |
| tocountrycode |  ``` Required ```  | TODO: Add a parameter description |
| muted |  ``` Optional ```  | TODO: Add a parameter description |
| deaf |  ``` Optional ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String conferencesid = "conferencesid";
String participantnumber = "participantnumber";
int tocountrycode = 237;
Boolean muted = true;
Boolean deaf = true;
String responseType = "json";
// Invoking the API call with sample inputs
conference.addParticipantAsync(conferencesid, participantnumber, tocountrycode, muted, deaf, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_view_conference_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.ConferenceController.createViewConferenceAsync") createViewConferenceAsync

> View Conference


```java
void createViewConferenceAsync(
        final String conferencesid,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferencesid |  ``` Required ```  | The unique identifier of each conference resource |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String conferencesid = "conferencesid";
String responseType = "json";
// Invoking the API call with sample inputs
conference.createViewConferenceAsync(conferencesid, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_list_conference_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.ConferenceController.createListConferenceAsync") createListConferenceAsync

> List Conference


```java
void createListConferenceAsync(
        final Integer page,
        final Integer pageSize,
        final String friendlyName,
        final InterruptedCallStatusEnum status,
        final String dateCreated,
        final String dateUpdated,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Which page of the overall response will be returned. Zero indexed |
| pageSize |  ``` Optional ```  | Number of individual resources listed in the response per page |
| friendlyName |  ``` Optional ```  | Only return conferences with the specified FriendlyName |
| status |  ``` Optional ```  | TODO: Add a parameter description |
| dateCreated |  ``` Optional ```  | TODO: Add a parameter description |
| dateUpdated |  ``` Optional ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
Integer page = 237;
Integer pageSize = 237;
String friendlyName = "FriendlyName";
InterruptedCallStatusEnum status = InterruptedCallStatusEnum.fromString("CANCELED");
String dateCreated = "DateCreated";
String dateUpdated = "DateUpdated";
String responseType = "json";
// Invoking the API call with sample inputs
conference.createListConferenceAsync(page, pageSize, friendlyName, status, dateCreated, dateUpdated, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="transcription_controller"></a>![Class: ](http://apidocs.io/img/class.png "message360.controllers.TranscriptionController") TranscriptionController

#### Get singleton instance

The singleton instance of the ``` TranscriptionController ``` class can be accessed from the API Client.

```java
TranscriptionController transcription = client.getTranscription();
```

#### <a name="create_list_transcription_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.TranscriptionController.createListTranscriptionAsync") createListTranscriptionAsync

> Get All transcriptions


```java
void createListTranscriptionAsync(
        final Integer page,
        final Integer pageSize,
        final StatusEnum status,
        final String dateTranscribed,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | TODO: Add a parameter description |
| pageSize |  ``` Optional ```  | TODO: Add a parameter description |
| status |  ``` Optional ```  | TODO: Add a parameter description |
| dateTranscribed |  ``` Optional ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
Integer page = 237;
Integer pageSize = 237;
StatusEnum status = StatusEnum.fromString("INPROGRESS");
String dateTranscribed = "DateTranscribed";
String responseType = "json";
// Invoking the API call with sample inputs
transcription.createListTranscriptionAsync(page, pageSize, status, dateTranscribed, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_recording_transcription_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.TranscriptionController.createRecordingTranscriptionAsync") createRecordingTranscriptionAsync

> Recording Transcriptions


```java
void createRecordingTranscriptionAsync(
        final String recordingSid,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recordingSid |  ``` Required ```  | Unique Recording sid |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String recordingSid = "RecordingSid";
String responseType = "json";
// Invoking the API call with sample inputs
transcription.createRecordingTranscriptionAsync(recordingSid, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_view_transcription_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.TranscriptionController.createViewTranscriptionAsync") createViewTranscriptionAsync

> View Specific Transcriptions


```java
void createViewTranscriptionAsync(
        final String transcriptionSid,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| transcriptionSid |  ``` Required ```  | Unique Transcription ID |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String transcriptionSid = "TranscriptionSid";
String responseType = "json";
// Invoking the API call with sample inputs
transcription.createViewTranscriptionAsync(transcriptionSid, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_audio_url_transcription_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.TranscriptionController.createAudioURLTranscriptionAsync") createAudioURLTranscriptionAsync

> Audio URL Transcriptions


```java
void createAudioURLTranscriptionAsync(
        final String audioUrl,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| audioUrl |  ``` Required ```  | Audio url |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String audioUrl = "AudioUrl";
String responseType = "json";
// Invoking the API call with sample inputs
transcription.createAudioURLTranscriptionAsync(audioUrl, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="phone_number_controller"></a>![Class: ](http://apidocs.io/img/class.png "message360.controllers.PhoneNumberController") PhoneNumberController

#### Get singleton instance

The singleton instance of the ``` PhoneNumberController ``` class can be accessed from the API Client.

```java
PhoneNumberController phoneNumber = client.getPhoneNumber();
```

#### <a name="create_available_phone_number_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.PhoneNumberController.createAvailablePhoneNumberAsync") createAvailablePhoneNumberAsync

> Available Phone Number


```java
void createAvailablePhoneNumberAsync(
        final String numberType,
        final String areaCode,
        final Integer pageSize,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| numberType |  ``` Required ```  | Number type either SMS,Voice or all |
| areaCode |  ``` Required ```  | Phone Number Area Code |
| pageSize |  ``` Optional ```  | Page Size |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String numberType = "NumberType";
String areaCode = "AreaCode";
Integer pageSize = 237;
String responseType = "json";
// Invoking the API call with sample inputs
phoneNumber.createAvailablePhoneNumberAsync(numberType, areaCode, pageSize, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_list_number_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.PhoneNumberController.createListNumberAsync") createListNumberAsync

> List Account's Phone number details


```java
void createListNumberAsync(
        final Integer page,
        final Integer pageSize,
        final String numberType,
        final String friendlyName,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Which page of the overall response will be returned. Zero indexed |
| pageSize |  ``` Optional ```  | Number of individual resources listed in the response per page |
| numberType |  ``` Optional ```  | TODO: Add a parameter description |
| friendlyName |  ``` Optional ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
Integer page = 237;
Integer pageSize = 237;
String numberType = "NumberType";
String friendlyName = "FriendlyName";
String responseType = "json";
// Invoking the API call with sample inputs
phoneNumber.createListNumberAsync(page, pageSize, numberType, friendlyName, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_release_number_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.PhoneNumberController.createReleaseNumberAsync") createReleaseNumberAsync

> Release number from account


```java
void createReleaseNumberAsync(
        final String phoneNumber,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | Phone number to be relase |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String phoneNumber = "PhoneNumber";
String responseType = "json";
// Invoking the API call with sample inputs
phoneNumber.createReleaseNumberAsync(phoneNumber, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_buy_number_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.PhoneNumberController.createBuyNumberAsync") createBuyNumberAsync

> Buy Phone Number 


```java
void createBuyNumberAsync(
        final String phoneNumber,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | Phone number to be purchase |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String phoneNumber = "PhoneNumber";
String responseType = "json";
// Invoking the API call with sample inputs
phoneNumber.createBuyNumberAsync(phoneNumber, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_view_number_details_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.PhoneNumberController.createViewNumberDetailsAsync") createViewNumberDetailsAsync

> Get Phone Number Details


```java
void createViewNumberDetailsAsync(
        final String phoneNumber,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | Get Phone number Detail |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String phoneNumber = "PhoneNumber";
String responseType = "json";
// Invoking the API call with sample inputs
phoneNumber.createViewNumberDetailsAsync(phoneNumber, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="update_phone_number_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.PhoneNumberController.updatePhoneNumberAsync") updatePhoneNumberAsync

> Update Phone Number Details


```java
void updatePhoneNumberAsync(
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
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | TODO: Add a parameter description |
| friendlyName |  ``` Optional ```  | TODO: Add a parameter description |
| voiceUrl |  ``` Optional ```  | URL requested once the call connects |
| voiceMethod |  ``` Optional ```  | TODO: Add a parameter description |
| voiceFallbackUrl |  ``` Optional ```  | URL requested if the voice URL is not available |
| voiceFallbackMethod |  ``` Optional ```  | TODO: Add a parameter description |
| hangupCallback |  ``` Optional ```  | TODO: Add a parameter description |
| hangupCallbackMethod |  ``` Optional ```  | TODO: Add a parameter description |
| heartbeatUrl |  ``` Optional ```  | URL requested once the call connects |
| heartbeatMethod |  ``` Optional ```  | URL that can be requested every 60 seconds during the call to notify of elapsed time |
| smsUrl |  ``` Optional ```  | URL requested when an SMS is received |
| smsMethod |  ``` Optional ```  | TODO: Add a parameter description |
| smsFallbackUrl |  ``` Optional ```  | URL requested once the call connects |
| smsFallbackMethod |  ``` Optional ```  | URL requested if the sms URL is not available |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String phoneNumber = "PhoneNumber";
String friendlyName = "FriendlyName";
String voiceUrl = "VoiceUrl";
HttpMethodEnum voiceMethod = HttpMethodEnum.fromString("GET");
String voiceFallbackUrl = "VoiceFallbackUrl";
HttpMethodEnum voiceFallbackMethod = HttpMethodEnum.fromString("GET");
String hangupCallback = "HangupCallback";
HttpMethodEnum hangupCallbackMethod = HttpMethodEnum.fromString("GET");
String heartbeatUrl = "HeartbeatUrl";
HttpMethodEnum heartbeatMethod = HttpMethodEnum.fromString("GET");
String smsUrl = "SmsUrl";
HttpMethodEnum smsMethod = HttpMethodEnum.fromString("GET");
String smsFallbackUrl = "SmsFallbackUrl";
HttpMethodEnum smsFallbackMethod = HttpMethodEnum.fromString("GET");
String responseType = "json";
// Invoking the API call with sample inputs
phoneNumber.updatePhoneNumberAsync(phoneNumber, friendlyName, voiceUrl, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="usage_controller"></a>![Class: ](http://apidocs.io/img/class.png "message360.controllers.UsageController") UsageController

#### Get singleton instance

The singleton instance of the ``` UsageController ``` class can be accessed from the API Client.

```java
UsageController usage = client.getUsage();
```

#### <a name="create_list_usage_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.UsageController.createListUsageAsync") createListUsageAsync

> Get all usage 


```java
void createListUsageAsync(
        final String productCode,
        final String startDate,
        final String endDate,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| productCode |  ``` Required ```  ``` DefaultValue ```  | Product Code |
| startDate |  ``` Required ```  ``` DefaultValue ```  | Start Usage Date |
| endDate |  ``` Required ```  ``` DefaultValue ```  | End Usage Date |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String productCode = "0";
String startDate = "2016-09-06";
String endDate = "2016-09-06";
String responseType = "json";
// Invoking the API call with sample inputs
usage.createListUsageAsync(productCode, startDate, endDate, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="sms_controller"></a>![Class: ](http://apidocs.io/img/class.png "message360.controllers.SMSController") SMSController

#### Get singleton instance

The singleton instance of the ``` SMSController ``` class can be accessed from the API Client.

```java
SMSController sMS = client.getSMS();
```

#### <a name="create_send_sms_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.SMSController.createSendSMSAsync") createSendSMSAsync

> Send an SMS from a message360 number


```java
void createSendSMSAsync(
        final int fromcountrycode,
        final String from,
        final int tocountrycode,
        final String to,
        final String body,
        final HttpMethodEnum method,
        final String messagestatuscallback,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| fromcountrycode |  ``` Required ```  ``` DefaultValue ```  | From Country Code |
| from |  ``` Required ```  | SMS enabled Message360 number to send this message from |
| tocountrycode |  ``` Required ```  ``` DefaultValue ```  | To country code |
| to |  ``` Required ```  | Number to send the SMS to |
| body |  ``` Required ```  | Text Message To Send |
| method |  ``` Optional ```  | Specifies the HTTP method used to request the required URL once SMS sent. |
| messagestatuscallback |  ``` Optional ```  | URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
int fromcountrycode = 1;
String from = "from";
int tocountrycode = 1;
String to = "to";
String body = "body";
HttpMethodEnum method = HttpMethodEnum.fromString("GET");
String messagestatuscallback = "messagestatuscallback";
String responseType = "json";
// Invoking the API call with sample inputs
sMS.createSendSMSAsync(fromcountrycode, from, tocountrycode, to, body, method, messagestatuscallback, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_view_sms_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.SMSController.createViewSMSAsync") createViewSMSAsync

> View Particular SMS


```java
void createViewSMSAsync(
        final String messagesid,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messagesid |  ``` Required ```  | Message sid |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String messagesid = "messagesid";
String responseType = "json";
// Invoking the API call with sample inputs
sMS.createViewSMSAsync(messagesid, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_list_sms_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.SMSController.createListSMSAsync") createListSMSAsync

> List All SMS


```java
void createListSMSAsync(
        final Integer page,
        final Integer pagesize,
        final String from,
        final String to,
        final String datesent,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Which page of the overall response will be returned. Zero indexed |
| pagesize |  ``` Optional ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | Messages sent from this number |
| to |  ``` Optional ```  | Messages sent to this number |
| datesent |  ``` Optional ```  | Only list SMS messages sent in the specified date range |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
Integer page = 195;
Integer pagesize = 195;
String from = "from";
String to = "to";
String datesent = "datesent";
String responseType = "json";
// Invoking the API call with sample inputs
sMS.createListSMSAsync(page, pagesize, from, to, datesent, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_list_inbound_sms_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.SMSController.createListInboundSMSAsync") createListInboundSMSAsync

> List All Inbound SMS


```java
void createListInboundSMSAsync(
        final Integer page,
        final String pagesize,
        final String from,
        final String to,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Which page of the overall response will be returned. Zero indexed |
| pagesize |  ``` Optional ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | From Number to Inbound SMS |
| to |  ``` Optional ```  | To Number to get Inbound SMS |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
Integer page = 195;
String pagesize = "pagesize";
String from = "from";
String to = "to";
String responseType = "json";
// Invoking the API call with sample inputs
sMS.createListInboundSMSAsync(page, pagesize, from, to, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="account_controller"></a>![Class: ](http://apidocs.io/img/class.png "message360.controllers.AccountController") AccountController

#### Get singleton instance

The singleton instance of the ``` AccountController ``` class can be accessed from the API Client.

```java
AccountController account = client.getAccount();
```

#### <a name="create_view_account_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.AccountController.createViewAccountAsync") createViewAccountAsync

> Display Account Description


```java
void createViewAccountAsync(
        final String date,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| date |  ``` Required ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
String date = "date";
String responseType = "json";
// Invoking the API call with sample inputs
account.createViewAccountAsync(date, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="recording_controller"></a>![Class: ](http://apidocs.io/img/class.png "message360.controllers.RecordingController") RecordingController

#### Get singleton instance

The singleton instance of the ``` RecordingController ``` class can be accessed from the API Client.

```java
RecordingController recording = client.getRecording();
```

#### <a name="create_delete_recording_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.RecordingController.createDeleteRecordingAsync") createDeleteRecordingAsync

> Delete Recording Record


```java
void createDeleteRecordingAsync(
        final String recordingSid,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recordingSid |  ``` Required ```  | Unique Recording Sid to be delete |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String recordingSid = "RecordingSid";
String responseType = "json";
// Invoking the API call with sample inputs
recording.createDeleteRecordingAsync(recordingSid, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_view_recording_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.RecordingController.createViewRecordingAsync") createViewRecordingAsync

> View a specific Recording


```java
void createViewRecordingAsync(
        final String recordingSid,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recordingSid |  ``` Required ```  | Search Recording sid |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String recordingSid = "RecordingSid";
String responseType = "json";
// Invoking the API call with sample inputs
recording.createViewRecordingAsync(recordingSid, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_list_recording_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.RecordingController.createListRecordingAsync") createListRecordingAsync

> List out Recordings


```java
void createListRecordingAsync(
        final Integer page,
        final Integer pageSize,
        final String dateCreated,
        final String callSid,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Which page of the overall response will be returned. Zero indexed |
| pageSize |  ``` Optional ```  | Number of individual resources listed in the response per page |
| dateCreated |  ``` Optional ```  | TODO: Add a parameter description |
| callSid |  ``` Optional ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
Integer page = 195;
Integer pageSize = 195;
String dateCreated = "DateCreated";
String callSid = "CallSid";
String responseType = "json";
// Invoking the API call with sample inputs
recording.createListRecordingAsync(page, pageSize, dateCreated, callSid, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="call_controller"></a>![Class: ](http://apidocs.io/img/class.png "message360.controllers.CallController") CallController

#### Get singleton instance

The singleton instance of the ``` CallController ``` class can be accessed from the API Client.

```java
CallController call = client.getCall();
```

#### <a name="create_view_call_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.CallController.createViewCallAsync") createViewCallAsync

> View Call Response


```java
void createViewCallAsync(
        final String callsid,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callsid |  ``` Required ```  | Call Sid id for particular Call |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String callsid = "callsid";
String responseType = "json";
// Invoking the API call with sample inputs
call.createViewCallAsync(callsid, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_make_call_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.CallController.createMakeCallAsync") createMakeCallAsync

> You can experiment with initiating a call through Message360 and view the request response generated when doing so and get the response in json


```java
void createMakeCallAsync(
        final String fromCountryCode,
        final String from,
        final String toCountryCode,
        final String to,
        final String url,
        final HttpMethodEnum method,
        final String statusCallBackUrl,
        final HttpMethodEnum statusCallBackMethod,
        final String fallBackUrl,
        final HttpMethodEnum fallBackMethod,
        final String heartBeatUrl,
        final Boolean heartBeatMethod,
        final Integer timeout,
        final String playDtmf,
        final Boolean hideCallerId,
        final Boolean record,
        final String recordCallBackUrl,
        final HttpMethodEnum recordCallBackMethod,
        final Boolean transcribe,
        final String transcribeCallBackUrl,
        final IfMachineEnum ifMachine,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| fromCountryCode |  ``` Required ```  | from country code |
| from |  ``` Required ```  | This number to display on Caller ID as calling |
| toCountryCode |  ``` Required ```  | To cuntry code number |
| to |  ``` Required ```  | To number |
| url |  ``` Required ```  | URL requested once the call connects |
| method |  ``` Optional ```  | Specifies the HTTP method used to request the required URL once call connects. |
| statusCallBackUrl |  ``` Optional ```  | specifies the HTTP methodlinkclass used to request StatusCallbackUrl. |
| statusCallBackMethod |  ``` Optional ```  | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. |
| fallBackUrl |  ``` Optional ```  | URL requested if the initial Url parameter fails or encounters an error |
| fallBackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required FallbackUrl once call connects. |
| heartBeatUrl |  ``` Optional ```  | URL that can be requested every 60 seconds during the call to notify of elapsed tim |
| heartBeatMethod |  ``` Optional ```  | Specifies the HTTP method used to request HeartbeatUrl. |
| timeout |  ``` Optional ```  | Time (in seconds) Message360 should wait while the call is ringing before canceling the call |
| playDtmf |  ``` Optional ```  | DTMF Digits to play to the call once it connects. 0-9, #, or * |
| hideCallerId |  ``` Optional ```  | Specifies if the caller id will be hidden |
| record |  ``` Optional ```  | Specifies if the call should be recorded |
| recordCallBackUrl |  ``` Optional ```  | Recording parameters will be sent here upon completion |
| recordCallBackMethod |  ``` Optional ```  | Method used to request the RecordCallback URL. |
| transcribe |  ``` Optional ```  | Specifies if the call recording should be transcribed |
| transcribeCallBackUrl |  ``` Optional ```  | Transcription parameters will be sent here upon completion |
| ifMachine |  ``` Optional ```  | How Message360 should handle the receiving numbers voicemail machine |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String fromCountryCode = "FromCountryCode";
String from = "From";
String toCountryCode = "ToCountryCode";
String to = "To";
String url = "Url";
HttpMethodEnum method = HttpMethodEnum.fromString("GET");
String statusCallBackUrl = "StatusCallBackUrl";
HttpMethodEnum statusCallBackMethod = HttpMethodEnum.fromString("GET");
String fallBackUrl = "FallBackUrl";
HttpMethodEnum fallBackMethod = HttpMethodEnum.fromString("GET");
String heartBeatUrl = "HeartBeatUrl";
Boolean heartBeatMethod = true;
Integer timeout = 195;
String playDtmf = "PlayDtmf";
Boolean hideCallerId = true;
Boolean record = true;
String recordCallBackUrl = "RecordCallBackUrl";
HttpMethodEnum recordCallBackMethod = HttpMethodEnum.fromString("GET");
Boolean transcribe = true;
String transcribeCallBackUrl = "TranscribeCallBackUrl";
IfMachineEnum ifMachine = IfMachineEnum.fromString("CONTINUE");
String responseType = "json";
// Invoking the API call with sample inputs
call.createMakeCallAsync(fromCountryCode, from, toCountryCode, to, url, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl, ifMachine, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_play_audio_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.CallController.createPlayAudioAsync") createPlayAudioAsync

> Play Dtmf and send the Digit


```java
void createPlayAudioAsync(
        final int length,
        final DirectionEnum direction,
        final boolean loop,
        final boolean mix,
        final String callSid,
        final String audioUrl,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| length |  ``` Required ```  | Time limit in seconds for audio play back |
| direction |  ``` Required ```  | The leg of the call audio will be played to |
| loop |  ``` Required ```  | Repeat audio playback indefinitely |
| mix |  ``` Required ```  | If false, all other audio will be muted |
| callSid |  ``` Optional ```  | The unique identifier of each call resource |
| audioUrl |  ``` Optional ```  | URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
int length = 195;
DirectionEnum direction = DirectionEnum.fromString("IN");
boolean loop = true;
boolean mix = true;
String callSid = "CallSid";
String audioUrl = "AudioUrl";
String responseType = "json";
// Invoking the API call with sample inputs
call.createPlayAudioAsync(length, direction, loop, mix, callSid, audioUrl, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_record_call_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.CallController.createRecordCallAsync") createRecordCallAsync

> Record a Call


```java
void createRecordCallAsync(
        final String callSid,
        final boolean record,
        final DirectionEnum direction,
        final Integer timeLimit,
        final String callBackUrl,
        final AudioFormatEnum fileformat,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | The unique identifier of each call resource |
| record |  ``` Required ```  | Set true to initiate recording or false to terminate recording |
| direction |  ``` Optional ```  | The leg of the call to record |
| timeLimit |  ``` Optional ```  | Time in seconds the recording duration should not exceed |
| callBackUrl |  ``` Optional ```  | URL consulted after the recording completes |
| fileformat |  ``` Optional ```  | Format of the recording file. Can be .mp3 or .wav |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String callSid = "CallSid";
boolean record = true;
DirectionEnum direction = DirectionEnum.fromString("IN");
Integer timeLimit = 195;
String callBackUrl = "CallBackUrl";
AudioFormatEnum fileformat = AudioFormatEnum.fromString("mp3");
String responseType = "json";
// Invoking the API call with sample inputs
call.createRecordCallAsync(callSid, record, direction, timeLimit, callBackUrl, fileformat, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_voice_effect_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.CallController.createVoiceEffectAsync") createVoiceEffectAsync

> Voice Effect


```java
void createVoiceEffectAsync(
        final String callSid,
        final AudioDirectionEnum audioDirection,
        final Double pitchSemiTones,
        final Double pitchOctaves,
        final Double pitch,
        final Double rate,
        final Double tempo,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | TODO: Add a parameter description |
| audioDirection |  ``` Optional ```  | TODO: Add a parameter description |
| pitchSemiTones |  ``` Optional ```  | value between -14 and 14 |
| pitchOctaves |  ``` Optional ```  | value between -1 and 1 |
| pitch |  ``` Optional ```  | value greater than 0 |
| rate |  ``` Optional ```  | value greater than 0 |
| tempo |  ``` Optional ```  | value greater than 0 |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String callSid = "CallSid";
AudioDirectionEnum audioDirection = AudioDirectionEnum.fromString("IN");
Double pitchSemiTones = 195.57036766809;
Double pitchOctaves = 195.57036766809;
Double pitch = 195.57036766809;
Double rate = 195.57036766809;
Double tempo = 195.57036766809;
String responseType = "json";
// Invoking the API call with sample inputs
call.createVoiceEffectAsync(callSid, audioDirection, pitchSemiTones, pitchOctaves, pitch, rate, tempo, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_send_digit_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.CallController.createSendDigitAsync") createSendDigitAsync

> Play Dtmf and send the Digit


```java
void createSendDigitAsync(
        final String callSid,
        final String playDtmf,
        final DirectionEnum playDtmfDirection,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | The unique identifier of each call resource |
| playDtmf |  ``` Required ```  | DTMF digits to play to the call. 0-9, #, *, W, or w |
| playDtmfDirection |  ``` Optional ```  | The leg of the call DTMF digits should be sent to |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String callSid = "CallSid";
String playDtmf = "PlayDtmf";
DirectionEnum playDtmfDirection = DirectionEnum.fromString("IN");
String responseType = "json";
// Invoking the API call with sample inputs
call.createSendDigitAsync(callSid, playDtmf, playDtmfDirection, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_interrupted_call_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.CallController.createInterruptedCallAsync") createInterruptedCallAsync

> Interrupt the Call by Call Sid


```java
void createInterruptedCallAsync(
        final String callSid,
        final String url,
        final HttpMethodEnum method,
        final InterruptedCallStatusEnum status,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | Call SId |
| url |  ``` Optional ```  | URL the in-progress call will be redirected to |
| method |  ``` Optional ```  | The method used to request the above Url parameter |
| status |  ``` Optional ```  | Status to set the in-progress call to |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String callSid = "CallSid";
String url = "Url";
HttpMethodEnum method = HttpMethodEnum.fromString("GET");
InterruptedCallStatusEnum status = InterruptedCallStatusEnum.fromString("CANCELED");
String responseType = "json";
// Invoking the API call with sample inputs
call.createInterruptedCallAsync(callSid, url, method, status, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_list_calls_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.CallController.createListCallsAsync") createListCallsAsync

> A list of calls associated with your Message360 account


```java
void createListCallsAsync(
        final String page,
        final String pageSize,
        final String to,
        final String from,
        final String dateCreated,
        final String responseType,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Which page of the overall response will be returned. Zero indexed |
| pageSize |  ``` Optional ```  | Number of individual resources listed in the response per page |
| to |  ``` Optional ```  | Only list calls to this number |
| from |  ``` Optional ```  | Only list calls from this number |
| dateCreated |  ``` Optional ```  | Only list calls starting within the specified date range |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String page = "Page";
String pageSize = "PageSize";
String to = "To";
String from = "From";
String dateCreated = "DateCreated";
String responseType = "json";
// Invoking the API call with sample inputs
call.createListCallsAsync(page, pageSize, to, from, dateCreated, responseType, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="carrier_controller"></a>![Class: ](http://apidocs.io/img/class.png "message360.controllers.CarrierController") CarrierController

#### Get singleton instance

The singleton instance of the ``` CarrierController ``` class can be accessed from the API Client.

```java
CarrierController carrier = client.getCarrier();
```

#### <a name="create_carrier_lookup_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.CarrierController.createCarrierLookupAsync") createCarrierLookupAsync

> Get the Carrier Lookup


```java
void createCarrierLookupAsync(
        final String phonenumber,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phonenumber |  ``` Required ```  | The number to lookup |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String phonenumber = "phonenumber";
String responseType = "json";
// Invoking the API call with sample inputs
carrier.createCarrierLookupAsync(phonenumber, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_carrier_lookup_list_async"></a>![Method: ](http://apidocs.io/img/method.png "message360.controllers.CarrierController.createCarrierLookupListAsync") createCarrierLookupListAsync

> Get the All Purchase Number's Carrier lookup


```java
void createCarrierLookupListAsync(
        final String page,
        final String pagesize,
        final String responseType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Page Number |
| pagesize |  ``` Optional ```  | Page Size |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
String page = "page";
String pagesize = "pagesize";
String responseType = "json";
// Invoking the API call with sample inputs
carrier.createCarrierLookupListAsync(page, pagesize, responseType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)



