package src.main.java.project.content;

public abstract class Water implements Transformable{

    private String color = "no";
    private String transparancy = "transparent";
    private String smell = "no";
    private int temperature = 0;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransparancy() {
        return transparancy;
    }

    public void setTransparancy(String transparancy) {
        this.transparancy = transparancy;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}