package homework.day6.strings;

import java.util.Arrays;

public class PrintCharsStatic {

    //метод, который позволяет отпечатать в консоль все буквы в стобик из строки текста, которую принимает на вход
    //в виде аргумента.
    public static void printChars(String str) {
        Arrays.stream(str.trim().replace(" ", "").split("")).forEach(System.out::println);
    }
}
