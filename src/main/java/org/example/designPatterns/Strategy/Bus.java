package org.example.designPatterns.Strategy;

public class Bus extends Vehicle {
    public Bus(VehicleStrategy vehicleStrategy) {
        super(vehicleStrategy);
    }

    public void drive() {
        System.out.println("Driving the Bus Class");
        super.drive();
    }
}
