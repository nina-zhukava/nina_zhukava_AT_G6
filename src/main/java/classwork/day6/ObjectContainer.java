package src.main.java.classwork.day6;

public class ObjectContainer {
    private Object[] array = new Object[10];
    private int emptyIndex = 0;

    public ObjectContainer() {
    }

    public void add(Object incoming) {
        if (this.emptyIndex < 10) {
            this.array[this.emptyIndex++] = incoming;
        } else {
            System.out.println("Array is full");
        }

    }

    public Object removeLast() {
        if (this.emptyIndex == 0) {
            System.out.println("Array is empty");
            return null;
        } else {
            Object toReturn = this.array[this.emptyIndex - 1];
            this.array[this.emptyIndex-- - 1] = null;
            return toReturn;
        }
    }

    public boolean isEmpty() {
        return this.emptyIndex == 0;
    }
}
