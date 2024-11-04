package org.example.designPatterns.Strategy;

public class StrategyMain {
    public static void main(String[] args){
        System.out.println("Hey we are Learning Strategy Design Pattern");
        Vehicle vehicle = new Car();
        vehicle.drive();
    }
}
