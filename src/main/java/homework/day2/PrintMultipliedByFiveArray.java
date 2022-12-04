package homework.day2;

import java.util.Arrays;
import java.util.List;

public class PrintMultipliedByFiveArray {

    public void printMultipliedByFiveArray() {

        List<Integer> array = Arrays.asList(2, 3, 7, 38);
        array.forEach(i -> System.out.println(i * 5));
    }
}
