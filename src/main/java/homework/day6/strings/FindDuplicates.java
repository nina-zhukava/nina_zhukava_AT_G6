package src.main.java.homework.day6.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

    // метод, который позволяет найти и вывести в консоль все дубликаты слов в строке текста, который принимает на
// вход в виде аргумента.
    public void findDuplicates(String str) {
        List<String> splitString = Arrays.stream(str.trim().split(" ")).collect(Collectors.toList());
        Set<String> set = new HashSet<>();
        splitString.stream()
                .filter(n -> !set.add(n))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}