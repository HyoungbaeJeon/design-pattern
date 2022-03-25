package pattern.mediator;

import pattern.mediator.colleague.Colleague;
import pattern.mediator.colleague.ConcreteColleague1;
import pattern.mediator.colleague.ConcreteColleague2;
import pattern.mediator.colleague.ConcreteColleague3;

public class MediatorMain {
    public static void main(String args[]) {
        Mediator mediator1 = new ConcreteMediator();
        Colleague colleague1 = new ConcreteColleague1("User1");
        Colleague colleague2 = new ConcreteColleague1("User2");
        Colleague colleague3 = new ConcreteColleague2("System");
        Colleague colleague4 = new ConcreteColleague3("Admin");

        colleague1.setMediator(mediator1);
        colleague2.setMediator(mediator1);
        colleague3.setMediator(mediator1);
        colleague4.setMediator(mediator1);

        mediator1.addColleague(colleague1);
        mediator1.addColleague(colleague2);
        mediator1.addColleague(colleague3);
        mediator1.addColleague(colleague4);

        colleague1.setMessage("I'm User1");
        colleague1.send();
    }
}
