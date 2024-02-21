package unit2;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class HumanStreaming {

    public List<Human> people;

    public HumanStreaming() {
        people = new ArrayList<>();
        people.add(new Human(19, "Aleksey", "Ruban", LocalDate.of(2004, 3, 22), BigInteger.valueOf(66)));
        people.add(new Human(18, "Shamil", "Aliev", LocalDate.of(2005, 7, 7), BigInteger.valueOf(70)));
        people.add(new Human(20, "Alexander", "Prohorov", LocalDate.of(2004, 1, 4), BigInteger.valueOf(75)));
        people.add(new Human(24, "Anastasia", "Rezaeva", LocalDate.of(1999, 7, 27), BigInteger.valueOf(60)));
        people.add(new Human(19, "Daria", "Krupeneva", LocalDate.of(2003, 12, 26), BigInteger.valueOf(65)));
        people.add(new Human(19, "Kirill", "Yakobchuk", LocalDate.of(2004, 6, 24), BigInteger.valueOf(78)));
    }

    public void sortingBySecondLetter() {
        System.out.println("Sorting by second letter:");
        Stream<Human> stream = people.stream();
        stream.sorted(Comparator.comparing(human -> human.firstName.substring(1, 2)))
        .forEach(human -> System.out.println(human.firstName + " " + human.lastName));
        System.out.println();
    }

    public void filterByWeight() {
        System.out.println("Filtering by weight dividing by 10:");
        people.stream().filter(human -> human.weight.remainder(BigInteger.valueOf(10)).equals(BigInteger.valueOf(0)))
        .forEach(human -> System.out.println(human.firstName + " " + human.lastName));
        System.out.println();
    }

    public void sortingByWeightAndAge() {
        System.out.println("Sorting by weight * age:");
        people.stream().sorted(Comparator.comparing(human -> human.weight.multiply(BigInteger.valueOf(human.age))))
        .forEach(human -> System.out.println(human.firstName + " " + human.lastName));
        System.out.println();
    }

    public void multiplicationWeight() {
        System.out.println("Multiplication of weights:");
        Optional<Human> result = people.stream().reduce((a, b) -> new Human(0, "", "", LocalDate.now(), a.weight.multiply(b.weight)));
        System.out.println(result.map(human -> human.weight).orElse(BigInteger.valueOf(0)));
        System.out.println();
    }


}
