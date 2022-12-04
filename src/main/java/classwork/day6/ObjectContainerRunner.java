package classwork.day6;

import java.util.Random;

public class ObjectContainerRunner {
    public ObjectContainerRunner() {
    }

    public static void main(String[] args) {
        ObjectContainer container = new ObjectContainer();
        Random random = new Random();

        for (int i = 0; i < 10; ++i) {
            container.add(random.nextInt(10));
        }

        while (!container.isEmpty()) {
            System.out.println(container.removeLast());
        }

    }
}
