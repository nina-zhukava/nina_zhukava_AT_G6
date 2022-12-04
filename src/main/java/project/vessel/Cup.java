package project.vessel;

import project.material.Material;
import project.stuff.Transformable;

public class Cup extends Vessel implements Containable {

    private Transformable stuff;

    public Cup(double volume, double diameter, Material material) {
        super(volume, diameter, material);
    }

    public Cup() {
        super(0.5, 6, Material.PLASTIC);
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
/*
    @Override
    public int getFreeSpace() {
        return 0;
    }*/

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void warm(int temperature) {

    }
}
