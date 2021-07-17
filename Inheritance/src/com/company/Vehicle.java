package com.company;

public class Vehicle {

    private String name;    // Declare some common fields for all vehicles
    private String size;
    private int steering;   // getCurrentDirection
    private int currentVelocity;

    // Generate constructor
    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.steering = 0;
        this.currentVelocity = 0;
    }

    // Create some methods for vehicles
    public void steering(int angle){

        //this.steering = angle;
        System.out.println("Vehicle.steering() is called:");

        // switch statements
        switch (angle){
            case 1:
                System.out.println("Case 1: Angle at 45 deg -> Direction is NORTHEAST\n");
                break;

            case 2:
                System.out.println("Case 2: Angle at 90 deg -> Direction is EAST\n");
                break;

            case 3:
                System.out.println("Case 3: Angle at 135 deg -> Direction is SOUTHEAST\n");
                break;

            case 4:
                System.out.println("Case 4: Angle at 180 deg -> Direction is SOUTH\n");
                break;

            case 5:
                System.out.println("Case 5: Angle at 225 deg -> Direction is SOUTHWEST\n");
                break;

            case 6:
                System.out.println("Case 6: Angle at 270 deg -> Direction is WEST\n");
                break;

            case 7:
                System.out.println("Case 7: Angle at 315 deg -> Direction is NORTHWEST\n");
                break;

            default:
                System.out.println("Case 0: Angle at 0 deg -> Direction is NORTH\n");
                break;
        }
    }

    public void move(int speed){
        currentVelocity = speed;
        System.out.println("Vehicle.move() is moving at " + speed + " km per hour");
    }

    public void stop(){
        this.currentVelocity = 0;
    }

    public int getSteering() {
        return steering;
    }

    public void setSteering(int steering) {
        this.steering = steering;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
