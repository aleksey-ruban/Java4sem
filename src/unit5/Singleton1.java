package unit5;

public class Singleton1 {

    private int number;

    private static Singleton1 instance;

    private Singleton1() {}

    public synchronized static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
