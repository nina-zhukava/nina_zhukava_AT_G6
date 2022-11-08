package src.main.java.project.material;

public enum Material {
    GLASS(0.017, "green", 2200),
    PLASTIC(0.2, "white", 1800),
    METAL(58.0, "silver", 7800);

    private double thermalConductivity;
    private String color;
    private double density;

    Material(double thermalConductivity, String color, double density) {
        this.thermalConductivity = thermalConductivity;
        this.color = color;
        this.density = density;
    }

    Material() {
    }

    public double getThermalConductivity() {
        return thermalConductivity;
    }

    public void setThermalConductivity(double thermalConductivity) {
        this.thermalConductivity = thermalConductivity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    @Override
    public String toString() {
        return "Material{" +
                "thermalConductivity=" + thermalConductivity +
                ", color='" + color + '\'' +
                ", density=" + density +
                '}';
    }
}
