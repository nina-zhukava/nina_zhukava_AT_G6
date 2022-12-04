package homework.day12;

import java.util.ArrayList;
import java.util.Collection;

public class SubtaskFour {
    public static void main(String[] args) throws InterruptedException {
        Collection<Mouse> mouse = new ArrayList<>();
        for (int i = 0; i < 280; i++) {
            mouse.add(new Mouse(i));
        }
        Thread t1 = new Thread(() -> {
            while (!mouse.isEmpty()) {
                Mouse m = mouse.stream().findFirst().get();
                m.peep();
                mouse.remove(m);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(() -> {
            while (!mouse.isEmpty()) {
                Mouse m = mouse.stream().findFirst().get();
                m.peep();
                mouse.remove(m);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t3 = new Thread(() -> {
            while (!mouse.isEmpty()) {
                Mouse m = mouse.stream().findFirst().get();
                m.peep();
                mouse.remove(m);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t4 = new Thread(() -> {
            while (!mouse.isEmpty()) {
                Mouse m = mouse.stream().findFirst().get();
                m.peep();
                mouse.remove(m);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t5 = new Thread(() -> {
            while (!mouse.isEmpty()) {
                Mouse m = mouse.stream().findFirst().get();
                m.peep();
                mouse.remove(m);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        System.out.println(mouse.size());
    }
}
