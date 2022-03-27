package creational.abstract_factory;

import creational.abstract_factory.pizza.Pizza;
import creational.abstract_factory.store.NYPizzaStore;
import creational.abstract_factory.store.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());
    }
}
