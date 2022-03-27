package behavioral.mediator;

import behavioral.mediator.colleague.Colleague;

// 객체간의 통신을 중재하는 클래스다
// 통신의 대상이 되는 Colleague 를 추가하는 메서드가 존재해야 한다
public interface Mediator {
    void addColleague(Colleague colleague);
    void mediate(Colleague colleague);
}
