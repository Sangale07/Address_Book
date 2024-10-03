package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<String, AddressBook> addressBookMap = new HashMap<>();

    public static void main(String[] args) {
        addAddressBook();
    }

    public static void addAddressBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Address Book Name:");
        String bookName = scanner.nextLine();
        AddressBook addressBook = new AddressBook(bookName);
        addressBookMap.put(bookName, addressBook);
        System.out.println("Address Book '" + bookName + "' added.");
    }
}