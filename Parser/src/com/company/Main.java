package com.company;

import com.sun.jdi.Value;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Parse example
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int newValue = Integer.parseInt(numberAsString);
        System.out.println("newValue = " + newValue);

        numberAsString += 1; // Concatenate 1 to string value "2018"
        newValue += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("newValue = " + newValue + "\n");

        // Prompt user input, type in console window
        // new object type of scanner
        Scanner scanner = new Scanner(System.in);   // Scanner is an inbuilt Java class

        System.out.println("Type your name here: ");
        String name = scanner.nextLine();   // Prompt user input here
        System.out.println("Your name is : " + name);   // Reply to user input

        System.out.println("Enter year of birth: ");
        int yearOfBirth = scanner.nextInt();    // Alternative way: parse a string into an int
        //scanner.nextLine(); // Handle the next line character (Enter key) - without this line,
        // IntelliJ will skip the subsequent user prompt line

        int age = 2021 - yearOfBirth;
        System.out.println("You are " + age + " years old");

        System.out.println("Enter favorite number: ");
        int myNumber = scanner.nextInt();    // Alternative way: parse a string into an int
        System.out.println("Your favourite number is " + myNumber + "\n");

        scanner.close();    // Need to close the scanner



    }
}
