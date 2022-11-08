package src.main.java.homework.day2;

import java.util.Arrays;
import java.util.List;

public class PrintMultipliedByItselfArray {

    public void printMultipliedByItselfArray() {
        List<Integer> array = Arrays.asList(2, 3, 7, 38);
        array.forEach(i -> System.out.println(i * i));
    }
}
