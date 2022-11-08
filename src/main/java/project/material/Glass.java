package src.main.java.project.material;

public class Glass extends OldMaterial {

    public Glass(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }

    public Glass() {
        super(0.017, "green", 2200);
    }
}
