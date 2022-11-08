package src.main.java.homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Elements {

    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Breadcrumb");
        elements.forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println(elements.stream().flatMap(s -> Arrays.stream(s.trim().split("[- ]"))).count());

        elements.add(4, "Spinner");
        elements.remove(2);
        elements.set(5, "Switch");
        elements.forEach(s -> System.out.print(s + " "));
    }
}
