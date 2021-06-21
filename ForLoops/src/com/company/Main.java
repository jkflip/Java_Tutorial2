package com.company;
// For loops
public class Main {

    public static void main(String[] args) {
        // Single line
        //System.out.println("10,000 with interest rate 7% is " + calculateInterest(10000,7));  // returns many decimal places

        // String.format("%.2f", result) rounds off result into 2 decimal places
        System.out.println("10,000 with interest rate 7% is " +
                String.format("%.2f",calculateInterest(10000,7)) + "\n");

        // Find the interest rates from 2% to 8% using a for loop
        for (int i = 2; i <= 8; i++){
            System.out.println("The interest at " + i + "% is "+ calculateInterest(10000,i));
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return amount*(interestRate/100);
    }
}
