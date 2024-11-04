package org.example.designPatterns.Strategy;

public class Train extends Vehicle {


    public Train() {
        super(new TrainStrategy());
    }

    public void drive() {
        System.out.println("Driving the Train Class");
        super.drive();
    }
}
