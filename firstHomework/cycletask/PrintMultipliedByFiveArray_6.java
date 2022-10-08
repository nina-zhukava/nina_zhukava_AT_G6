package firstHomework.cycletask;

public class PrintMultipliedByFiveArray_6 {

    public void printMultipliedByFiveArray() {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] *= 5;
        }
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
