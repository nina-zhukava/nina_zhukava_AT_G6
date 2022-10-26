package src.main.java.homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Noodles {

    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String s : noodles) {
            if (noodles.indexOf(s) == noodles.size() - 1) {
                System.out.println(s);
            } else {
                System.out.print(s + " — ");
            }
        }
        for (int i = 0; i < noodles.size(); i++) {
            String newName = noodles.get(i).replace("a", "o");
            noodles.set(i, newName);
        }
        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }
    }
}
