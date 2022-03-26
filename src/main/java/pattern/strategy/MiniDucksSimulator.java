package pattern.strategy;

import pattern.strategy.flying.FlyRocketPowered;

public class MiniDucksSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        // 이렇게 runtime 시점에 flyBehavior 에 할당된 객체를 다른 객체로 변경 할 수 있다.
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
