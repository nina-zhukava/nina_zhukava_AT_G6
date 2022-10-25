package src.main.java.homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Birds {

    public static void main(String[] args) {
        List<String> birds = new ArrayList<>(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"));

        for (String s : birds) {
            System.out.println("--" + s + "--");
        }
        int counter = 0;
        for (String s : birds) {
            int internalCounter = 0;
            String[] b = s.trim().split("");
            for (int i = 0; i < s.length(); i++) {
                if (b[i].toLowerCase().matches("[аяуюоеёэиы]")) {
                    internalCounter++;
                }
            }
            if (internalCounter > 1) {
                counter++;
            }
        }
        System.out.println(counter);
        birds.set(2, "Синица");
        for (String s : birds) {
            System.out.println(s + " ");
        }
    }
}
