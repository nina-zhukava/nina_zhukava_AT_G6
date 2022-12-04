package classwork.day11;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class ThreadTask {

    public static void main(String[] args) throws InterruptedException {

        Thread thread2 = new Thread(() -> heavyMethod());
        Thread thread1 = new Thread(() -> heavyMethod());
        Thread thread3 = new Thread(() -> {
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            heavyMethod();
        });

        thread1.start();
        thread2.start();
        thread3.start();

/*        for (int i = 0; i < 5; i++) {
            new  Thread(() -> {
                heavyMethod();
            }).start();
        }*/
    }

    public static void heavyMethod() {
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 1_00_000_000; i++) {
            double d = tan(atan(123456789.123456789));
        }

        System.out.printf("I'm %s, and I have finished in %s millis \r\n",
                Thread.currentThread().getName(),
                (System.currentTimeMillis() - t0));
    }
}
