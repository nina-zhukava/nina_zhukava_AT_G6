package src.main.java.homework.day2;

public class PrintMultipliedByFiveArray_6 {

    public void printMultipliedByFiveArray() {

        int[] array = {1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            array[i] *= 5;
        }
        for (int a : array) {
            System.out.println(a);
        }
    }
}
