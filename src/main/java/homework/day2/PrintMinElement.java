package homework.day2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrintMinElement {

    public void printMinElement() {
        List<Integer> array = Arrays.asList(2, 3, 7, 38);
        System.out.println(array.stream().min(Comparator.naturalOrder()).get());
    }
}
