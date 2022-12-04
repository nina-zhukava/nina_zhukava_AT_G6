package homework.day8;

import homework.day8.zeroTask.Water;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Waters {

    public static void main(String[] args) {
        List<Water> waters = new ArrayList<>(Arrays.asList(new Water("Прозрачная", "Нет"), new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный")));
        for (Water w : waters) {
            System.out.println(w.getColor() + " — " + w.getSmell());
        }
    }
}
