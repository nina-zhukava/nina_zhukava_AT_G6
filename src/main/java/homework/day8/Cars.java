package src.main.java.homework.day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {
    public static void main(String[] args) throws IOException {

        List<String> cars = new ArrayList<>(Arrays.asList("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль",
                "Ауди"));
        BufferedWriter out = new BufferedWriter(new FileWriter("cars.txt"));
        StringBuilder toPrint = new StringBuilder();
        for (String s : cars) {
            toPrint.append("\"").append(s).append("\"").append("\n");
        }
        out.write(toPrint.toString());

        out.close();
        List<String> citiesToRemove = new ArrayList<>();
        for (String s : cars) {
            if (s.length() > 4) {
                citiesToRemove.add(s);
            }
        }
        cars.removeAll(citiesToRemove);
        for (String s : cars) {
            System.out.print(s + " ");
        }
    }
}
