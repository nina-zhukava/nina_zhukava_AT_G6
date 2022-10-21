package src.main.java.project.boxing.materials;

public class Glass extends Material {

    public Glass(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }
    public Glass() {
        super(1, "green", 1);
    }
}
