package com.company;
// Section 5
public class Main {

    public static void main(String[] args) {

        // Calling the first calculateScore method
        int newScore = calculateScore("John", 500);
        System.out.println("New score = " + newScore);

        calculateScore(125); // Calling the 2nd calculateScore method - this is called overloading the method
        calculateScore();   // Calling the 3rd calculateScore method
    }

    // Declaring the 1st method for calculateScore
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score*1000;
    }

    // Declaring a 2nd method with the same name with one argument only
    public static int calculateScore(int score){
        System.out.println("Unknown player scored " + score + " points");
        return score*1000;
    }

    // Declaring a 3rd method with the same name, this time with no arguments
    public static int calculateScore(){
        System.out.println("No player name, no score");
        return 0;
    }

}
