package behavioral.strategy;

import behavioral.strategy.flying.FlyBehavior;
import behavioral.strategy.quackling.QuackBehavior;

public abstract class Duck {
    // 추상화 시킨 class 를 가지고 온다.
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    // display 는 하위에서 implement 한다.
    public abstract void display();

    public void performFly() {
        // 추상화 시킨 클래스의 method 를 호출한다.
        flyBehavior.fly();
    }

    public void performQuack() {
        // 추상화 시킨 클래스의 method 를 호출한다.
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    // Setting behavior dynamically
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    // Setting behavior dynamically
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}
