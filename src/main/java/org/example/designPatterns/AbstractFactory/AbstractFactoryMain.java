package org.example.designPatterns.AbstractFactory;

public class AbstractFactoryMain {
    public static void main(String[] args){
        System.out.println("Hey we are learning Abstract Factory Design Pattern");
        String vehicleType = "PLANE";
        VehicleFactory vehicleFactory = VehicleFactory.getVehicleFactory(vehicleType);
        Vehicle vehicle = vehicleFactory.getVehicle("AirIndia");
        System.out.println(vehicle.getName());
        System.out.println(vehicle.getPrice());
    }
}
