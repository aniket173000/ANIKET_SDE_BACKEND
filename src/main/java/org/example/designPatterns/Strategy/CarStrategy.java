package org.example.designPatterns.Strategy;

public class CarStrategy implements VehicleStrategy {
    @Override
    public void drive() {
      System.out.println("Driving the Strategy Car Class");
    }
}
