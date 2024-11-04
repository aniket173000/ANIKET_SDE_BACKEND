package org.example.designPatterns.Decorator;

public class Jalappino extends Toppings {
    private Pizza pizza;

    public Jalappino(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        System.out.println("Jalappino of 100 Rs added to the pizza");
        return pizza.cost() + 100;
    }
}
