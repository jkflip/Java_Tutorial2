package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("If else statements -----");
        int value = 1;  // Change value here
        // Simple if else statements
        if (value == 1){
            System.out.println("The value is 1\n");
        }else if(value == 2){
            System.out.println("The value is 2\n");
        }else{
            System.out.println("Value is neither 1 nor 2\n");
        }

        // Switch statements to perform the above
        System.out.println("Switch statements -----");
        int switchValue = 3;    // Change value here to test switch statements

        switch(switchValue){
            case 1:
                System.out.println("Value is 1\n");
                break;  // Terminate control statement i.e. exit case 1

            case 2:
                System.out.println("Value is 2\n");
                break;

            case 3: case 4: case 5: // Grouping model tests
                System.out.println("Value is 3 or 4 or 5\n");
                break;

            default:    // For any other case not covered above, similar to "else" in if statements
                System.out.println("Value is out of bounds\n");
                break;
        }

        // Char switch statements
        System.out.println("Char switch statements -----");
        String switchValueLetter = "F";    // Change value here to test switch statements

        switch(switchValueLetter){
            case "A":
                System.out.println("Value is A\n");
                break;  // Terminate control statement i.e. exit case 1

            case "B":
                System.out.println("Value is B\n");
                break;

            case "C": case "D": case "E": // Grouping model tests
                System.out.println("Value is C or D or E");
                System.out.println("Actually it's " + switchValueLetter + "\n");
                break;

            default:    // For any other case not covered above, similar to "else" in if statements
                System.out.println("Char value is out of bounds\n");
                break;
        }
    }
}
