package org.example.designPatterns.Factory;

public class TransportFactory {
    public static Transport getTransport(String type) {
        if(type.equalsIgnoreCase("CAR")){
            return new Car(3);
        } else if (type.equalsIgnoreCase("FLIGHT")) {
            return new Flight(5);
        }else{
            return null;
        }
    }
}
