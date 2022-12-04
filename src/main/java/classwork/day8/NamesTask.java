package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class NamesTask {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Оля");
        names.add("Коля");
        names.add("Аня");
        names.add("Миша");
        names.add("Даша");

        for (String s : names) {
            System.out.print(s + " ");
        }
        System.out.println();

        names.set(1, "Оля");
        names.set(4, "Катя");

        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }
        System.out.println();

        names.remove("Оля");
        names.remove(3);

        for (String s : names) {
            System.out.print(s + " ");
        }
    }
}
