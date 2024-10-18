package org.example.designPatterns.AbstractFactory;

public class AirIndiaPlane implements Vehicle {
    @Override
    public String getName() {
        return "My Plane is Air India";
    }

    @Override
    public Integer getPrice() {
        System.out.println("My Air India Plane Price is 1230076000");
        return 1234321;
    }
}
