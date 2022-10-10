package src.main.java.homework.day2;

public class CycleWhile {

    public void printNumbers(int lastNumberToPrint) {
        int counter = 0;
        while (counter <= lastNumberToPrint) {
            System.out.print(counter + " ");
            counter++;
        }
    }
}