package src.main.java.project.boxing;

public class VesselBox<T extends Vessel> {
    private T[] t;

    public VesselBox(T[] t) {
        if (t.length == 9 || t.length == 25 || t.length == 36) {
            this.t = t;
/*            for (T te : t) {
                t = new T;

            }*/
        } else {
            System.out.println("Cannot create box with this capacity");
        }
    }
}
