package src.main.java.homework.day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFile {

    //построчно прочитать файл и создать стрим из его строк, пропустив первые 4 строки собрать коллекцию в одну строку,
//разделить на по <br>, оставить только те, что начинаются с "Date log:", в каждой строке оставить только первые 20 символов,
// к каждой в конец дописать значение текущей даты
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        List<String> file = new ArrayList<>();
        String subLine;
        while (reader.ready()) {
            subLine = reader.readLine();
            file.add(subLine);
        }
        reader.close();
        String str = file.stream()
                .skip(4)
                .filter(s -> s.startsWith("Date log:"))
                .map(s -> s.substring(0, 19))
                .map(s -> s + " " + new Date())
                .collect(Collectors.joining("<br>"));
        System.out.println(str);
    }
}
