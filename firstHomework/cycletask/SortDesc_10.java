package firstHomework.cycletask;

public class SortDesc_10 {

    public void sortDesc() {
        int[] array = {8, 4, 19, -3};

        for (int n = 0; n < array.length; n++) {
            int max = n;
            for (int i = n; i < array.length; i++) {
                if (array[i] > array[max]) {
                    max = i;
                }
            }
            int x = array[n];
            array[n] = array[max];
            array[max] = x;
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
/*10 отсортировать элементы массива в порядке убывания (любым способом) и вывести результат в консоль*/