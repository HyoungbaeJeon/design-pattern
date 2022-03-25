package pattern.mediator.colleague;

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(String name) {
        super(name);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println("System can't receive messages");
    }
}
