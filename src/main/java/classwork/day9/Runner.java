package src.main.java.classwork.day9;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
/*        MyClass mc = new MyClass();
        mc.justMethod(ClassX::new);*/

        List<Person> people = Arrays.asList(
                new Person("Vasya", 13, Person.Sex.MAN),
                new Person("Katya", 28, Person.Sex.WOMEN),
                new Person("Vova", 24, Person.Sex.MAN),
                new Person("Masha", 38, Person.Sex.WOMEN),
                new Person("Roman Petrovich", 72, Person.Sex.MAN)
        );

        int counter = 0;
        for (Person p : people) {
            if (((p.sex == Person.Sex.MAN && p.age <= 60) || (p.sex == Person.Sex.WOMEN && p.age <= 55)) && p.age >= 18) {
                counter++;
            }
        }
        System.out.println(counter);

        long counter2 = people.stream().filter(person -> person.age >= 18)
                .filter(p -> ((p.sex == Person.Sex.MAN && p.age <= 60) || (p.sex == Person.Sex.WOMEN && p.age <= 55)))
                .count();
        System.out.println(counter2);
    }
}
