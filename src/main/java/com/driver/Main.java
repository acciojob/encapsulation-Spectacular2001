package com.driver;

public class Main {
    public static void main(String[] args) { // Fixed method declaration
        RWOnly obj = new RWOnly(); // Corrected class name capitalization


        // Error: Cannot access 'name' directly as it is private in RWOnly class.
// obj.name = "Test Name"; 
// Error: The field RWOnly.name is not visible
// System.out.println(obj.name); 
// Error: The field RWOnly.name is not visible


        obj.setName("Test Name"); // Using the setter to set the name
        System.out.println(obj.getName()); // Using the getter to get and print the name
    }
}

