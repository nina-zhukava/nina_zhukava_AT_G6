package homework.day2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrintReversedArray {

    public void printReversedArray() {
        List<Integer> array = Arrays.asList(2, 3, 7, 38);
        array.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
