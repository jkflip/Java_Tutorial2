package com.company;

public class Car extends Vehicle{

    // Unique fields to a car
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    // Generate constructor
    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);

        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        //this.currentGear = currentGear;
        this.currentGear = 1;
    }

    // Method
    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int angle){
        // Change velocity
        System.out.println("Car.changeVelocity(): Velocity at " + speed + " in direction case " + angle);

        // Call methods defined in Vehicle superclass
        move(speed);
        steering(angle);
    }

}
