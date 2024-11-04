package org.example.designPatterns.Decorator;

public class DecoratorMain {
    public static void main(String[] args){
        System.out.println("Hey we are testing decorator pattern");

        Pizza pizza1 = new ExtraCheese(new Jalappino(new ExtraCheese(new PizzaType1())));
        System.out.println("Cost of pizza with extra cheese is " + pizza1.cost());
        Pizza pizza2 = new ExtraCheese(new Jalappino(new ExtraCheese(new PizzaType2())));
        System.out.println("Cost of pizza with extra cheese is " + pizza2.cost());
    }
}
/**
 * It is a structural design pattern.
 * The Decorator Design Pattern is a structural design pattern that allows behavior to
 * be added to individual objects dynamically, without affecting the behavior of other objects from the same class.
 * It involves creating a set of decorator classes that are used to wrap concrete components.
 */