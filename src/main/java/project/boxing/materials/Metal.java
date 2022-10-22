package src.main.java.project.boxing.materials;

public class Metal extends Material {
    public Metal(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }

    public Metal() {
        super(1, "gold", 20);
    }
}
