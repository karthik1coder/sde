package designpatterns.creational;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void startHelloThreads(int threadCount) {
        for (int i = 0; i < threadCount; i++) {
            Thread thread = new Thread(() -> System.out.println("hello"));
            thread.start();
        }
    }
}