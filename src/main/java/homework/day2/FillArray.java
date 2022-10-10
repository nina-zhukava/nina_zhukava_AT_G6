package src.main.java.homework.day2;

import java.util.Random;

public class FillArray {

    public void fillArray(int arrayLenght) {
        int[] array = new int[arrayLenght];
        Random random = new Random();

        for (int i = 0; i < arrayLenght; i++) {
            array[i] = random.nextInt(100);
        }
    }
}
