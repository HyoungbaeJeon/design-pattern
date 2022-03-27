package creational.singleton.option2;

public class Singleton {
    private static Singleton uniqueInstance = null;

    // other useful instance variables
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null)
                    uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    }
// other useful methods
}