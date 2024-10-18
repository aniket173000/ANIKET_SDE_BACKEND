package org.example.designPatterns.Factory;

public class Car implements Transport {
    Integer size;
    public Car(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
