package src.main.java.homework.day10;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntList {

    //сгенерировать коллекцию целых чисел (List) из n элементов от minValue до maxValue и определить, содержаться ли в данной
//коллекции числа, которые делятся и на 3 и на 5 без остатка с помощь stream
    public static void main(String[] args) {
        int minValue = -30;
        int maxValue = 455;

        System.out.println(IntStream.rangeClosed(minValue, maxValue)
                .boxed()
                .collect(Collectors.toList())
                .stream()
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .count());
    }
}
