package src.main.java.homework.day6.strings;

public class FindNumbers {

    //метод, который позволяет найти в тексте все цифры и преобразовать их в массив числовых переменных, вывести все
    //элементы массива в косоль, текст получает на вход в виде аргумента
    public void findNumbers(String str) {
        String[] splitString = str.trim().replace(" ", "").split("");
        int counter = 0;
        int index = 0;
        for (String s : splitString) {
            if (s.matches("[0-9]")) {
                counter++;
            }
        }
        int[] numbers = new int[counter];
        for (String s : splitString) {
            if (s.matches("[0-9]")) {
                numbers[index] = Integer.parseInt(s);
                index++;
            }
        }
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
