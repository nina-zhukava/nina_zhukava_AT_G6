package src.main.java.project.warehouse;

import src.main.java.project.material.Material;
import src.main.java.project.stuff.Transformable;
import src.main.java.project.vessel.Container;

public class Factory {
    private Warehouse warehouse;

    public void createVesselBox(int capacity, double volume, Material material, Transformable stuff, Class<?> type) {
//        VesselBox<type.getClass()> vesselBox = new VesselBox<>("", )
    }

    private Container createVessel(double volume, Material material, Transformable stuff, Class<?> type) {
//        Vessel vessel = new type;
        return null;
    }
}
