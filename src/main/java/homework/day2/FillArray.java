package src.main.java.homework.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FillArray {

    public void fillArray(int arrayLenght) {
        List<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < arrayLenght; i++) {
            array.add(i, random.nextInt(100));
        }
    }
}
