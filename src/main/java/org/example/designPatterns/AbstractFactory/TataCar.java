package org.example.designPatterns.AbstractFactory;

public class TataCar implements Vehicle {

    @Override
    public String getName() {
        return "My Car is Tata";
    }

    @Override
    public Integer getPrice() {
        System.out.println("My Car Price is 12300000");
        return 12300000;
    }
}
