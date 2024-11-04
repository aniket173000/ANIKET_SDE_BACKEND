package org.example.designPatterns.Decorator;

public class ExtraCheese extends Toppings {

    private Pizza pizza;

    public ExtraCheese(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        System.out.println("Extra Cheese of 120 Rs added to the pizza");
        return pizza.cost() + 120;
    }
}
