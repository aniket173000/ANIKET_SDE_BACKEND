package org.example.designPatterns.Strategy;

public class BusStrategy implements VehicleStrategy {


    @Override
    public void drive() {
      System.out.println("Driving the Strategy Bus Class");
    }
}
