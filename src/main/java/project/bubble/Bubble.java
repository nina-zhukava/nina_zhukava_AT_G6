package src.main.java.project.bubble;

public class Bubble {

    private double volume = 0.3;
    private String gas;

    //конструктор Bubble(String gas), в который передается строка с названием газа пузырька
    public Bubble(String gas) {
        this.gas = gas;
    }

    public void cramp() {
        System.out.println("Cramp!");
    }

    //метод double getVolume(), возвращающий обьем пузырька
    public double getVolume() {
        return volume;
    }
}