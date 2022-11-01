package src.main.java.classwork.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTasks {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чис а а то");

        System.out.println(list.stream().anyMatch("мама"::equals));
        System.out.println(list.stream().allMatch(s -> s.contains("м")));
        List<String> list2 = list.stream().map(s -> s.concat("m")).collect(Collectors.toList());
        System.out.println(list2);
        List<String> list3 = list.stream()
                .flatMap(s -> Arrays.stream(s.split("а")))
//                .map(String::trim)
                .filter(s -> !s.equals(" ")) // не удаляет строки из пробелов
                .collect(Collectors.toList());
        System.out.println(list3);
    }
}
