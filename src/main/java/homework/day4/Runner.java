package src.main.java.homework.day4;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(22, 3, 7, 38);
        System.out.println(ArrayAndConsoleTasks.getModifiedArray(array, 3));
        System.out.println(ArrayAndConsoleTasks.getElementsSum(array));
        ArrayAndConsoleTasks.countElementSum(array, 2);
    }
}
