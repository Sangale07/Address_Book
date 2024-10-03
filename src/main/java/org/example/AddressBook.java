package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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


        public void editContact(String firstName, String lastName) {
            for (ContactPerson contact : contactList) {
                if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter new address:");
                    contact.setAddress(scanner.nextLine());
                    System.out.println("Enter new city:");
                    contact.setCity(scanner.nextLine());
                    System.out.println("Enter new state:");
                    contact.setState(scanner.nextLine());
                    System.out.println("Enter new zip:");
                    contact.setZip(scanner.nextInt());
                    System.out.println("Enter new phone number:");
                    contact.setPhoneNumber(scanner.nextLong());
                    System.out.println("Enter new email:");
                    scanner.nextLine(); // clear buffer
                    contact.setEmail(scanner.nextLine());
                    System.out.println("Contact updated successfully.");
                    return;
                }
            }
            System.out.println("Contact not found.");
        }

    public void deleteContact(String firstName, String lastName) {
        contactList.removeIf(contact -> contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName));
        System.out.println("Contact deleted successfully.");
    }
    public void addMultipleContacts() {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Enter first name:");
            String firstName = scanner.nextLine();
            System.out.println("Enter last name:");
            String lastName = scanner.nextLine();
            System.out.println("Enter address:");
            String address = scanner.nextLine();
            System.out.println("Enter city:");
            String city = scanner.nextLine();
            System.out.println("Enter state:");
            String state = scanner.nextLine();
            System.out.println("Enter zip:");
            int zip = scanner.nextInt();
            System.out.println("Enter phone number:");
            long phoneNumber = scanner.nextLong();
            scanner.nextLine();  // Clear buffer
            System.out.println("Enter email:");
            String email = scanner.nextLine();

            ContactPerson contact = new ContactPerson(firstName, lastName, address, city, state, zip, phoneNumber, email);
            addContact(contact);

            System.out.println("Do you want to add another contact? (yes/no)");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));
    }
}


