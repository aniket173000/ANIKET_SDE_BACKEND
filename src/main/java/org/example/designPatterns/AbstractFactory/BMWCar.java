package org.example.designPatterns.AbstractFactory;

public class BMWCar implements Vehicle {
    @Override
    public String getName() {
        return "My Car is BMW";
    }

    @Override
    public Integer getPrice() {
        System.out.println("My Car Price is 30000000");
        return 30000000;
    }
}
