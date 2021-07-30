package com.company;

import com.company.Printer.Printer;

public class Main {

    public static void main(String[] args){

        // Un/comment where necessary
        // Case 1: No encapsulation (assume that constructors are not used)
        // Without encapsulation, there's no way to ensure that the data is valid
        // ============================================================================================================
//        Player player = new Player();
//
//        // Manually set the fields into Player class due to no constructors in Player class
//        // Access fields directly
//        player.name = "John";
//        player.health = 100;
//        player.weapon = "Sword";
//
//        int damage = 20;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = "+ player.healthRemaining());
//
//        damage = 95;
//        player.health = 200;    // Overriding by changing the fields from the class directly -- need some way of preventing this
//        player.loseHealth(damage);
//        System.out.println("Remaining health = "+ player.healthRemaining());

        //Case 2: With encapsulation
        // ============================================================================================================
//        EnhancedPlayer player = new EnhancedPlayer("Peter",300,"Staff");    // fail the validation test
//        System.out.println("Initial health "+ player.getHealth());

        // Challenge:
        // Create a class & demonstrate proper encapsulation techniques. The class will be called Printer - it will
        // simulate a real printer. It should have fields for the toner level, number of pages printed & also whether its
        // duplex printer (capable of printing both sides of the paper). Add methods to fill up the toner (up to max of
        // 100%), another method to simulate printing a page (which should increase the number of pages printed). Decide
        // on the scope, whether to use constructors & anything else you think is needed.
        // ============================================================================================================
        double myTonerLevel = 100;
        Printer printer = new Printer(myTonerLevel,0,false);
        System.out.println("Initial toner level: " + printer.getTonerLevel() + "%");

        printer.printPage(5);
        System.out.println("New toner level after " + printer.getNumOfPagesPrinted() + " pages is " + printer.getTonerLevel() + "%\n");

        printer.printPage(5);   // Print another 5 pages with the remaining toner level
        System.out.println("New toner level after " + printer.getNumOfPagesPrinted() + " pages is " + printer.getTonerLevel() + "%");
        printer.fillToner();
        System.out.println("\n");

        printer.printPage(200);   // Print another 5 pages with the remaining toner level
        System.out.println("New toner level after " + printer.getNumOfPagesPrinted() + " pages is " + printer.getTonerLevel() + "%");
        printer.fillToner();

    }

}
