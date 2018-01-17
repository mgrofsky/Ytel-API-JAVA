/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class UpdateDedicatedShortCodeAssignmentInputBuilder {
    //the instance to build
    private UpdateDedicatedShortCodeAssignmentInput updateDedicatedShortCodeAssignmentInput;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateDedicatedShortCodeAssignmentInputBuilder() {
        updateDedicatedShortCodeAssignmentInput = new UpdateDedicatedShortCodeAssignmentInput();
    }

    /**
     * List of valid dedicated shortcode to your message360 account.
     */
    public UpdateDedicatedShortCodeAssignmentInputBuilder shortcode(String shortcode) {
        updateDedicatedShortCodeAssignmentInput.setShortcode(shortcode);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public UpdateDedicatedShortCodeAssignmentInputBuilder responseType(String responseType) {
        updateDedicatedShortCodeAssignmentInput.setResponseType(responseType);
        return this;
    }

    /**
     * User generated name of the dedicated shortcode.
     */
    public UpdateDedicatedShortCodeAssignmentInputBuilder friendlyName(String friendlyName) {
        updateDedicatedShortCodeAssignmentInput.setFriendlyName(friendlyName);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
     */
    public UpdateDedicatedShortCodeAssignmentInputBuilder callbackMethod(String callbackMethod) {
        updateDedicatedShortCodeAssignmentInput.setCallbackMethod(callbackMethod);
        return this;
    }

    /**
     * URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
     */
    public UpdateDedicatedShortCodeAssignmentInputBuilder callbackUrl(String callbackUrl) {
        updateDedicatedShortCodeAssignmentInput.setCallbackUrl(callbackUrl);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required FallbackUrl once call connects.
     */
    public UpdateDedicatedShortCodeAssignmentInputBuilder fallbackMethod(String fallbackMethod) {
        updateDedicatedShortCodeAssignmentInput.setFallbackMethod(fallbackMethod);
        return this;
    }

    /**
     * URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.
     */
    public UpdateDedicatedShortCodeAssignmentInputBuilder fallbackUrl(String fallbackUrl) {
        updateDedicatedShortCodeAssignmentInput.setFallbackUrl(fallbackUrl);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateDedicatedShortCodeAssignmentInput build() {
        return updateDedicatedShortCodeAssignmentInput;
    }
}