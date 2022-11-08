package src.main.java.project.material;

public abstract class OldMaterial {

    private double thermalConductivity;
    private String color;
    private double density;

    public OldMaterial(double thermalConductivity, String color, double density) {
        this.thermalConductivity = thermalConductivity;
        this.color = color;
        this.density = density;
    }

}
