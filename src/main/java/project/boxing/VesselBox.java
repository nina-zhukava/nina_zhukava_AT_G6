package src.main.java.project.boxing;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VesselBox<T extends Vessel> {
    private List<T> t;

    public VesselBox(T o, int i) {
        if (i == 9 || i == 25 || i == 36) {
            this.t = new ArrayList<>(i);
            for (int j = 0; j < i; j++) {
                t.set(j, o);
            }
        } else {
            System.out.println("Cannot create box with this capacity");
        }
    }

    public List<T> getT() {
        return t;
    }

    public int getSize() {
        return t.size();
    }

    public void setT(List<T> t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "VesselBox{" +
                "t=" + t +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VesselBox<?> vesselBox = (VesselBox<?>) o;
        return Objects.equals(t, vesselBox.t);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t);
    }
}
