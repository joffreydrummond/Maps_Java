package com.company;

import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Map<String, String> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        int choice = 0;

        while (choice != 4) {
            printMenu();
            choice = getUserChoice();
            if (choice == 1) {
                displayPhonebook();
            } else if (choice == 2) {
                addContact();
            } else if (choice == 3) {
                deleteContact();
            } else if (choice == 4) {
                System.out.println("See you next time. Goodbye!");
            } else {
                System.out.println("Please select a valid option.");
            }
        }
        // write your code here
    }

    public static void printMenu() {
        System.out.println("1) Display Phonebook");
        System.out.println("2) Add New Contact(s)");
        System.out.println("3) Delete Contact(s)");
        System.out.println("4) Exit Phonebook");
        System.out.println("########################################");
    }

    public static int getUserChoice() {
        return scanner.nextInt();
    }

    public static void displayPhonebook() {
        Set<String> phoneNumbers = phoneBook.keySet();

        for (String number : phoneNumbers) {
            System.out.println("Name: " + phoneBook.get(number) + " Phone number: " + number);
        }

    }

    public static void addContact() {
        System.out.print("Enter a phone number");
        String phoneNumber = scanner.next();
        System.out.println("Enter a name.");
        String name = scanner.next();
        phoneBook.put(phoneNumber, name);
        System.out.println("New contact " + name + " added!");
    }

    public static void deleteContact() {
        System.out.println("Enter phone number to delete.");
        String phoneNumber = scanner.next();
        if (phoneBook.remove(phoneNumber) == null) {
            System.out.println("No contact with that number");
        } else {
            System.out.println("Removed " + phoneBook.remove(phoneNumber));
        }

    }

}
