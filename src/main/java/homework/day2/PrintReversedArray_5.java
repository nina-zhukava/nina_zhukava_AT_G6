package src.main.java.homework.day2;

public class PrintReversedArray_5 {

    public void printReversedArray(){
        int[] array = {1,2,3,4,5};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
