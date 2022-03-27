package behavioral.strategy;

import behavioral.strategy.flying.FlyWithWings;
import behavioral.strategy.quackling.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        // 생성될 때 내가 사용할 행동들을 선언 해준다.
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I’m a real Mallard Duck");
    }
}
