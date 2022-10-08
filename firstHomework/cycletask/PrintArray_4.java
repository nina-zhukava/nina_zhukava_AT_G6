package firstHomework.cycletask;

import java.util.Random;

public class PrintArray_4 {

    public void printArray(){
        int n = 10;
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
