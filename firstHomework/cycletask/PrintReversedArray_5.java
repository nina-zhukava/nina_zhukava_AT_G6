package firstHomework.cycletask;

public class PrintReversedArray_5 {

    public void printReversedArray(){
        int[] arr = {1,2,3,4,5};
        int x = arr.length - 1;
        for (int i = x; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
