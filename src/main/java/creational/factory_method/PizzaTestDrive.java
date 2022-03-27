package creational.factory_method;

import creational.factory_method.pizza.Pizza;
import creational.factory_method.store.ChicagoPizzaStore;
import creational.factory_method.store.NYPizzaStore;
import creational.factory_method.store.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
