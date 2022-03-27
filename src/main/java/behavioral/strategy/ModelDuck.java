package behavioral.strategy;

import behavioral.strategy.quackling.Quack;
import behavioral.strategy.flying.FlyNoWay;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I’m a model duck");
    }
}

