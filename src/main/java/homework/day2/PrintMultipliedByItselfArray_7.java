package src.main.java.homework.day2;

public class PrintMultipliedByItselfArray_7 {

    public void printMultipliedByItselfArray() {
        int[] array = {1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i];
        }
        for (int a : array) {
            System.out.println(a);
        }
    }
}
