package src.main.java.homework.day8;

import src.main.java.homework.day8.zeroTask.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SandBox {

    public static void main(String[] args) {
        List<Sand> sandbox = new ArrayList<>();
        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

        for (Sand s : sandbox) {
            System.out.print(s.getWeight() + " ");
        }
        System.out.println();

        for (Sand s : sandbox) {
            System.out.print(s.getName() + " ");
        }
        System.out.println();
        Map<Integer, Sand> sandMap = new HashMap<>();
        for (int i = 0; i < sandbox.size(); i++) {
            sandMap.put(i, sandbox.get(i));
        }
        for (int m : sandMap.keySet()) {
            System.out.print(m + " ");
        }
        System.out.println();
        for (Sand s : sandMap.values()) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (Map.Entry<Integer, Sand> m : sandMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
