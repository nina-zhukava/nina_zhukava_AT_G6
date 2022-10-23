package src.main.java.classwork.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {


    public static void main(String[] args) {
        String[] array = "мама мыла раму мыла".split(" ");

        List<String> list = new ArrayList<>(Arrays.asList(array));

        for (String s : list) {
            System.out.println(s);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
