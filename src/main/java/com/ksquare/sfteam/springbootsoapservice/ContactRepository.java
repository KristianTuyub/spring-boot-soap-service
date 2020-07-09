package com.ksquare.sfteam.springbootsoapservice;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import https.theksquaregroup_com.xml.contact.Contact;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class ContactRepository {
    private static final Map<String, Contact> contacts = new HashMap<>();

    @PostConstruct
    public void initData() {

        Contact contact = new Contact();
        contact.setName("Kyle");
        contact.setLastName("Rayner");
        contact.setHeroName("Green Lantern");
        contact.setRequestDescription("As a green lantern I got assigned to protect this sector It would be cool to work together");
        contact.setAge(32);
        contact.setSuperPower("Pass through certain solid objects, Energy Construct Creation, etc.");
        contact.setImg("https://www.superherodb.com/pictures2/portraits/10/100/1409.jpg");
        contacts.put(contact.getName(), contact);

        contact = new Contact();
        contact.setName("Bruce");
        contact.setLastName("Banner");
        contact.setHeroName("Hulk");
        contact.setRequestDescription("Reserved");
        contact.setAge(32);
        contact.setSuperPower("Nuclear physicist, Agent of S.H.I.E.L.D.");
        contact.setImg("https://www.superherodb.com/pictures2/portraits/10/100/83.jpg");
        contacts.put(contact.getName(), contact);

    }

    public Contact findContact(String name) {
        Contact contact = contacts.get(name);

        Contact emptyContact = new Contact();
        emptyContact.setName("Not Found");
        emptyContact.setLastName("Not Found");
        emptyContact.setHeroName("Not Found");
        emptyContact.setRequestDescription("Not Found");
        emptyContact.setAge(0);
        emptyContact.setSuperPower("Not Found");
        emptyContact.setImg("Not Found");

        return contact == null ? emptyContact : contact;
    }
}
