package behavioral.iterator;

public class WaitressTest {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu());
        waitress.printMenu();
    }
}
