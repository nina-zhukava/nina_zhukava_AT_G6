package src.main.java.project;

import src.main.java.project.boxing.Bottle;
import src.main.java.project.boxing.Cup;
import src.main.java.project.boxing.VesselBox;

public class Warehouse {

//    Создать 2 объекта класса VesselBox с бутылками и кружками в классе Warehouse и вывести на экран имена хранимых обьектов.
    VesselBox<Bottle> bottleBox = new VesselBox<>();
    VesselBox<Cup> cupBox = new VesselBox<>();
}
