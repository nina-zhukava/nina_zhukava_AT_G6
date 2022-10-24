package src.main.java.homework.day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Figures {
    public static void main(String[] args) throws IOException {
        List<String> figures = new ArrayList<>(Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"));
        StringBuilder toPrint = new StringBuilder();
        for (String s : figures) {
            if (figures.indexOf(s) < figures.size() - 1) {
                toPrint.append(s).append(" — ");
            } else {
                toPrint.append(s);
            }
        }
        System.out.println(toPrint);
        BufferedWriter out = new BufferedWriter(new FileWriter("figures.txt"));
        out.write(toPrint.toString());
        out.close();
        int counter = 0;
        for (String s : figures) {
            if (!s.contains("и")) {
                counter++;
            }
        }
        System.out.println(counter);
        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
        System.out.println();
        figures.add(2, "Треугольник");
        for (String s : figures) {
            System.out.print(s + " ");
        }
    }
}
