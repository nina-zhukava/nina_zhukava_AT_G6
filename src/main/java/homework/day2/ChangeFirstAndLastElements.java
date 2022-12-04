package homework.day2;

import java.util.Arrays;
import java.util.List;

public class ChangeFirstAndLastElements {

    public void changeFirstAndLastElements() {
        List<Integer> array = Arrays.asList(2, 3, 7, 38);
        int firstItem = array.get(0);
        array.set(0, array.get(array.size() - 1));
        array.set(array.size() - 1, firstItem);
        array.forEach(s -> System.out.println(s + " "));
    }
}
