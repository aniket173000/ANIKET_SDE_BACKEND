package org.example.designPatterns.Strategy;

public class TrainStrategy implements VehicleStrategy {
    @Override
    public void drive() {
       System.out.println("Driving the Strategy Train Class");
    }
}
