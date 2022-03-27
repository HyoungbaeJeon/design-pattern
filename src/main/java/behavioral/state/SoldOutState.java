package behavioral.state;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Sorry, Sold Out");
    }

    public void ejectQuarter() {
        System.out.println("Sorry, Sold Out");
    }

    public void turnCrank() {
        System.out.println("Sorry, Sold Out");
    }

    public void dispense() {
        System.out.println("Sorry, Sold Out");
    }
}
