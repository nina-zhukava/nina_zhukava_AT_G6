package project.vessel;

import project.material.Material;
import project.stuff.Transformable;

public class Cup extends Vessel implements Container {

    private Transformable stuff;

    public Cup(double volume, double diameter, Material material) {
        super(volume, diameter, material);
    }

    public Cup() {
        super(0.5, 6, Material.PLASTIC);
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
