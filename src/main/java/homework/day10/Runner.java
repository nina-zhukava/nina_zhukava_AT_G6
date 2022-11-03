package src.main.java.homework.day10;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {

    //Сгенерировать группу из 100 человек в возрасте от 15 до 30 лет.
    //Написать одну непрерывную цепочку stream вызовов, которая выбирает людей, возраст которых меньше 21, выводит их имена
    //и возраст в консоль, сортирует по фамилии, а потом по имени(использовать thenComparing у класса Comparator), берет 4
    //первых человека, формирует коллекцию из имен объектов, собирает все в коллекцию
    public static void main(String[] args) {
        Random random = new Random();
        byte[] array = new byte[5];
        new Random().nextBytes(array);

        List<Person> people = Stream.generate(() -> new Person(1 + random.nextInt(100), getString(), getString()))
                .limit(100).collect(Collectors.toList());
        List<String> people2 = people.stream()
                .filter(person -> person.getAge() < 21)
                .peek(person -> System.out.println(person.getName() + " " + person.getAge()))
                .sorted(Comparator.comparing(Person::getSurname).thenComparing((Person::getName)))
                .limit(4)
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println();
        System.out.println(people2);
    }


    private static String getString() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars2 = "qwertyuiopasdfghjklzxcvbnm";
        StringBuilder builder = new StringBuilder();
        Random rnd = new Random();
        while (builder.length() < 7) {
            if (builder.length() == 0) {
                builder.append(chars.charAt((int) (rnd.nextFloat() * chars.length())));
            } else {
                builder.append(chars2.charAt((int) (rnd.nextFloat() * chars.length())));
            }
        }
        return builder.toString();
    }
}
