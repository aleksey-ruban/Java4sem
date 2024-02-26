package unit5;

public class Singleton3 {

    private int number;

    private static Singleton3 instance = new Singleton3();

    private Singleton3() {}

    public synchronized static Singleton3 getInstance() {
        return instance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
