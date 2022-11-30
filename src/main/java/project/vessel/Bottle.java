package project.vessel;

import project.material.Material;
import project.stuff.Bubble;
import project.stuff.SparklingWater;
import project.stuff.Transformable;
import project.stuff.Water;

public class Bottle extends Vessel implements Container {

    private double volume;
    private Water water;
    private Transformable stuff;

    public Bottle(double volume, Material material) {
        super(volume, 2.0, material);
    }

    public Bottle(double volume, double diameter, Material material) { //можно добавить воду,чтобы не создавать ее здесь
        super(volume, diameter, material);
        System.out.println("The bottle is filling in with bubbles"); //todo вынести куда?
        this.water = new SparklingWater(volume);
    }

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
        Transformable stuff = this.stuff;
        this.stuff = null;
        return stuff;
    }

    @Override
    public boolean isEmpty() { //todo у нас нет такого поля
        return false;
    }

    @Override
    public void close() {
        //todo сетается на воду?
    }
}