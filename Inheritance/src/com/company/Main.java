package com.company;

public class Main {

    public static void main(String[] args){
        // Create new class from Animals
        Animal animal = new Animal("Animal",1,1,5,5);

        // Create Dog class
        Dog dog = new Dog("Husky",8,20,2,4,1,20,"Long and silky");

        // Un/comment where necessary
        // Part 1 - Inheritance
        // ============================================================================================================
//        System.out.println("Part 1: Inheritance ----------------------------------------------------------");
//        dog.eat(); // Note that eat is not defined in Dog class but is inherited from the Animal class

        // Part 2 - Inheritance: superclass & override
        // ============================================================================================================
//        System.out.println("Part 2: Inheritance: superclass vs override ----------------------------------");
//        dog.walk(); // set to call method from superclass: super.move()
//        dog.run();  // set to call method overriden in Dog: move()

        // Part 3 - References vs Object vs Instance vs Class
        // ============================================================================================================
        // House class to act as a "blueprint". Each house built is an "object" (i.e. "instance"). Every house has an
        // address and this is known as "reference". Copying references != copying the house, we are only copying
        // the address to the house.

//        System.out.println("Part 3: References vs Object vs Instance vs Class ----------------------------");
//        House blueHouse = new House("blue");    // Declare new instance/object of House class; blueHouse to be blue
//        House anotherHouse = blueHouse;              // anotherHouse points(i.e. references) to blueHouse
//
//        // 2 references pointing to the same object in memory, thus both will print blue
//        System.out.println("blueHouse.getColor() = " + blueHouse.getColor());       // prints blue
//        System.out.println("another.getColor() = " + anotherHouse.getColor() + "\n");    // same
//
//        // Set the color of blueHouse to be red (anotherHouse is still pointing to blueHouse)
//        anotherHouse.setColor("red");
//        System.out.println("blueHouse.getColor() = " + blueHouse.getColor());   // prints red
//        System.out.println("another.getColor() = " + anotherHouse.getColor() + "\n"); // same
//
//        House greenHouse = new House("green");  // New instance greenHouse to be green
//        anotherHouse = greenHouse;  // Dereferencing anotherHouse to make it point/reference to greenHouse
//
//        System.out.println("blueHouse.getColor() = " + blueHouse.getColor());    // prints red
//        System.out.println("greenHouse.getColor() = " + greenHouse.getColor());   // prints green
//        System.out.println("another.getColor() = " + anotherHouse.getColor() + "\n"); // prints green

        // Challenge 1: Vehicle and Car
        // ============================================================================================================
//        System.out.println("Challenge 1: Vehicles and Car ------------------------------------------------");
//        Hilux hilux = new Hilux(36);
//        hilux.steering(1);
//        hilux.accelerate(30);

        // Coding Exercise 35: Circle
        // ============================================================================================================
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());



    }

}






