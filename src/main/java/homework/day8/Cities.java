package src.main.java.homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cities {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(Arrays.asList("Минск", "Москва", "Берлин"));

        cities.forEach(System.out::println);
        System.out.println(cities.stream().flatMap(s -> Arrays.stream(s.split(""))).count());
        cities.forEach(s -> System.out.print(s + " "));
    }
}
