package main.Factory;

import main.Pizza.Pizza;
import main.Pizza.impl.CheesePizza;
import main.Pizza.impl.ClamPizza;
import main.Pizza.impl.PepperoniPizza;
import main.Pizza.impl.VeggiePizza;

public class PizzaFactory {
    public Pizza createPizza(String type){

        Pizza pizza = null;
        
        if(type.equalsIgnoreCase("Pepperoni")){
            pizza = new PepperoniPizza();
        }

        else if(type.equalsIgnoreCase("Clam")){
            pizza = new ClamPizza();
        }

        else if(type.equalsIgnoreCase("Veggie")){
            pizza = new VeggiePizza();
        }

        else if(type.equalsIgnoreCase("Cheese")){
            pizza = new CheesePizza();
        }
        
        return pizza;
        
    }
    
}
