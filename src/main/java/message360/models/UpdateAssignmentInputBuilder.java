/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class UpdateAssignmentInputBuilder {
    //the instance to build
    private UpdateAssignmentInput updateAssignmentInput;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateAssignmentInputBuilder() {
        updateAssignmentInput = new UpdateAssignmentInput();
    }

    /**
     * List of valid shortcode to your message360 account
     */
    public UpdateAssignmentInputBuilder shortcode(String shortcode) {
        updateAssignmentInput.setShortcode(shortcode);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public UpdateAssignmentInputBuilder responseType(String responseType) {
        updateAssignmentInput.setResponseType(responseType);
        return this;
    }

    /**
     * User generated name of the shortcode
     */
    public UpdateAssignmentInputBuilder friendlyName(String friendlyName) {
        updateAssignmentInput.setFriendlyName(friendlyName);
        return this;
    }

    /**
     * URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
     */
    public UpdateAssignmentInputBuilder callbackUrl(String callbackUrl) {
        updateAssignmentInput.setCallbackUrl(callbackUrl);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
     */
    public UpdateAssignmentInputBuilder callbackMethod(HttpActionEnum callbackMethod) {
        updateAssignmentInput.setCallbackMethod(callbackMethod);
        return this;
    }

    /**
     * URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.
     */
    public UpdateAssignmentInputBuilder fallbackUrl(String fallbackUrl) {
        updateAssignmentInput.setFallbackUrl(fallbackUrl);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required FallbackUrl once call connects.
     */
    public UpdateAssignmentInputBuilder fallbackUrlMethod(HttpActionEnum fallbackUrlMethod) {
        updateAssignmentInput.setFallbackUrlMethod(fallbackUrlMethod);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateAssignmentInput build() {
        return updateAssignmentInput;
    }
}