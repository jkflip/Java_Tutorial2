package com.company;
// While loop
public class Main {

    public static void main(String[] args) {

        int count = 0;
        // 1st while loop
        while(count != 5){
            System.out.println("Count value is " + count);
            count++;
        }

        // 2nd while loop using boolean
        int count2 = 1;
        while(true){

            if(count2 == 6){
                break;
            }
            System.out.println("Count2 value is " + count2);
            count2++;
        }
        
        // do while loop
        int count3 = 7;
        do{
            System.out.println("Run this line at least once");
            System.out.println("Count3 is " + count3);
            count3++;

            if (count3 == 10){
                break;
            }

        }while(count3 < 6);

    }
}
