package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Map<Integer, String> phonebook = new HashMap<>();

    public static void main(String[] args) {
        int choice = 0;

        while (choice != 4) {
            printMenu();
            choice = getUserChoice();

            if (choice == 1) {
                displayPhonebook();
//                else if (choice == 2) {
////                    addContact();
//                    else if (choice == 3) {
////                        deleteContact();
//                        else if (choice == 4) {
//                            System.out.println("See you next time. Goodbye!");
//                        } else {
//                            System.out.println("Please select a valid option.");
//                        }
//                    }
//                }
            }
        }
        // write your code here
    }

    public static void printMenu(){
        System.out.println("1) Display Phonebook");
        System.out.println("2) Add New Contact(s)");
        System.out.println("3) Delete Contact(s)");
        System.out.println("4) Exit Phonebook");
        System.out.println("########################################");
    }

    public static int getUserChoice(){
        return scanner.nextInt();
    }

    public static void displayPhonebook(){

    }


}
