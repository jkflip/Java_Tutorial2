package com.company;
// Coding Exercise 35
public class Cylinder extends Circle{

    private double height;

    //The class needs to have one constructor with two parameters radius and height both of type double. It needs to
    // call parent constructor and initialize a height field.
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Method named getHeight without any parameters, it needs to return the value of height field.
    public double getHeight(){
        // In case the height parameter is less than 0 it needs to set the height field value to 0.
        if(height <=0){
            height = 0;
        }
        return height;
    }

    //Method named getVolume without any parameters, it needs to return the calculated volume.
    // To calculate volume multiply the area with height.
    public double getVolume(){
        return super.getArea()*height;
    }

}
