package firstHomework.cycletask;

import java.util.Random;

public class FillArray_3 {

    public void fillArray(int n) {
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }
    }
}
