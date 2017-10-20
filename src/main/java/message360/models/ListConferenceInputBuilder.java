/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class ListConferenceInputBuilder {
    //the instance to build
    private ListConferenceInput listConferenceInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListConferenceInputBuilder() {
        listConferenceInput = new ListConferenceInput();
    }

    /**
     * Response type format xml or json
     */
    public ListConferenceInputBuilder responseType(String responseType) {
        listConferenceInput.setResponseType(responseType);
        return this;
    }

    /**
     * Which page of the overall response will be returned. Zero indexed
     */
    public ListConferenceInputBuilder page(Integer page) {
        listConferenceInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public ListConferenceInputBuilder pageSize(Integer pageSize) {
        listConferenceInput.setPageSize(pageSize);
        return this;
    }

    /**
     * Only return conferences with the specified FriendlyName
     */
    public ListConferenceInputBuilder friendlyName(String friendlyName) {
        listConferenceInput.setFriendlyName(friendlyName);
        return this;
    }

    public ListConferenceInputBuilder dateCreated(String dateCreated) {
        listConferenceInput.setDateCreated(dateCreated);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListConferenceInput build() {
        return listConferenceInput;
    }
}