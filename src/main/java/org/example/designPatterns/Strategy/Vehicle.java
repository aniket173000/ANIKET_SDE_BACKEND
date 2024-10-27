package org.example.designPatterns.Strategy;

public class Vehicle {

    private final VehicleStrategy vehicleStrategy;

    public Vehicle(VehicleStrategy vehicleStrategy) {
        this.vehicleStrategy = vehicleStrategy;
    }
    public void drive(){
        System.out.println("Driving the Vehicle Class");
        vehicleStrategy.drive();
    }
}
