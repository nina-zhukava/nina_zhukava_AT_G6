package classwork.day6;

public class GenericContainer<T> {

    private T[] container;
    private int currentPosition = 0;

    public GenericContainer() {
        this.currentPosition = 0;
    }

    public void add(T o) {
        if (this.currentPosition < 10) {
            this.container[this.currentPosition++] = o;
        } else {
            System.out.println("container is full");
        }

    }

    public T removeLast() {
        T result = null;
        if (this.currentPosition > 0) {
            result = this.container[this.currentPosition - 1];
            this.container[--this.currentPosition] = null;
        }

        return result;
    }

    public boolean isEmpty() {
        return this.currentPosition == 0;
    }
}
