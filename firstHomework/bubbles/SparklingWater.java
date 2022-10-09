package firstHomework.bubbles;

public class SparklingWater extends Water {

    public static int bubblesPerLitr = 10000;

    public void pump(Bubble[] bubbles) { //should it return sparkling water?
        for (int i =0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("");
        }
    }

    public void degas(Bubble[] bubbles) { //todo remove bubbles
        for (Bubble bubble : bubbles) {
            bubble.bubbleCramp();
        }
        bubbles = new Bubble[0];
    }
}
/*- создать класс SparklingWater, являющийся дочерним Water
- у газировки есть пузырьки
- вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[] bubbles)
- 1 литр воды содержит 10 тыс пузырьков
- у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье
*/