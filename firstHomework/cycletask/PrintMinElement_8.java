package firstHomework.cycletask;

import java.util.Random;

public class PrintMinElement_8 {

    public void printMinElement(){
        int n = 10;
        int[] array = {1,2,3,4,5,3,5,23,434,21,-3};
/*        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }*/

        int min = array[0];
        for (int arr : array) {
            if (arr < min){
                min = arr;
            }
        }
        System.out.println(min);
    }
}
