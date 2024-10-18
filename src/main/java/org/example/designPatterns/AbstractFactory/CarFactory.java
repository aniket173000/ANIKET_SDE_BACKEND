package org.example.designPatterns.AbstractFactory;

public class CarFactory extends VehicleFactory {
    public Vehicle getVehicle(String vehicleType) {
        if(vehicleType.equalsIgnoreCase("BMW")) {
        return new BMWCar();
    } else if(vehicleType.equalsIgnoreCase("TATA")) {
        return new TataCar();
    } else {
            System.out.println("Invalid Vehicle Type");
            return null;
    }
}
}
