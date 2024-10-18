package org.example.designPatterns.AbstractFactory;

public class PlaneFactory extends VehicleFactory {
    public Vehicle getVehicle(String vehicleType) {
        if(vehicleType.equals("Indigo")) {
        return new IndigoPlane();
    } else if(vehicleType.equals("AirIndia")) {
        return new AirIndiaPlane();
    } else {
        System.out.println("Invalid Vehicle Type");
        return null;
    }
}
}
