package pattern.mediator;

import pattern.mediator.colleague.Colleague;

import java.util.ArrayList;
import java.util.List;

// Mediator를 구현하는, 실질적으로 중재하는 로직을 가지는 클래스다
// 서로 통신하는 객체들을 가지고있어야 하며, 특정 Colleague로부터 요청이 들어오면, 상대 Colleague를 찾아서 해당 메시지를 전달한다
// Mediator는 Colleague에 대한 레퍼런스를 가지고 있고 Colleague는 Mediator에 대한 레퍼런스를 가지고 있다.
// 즉, 양방향 연관관계(Bi-Directional Associations)를 가진다.
public class ConcreteMediator implements Mediator {
    private List<Colleague> colleagueList;

    public ConcreteMediator() {
        this.colleagueList = new ArrayList<Colleague>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagueList.add(colleague);
    }

    @Override
    public void mediate(Colleague colleague) {
        for(Colleague receiverColleague : colleagueList) {
            System.out.println("\tMediating " + colleague.getName() + " to " + receiverColleague.getName());
            receiverColleague.receive(colleague);
        }
    }
}
