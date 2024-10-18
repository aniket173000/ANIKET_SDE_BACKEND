package org.example.multithreading;

public class MultiThreading extends Thread {
    @Override
    public void run() {
       try{
           System.out.println("Hello from " + this.getName() +" threadId: " + this.getId() + " threadState: " + this.getState());
       } catch (Exception e){
           System.out.println("Exception in thread " + this.getName());
       }
    }
}
