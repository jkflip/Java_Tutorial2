package com.company.Printer;

// Create a class & demonstrate proper encapsulation techniques. The class will be called Printer - it will
// simulate a real printer. It should have fields for the toner level, number of pages printed & also whether its
// duplex printer (capable of printing both sides of the paper). Add methods to fill up the toner (up to max of
// 100%), another method to simulate printing a page (which should increase the number of pages printed). Decide
// on the scope, whether to use constructors & anything else you think is needed.

public class Printer {

    private double tonerLevel; // in percentage
    private int numOfPagesPrinted;
    private boolean isDuplex;   // capable of printing both sides of the paper or not

    public Printer(double tonerLevel, int numOfPagesPrinted, boolean isDuplex) {
        // Some validation for toner level (i.e. can only be from 0~100)
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.numOfPagesPrinted = numOfPagesPrinted;
        this.isDuplex = isDuplex;
    }

    // Method to fill up toner
    public void fillToner(){
        if (tonerLevel < 1){
            System.out.println("Refilling toner....");
            tonerLevel = 100;
        }else if (tonerLevel >= 100){
            System.out.println("Toner level already full!");
        }else{
            System.out.println("Your current toner level is "+ tonerLevel + "%. Toner level neither full nor empty. " +
                    "No need to refill");
        }
    }

    // Method to print page
    public double printPage(int desiredNumOfPages){
        if (tonerLevel < 1){
            System.out.println("Error: Your toner is empty! Please refill before proceeding!");
        }else {
            for (numOfPagesPrinted = 0; numOfPagesPrinted < desiredNumOfPages; numOfPagesPrinted++){
                tonerLevel = tonerLevel - (0.05 * tonerLevel);  // Subtract 5% from toner level for every page printed

                // Printer will stop printing once toner level reaches 0%
                if (tonerLevel < 1){
                    System.out.println("Only " + numOfPagesPrinted + " pages are printed");
                    System.out.println("Please refill, your toner is empty!");
                    break;
                }
            }
            // Update the number of pages printed and new toner level
//            System.out.println("Number of pages printed: " + numOfPagesPrinted);
//            System.out.println("New toner level is " + tonerLevel);
        }
        tonerLevel = Math.floor(tonerLevel);
        return tonerLevel;  // Return new toner level

    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getNumOfPagesPrinted() {
        return numOfPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
