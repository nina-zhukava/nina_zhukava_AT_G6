package classwork.day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetSpeed {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        for (int i = 0; i < 1000000; i++) {
            hashSet.add("a " + i);
            treeSet.add("b " + i);
        }

        Iterator<String> hashIterator = hashSet.iterator();
        Iterator<String> treeIterator = treeSet.iterator();

        long t0 = System.currentTimeMillis();
        while (hashIterator.hasNext()) {
            hashIterator.next();
        }
        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();
        while (treeIterator.hasNext()) {
            treeIterator.next();
        }
        System.out.println(System.currentTimeMillis() - t0);
    }
}
