package src.main.java.project.vessel;

import src.main.java.project.material.Material;
import src.main.java.project.stuff.Transformable;

public class Cup extends Vessel implements Containable {

    public Cup(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
    }

    public Cup() {
        super(0.5, 6, 1, Material.PLASTIC);
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
    public void open() {

    }

    @Override
    public void close() {

    }
}
