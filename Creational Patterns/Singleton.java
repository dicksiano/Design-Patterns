public class Singleton {
    private static Singleton _instance = new Singleton();

    private Singleton() {} // Private constructor!

    public static Singleton getInstance() {
        return _instance;
    }
}