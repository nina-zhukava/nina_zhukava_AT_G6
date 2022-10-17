package src.main.java.classwork.day6;

public class Runner {
    public Runner() {
    }

    private void printColor(String color) {
        switch (color) {
            case "blue":
                System.out.println("blue");
                break;
            case "red":
                System.out.println("red");
                break;
            case "green":
                System.out.println("green");
                break;
            case "purple":
                System.out.println("purple");
                break;
            case "yellow":
                System.out.println("yellow");
        }

    }

    private void printColorS(String color) {
        switch (color) {
            case "red":
                System.out.println("red");
            default:
        }
    }

    public static void main(String[] args) {
        Runner r = new Runner();
        r.printColor("red");
        r.printColorS("red");
    }
}
