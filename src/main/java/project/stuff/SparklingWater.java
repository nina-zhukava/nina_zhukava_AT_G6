package src.main.java.project.stuff;

import java.util.ArrayList;
import java.util.List;

public class SparklingWater extends Water {

    private boolean isOpened;
    private List<Bubble> bubbles;
    private int bubblesPerLitr = 10000;

    public SparklingWater(double vol) {
        this.bubbles = new ArrayList<>((int) (vol * bubblesPerLitr));
        pump(this.bubbles);
        try {
            isOpened();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // публичный метод void pump(Bubble[] bubbles), который сетает массив из пузырьков в воду
    public void pump(List<Bubble> bubbles) {
        for (int i = 0; i < bubbles.size(); i++) {
            bubbles.set(i, new Bubble());
        }
    }

    //приватный метод void isOpened(), который в новом потоке проверят состояние воды на "открытость"
    // и в случае, если она открыта запускает метод degas()
    private void isOpened() {
        System.out.println("Checking if water is opened");
        new Thread(() -> {
            if (isOpened) {
                degas(this.bubbles);
            }
        }).start();
    }

    //приватный метод degas(), который каждую секунду выпускает по партии пузырьков из рассчета 10 + 5 *
    // температура_воды
    private void degas(List<Bubble> bubbles) {
        System.out.println("Bubbles are leaving water");
        int bubblesPerSecond = 10 + 5 * getTemperature();
        while (bubbles.size() != 0) {
            for (int i = 0; i < bubblesPerSecond; i++) {
                bubbles.get(i).cramp();
                bubbles.remove(bubbles.get(i));
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //публичный метод boolean isSparkle(), возвращающий true если в воде еще есть пузырьки газа
    public boolean isSparkle() {
        System.out.println("Checking if there are bubbles left in the water");
        return bubbles.size() != 0;
    }

    @Override
    public void setOpened() {
        this.isOpened = true;
    }
}