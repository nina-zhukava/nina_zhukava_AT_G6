package src.main.java.homework.day2;

import java.util.Random;

public class PrintArray {

    public void printArray() {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}