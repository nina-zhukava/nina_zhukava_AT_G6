package src.main.java.classwork.day7;

import java.util.Scanner;

public class Scan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            System.out.printf("Just got '%s' text", incoming);
            if (incoming.equalsIgnoreCase("stop")) {
                return;
            }
        }
    }
}
