package src.main.java.project.bottle;

import src.main.java.project.water.SparklingWater;
import src.main.java.project.water.Water;

public class Bottle {

    private double volume;
    private Water water;

    //Bottle(double volume), в котором бутылка заполняется массивом из пузырьков из рассчета 10000 на каждый литр
    public Bottle(double vol) {
        System.out.println("The bottle is filling with the bubbles");
        this.volume = vol;
        this.water = water;

    }

    //есть публичный метод void open(), который меняет состояние воды в "открытое"
    // (приблизительно, как this.water.setOpened(true);)
    //который вызывает метод degas() в газировке
    public void open() {
        if (water instanceof SparklingWater) {
            ((SparklingWater) water).setOpened(true);
        }
    }

    // публичный метод void warm(int temperature), который устанавливает температуру воды в бутылке
    public void warm(int temperature) {
        this.water.setTemperature(temperature);
    }

    //публичный метод Water getWater() возвращающий обьект воды
    public Water getWater() {
        return this.water;
    }

    //публичный метод setWater(Water water) добавляющий новый обьект воды
    public Water setWater() {
        return null;
    }
}