package com.company;

public class Hilux extends Car{

    private int roadService;

    public Hilux(int roadService) {
        super("Hilux", "4WD", 4, 4, 6, false);
        this.roadService = roadService; // in months
    }

    public void accelerate(int rate){

        int newVelocity = getCurrentVelocity() + rate;

        // Automatic transmission: Method to change gear depending on speed
        if (newVelocity == 0){
            stop();
            changeGear(1);  // Change to gear 1 if car is stopped
        }else if (newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }else if(newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        }else if(newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        }else {
            changeGear(4);
        }

        if (newVelocity > 0){
            // update to new velocity and direction
            changeVelocity(newVelocity, getSteering());
        }

    }
}
