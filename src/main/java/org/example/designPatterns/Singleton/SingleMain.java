package org.example.designPatterns.Singleton;

public class SingleMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello,We are learning Singleton Design Pattern");
//        Single s1 = Single.getInstance(5);
//        Single s2 = Single.getInstance(3);
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());

        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        t1.start();
        System.out.println("Thread 1 started");
        t2.start();
        System.out.println("Thread 2 started");


    }
    static class Thread1 implements Runnable {
        @Override
        public void run() {
            Single s3 = Single.getInstance(510);
            System.out.println(s3.hashCode());
        }
    }
    static class Thread2 implements Runnable {
        @Override
        public void run() {
            Single s4 = Single.getInstance(532);
            System.out.println(s4.hashCode());
        }
    }
}
