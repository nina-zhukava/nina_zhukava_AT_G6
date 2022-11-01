package src.main.java.classwork.day10;

import src.main.java.classwork.day9.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStringTask {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("er", "dsf", "re", "g", "y", "o", "w");
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        List<Person> people = Arrays.asList(
                new Person("Vasya", 13, Person.Sex.MAN),
                new Person("Katya", 28, Person.Sex.WOMEN),
                new Person("Vova", 24, Person.Sex.MAN),
                new Person("Masha", 38, Person.Sex.WOMEN),
                new Person("Roman Petrovich", 72, Person.Sex.MAN)
        );

        List<Person> people2 = people.stream().sorted((a, b) -> a.sex != b.sex ? a.sex.compareTo(b.sex) : a.age - b.age)
                .peek(person -> System.out.println(person.name))
                .collect(Collectors.toList());
    }
}
