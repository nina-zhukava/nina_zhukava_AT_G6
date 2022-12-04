package homework.day8;

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
        System.out.println(figures.stream().filter(s -> !s.contains("и")).count());
        figures.stream().forEach(s -> {
            if (figures.indexOf(s) < figures.size() - 1) {
                toPrint.append(s).append(" — ");
            } else {
                toPrint.append(s);
            }
        });

        System.out.println(toPrint);
        BufferedWriter out = new BufferedWriter(new FileWriter("figures.txt"));
        out.write(toPrint.toString());
        out.close();
        System.out.println();
        figures.add(2, "Треугольник");
        figures.forEach(s -> System.out.print(s + " "));
    }
}
