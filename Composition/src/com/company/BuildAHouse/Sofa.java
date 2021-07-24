package com.company.BuildAHouse;

public class Sofa {

    private int noOfSeats;
    private String sofaColor;

    public Sofa(int noOfSeats, String sofaColor) {
        this.noOfSeats = noOfSeats;
        this.sofaColor = sofaColor;
    }

    public void sitOnSofa(){
        System.out.println("Sofa: Sitting on sofa");
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public String getSofaColor() {
        return sofaColor;
    }
}
