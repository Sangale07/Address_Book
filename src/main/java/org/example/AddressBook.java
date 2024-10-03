package org.example;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private String bookName;
    private List<ContactPerson> contactList;

    public AddressBook(String bookName) {
        this.bookName = bookName;
        this.contactList = new ArrayList<>();
    }

    public void addContact(ContactPerson contact) {
        if (contactList.contains(contact)) {
            System.out.println("Contact already exists!");
        } else {
            contactList.add(contact);
            System.out.println("Contact added successfully.");
        }
    }

    public void displayContacts() {
        if (contactList.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            contactList.forEach(System.out::println);
        }
    }
}
