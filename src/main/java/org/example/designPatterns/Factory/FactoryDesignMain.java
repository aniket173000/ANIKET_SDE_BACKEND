package org.example.designPatterns.Factory;

public class FactoryDesignMain {
    public static void main(String[] args){
        System.out.println("Hey we are learning Factory Design Pattern");
//        Transport car = new Car(); // tight coupling
          Transport car = TransportFactory.getTransport("CAR"); // loose coupling
          Transport flight = TransportFactory.getTransport("Tata");
          System.out.println("Car size is " + car.getSize());
          System.out.println("Flight size is " + flight.getSize());
    }
}
