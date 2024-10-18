package org.example.designPatterns.AbstractFactory;

public class IndigoPlane implements Vehicle {

    @Override
    public String getName() {
        return "My Plane is Indigo";
    }

    @Override
    public Integer getPrice() {
        System.out.println("My Plane Price is Aukkaat ke bahar");
        return 1230076000;
    }
}
