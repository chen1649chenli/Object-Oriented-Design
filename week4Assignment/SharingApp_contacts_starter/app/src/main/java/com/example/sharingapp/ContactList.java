package com.example.sharingapp;

import java.util.ArrayList;

public class ContactList {
    private static ArrayList<Contact> contacts;
    private String FILENAME = "contacts.sav";

    public ContactList(){
        contacts = new ArrayList<Contact>();
    }
}
