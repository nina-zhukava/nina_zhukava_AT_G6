package src.main.java.classwork.day12;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 1_000_000; i++) {
                    counter.incrementAndGet();
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 1_000_000; i++) {
                    counter.decrementAndGet();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter);
    }
}
