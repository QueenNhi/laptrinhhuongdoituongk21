package DoAnHDT.model;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {}

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void connect() {
        System.out.println("Kết nối đến cơ sở dữ liệu...");
    }
}