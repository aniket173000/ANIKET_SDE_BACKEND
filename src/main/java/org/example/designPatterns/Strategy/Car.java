package org.example.designPatterns.Strategy;

public class Car extends Vehicle {
    public Car(VehicleStrategy vehicleStrategy) {
        super(vehicleStrategy);
    }

    public void drive(){
        System.out.println("Driving the Car Class");
        super.drive();
    }
}
