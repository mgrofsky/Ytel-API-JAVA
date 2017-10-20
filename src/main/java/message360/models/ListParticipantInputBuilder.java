/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

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
     * unique conference sid
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
     * page number
     */
    public ListParticipantInputBuilder page(Integer page) {
        listParticipantInput.setPage(page);
        return this;
    }

    public ListParticipantInputBuilder pagesize(Integer pagesize) {
        listParticipantInput.setPagesize(pagesize);
        return this;
    }

    public ListParticipantInputBuilder muted(Boolean muted) {
        listParticipantInput.setMuted(muted);
        return this;
    }

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