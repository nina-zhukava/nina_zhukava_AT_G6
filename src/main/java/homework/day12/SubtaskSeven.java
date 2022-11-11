package src.main.java.homework.day12;

import java.util.concurrent.CopyOnWriteArrayList;

public class SubtaskSeven {

    private static CopyOnWriteArrayList<Mouse> mouse = new CopyOnWriteArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 240; i++) {
            mouse.add(new Mouse(i));
        }
        Thread t1 = new Thread(SubtaskSeven::peepAndRemove);
        Thread t2 = new Thread(SubtaskSeven::peepAndRemove);
        Thread t3 = new Thread(SubtaskSeven::peepAndRemove);
        Thread t4 = new Thread(SubtaskSeven::createHedgehogOnMouseBase);
        Thread t5 = new Thread(SubtaskSeven::createHedgehogOnMouseBase);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    private static void peepAndRemove() {
        mouse.forEach(m -> {
            if (Integer.parseInt(m.getName().replace("Mouse ", "")) % 2 != 0) {
                m.peep();
                mouse.remove(m);
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    private static void createHedgehogOnMouseBase() {
        mouse.forEach(m -> {
            if (Integer.parseInt(m.getName().replace("Mouse ", "")) % 2 == 0) {
                m.peep();
                try {
                    new Hedgehog(Integer.parseInt(m.getName().replace("Mouse ", ""))).say();
                    Thread.sleep(220);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
