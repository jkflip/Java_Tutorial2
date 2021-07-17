package com.company;

// Coding Exercise 35
public class Circle {

    private double radius;  // declare field related to circle as type double

    // The class needs to have one constructor with parameter radius of type double and it needs to initialize the fields
    public Circle(double radius) {
        this.radius = radius;
        //this.area = area;
    }

    // Method named getRadius without any parameters, it needs to return the value of radius field.
    public double getRadius(){
        // In case the radius parameter is less than 0 it needs to set the radius field value to 0.
        if(radius <=0){
            radius = 0;
        }

        return radius;
    }

    // Method named getArea without any parameters, it needs to return the calculated area (radius * radius * PI).
    // For PI use Math.PI constant.
    public double getArea(){
         return radius*radius*Math.PI;
    }

}


