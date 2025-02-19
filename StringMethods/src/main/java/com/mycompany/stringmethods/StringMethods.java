
package com.mycompany.stringmethods;

public class StringMethods {

    public static void main(String[] args) {
        String firstName = "Shehraz ";
        String lastName = "Sarwar";

        // Concatenating strings
        String fullName = firstName.concat(lastName);
        System.out.println("Full Name: " + fullName);

        // Getting the length of the full name
        System.out.println("Length of Full Name: " + fullName.length());
    }
}
