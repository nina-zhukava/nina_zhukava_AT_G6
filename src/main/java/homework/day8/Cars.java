package homework.day8;

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
        cars.forEach(s -> {
            toPrint.append("\"").append(s).append("\"").append("\n");
        });
        out.write(toPrint.toString());
        out.close();
        cars.stream().filter(s -> !(s.length() > 4)).forEach(s -> System.out.print(s + " "));
    }
}
