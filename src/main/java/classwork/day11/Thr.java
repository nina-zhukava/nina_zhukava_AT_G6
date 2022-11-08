package src.main.java.classwork.day11;

public class Thr {
    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();
        new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 3; i++) {
                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.printf("t-%s ", i);
                }
            }
        }).start();

        Thread.sleep(10);

        synchronized (lock) {
            for (int i = 0; i < 3; i++) {
                Thread.currentThread().sleep(1000);
                System.out.printf("m-%s ", i);
            }
        }
    }
}
