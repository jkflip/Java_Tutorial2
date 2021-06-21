package com.company;
// Lesson 2 Udemy Java by Tim Buchalka
public class Main {
    // this is a main method
    public static void main(String[] args) {

        // if else statements
        boolean gameOver = false;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        // Run the method here
        calculateScore();
        calculateScore2(true, 800, 8, 200);  // Pass information into method through arguments

        if(score > 4000){
            //gameOver = false;
            System.out.println("Is it game over = " + gameOver);
            System.out.println("New score! Your score is = " + score);
        }else{
            gameOver = true;
            System.out.println("Is it game over = " + gameOver);
            System.out.println("Try again! Your score is = " + score);
        }

        if(gameOver){
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("Your final score = " + finalScore);
        }else{
            System.out.println("The game is still on");
        }

    }

    // This is a method
    public static void calculateScore(){
        boolean gameOver = false;
        int score = 3000;
        int levelCompleted = 8;
        int bonus = 200;

        System.out.println("Running method calculateScore: ");

        if(score < 4000){
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("Your final score = " + finalScore);
        }else{
            System.out.println("The game is still on");
        }

        System.out.println("Exit method calculateScore--\n");
    }

    // Method with 4 parameters - acts like a function
    public static void calculateScore2(boolean gameOver, int score, int levelCompleted, int bonus){

        System.out.println("Running method calculateScore2: ");

        if(score < 4000){
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("Your final score = " + finalScore);
        }else{
            System.out.println("The game is still on");
        }

        System.out.println("Exit method calculateScore2--\n");
    }
}
