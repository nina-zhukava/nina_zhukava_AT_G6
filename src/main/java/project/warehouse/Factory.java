package project.warehouse;

import project.material.Material;
import project.stuff.Transformable;
import project.vessel.Container;

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
