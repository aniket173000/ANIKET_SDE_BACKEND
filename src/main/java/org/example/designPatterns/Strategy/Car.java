package org.example.designPatterns.Strategy;

public class Car extends Vehicle {
    public Car() {
        super(new CarStrategy());
    }

    public void drive(){
        System.out.println("Driving the Car Class");
        super.drive();
    }
}
