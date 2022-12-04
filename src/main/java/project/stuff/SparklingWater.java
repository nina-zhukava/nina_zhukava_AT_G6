package project.stuff;

import java.util.ArrayList;
import java.util.List;

public class SparklingWater extends Water {

    private boolean isOpened;
    private List<Bubble> bubbles;
    private int bubblesPerLitr = 10000;

    //конструктор, который сетает нужное количество пузырьков из рассчета, что 1 литр воды
    // содержит 10 тыс пузырьков и вызывает внутренний метод isOpened()
    public SparklingWater() {
        this.bubbles = new ArrayList<>();//todo set
        isOpened();
    }

    // публичный метод void pump(Bubble[] bubbles), который сетает массив из пузырьков в воду
    public void pump(List<Bubble> bubbles) { //а где мы создаем пузырьки?
        for (int i = 0; i < bubbles.size(); i++) {
            bubbles.set(i, new Bubble(/*"CO2"*/));
        }
    }

    //приватный метод void isOpened(), который в новом потоке проверят состояние воды на "открытость"
    // и в случае, если она открыта запускает метод degas()
    private void isOpened() {
        System.out.println("Checking if water is opened");
        if (isOpened) {
            degas(this.bubbles);
        }
    }

    //приватный метод degas(), который каждую секунду выпускает по партии пузырьков из рассчета 10 + 5 * температура_воды
    private void degas(List<Bubble> bubbles) {
        System.out.println("Bubbles are leaving water");
        for (Bubble bubble : bubbles) {
            bubble.cramp();
            bubbles.remove(bubble);
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