package firstHomework.cycletask;

public class PrintMultipliedByItselfArray_7 {

    public void printMultipliedByItselfArray() {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] *= arr[i];
        }
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
