package org.example.designPatterns.Strategy;

public class Train extends Vehicle {


    public Train(VehicleStrategy vehicleStrategy) {
        super(vehicleStrategy);
    }

    public void drive() {
        System.out.println("Driving the Train Class");
        super.drive();
    }
}
