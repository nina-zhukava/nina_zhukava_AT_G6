package src.main.java.project;

import src.main.java.project.boxing.Bottle;
import src.main.java.project.boxing.Cup;
import src.main.java.project.boxing.VesselBox;

public class Warehouse {

    public static void main(String[] args) {
        // Создать 2 объекта класса VesselBox с бутылками и кружками в классе Warehouse
        // и вывести на экран имена хранимых обьектов.
        VesselBox<Bottle> bottleBox = new VesselBox<>(new Bottle(), 3);
        VesselBox<Cup> cupBox = new VesselBox<>(new Cup(), 25);

    }
}
