package com.company;
// Part 2: Inheritance
//Fish class that inherits the Animal class
public class Fish extends Animal{

    private int gills;
    private int fins;
    private int eyes;

    // Generate constructor. Note that this constructor consists of fields from the superclass Animal
    public Fish(String name, int brain, int body, int size, int weight, int gills, int fins, int eyes) {

        super(name, brain, body, size, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }

    public Fish(String name, int size, int weight, int gills, int fins, int eyes) {

        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }

    // Define methods unique to Fish class
    private void rest(){
        System.out.println("Fish.rest() is called");
    }

    private void moveMuscles(){
        System.out.println("Fish.moveMuscles() is called");
    }

    private void moveBackFin(){
        System.out.println("Fish.moveBackFin() is called");
    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);

    }



}
