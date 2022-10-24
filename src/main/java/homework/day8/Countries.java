package src.main.java.homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Countries {

    public static void main(String[] args) {
        List<String> countries = new ArrayList<>(Arrays.asList("Андора", "Португалия", "Англия", "Замбия"));
        for (String s : countries) {
            if (countries.indexOf(s) == countries.size() - 1) {
                System.out.println(s);
            } else {
                System.out.print(s + ", ");
            }
        }
        int counter = 0;
        for (String s : countries) {
            if (s.length() < 7) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}
