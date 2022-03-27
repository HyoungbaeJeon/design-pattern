package creational.singleton;

public class Singleton {
    private static Singleton uniqueInstance;

    // other useful instance variables
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    // other useful methods
}

