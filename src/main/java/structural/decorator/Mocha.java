package structural.decorator;

import structural.decorator.beverage.Beverage;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
