package com.company;
// Class and object
public class Main {

    public static void main(String[] args) {

        System.out.println("Lesson: Class and Objects -----");

        // Build object from the Java class created (Car)
        Car porsche = new Car();    // create a new datatype "porsche" (i.e. object), type "Car"
        Car holden = new Car();     // when creating a class, always use "new" keyword

        porsche.setModel("Carrera");    // "Carrera" is a valid model
        System.out.println("Model is " + porsche.getModel());

        holden.setModel("911");     // "911" is an invalid model
        System.out.println("Model is " + holden.getModel());

        holden.setModel("Wira");     // "Wira" is an invalid model
        System.out.println("Model is " + holden.getModel() + "\n");

        // Practice 1: Testing simple calculator
        SimpleCalculator testing = new SimpleCalculator();

        testing.setFirstNumber(3);
        testing.setSecondNumber(5);
        System.out.println("Practice 1: SimpleCalculator -----");
        System.out.println("Result for: " + testing.getFirstNumber() + " and " + testing.getSecondNumber());
        System.out.println("1) Addition is = " + testing.getAdditionResult());
        System.out.println("2) Subtraction is = " + testing.getSubtractionResult());
        System.out.println("3) Multiplication is = " + testing.getMultiplicationResult());
        System.out.println("4) Division is = " + testing.getDivisionResult()+"\n");

        // Practice 2: Bank Account
        /*
        BankAccount myAccount = new BankAccount();

        myAccount.setBalance(1000.50);  // initial balance
        myAccount.setAccountNumber(12345);
        myAccount.setCustomerName("John")
        myAcc
        myAccount.withdraw(5000);   // over withdrawal
        myAccount.withdraw(100);    // withdraw
        myAccount.deposit(50);      // deposit

        // Use constructors to perform lines 35 - 40
        */

        // Assigning the fields using the constructor created in "BankAccount" class
        // Parameter = int accountNumber, double balance, String customerName, String email, int phoneNumber
        BankAccount myAccount = new BankAccount(12345, 1000.50,
                "John", "dummyEmail@company.com", 68889);

        // Print for Practice 2
        System.out.println("Practice 2: BankAccount ------");
        System.out.println("Constructors parameters called for BankAccount: ");
        System.out.println("1) Account Number = " + myAccount.getAccountNumber());
        System.out.println("2) Balance = " + myAccount.getBalance());
        System.out.println("3) Customer name = " + myAccount.getCustomerName());
        System.out.println("4) Email = " + myAccount.getEmail());
        System.out.println("5) Phone number = " + myAccount.getPhoneNumber()+ "\n");

        // Some example operation here
        myAccount.withdraw(5000);   // over withdrawal
        myAccount.withdraw(100);    // withdraw
        myAccount.deposit(50);      // deposit

        // Practice 3: VipPerson (video 80)
        System.out.println("\n");
        System.out.println("Practice 3: VipPerson -----");
        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());  // Calling the 1st constructor, for when no name is inputted

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());
        System.out.println(person2.getEmailAddress());  // Calling 2nd constructor

        VipPerson person3 = new VipPerson("Timmy", 100.00, "timmyMail@domain.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());  // Calling 3rd constructor

        // Stopped at lesson video 80 - Constructor Part 2
        

    }


}
