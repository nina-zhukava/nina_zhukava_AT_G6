package src.main.java.homework.day12;

public class Hedgehog {
    private String pattern;
    private String name;

    public Hedgehog(int number) {
        this.name = "Hedgehog " + number;
    }

    public void peep() throws InterruptedException {
        System.out.println("I am " + this.name);
        Thread.sleep(50);
    }
}
