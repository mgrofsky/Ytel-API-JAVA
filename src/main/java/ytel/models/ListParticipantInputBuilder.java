/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;

public class ListParticipantInputBuilder {
    //the instance to build
    private ListParticipantInput listParticipantInput;

    /**
     * Default constructor to initialize the instance
     */
    public ListParticipantInputBuilder() {
        listParticipantInput = new ListParticipantInput();
    }

    /**
     * The unique identifier for a conference.
     */
    public ListParticipantInputBuilder conferenceSid(String conferenceSid) {
        listParticipantInput.setConferenceSid(conferenceSid);
        return this;
    }

    /**
     * Response format, xml or json
     */
    public ListParticipantInputBuilder responseType(String responseType) {
        listParticipantInput.setResponseType(responseType);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public ListParticipantInputBuilder page(Integer page) {
        listParticipantInput.setPage(page);
        return this;
    }

    /**
     * The count of objects to return per page.
     */
    public ListParticipantInputBuilder pagesize(Integer pagesize) {
        listParticipantInput.setPagesize(pagesize);
        return this;
    }

    /**
     * Specifies if participant should be muted.
     */
    public ListParticipantInputBuilder muted(Boolean muted) {
        listParticipantInput.setMuted(muted);
        return this;
    }

    /**
     * Specifies if the participant should hear audio in the conference.
     */
    public ListParticipantInputBuilder deaf(Boolean deaf) {
        listParticipantInput.setDeaf(deaf);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListParticipantInput build() {
        return listParticipantInput;
    }
}