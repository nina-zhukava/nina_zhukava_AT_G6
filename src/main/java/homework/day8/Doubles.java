package src.main.java.homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doubles {

    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<>(Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9));
        for (double i : doubles) {
            System.out.print(i + " ");
        }
        System.out.println();
        double result = 1;
        for (double i : doubles) {
            result *= i;
        }
        System.out.println(result);
        result = 0;
        for (double i : doubles) {
            result += i - (int) i;
        }
        System.out.println(result);
        for (int i = 0; i < doubles.size(); i++) {
            System.out.print(doubles.get(i).intValue() + " ");
        }
    }
}
