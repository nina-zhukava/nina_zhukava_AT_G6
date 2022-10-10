package src.main.java.homework.day2;

public class SortDesc_10 {

    public void sortDesc() {
        int[] array = {8, 4, 19, -3};

        for (int index = 0; index < array.length; index++) {
            int max = index;
            for (int i = index; i < array.length; i++) {
                if (array[i] > array[max]) {
                    max = i;
                }
            }
            int x = array[index];
            array[index] = array[max];
            array[max] = x;
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}