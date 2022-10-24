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

        for (String s : butterflies) {
            System.out.println("\"" + s + "\"");
        }
        int counter = 0;
        for (String s : butterflies) {
            if (s.contains("o")) {
                counter++;
            }
        }
        System.out.println(counter);
        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }
        for (String s : butterflies) {
            System.out.print(s + "\n");
        }
    }
}
