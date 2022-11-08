package src.main.java.project.vessel;

import src.main.java.project.material.OldMaterial;

public abstract class Vessel {

    private double volume;
    private double diameter;
    private int weight;
    private OldMaterial material;

    public Vessel(double volume, double diameter, int weight, OldMaterial material) {
        this.volume = volume;
        this.diameter = diameter;
        this.weight = weight;
        this.material = material;
    }

    public Vessel() {
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public OldMaterial getMaterial() {
        return material;
    }

    public void setMaterial(OldMaterial material) {
        this.material = material;
    }
}
