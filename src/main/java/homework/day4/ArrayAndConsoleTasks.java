package src.main.java.homework.day4;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayAndConsoleTasks {

    // метод, который принимает на вход целочисленном массив и считает сумму каждого n-ого элемента в нем,
// где n - целое число, передаваемое в сигнатуру этого метода
    public static void countElementSum(List<Integer> array, int n) {
        int sum = IntStream.range(0, array.size())
                .filter(x -> x % n == 0)
                .mapToObj(array::get)
                .mapToInt(s -> s).sum();
        System.out.println(sum);
    }

    // метод, который вернет целочисленный массив, состоящий только из тех элементов исходного целочисленного
// массива (подается на вход этого метода), которые больше, чем число n, где n - целое число, передаваемое в сигнатуру
// этого метода, элементы в результирующем массиве должны быть расположены в обратном порядке
    public static List<Integer> getModifiedArray(List<Integer> initialArray, int n) {
        return initialArray.stream().filter(x -> x > n).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    // метод, который вернет сумму тех элементов целочисленного массива, которые кратны числу текущего месяца
// (массив подается в сигнатуру метода)
    public static int getElementsSum(List<Integer> initialArray) {
        int monthNumber = LocalDateTime.now().getMonth().getValue();
        return initialArray.stream().filter(x -> x % monthNumber == 0).mapToInt(s -> s).sum();
    }

    // метод, который нарисует в консоли корову
    public static void drawCow() {
        System.out.println();
        System.out.println("\t  ^__^");
        System.out.println("\t  (oo)\\\\_______");
        System.out.println("\t (__)\\ ) \\/\\  \\");
        System.out.println("\t      ||----w |\\");
        System.out.println("\t      ||     ||");
        System.out.println();
    }
}