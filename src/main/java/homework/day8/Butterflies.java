package src.main.java.homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {

    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");
        System.out.println(butterflies.stream()
                .peek(s -> System.out.println("\"" + s + "\""))
                .filter(s -> s.contains("о"))
                .count());
        butterflies.forEach(s -> System.out.print(s + " "));
        System.out.println();
        butterflies.forEach(System.out::println);
    }
}
