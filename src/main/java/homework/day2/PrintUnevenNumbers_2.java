package src.main.java.homework.day2;

public class PrintUnevenNumbers_2 {

    public void printUnevenNumbers(int startNumber, int endNumber) {
        for (int i = startNumber; i < endNumber + 1; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
