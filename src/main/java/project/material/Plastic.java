package src.main.java.project.material;

public class Plastic extends OldMaterial {
    public Plastic(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }

    public Plastic() {
        super(0.2, "white", 1800);
    }
}
