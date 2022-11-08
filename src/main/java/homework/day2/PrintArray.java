package src.main.java.homework.day2;

import java.util.Arrays;
import java.util.List;

public class PrintArray {

    public void printArray() {
        List<Integer> array = Arrays.asList(2, 3, 7, 38);
        array.forEach(s -> System.out.print(s + " "));
    }
}