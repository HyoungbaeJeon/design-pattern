package creational.factory_method.store;

import creational.factory_method.pizza.NYStyleCheesePizza;
import creational.factory_method.pizza.NYStyleVeggiePizza;
import creational.factory_method.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        } else {
            // 기본 피자
            pizza = new NYStyleCheesePizza();
        }
        return pizza;
    }
}
