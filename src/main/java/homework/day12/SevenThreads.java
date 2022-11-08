package src.main.java.homework.day12;

import java.util.ArrayList;
import java.util.Collection;

public class SevenThreads {

    public static void main(String[] args) throws InterruptedException {
        new Thread(SevenThreads::createMiceAndPeep).start();
        new Thread(SevenThreads::createMiceAndPeep).start();
        new Thread(SevenThreads::createMiceAndPeep).start();
        new Thread(SevenThreads::createMiceAndPeep).start();
        new Thread(SevenThreads::createMiceAndPeep).start();
        new Thread(SevenThreads::createMiceAndPeep).start();
        new Thread(SevenThreads::createMiceAndPeep).start();
    }

    public static void createMiceAndPeep() {
        Collection<Mouse> mouse = new ArrayList<>();
        for (int i = 0; i < 18; i++) {
            mouse.add(new Mouse(i));
        }
        mouse.stream()
                .filter(mouse1 -> Integer.parseInt(mouse1.getName().replace("Mouse ", "")) % 2 == 0)
                .forEach(Mouse::peep);
    }
}
