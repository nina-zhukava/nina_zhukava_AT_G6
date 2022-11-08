package src.main.java.homework.day12;

import java.util.ArrayList;
import java.util.Collection;

public class FiveThreads {

    public static void main(String[] args) throws InterruptedException {
        new Thread(FiveThreads::createMiceAndPeep).start();
        new Thread(FiveThreads::createMiceAndPeep).start();
        new Thread(FiveThreads::createMiceAndPeep).start();
        new Thread(FiveThreads::createMiceAndPeep).start();
        new Thread(FiveThreads::createMiceAndPeep).start();
    }

    public static void createMiceAndPeep() {
        Collection<Mouse> mouse = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            mouse.add(new Mouse(i));
        }
        mouse.forEach(Mouse::peep);
    }
}
