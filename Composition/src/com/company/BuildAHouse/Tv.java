package com.company.BuildAHouse;

import com.company.BuildingAComputer.Resolution;

public class Tv {

    private String model;
    private String manufacturer;
    private Resolution resolution; // import Resolution class from BuildingAComputer

    public Tv(String model, String manufacturer, Resolution resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.resolution = resolution;
    }

    // For some unknown reason, must declare the method as static otherwise get error msg:
    // Non-static method 'pressRemote()' cannot be referenced from a static context
    public static void pressRemote(){
        System.out.println("Tv: Remote control button is pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
