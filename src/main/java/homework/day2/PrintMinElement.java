package src.main.java.homework.day2;

public class PrintMinElement {

    public void printMinElement() {
        int[] array = {1,2,3,4,5,3,5,23,434,21,-3};

        int min = array[0];
        for (int arrayElement : array) {
            if (arrayElement < min){
                min = arrayElement;
            }
        }
        System.out.println(min);
    }
}
