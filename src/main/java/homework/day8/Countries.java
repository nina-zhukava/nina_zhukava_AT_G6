package src.main.java.homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Countries {

    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");
        countries.forEach(s -> {
            if (countries.indexOf(s) == countries.size() - 1) {
                System.out.println(s);
            } else {
                System.out.print(s + ", ");
            }
        });
        System.out.println(countries.stream().filter(s -> s.length() < 7).count());
        countries.forEach(System.out::println);
    }
}
