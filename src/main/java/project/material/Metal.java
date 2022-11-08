package src.main.java.project.material;

public class Metal extends OldMaterial {
    public Metal(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }

    public Metal() {
        super(58.0, "silver", 7800);
    }
}
