package main;

import main.Factory.PizzaFactory;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new PizzaFactory());
        pizzaStore.orderPizza("Pepperoni");
    }
}
