package src.main.java.classwork.day7;

import java.io.*;

public class ObjectReaderWriter {

    public static void write() throws IOException {
        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Person("Vas", 33, 180, 90));
        oos.close();
    }

    public static void read() throws ClassNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("t.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person person = (Person) ois.readObject();
        ois.close();
        System.out.println(person);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
/*        ObjectReaderWriter.write();
        ObjectReaderWriter.read();*/
        Person person = new Person("asya", 32, 180, 70);
        Person person2 = new Person("acsya", 32, 180, 70);

        System.out.println(person.equals(person2));
    }
}
