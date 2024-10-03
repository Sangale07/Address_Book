package org.example;

public record ContactPerson(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber, String email) {
};
