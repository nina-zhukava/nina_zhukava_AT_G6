package src.main.java.classwork.day8;

import java.util.HashMap;
import java.util.Map;

public class MapTask {

    public static void main(String[] args) {
        String[] array = "мама мыла раму мыла".split(" ");
        Map<Integer, String> hashMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            hashMap.put(i, array[i]);
        }

        for (int i : hashMap.keySet()) {
            System.out.println(i);
        }
        for (String s : hashMap.values()) {
            System.out.println(s);
        }
        for (Map.Entry<Integer, String> set : hashMap.entrySet()) {
            System.out.println(set.getKey() + " " + set.getValue());
        }
    }
}
