package src.main.java.project.boxing;

import src.main.java.project.boxing.materials.Glass;
import src.main.java.project.boxing.materials.Material;
import src.main.java.project.bubble.Bubble;
import src.main.java.project.content.Containable;
import src.main.java.project.content.SparklingWater;
import src.main.java.project.content.Transformable;
import src.main.java.project.content.Water;

import java.util.ArrayList;
import java.util.List;

public class Bottle extends Vessel implements Containable {

    private double volume;
    private Water water;

    public Bottle() {
        super(1.0, 8.0, 1, new Glass());
    }

    public Bottle(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
        System.out.println("The bottle is filling in with bubbles");
        this.water = new SparklingWater();
        List<Bubble> bubbles = new ArrayList<>((int) (volume * 10000));
        ((SparklingWater) water).pump(bubbles);
    }

    //Bottle(double volume), в котором бутылка заполняется массивом из пузырьков из рассчета 10000 на каждый литр
    //как сочетать с конструктором выше? добавила в вессел пустой конструктор пока
    public Bottle(double vol) {
        System.out.println("The bottle is filling in with bubbles");
        this.volume = vol;
        this.water = new SparklingWater();
        List<Bubble> bubbles = new ArrayList<>((int) (volume * 10000));
        ((SparklingWater) water).pump(bubbles);
    }

    //есть публичный метод void open(), который меняет состояние воды в "открытое"(~ как this.water.setOpened(true);)
    //который вызывает метод degas() в газировке (требование с первой домашки)
    public void open() {
        if (water instanceof SparklingWater) {
            System.out.println("Changes water state to Open");
            ((SparklingWater) water).setOpened(true);
        }
    }

    // публичный метод void warm(int temperature), который устанавливает температуру воды в бутылке
    public void warm(int temperature) {
        System.out.printf("Warming water to: %s", temperature).println();
        this.water.setTemperature(temperature);
    }

    public Water getWater() {
        return this.water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    @Override
    public void addStuff(Transformable stuff) {

    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    @Override
    public void close() {

    }
}