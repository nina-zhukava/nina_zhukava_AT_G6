package src.main.java.homework.day8;

import src.main.java.homework.day8.zeroTask.Chair;

import java.util.*;

public class Furniture {

    public static void main(String[] args) {
        List<Chair> furniture = new ArrayList<>(Arrays.asList(new Chair(1, 2), new Chair(4, 2),
                new Chair(2, 4)));

        for (Chair c : furniture) {
            System.out.print(c.getHeight() * c.getWidth() + " ");
        }
        System.out.println();
        Map<Integer, Chair> chairMap = new HashMap<>();
        for (int i = 0; i < furniture.size(); i++) {
            chairMap.put(i, furniture.get(i));
        }
        for (int m : chairMap.keySet()) {
            System.out.print(m + " ");
        }
        System.out.println();
        for (Chair m : chairMap.values()) {
            System.out.print(m + " ");
        }
        System.out.println();
        for (Map.Entry<Integer, Chair> m : chairMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
