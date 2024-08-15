package main;

import main.Factory.PizzaFactory;
import main.Pizza.Pizza;

public class PizzaStore {
    PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    public void orderPizza(String type){
        Pizza pizza = pizzaFactory.createPizza(type);
        if(pizza==null){
            System.out.println(type+" pizza does not exist in the store.");
            return;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

}
