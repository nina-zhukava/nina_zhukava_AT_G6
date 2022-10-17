package src.main.java.project.bottle;

import src.main.java.project.bubble.Bubble;
import src.main.java.project.water.SparklingWater;
import src.main.java.project.water.Water;

public class Bottle {

    private double volume;
    private Water water;

    //Bottle(double volume), в котором бутылка заполняется массивом из пузырьков из рассчета 10000 на каждый литр
    public Bottle(double vol) {
        System.out.println("The bottle is filling in with bubbles");
        this.volume = vol;
        this.water = new SparklingWater();
        Bubble[] bubbles = new Bubble[(int) (vol * 10000)];
        ((SparklingWater) water).pump(bubbles);
    }

    //есть публичный метод void open(), который меняет состояние воды в "открытое"(~ как this.water.setOpened(true);)
    //который вызывает метод degas() в газировке (требование с первой домашки)
    public void open() {
        if (water instanceof SparklingWater) {
            System.out.println("Changes water state to Open");
            ((SparklingWater) water).setOpened(true); //как запустить degas?
        }
    }

    // публичный метод void warm(int temperature), который устанавливает температуру воды в бутылке
    public void warm(int temperature) {
        System.out.printf("Warming water to: %s", temperature).println();
        this.water.setTemperature(temperature);
    }

    //публичный метод Water getWater() возвращающий обьект воды
    public Water getWater() {
        return this.water;
    }

    //публичный метод setWater(Water water) добавляющий новый обьект воды
    public void setWater(Water water) {
        this.water = water;
    }
}