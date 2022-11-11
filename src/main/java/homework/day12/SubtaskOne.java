package src.main.java.homework.day12;

import java.util.ArrayList;
import java.util.Collection;

public class SubtaskOne {

    public static void main(String[] args) throws InterruptedException {
        new Thread(SubtaskOne::createMiceAndPeep).start();
        new Thread(SubtaskOne::createMiceAndPeep).start();
        new Thread(SubtaskOne::createMiceAndPeep).start();
        new Thread(SubtaskOne::createMiceAndPeep).start();
        new Thread(SubtaskOne::createMiceAndPeep).start();
    }

    public static void createMiceAndPeep() {
        Collection<Mouse> mouse = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            mouse.add(new Mouse(i));
        }
        mouse.forEach(Mouse::peep);
    }
}
