package src.main.java.homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Elements {

    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Breadcrumb");

        for (String s : elements) {
            System.out.print(s + " ");
        }
        System.out.println();

        int counter = 0;
        for (String s : elements) {
            String[] element = s.trim().split("[- ]");
            if (element.length > 1) {
                counter++;
            }
        }
        System.out.println(counter);
        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
        System.out.println();
        elements.add(3, "Spinner");
        elements.remove(1);
        elements.set(4, "Switch");

        for (String s : elements) {
            System.out.print(s + " ");
        }
    }
}
