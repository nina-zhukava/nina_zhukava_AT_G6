package src.main.java.classwork.day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();
        for (int i = 0; i < 10000000; i++) {
            myList1.add("aa" + i);
            myList2.add("aa" + i);
        }
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < myList1.size(); i++) {
            myList1.get(i);
        }
        System.out.println(System.currentTimeMillis() - t0);
        t0 = System.currentTimeMillis();
        for (int i = 0; i < myList2.size(); i++) {
            myList2.get(i);
        }
        System.out.println(System.currentTimeMillis() - t0);
    }
}
