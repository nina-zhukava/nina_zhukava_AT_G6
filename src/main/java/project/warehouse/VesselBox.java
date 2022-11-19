package src.main.java.project.warehouse;

import src.main.java.project.vessel.Container;
import src.main.java.project.vessel.Vessel;

import java.util.List;
import java.util.Objects;

public class VesselBox<T extends Vessel> { //cсоздаем коробку с бутылками/кружками/банками

    private String name; //имя ящика, по маске "I am box with <25> <Bottles>"
    private int capacity;
    private List<Container> box;
    private long id;

    public VesselBox(String name, List<Container> box) { //todo зачем нам тут имя передавать?
        this.name = name;
        this.box = box;
        this.capacity = box.size();

    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Container> getBox() {
        return box;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VesselBox<?> vesselBox = (VesselBox<?>) o;
        return capacity == vesselBox.capacity && id == vesselBox.id && Objects.equals(name, vesselBox.name) && Objects.equals(box, vesselBox.box);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity, box, id);
    }

    @Override
    public String toString() {
        return "VesselBox{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", box=" + box +
                ", id=" + id +
                '}';
    }
}
