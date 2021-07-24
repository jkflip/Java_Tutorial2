package com.company;

import com.company.BuildAHouse.*;
import com.company.BuildingAComputer.*;

public class Main {

    public static void main(String[] args){
        //System.out.println("Hello World!");

        // Composition - looks for a relationship
        // E.g. a computer(master object) has a case, motherboard & monitor
        // Its different from a vehicle, whereby car is a vehicle (from Inheritance examples)
        // A case, monitor & motherboard are composition of a computer i.e. they make up the entire computer.
        Dimensions dimensions = new Dimensions(20,20,5);
        Case pcCase = new Case("220B","Dell","240V",dimensions);

        // Note: It is possible to create a class on the fly. In this example, we can create a new Resolution class by
        // typing new Resolution into the field below. Do this if you don't need to save it into a variable.
        Monitor pcMonitor = new Monitor("27inch Beast","Acer",27, new Resolution(2540,1440));

        Motherboard pcMotherboard = new Motherboard("BJ-200","Asus",4,6,"v2.44");

        // Create the Computer class by passing 3 objects into it
        Computer theComputer = new Computer(pcCase,pcMonitor,pcMotherboard);

        // Un/comment where necessary
        // Part 1: Composition 1
        // =============================================================================================================
        // E.g. on how to access a method from Computer class (for when the getters are declared as public)
//        System.out.println("Part 1: Composition 1 =========================");
//        theComputer.getPcCase().pressPowerButton();
//        theComputer.getMonitor().drawPixelAt(1500,1200,"red"); // Access method drawPixelAt from Monitor class
//        theComputer.getMotherboard().loadProgram("Windows 10");

        // Part 2: Composition 2
        // =============================================================================================================
        // E.g. on how to access a method from Computer class (for when the getters are declared as private)
//        System.out.println("Part 2: Composition 2 =========================");
//        theComputer.powerUp();


        // Challenge
        // =============================================================================================================
        // Challenge: Create single room of a house, include things in the room. Add at least one method to access an
        // object via a getter and then the object public method. Add at least one method to hide object (i.e. not using
        // getter)
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(12,"white");

        Tv tv = new Tv("LM55","LG",new Resolution(1980,1280));

        Sofa sofa = new Sofa(4,"grey");

        LivingRoom livingroom = new LivingRoom("Cozy",wall1,wall2,wall3,wall4,ceiling,tv,sofa);
        livingroom.changeTvChannel();
        livingroom.getSofa().sitOnSofa();

    }

}
