package com.company;

import java.util.Locale;

// Java Class - a blueprint for an object
public class Car {

    private int doors;  // State components of Car
    private int wheels;
    private String model;    // let this be variable 1
    private String engine;
    private String color;

    // Create a method that is publicly accessible
    public void setModel(String model){ // let this be variable 2

        String validModel = model.toLowerCase();

        // Only if porsche and holden are passed - validation here to prevent invalid "models"
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model; // update variable 1 with the content of the parameter passed (variable 2)
        }else{
            this.model = "Unknown";
        }

    }

    public String getModel(){
        return this.model;
    }
}
