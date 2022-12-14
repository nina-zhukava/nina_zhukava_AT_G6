package project.warehouse;

import java.util.Map;

public class Warehouse {

    private Map<Integer, VesselBox> stock;

    public void addBox(VesselBox box) {
        this.stock.put(stock.size() + 1, box);
    }

    public VesselBox getBox(int index) {
        return stock.get(index);
    }

    void removeBox(int index) {
        stock.remove(index);
    }
}
