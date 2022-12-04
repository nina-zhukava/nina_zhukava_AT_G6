package classwork.day10;

import classwork.day9.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("er", "df", "wrgre", "g", "y", "o", "zw");

        List<Person> people = Arrays.asList(
                new Person("Vasya", 13, Person.Sex.MAN),
                new Person("Katya", 8, Person.Sex.WOMEN),
                new Person("Vova", 24, Person.Sex.MAN),
                new Person("Masha", 38, Person.Sex.WOMEN),
                new Person("Roman Petrovich", 72, Person.Sex.MAN)
        );
        System.out.println(list.stream()
                .flatMap(s -> Arrays.stream(s.split("")))
                .peek(System.out::println)
                .max(Comparator.naturalOrder())
                .get());

        System.out.println(people.stream().min(Comparator.comparingInt(p -> p.age)).get().name);
        System.out.println(list.stream().flatMap(s -> Arrays.stream(s.trim().split(""))).count());
        System.out.println(list.stream()
                .filter(s -> !(s.length() % 2 == 0))
                .flatMap(s -> Arrays.stream(s.trim().split("")))
                .count());
        System.out.println(list.stream().map(String::length).mapToInt(s -> s % 2 == 1 ? s : 0).sum());
        System.out.println(list.stream().collect(Collectors.joining(":", "<p>", "/<p>")));
        System.out.println(people.stream().collect(Collectors.toMap(person -> person.hashCode(), person -> person)));
        System.out.println(people.stream().collect(Collectors.groupingBy(person -> person.sex)).keySet());
    }
}
