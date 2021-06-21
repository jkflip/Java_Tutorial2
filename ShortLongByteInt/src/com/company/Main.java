package com.company;

import org.w3c.dom.ls.LSOutput;

// Java Tutorials with Tim Buchalka from Udemy
// Un/comment where necessary
public class Main {
    // Main method
    public static void main(String[] args) {

        System.out.println("Testing 1 2 3");
        int myValue = 10000;
        System.out.println(myValue);

        // Casting
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myNewByteValue = (byte) (myMinByteValue/2);    // casting here
        System.out.println(myMinByteValue);
        System.out.println(myNewByteValue + "\n");

        // Floats(i.e. real numbers, 32 bits) and doubles (64 bits)
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        // Declaring floats and doubles
        float myFloatValue = 2.45f / 3f;    // Good practice to declare with 'f' or 'd' if typing in literal numbers
        double myDoubleValue = 5.23d / 3d;  // double has higher precision
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Practice: Convert pound to kg
        double poundToKg = 0.45359237d;
        double mmWeightPounds = 100.3d;
        double myWeightKg = mmWeightPounds*poundToKg;
        System.out.println("1 pound = " + poundToKg);
        System.out.println("My weight in pound = " + mmWeightPounds);
        System.out.println("My weight in kg = " + myWeightKg + "\n");

        // Char(2 bytes or 16 bits) and Boolean
        char myChar = 'd';  // char declaration can only use ONE letter e.g. 'dd' will give an error
        char myUnicodeChar = '\u0044';  // character 'd' represented in unicode format - refer to table online
        System.out.println(myChar);
        System.out.println(myUnicodeChar + "\n");

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOver21 = true;    // how boolean variable names are declared

        // String - not a primitive type, its a Class, can store more char (i.e. sequence of char)
        String myString = "This is a string";
        System.out.println("My string is = " + myString);

        myString = myString + "\u00A9 2021";    // concatenate a unicode with a string
        System.out.println(myString+ "\n");

        // If-then statements
        boolean isAlien = false;
        if(isAlien == false) {  // !isAlien
            System.out.println("Not an alien");
        }

        // AND (&&) & OR (||) operators
        int myTopScore = 80;
        int secondTopScore = 60;
        if (myTopScore < 100 && secondTopScore < myTopScore) {  //
            System.out.println("My score = " + myTopScore + ", 2nd top score = " + secondTopScore);
            System.out.println("You got the highest score!");
        }

        // Ternary operator - shortcut in assigning one of 2 values to a var depending on given condition
        boolean isCar = false;
        boolean wasCar = isCar ? true:false; // isCar true or false ?
        System.out.println("isCar is true or false ? = " + wasCar);
        int isRemainder = 3;
        boolean wasRemainder = (isRemainder == 3) ? true:false;
        System.out.println("isReminder = 3 is: " + wasRemainder + "\n");


    }
}
