package firstHomework.cycletask;

public class ChangeFirstAndLastElements_9 {

    public void changeFirstAndLastElements () {
        int[] array = {2,3,4,5,3,5,23,434,21,-3};
        int lastItemIndex = array.length - 1;
        int[] newArray = new int[array.length];
        for (int i = 0; i <= lastItemIndex; i++ ) {
            if (i == 0) {
                newArray[lastItemIndex] = array[0];
            } else if (i == lastItemIndex) {
                newArray[0] = array[lastItemIndex];
            } else {
                newArray[i] = array[i];
            }
        }


        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a : newArray) {
            System.out.print(a + " ");
        }
    }
}
