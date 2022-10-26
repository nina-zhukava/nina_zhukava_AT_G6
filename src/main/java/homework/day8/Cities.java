package src.main.java.homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cities {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(Arrays.asList("Минск", "Москва", "Берлин"));

        for (String s : cities) {
            System.out.println(s);
        }
        int counter = 0;
        for (String s : cities) {
            counter += s.length();
        }
        System.out.println(counter);
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}
