package creational.factory_method.store;

import creational.factory_method.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        } else {
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
