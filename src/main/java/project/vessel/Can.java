package src.main.java.project.vessel;

import src.main.java.project.material.Material;
import src.main.java.project.stuff.Transformable;

public class Can extends Vessel implements Containable {

    private Transformable stuff;

    public Can(double volume, double diameter, Material material) {
        super(volume, diameter, material);
    }

    public Can(double volume) {
        super(volume, 5, Material.METAL);
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

/*    @Override
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
