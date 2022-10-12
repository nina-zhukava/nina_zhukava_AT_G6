package src.main.java.project.water;

import src.main.java.project.bubble.Bubble;

public class SparklingWater extends Water {

    Bubble[] bubbles;
    public int bubblesPerLitr = 10000;//?

    //конструктор SparklingWater(), который вызывает внутренний метод isOpened();
    public SparklingWater() {
        isOpened();
    }

    // публичный метод void pump(Bubble[] bubbles), который сетает массив из пузырьков в воду
    public void pump(Bubble[] bubbles) { //а где мы создаем пузырьки?
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("");
        }
    }

    //публичный метод void setOpened(boolean isOpened), который меняет состояние воды на "открытое"
    @Override
    public void setOpened(boolean isOpened) {
        System.out.println("Changing water state to Opened");
        this.isOpened = true;
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
    private void degas(Bubble[] bubbles) { //todo remove bubbles
        System.out.println("Bubbles are leaving water");
        for (Bubble bubble : bubbles) {
            bubble.cramp();
        }
        bubbles = new Bubble[0];
    }

    //публичный метод boolean isSparkle(), возвращающий true если в воде еще есть пузырьки газа
    public boolean isSparkle() {
        return false;
    }
}