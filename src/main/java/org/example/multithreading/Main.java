package org.example.multithreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for(int i=0;i<8;i++){
            MultiThreading thread = new MultiThreading();
            thread.start();
        }
    }
}