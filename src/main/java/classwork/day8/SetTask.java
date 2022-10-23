package src.main.java.classwork.day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTask {

    public static void main(String[] args) {
        String[] array = "мама мыла раму мыла".split(" ");

        Set<String> set = new HashSet<>();
        for (String s : array) {
            set.add(s);
        }

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        for (String s : set) {
            System.out.println(s);
        }
    }
}
