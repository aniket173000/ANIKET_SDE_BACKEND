package org.example.designPatterns.Strategy;

public class Bus extends Vehicle {
    public Bus() {
        super(new BusStrategy());
    }

    public void drive() {
        System.out.println("Driving the Bus Class");
        super.drive();
    }
}
