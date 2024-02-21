package unit1;

import javafx.util.Pair;

import java.util.Scanner;
import java.util.function.Function;

public class Unit1 implements Function<Pair<Integer, Integer>, Integer> {
    @Override
    public Integer apply(Pair<Integer, Integer> p) {
        int a = p.getKey();
        int b = p.getValue();
        return gcd(a, b);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Unit1 unit1 = new Unit1();
        int a = sc.nextInt();
        int b = sc.nextInt();
        Pair<Integer, Integer> pair = new Pair<>(a, b);
        System.out.println(unit1.apply(pair));
    }

}