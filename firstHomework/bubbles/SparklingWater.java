package firstHomework.bubbles;

public class SparklingWater extends Water {

    private Bubble[] bubbles;
    private int bubblesPerLitr = 10000;

    public void pump(Bubble[] bubbles) {
        for (int i =0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("");
        }
    }

    public void degas(double vol) { //todo удаляет
        int bubblesQuantity = (int)(vol * bubblesPerLitr);
        bubbles = new Bubble[bubblesQuantity];
        for (Bubble bubble : this.bubbles) {
            bubble.bubbleCramp();
        }
    }
}
/*- создать класс SparklingWater, являющийся дочерним Water
- у газировки есть пузырьки
- вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[] bubbles)
- 1 литр воды содержит 10 тыс пузырьков
- у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье
*/