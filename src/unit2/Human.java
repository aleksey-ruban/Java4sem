package unit2;

import java.math.BigInteger;
import java.time.LocalDate;

public class Human {
    int age;
    String firstName;
    String lastName;
    LocalDate birthDate;
    BigInteger weight;

    public Human(int age, String firstName, String lastName, LocalDate birthDate, BigInteger weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }
}
