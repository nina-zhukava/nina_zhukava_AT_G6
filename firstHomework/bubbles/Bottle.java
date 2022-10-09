package firstHomework.bubbles;

public class Bottle {

    private double volume;
    private Water water;

    public Bottle(double vol, Water water) {
        this.volume = vol;
        this.water = water;
    }

    public void open(SparklingWater sparklingWater, Bubble[] bubbles) {
        sparklingWater.degas(bubbles);
    }
}
/*- создать класс Bottle
- у него есть обьем
- есть вода
- есть метод open(), который вызывает метод degas() в газировке*/