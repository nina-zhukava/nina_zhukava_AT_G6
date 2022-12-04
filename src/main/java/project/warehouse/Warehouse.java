package project.warehouse;

import project.vessel.Bottle;
import project.vessel.Cup;

import java.util.Map;

public class Warehouse {

    private Map<Integer, VesselBox> stock;

    public void addBox(VesselBox box) {

    }

    public VesselBox getBox() {

    }

    void removeBox() {

    }

    public static void main(String[] args) {
        // Создать 2 объекта класса VesselBox с бутылками и кружками в классе Warehouse
        // и вывести на экран имена хранимых обьектов.
        VesselBox<Bottle> bottleBox = new VesselBox<>(new Bottle(), 9);
        VesselBox<Cup> cupBox = new VesselBox<>(new Cup(), 25);

        bottleBox.getT().stream().peek(System.out::println);


    }
}
