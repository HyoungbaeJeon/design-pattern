package pattern.strategy.quackling;

// 변경이 예상되어지는 클래스에 대해 추상화 시킨다.
// quack (꽥꽥) 행동은 오리마다 행동하는 것들이 다르기 때문에 interface 로 추상화 시킨다.
// 이렇게 추상화된 interface 에 client 가 접근하여 quack method 를 호출하게 되면
// quack 와 관련된 다른 행동들이 추가가 되더라도 영향을 미치지 않게 된다.
public interface QuackBehavior {
    public void quack();
}
