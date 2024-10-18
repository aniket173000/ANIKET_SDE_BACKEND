package org.example.designPatterns.AbstractFactory;

public abstract class VehicleFactory {
    public static VehicleFactory getVehicleFactory(String vehicleType) {
        if(vehicleType.equalsIgnoreCase("CAR")){
            System.out.println("Inside Car Factory");
            return new CarFactory();
        }else{
            return new PlaneFactory();
        }
    }
    public abstract Vehicle getVehicle(String vehicleType);

}
