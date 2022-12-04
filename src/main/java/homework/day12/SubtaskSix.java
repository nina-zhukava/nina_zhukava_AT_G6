package homework.day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class SubtaskSix {

    private static Collection<Mouse> mouse = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        for (int i = 0; i < 420; i++) {
            mouse.add(new Mouse(i));
        }
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                peepAndRemove();
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                peepAndRemove();
            }
        });
        Thread t3 = new Thread(() -> {
            synchronized (lock) {
                peepAndRemove();
            }
        });
        Thread t4 = new Thread(() -> {
            synchronized (lock) {
                peepAndRemove();
            }
        });
        Thread t5 = new Thread(() -> {
            synchronized (lock) {
                peepAndRemove();
            }
        });
        Thread t6 = new Thread(() -> {
            synchronized (lock) {
                peepAndRemove();
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }

    private static void peepAndRemove() {
        while (!mouse.isEmpty() && mouse.stream().anyMatch(mouse1 -> Integer.parseInt(mouse1.getName().replace("Mouse ", "")) % 2 == 0)) {
            Mouse m = mouse.stream()
                    .filter(mouse1 -> Integer.parseInt(mouse1.getName().replace("Mouse ", "")) % 2 == 0)
                    .collect(Collectors.toList()).stream().findFirst().get();
            m.peep();
            mouse.remove(m);
            try {
                Thread.sleep(170);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}