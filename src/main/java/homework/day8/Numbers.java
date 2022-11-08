package src.main.java.homework.day8;

import java.util.*;

public class Numbers {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699));
        numbers.forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println(numbers.stream().mapToInt(Integer::shortValue).sum());
        Collections.sort(numbers);
        numbers.stream().sorted(Comparator.naturalOrder())
                .peek(s -> System.out.print(s + " "))
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.print(s + " "));
    }
}
