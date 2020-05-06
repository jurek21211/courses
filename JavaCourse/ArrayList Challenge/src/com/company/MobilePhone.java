package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already on file.");
            return false;
        }
        contactList.add(contact);
        return true;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < this.contactList.size(); i++) {
            System.out.println((i + 1) + ". " + this.contactList.get(i).getName() + " -> " + this.contactList.get(i).getNumber());
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " not found");
            return false;
        }
        this.contactList.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    private int findContact(Contact contact) {
        return this.contactList.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < this.contactList.size(); i++) {
            Contact contact = this.contactList.get(i);
            if (contact.getName().equals(name))
                return i;
        }
        return -1;
    }


    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >= 0 ) {
            return this.contactList.get(position);
        }
        return null;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already on file.");
            return false;
        }
        this.contactList.remove(contact);
        System.out.println(contact.getName() + " has been removed.");
        return true;

    }
}
