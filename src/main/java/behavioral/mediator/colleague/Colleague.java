package behavioral.mediator.colleague;

import behavioral.mediator.Mediator;

// 다른 객체와 통신을 하는 요소다
// 예제의 User, Admin, System의 추상적인 요소에 해당한다. 통신에 필요한 메서드를 가지고 있다
// 다른 객체와의 통신은 직접하지 않으며, Mediator 객체를 통해 요청을 하는 방식으로 통신한다
public abstract class Colleague {
    private Mediator mediator;
    protected String name;
    private String message;

    public Colleague(String name){
        this.name = name;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return this.name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

    public void send() {
        System.out.println(this.name + " send()");
        System.out.println();
        mediator.mediate(this);
    }

    public abstract void receive(Colleague colleague);
}
