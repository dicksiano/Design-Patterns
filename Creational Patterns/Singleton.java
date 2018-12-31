public final class Singleton {
    private static volatile Singleton _instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(_instance == null) {
            synchronized (Singleton.class) {
                if (_instance == null) {
                    _instance = new Singleton();
                }
            }
        }
        return instance;
    }
}