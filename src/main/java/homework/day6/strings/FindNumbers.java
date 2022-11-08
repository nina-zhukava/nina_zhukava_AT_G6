package src.main.java.homework.day6.strings;

import java.util.Arrays;

public class FindNumbers {

    //метод, который позволяет найти в тексте все цифры и преобразовать их в массив числовых переменных, вывести все
    //элементы массива в косоль, текст получает на вход в виде аргумента
    public void findNumbers(String str) {
        Arrays.stream(str.trim().replaceAll("[^-?0-9]+", " ").replace(" ", "").split(""))
                .forEach(System.out::println);
    }
}
