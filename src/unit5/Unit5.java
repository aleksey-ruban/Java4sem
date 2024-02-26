package unit5;

public class Unit5 {

    public static void main(String[] args) {
        Singleton1 s11 = Singleton1.getInstance();
        s11.setNumber(5);
        Singleton1 s12 = Singleton1.getInstance();

        System.out.println(s12.getNumber());

        Singleton2 s21 = Singleton2.INSTANCE;
        s21.number = 3;
        Singleton2 s22 = Singleton2.INSTANCE;

        System.out.println(s22.number);

        Singleton1 s31 = Singleton1.getInstance();
        s31.setNumber(8);
        Singleton1 s32 = Singleton1.getInstance();

        System.out.println(s32.getNumber());

    }

}
