package homework.day10;

import java.util.stream.IntStream;

public class Inch {

    //для всех четных значений длин от 1 до 20 дюймов (работаем с int) вывести в консоль значения в дюймах, певерести значения
//в сантиметры (работаем с double) и найти сумму
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(0, 20)
                .filter(i -> i % 2 == 0)
                .peek(System.out::println)
                .mapToDouble(i -> i * 2.54)
                .sum());
    }
}

