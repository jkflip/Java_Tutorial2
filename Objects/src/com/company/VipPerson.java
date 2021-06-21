package com.company;

public class VipPerson {

    // Declaring the fields
    private String name;
    private double creditLimit;
    private String emailAddress;

    // Passing a constructor to another constructor by overloading it
    public VipPerson() {    // Constructor 1
        this("Default name",50000.00,"defaultEmal@domain.com");
    }

    // Overloading the constructor again, but change to have 2 parameters
    public VipPerson(String name, double creditLimit) { // Constructor 2
        this(name, creditLimit, "unknownUser@company.com");
    }

    // To auto generate constructors, goto Code > Generate > Constructors
    // Note: The 1st & 2nd constructors are calling the 3rd constructor. The 3rd constructor is the
    // only one that saves values into the Java class fields.
    public VipPerson(String name, double creditLimit, String emailAddress) { // Constructor 3
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    // Generate "getters" -- Setters not needed
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
