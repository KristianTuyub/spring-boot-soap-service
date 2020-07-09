package com.ksquare.sfteam.springbootsoapservice;

import https.theksquaregroup_com.xml.contact.ContactDetailsRequest;
import https.theksquaregroup_com.xml.contact.ContactDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ContactEndpoint {
    private static final String NAMESPACE_URI = "https://theksquaregroup.com/xml/contact";

    private ContactRepository contactRepository;

    @Autowired
    public ContactEndpoint(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ContactDetailsRequest")
    @ResponsePayload
    public ContactDetailsResponse getContact(@RequestPayload ContactDetailsRequest request) {
        ContactDetailsResponse response = new ContactDetailsResponse();
        response.setContact(contactRepository.findContact(request.getName()));

        return response;
    }
}
