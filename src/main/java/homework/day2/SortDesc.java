package src.main.java.homework.day2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDesc {

    public void sortDesc() {
        List<Integer> array = Arrays.asList(2, 3, 7, 38);
        List<Integer> arraySorted = array.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        arraySorted.forEach(System.out::println);
    }
}