package src.main.java.homework.day8;

import src.main.java.homework.day8.zeroTask.Chair;

import java.util.*;

public class Chairs {

    public static void main(String[] args) {
        List<Chair> chairs = new ArrayList<>(Arrays.asList(new Chair(1, 2), new Chair(4, 2),
                new Chair(2, 4)));

        for (Chair c : chairs) {
            System.out.print(c.getHeight() * c.getWidth() + " ");
        }
        System.out.println();
        Map<Integer, Chair> chairMap = new HashMap<>();
        for (int i = 0; i < chairs.size(); i++) {
            chairMap.put(i, chairs.get(i));
        }
        for (Map.Entry<Integer, Chair> m : chairMap.entrySet()) {
            System.out.print(m.getKey() + " ");
        }
        System.out.println();
        for (Map.Entry<Integer, Chair> m : chairMap.entrySet()) {
            System.out.print(m.getValue() + " ");
        }
        System.out.println();
        for (Map.Entry<Integer, Chair> m : chairMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
