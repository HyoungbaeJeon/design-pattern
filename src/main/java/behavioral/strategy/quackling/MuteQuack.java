package behavioral.strategy.quackling;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< silence >>");
    }
}

