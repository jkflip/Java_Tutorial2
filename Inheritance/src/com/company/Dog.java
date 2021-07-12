package com.company;
// Dog class: Inherit the Animal class
public class Dog extends Animal{    //Dog is part of the animal class

    // Some fields/characteristics of Dog
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // Generate constructor
    public Dog(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight); // super calls the constructor that is for the class its extending from
    }

    // Alternative:
    // For this e.g. let's say all dogs have brain, -> don't need to include brain parameter
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {

        // Here we pass 1 to brain and body. Thus, we do not need to redefine brain & body whenever we call the Dog class
        super(name, 1, 1, size, weight);

        // Initialise the fields related to the Dog class
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    // A method uniquely to dogs
    private void chew(){
        System.out.println("Dog.chew() is called");
    }

    // Override a method from the superclass, Animal
    // Now both the dog class and the animal class have the .eat method
    @Override // This will override the eat method defined in superclass Animal
    public void eat() {
        System.out.println("Dog.eat() is called");

        // Call the method uniquely defined to dog class
        chew();

        // Call the super equivalent of the class. The superclass is Animal for class Dog
        // To call the eat method defined in the superclass, use super.eat()
        // Just calling eat() will call the Dog.eat() class since
        super.eat();
        System.out.println("\n");
    }

    // Inheritance Part 2
    public void walk(){
        System.out.println("Dog.walk() is called");
        super.move(5);
        //move(5);
    }

    public void run(){
        System.out.println("Dog.run() is called");
        move(10);
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() is called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() is called");
        moveLegs(speed);
        super.move(speed);  // Inside this override method, call the superclass' move method
    }
}
