package com.company;

public class Main {

    public static void main(String[] args){
        // Create new class from Animals
        Animal animal = new Animal("Animal",1,1,5,5);

        // Create Dog class
        Dog dog = new Dog("Husky",8,20,2,4,1,20,"Long and silky");

        // Part 1 - Un/comment where necessary
        //dog.eat(); // Note that eat is not defined in Dog class but is inherited from the Animal class

        // Part 2 - Un/comment where necessary
        //dog.walk(); // set to call method from superclass: super.move()
        dog.run();  // set to call method overriden in Dog: move()
    }


}
