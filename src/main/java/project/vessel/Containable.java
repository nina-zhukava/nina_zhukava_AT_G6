package src.main.java.project.vessel;

import src.main.java.project.stuff.Transformable;

public interface Containable {

    // adds some stuff (e.g. water, sand) to Containable object
    public void addStuff(Transformable stuff);

    // removes all stuff away
    public Transformable removeStuff();

    // returns true if there is no stuff inside
    public boolean isEmpty();

    //forces Containable to be opened
    public void open();

    // forces Containable to be closed
    public void close();

    //устанавливает температуру содержимого
    public void warm(int temperature);
}
