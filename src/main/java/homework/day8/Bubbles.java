package homework.day8;

import homework.day8.zeroTask.Bubble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bubbles {

    public static void main(String[] args) {
        List<Bubble> bubbles = new ArrayList<>(Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"),
                new Bubble(5, "CO")));
        for (Bubble b : bubbles) {
            System.out.print(b.getVolume() + " ");
        }
        System.out.println();
        for (Bubble b : bubbles) {
            System.out.print(b.getName() + " ");
        }
        System.out.println();
        int volumeSum = 0;
        for (Bubble b : bubbles) {
            volumeSum += b.getVolume();
        }
        System.out.println(volumeSum);
        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}
