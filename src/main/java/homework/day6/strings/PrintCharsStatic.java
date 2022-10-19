package src.main.java.homework.day6.strings;

public class PrintCharsStatic {

    //метод, который позволяет отпечатать в консоль все буквы в стобик из строки текста, которую принимает на вход
    //в виде аргумента.
    public static void printChars(String str) {
        String[] splitStr = str.trim().replace(" ", "").split("");
        for (String s : splitStr) {
            System.out.println(s);
        }
    }
}
