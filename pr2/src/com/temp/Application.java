package com.temp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Application {
    public Application() {
        List<Human> list = new ArrayList<Human>();

        list.add(new Human(40, "Jarel", "Golden", LocalDate.of(1980, 7, 26), 84));
        list.add(new Human(15, "Thomas", "Pham", LocalDate.of(2005, 4, 10), 61));
        list.add(new Human(34, "Rianna", "Hough", LocalDate.of(1987, 2, 3), 54));
        list.add(new Human(21, "Evie-Grace", "Roman", LocalDate.of(1999, 12, 23), 62));
        list.add(new Human(63, "Esther", "Whittington", LocalDate.of(1958, 1, 4), 78));
        list.add(new Human(23, "Xanthe", "Tucker", LocalDate.of(1997, 5, 30), 69));
        list.add(new Human(59, "Michaela", "Brook", LocalDate.of(1961, 9, 9), 71));
        list.add(new Human(12, "Lindsey", "Berry", LocalDate.of(2009, 1, 26), 45));
        list.add(new Human(37, "Akram", "Nelson", LocalDate.of(1983, 7, 16), 78));
        list.add(new Human(71, "Luisa", "Li", LocalDate.of(1949, 10, 1), 64));
        list.add(new Human(8, "Anna", "Morrison", LocalDate.of(2012, 11, 19), 30));

        System.out.println("\nSorted by age: ");
        list.stream().sorted(Comparator.comparingInt(Human::getAge).reversed()).forEach(System.out::println);
        System.out.println("\nFiltered by first name [A]: ");
        list.stream().filter(human -> human.getFirstName().charAt(0) == 'A').forEach(System.out::println);
        System.out.println("\nSorted by birth date: ");
        list.stream().sorted(Comparator.comparing(Human::getBirthDate)).forEach(System.out::println);
        System.out.println("\nAverage weight:  " + "\n" + list.stream().mapToInt(Human::getWeight).average().orElseThrow());


    }
}
