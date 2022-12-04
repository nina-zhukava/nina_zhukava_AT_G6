package project.vessel;

import project.material.Material;
import project.stuff.Bubble;
import project.stuff.SparklingWater;
import project.stuff.Transformable;
import project.stuff.Water;

public class Bottle extends Vessel implements Containable {

    private double volume;
    private Water water;
    private Transformable stuff;

    public Bottle(double volume, Material material) {
        super(volume, 8.0, material);
    }

    public Bottle(double volume, double diameter, Material material) {
        super(volume, diameter, material);
        System.out.println("The bottle is filling in with bubbles");
        this.water = new SparklingWater(volume);
    }

    //есть публичный метод void open(), который меняет состояние воды в "открытое"(~ как this.water.setOpened(true);)
    //который вызывает метод degas() в газировке (требование с первой домашки)
    public void open() {
        if (water instanceof SparklingWater) {
            System.out.println("Changes water state to Open");
            water.setOpened();
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
        this.stuff = stuff;
    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

/*    @Override
    public int getFreeSpace() {
        return 0;
    }*/

    @Override
    public void close() {

    }
}