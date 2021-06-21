package com.company;
// Java class BankAccount
public class BankAccount {

    // Declaring the fields
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    // Create constructor, use same name as the public class
    // Constructors - to make it easier to assign field values to public class "BankAccount"
    public BankAccount(){ // notice how it is declared: "public" only
        System.out.println("Empty constructor called");
    }

    // Overloading a constructor (i.e. reusing the same name but change only the parameters)
    public BankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Operation here
    public void deposit(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposited = " + depositAmount + ". Total balance = " + balance);
    }

    public void withdraw(double withdrawAmount){

        if(balance-withdrawAmount < 0){
            System.out.println("Not enough money!");
            System.out.println("You have " + balance + " only");
        }else{
            balance -=withdrawAmount;
            System.out.println("Withdrawn = " + withdrawAmount + ".Remaining balance = " + balance);
        }

    }

    // Note that by using constructors, there is no more need for the setters (Getters still needed)
    // To auto generate the "getters" and "setters", goto Code > Generate > Getter and Setter
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




}
