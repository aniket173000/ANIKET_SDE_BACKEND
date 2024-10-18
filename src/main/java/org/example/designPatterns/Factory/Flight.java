package org.example.designPatterns.Factory;

public class Flight implements Transport {
     Integer size;
     public Flight(int size) {
         this.size = size;
     }
    @Override
    public int getSize() {
        return size;
    }
}
