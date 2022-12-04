package homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Birds {

    public static void main(String[] args) {
        List<String> birds = new ArrayList<>(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"));

        birds.forEach(s -> System.out.println("--" + s + "--"));
        System.out.println(birds.stream().filter
                (s -> Arrays.stream(s.split("")).filter(a -> a.matches("[аяуюоеёэиы]")).count() >= 2).count());
        birds.set(3, "Синица");
        birds.forEach(s -> System.out.print(s + " "));
    }
}
